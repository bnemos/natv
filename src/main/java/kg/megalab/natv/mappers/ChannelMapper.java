package kg.megalab.natv.mappers;

import kg.megalab.natv.models.dto.ChannelsDto;
import kg.megalab.natv.models.entity.Channels;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ChannelMapper {

    Channels mapToChannel(ChannelsDto channelsDto);
    ChannelsDto mapToChannelsDto(Channels channels);

    List<ChannelsDto> toChannelsDto(List<Channels> channelsList);
    List<Channels> toChannels(List<ChannelsDto> channelsDtoList);
}
