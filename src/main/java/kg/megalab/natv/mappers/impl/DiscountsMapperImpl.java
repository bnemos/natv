package kg.megalab.natv.mappers.impl;

import kg.megalab.natv.mappers.ChannelMapper;
import kg.megalab.natv.mappers.DiscountsMapper;
import kg.megalab.natv.models.dto.DiscountsDto;
import kg.megalab.natv.models.entity.Discounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DiscountsMapperImpl implements DiscountsMapper {

    @Autowired
    ChannelMapper channelMapper;

    @Override
    public Discounts mapToDiscounts(DiscountsDto discountsDto) {
        Discounts discounts = new Discounts();
        discounts.setId(discountsDto.getId());
        discounts.setEndDate(discountsDto.getEndDate());
        discounts.setStartDate(discountsDto.getStartDate());
        discounts.setMinDays(discountsDto.getMinDays());
        discounts.setPercent(discountsDto.getPercent());
        discounts.setChannel(channelMapper.mapToChannel(discountsDto.getChannelsDto()));
        return discounts;
    }

    @Override
    public DiscountsDto mapToDiscountsDto(Discounts discounts) {
        DiscountsDto discountsDto = new DiscountsDto();
        discountsDto.setId(discounts.getId());
        discountsDto.setEndDate(discounts.getEndDate());
        discountsDto.setStartDate(discounts.getStartDate());
        discountsDto.setMinDays(discounts.getMinDays());
        discountsDto.setPercent(discounts.getPercent());
        discountsDto.setChannelsDto(channelMapper.mapToChannelsDto(discounts.getChannel()));
        return discountsDto;
    }

    @Override
    public List<Discounts> toDiscounts(List<DiscountsDto> discountsDtoList) {
        return discountsDtoList.stream()
                .map(x->mapToDiscounts(x))
                .collect(Collectors.toList());
    }

    @Override
    public List<DiscountsDto> toDiscountsDto(List<Discounts> discountsList) {
        return discountsList.stream()
                .map(x->mapToDiscountsDto(x))
                .collect(Collectors.toList());
    }

}
