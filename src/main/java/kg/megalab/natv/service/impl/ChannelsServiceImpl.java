package kg.megalab.natv.service.impl;

import kg.megalab.natv.mappers.ChannelMapper;
import kg.megalab.natv.models.dto.ChannelsDto;
import kg.megalab.natv.models.dto.DiscountsDto;
import kg.megalab.natv.models.dto.PricesDto;
import kg.megalab.natv.models.objects.OutputChannel;
import kg.megalab.natv.models.objects.OutputDiscount;
import kg.megalab.natv.repo.ChannelsRepo;
import kg.megalab.natv.service.ChannelsService;
import kg.megalab.natv.service.DiscountsService;
import kg.megalab.natv.service.PricesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ChannelsServiceImpl implements ChannelsService {

    @Autowired
    private ChannelsRepo channelsRepo;
    @Autowired
    private PricesService pricesService;
    @Autowired
    private ChannelMapper channelMapper;
    @Autowired
    private DiscountsService discountsService;



    public ChannelsServiceImpl(ChannelsRepo channelsRepo) {
        this.channelsRepo = channelsRepo;
    }

    @Override
    public List<OutputChannel> getChannel(int limitPage)
    {
        List<PricesDto> pricesDtos = pricesService.getAllPrices();
        List<PricesDto> pricesDtoList = pricesDtos.stream()
                .filter(x->x.getChannelsDto().isActive())
                .collect(Collectors.toList());

        List<OutputChannel> outputChannelList = new ArrayList<>();
        for (PricesDto p: pricesDtoList){
            OutputChannel outputChannel = new OutputChannel();
            outputChannel.setId(p.getId());
            outputChannel.setChannelName(p.getChannelsDto().getName());
            outputChannel.setPrice(p.getPrice());
            outputChannel.setPhotoUrl(p.getChannelsDto().getPhotoUrl());
            List<DiscountsDto> discountsDtos = discountsService.allActiveChannelDiscounts(p.getChannelsDto().getId());
            List<OutputDiscount> discountsDtoList = new ArrayList<>();
            for (DiscountsDto d: discountsDtos){
                OutputDiscount outputDiscount = new OutputDiscount();
                outputDiscount.setPercent(d.getPercent());
                outputDiscount.setMinDays(d.getMinDays());
                discountsDtoList.add(outputDiscount);
            }
            outputChannel.setDiscounts(discountsDtoList);
            outputChannelList.add(outputChannel);
        }
        return outputChannelList.stream().limit(limitPage).collect(Collectors.toList());

    }

    @Override
    public ChannelsDto saveChannel(ChannelsDto channelsDto) {
        return channelMapper.mapToChannelsDto(channelsRepo.save(channelMapper.mapToChannel(channelsDto)));
    }

    
}
