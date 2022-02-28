package kg.megalab.natv.models.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import kg.megalab.natv.models.entity.Channels;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PricesDto {
    ChannelsDto channelsDto;
    Long id;

    Date startDate;

    Date endDate;
    double price;


}
