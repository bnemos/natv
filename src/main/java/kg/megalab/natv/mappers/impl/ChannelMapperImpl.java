package kg.megalab.natv.mappers.impl;

import kg.megalab.natv.mappers.ChannelMapper;
import kg.megalab.natv.models.dto.ChannelsDto;
import kg.megalab.natv.models.entity.Channels;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ChannelMapperImpl implements ChannelMapper {

    @Override
    public Channels mapToChannel(ChannelsDto channelsDto) {
        Channels channels = new Channels();
        channels.setName(channelsDto.getName());
        channels.setPhotoUrl(channelsDto.getPhotoUrl());
        channels.setId(channelsDto.getId());
        channels.setActive(channelsDto.isActive());
        return channels;
    }

    @Override
    public ChannelsDto mapToChannelsDto(Channels channels) {

        ChannelsDto channelsDto = new ChannelsDto();
        channelsDto.setActive(channels.isActive());
        channelsDto.setName(channels.getName());
        channelsDto.setPhotoUrl(channels.getPhotoUrl());
        channelsDto.setId(channels.getId());
        return channelsDto;
    }

    @Override
    public List<ChannelsDto> toChannelsDto(List<Channels> channelsList) {
        return channelsList.stream()
                .map(this::mapToChannelsDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<Channels> toChannels(List<ChannelsDto> channelsDtoList) {
        return channelsDtoList.stream()
                .map(this::mapToChannel)
                .collect(Collectors.toList());
    }
}
