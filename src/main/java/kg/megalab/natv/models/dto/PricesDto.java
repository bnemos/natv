package kg.megalab.natv.models.dto;

import kg.megalab.natv.models.entity.Channels;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.sql.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PricesDto {
    ChannelsDto channelsDto;
    Long id;
    Date startDate;
    Date endDate;
    double price;


}
