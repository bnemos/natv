package kg.megalab.natv.service.impl;

import kg.megalab.natv.mappers.OrderMapper;
import kg.megalab.natv.models.dto.DiscountsDto;
import kg.megalab.natv.models.dto.OrderDetailsDto;
import kg.megalab.natv.models.dto.OrdersDto;
import kg.megalab.natv.models.dto.PricesDto;
import kg.megalab.natv.models.entity.Orders;
import kg.megalab.natv.models.objects.InputChannelData;
import kg.megalab.natv.models.objects.MakeOrderInput;
import kg.megalab.natv.models.objects.MakeOrderOutput;
import kg.megalab.natv.repo.OrderRepo;
import kg.megalab.natv.service.ChannelsService;
import kg.megalab.natv.service.DiscountsService;
import kg.megalab.natv.service.OrderService;
import kg.megalab.natv.service.PricesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepo orderRepo;
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private PricesService pricesService;
    @Autowired
    private ChannelsService channelsService;
    @Autowired
    private DiscountsService discountsService;

    @Override
    public MakeOrderOutput makeOrder(MakeOrderInput makeOrderInput) {
        MakeOrderOutput makeOrderOutput = new MakeOrderOutput();
        Orders orders = new Orders();
        orders.setText(makeOrderInput.getAdText());
        orders.setPhone(makeOrderInput.getClientPhone());
        orders.setName(makeOrderInput.getClientName());
        orders.setEmail(makeOrderInput.getClientEmail());
        OrdersDto ordersSave = orderMapper.mapToOrdersDto(orderRepo.save(orders));
        String noSpaceText = orders.getText().replaceAll("\\s+", "");
        List<InputChannelData> inputChannelData = makeOrderInput.getChannels();
        for (InputChannelData m: inputChannelData){
            OrderDetailsDto orderDetailsDto =new OrderDetailsDto();
            orderDetailsDto.setOrders(ordersSave);
            PricesDto pricesDto = pricesService.findChannelAndId(m.getChannelId());
            double pricePerSymbol = pricesDto.getPrice();
            int textSize=noSpaceText.length();
            int days = m.getDays().size();
            DiscountsDto discountsDto=discountsService.findByChannelAndMinDays(days, m.getChannelId());
            if(discountsDto!=null) {
                double discountPercent = discountsDto.getPercent();
                double priceWithoutDiscount = pricePerSymbol * textSize;
                double discount = priceWithoutDiscount*discountPercent/100;
                double discountedPrice = (priceWithoutDiscount-discount)*days;
                makeOrderOutput.setPrice(pricePerSymbol);
                makeOrderOutput.setTotalPrice(discountedPrice);
            }else{
                double totalPricePerChannel = (pricePerSymbol * textSize) * days;
                makeOrderOutput.setTotalPrice(totalPricePerChannel);
                makeOrderOutput.setPrice(pricePerSymbol);
            }

            makeOrderOutput.setText(makeOrderInput.getAdText());
            makeOrderOutput.setChannelsDto(channelsService.findChannelById(m.getChannelId()));


        }
        return makeOrderOutput;
    }
}
