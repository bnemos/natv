package kg.megalab.natv.service;

import kg.megalab.natv.models.dto.ChannelsDto;
import kg.megalab.natv.models.objects.OutputChannel;

import java.util.List;

public interface ChannelsService {

    List<OutputChannel> getChannel();

    ChannelsDto saveChannel(ChannelsDto channelsDto);
}
