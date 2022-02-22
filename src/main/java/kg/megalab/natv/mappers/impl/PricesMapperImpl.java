package kg.megalab.natv.mappers.impl;

import kg.megalab.natv.mappers.ChannelMapper;
import kg.megalab.natv.mappers.PricesMapper;
import kg.megalab.natv.models.dto.PricesDto;
import kg.megalab.natv.models.entity.Prices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PricesMapperImpl implements PricesMapper {

    @Autowired
    private ChannelMapper channelMapper;

    @Override
    public Prices mapToPrices(PricesDto pricesDto) {
        Prices prices = new Prices();
        prices.setPrice(pricesDto.getPrice());
        prices.setId(pricesDto.getId());
        prices.setEndDate(pricesDto.getEndDate());
        prices.setStartDate(pricesDto.getStartDate());
        prices.setChannels(channelMapper.mapToChannel(pricesDto.getChannelsDto()));
        return prices;
    }

    @Override
    public PricesDto mapToPricesDto(Prices prices) {
        PricesDto pricesDto = new PricesDto();
        pricesDto.setPrice(prices.getPrice());
        pricesDto.setId(prices.getId());
        pricesDto.setEndDate(prices.getEndDate());
        pricesDto.setStartDate(prices.getStartDate());
        pricesDto.setChannelsDto(channelMapper.mapToChannelsDto(prices.getChannels()));
        return pricesDto;
    }

    @Override
    public List<Prices> toPrices(List<PricesDto> pricesList) {
        return pricesList.stream()
                .map(this::mapToPrices)
                .collect(Collectors.toList());
    }

    @Override
    public List<PricesDto> toPricesDto(List<Prices> pricesDtoList) {
        return pricesDtoList.stream()
                .map(x -> mapToPricesDto(x))
                .collect(Collectors.toList());
    }
}
