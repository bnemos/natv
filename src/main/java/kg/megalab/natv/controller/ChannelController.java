package kg.megalab.natv.controller;

import kg.megalab.natv.models.dto.ChannelsDto;
import kg.megalab.natv.models.objects.OutputChannel;
import kg.megalab.natv.service.ChannelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/channels")
public class ChannelController {

    @Autowired
    private ChannelsService channelsService;

    @PostMapping("/update")
    public ChannelsDto updateChannels(@RequestBody ChannelsDto channelsDto){

        return channelsService.saveChannel(channelsDto);
    }
    @PutMapping("/save")
    public ChannelsDto saveChannels(@RequestBody ChannelsDto channelsDto){
        return channelsService.saveChannel(channelsDto);
    }

    @GetMapping("/get_channels")
    public List<OutputChannel> getChannels(@RequestParam int pageLimit)
    {
        return channelsService.getChannel(pageLimit);
    }

}
