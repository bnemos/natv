package kg.megalab.natv.models.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.sql.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DiscountsDto {

    Long id;
    double percent;
    Date startDate;
    Date endDate;
    int minDays;
    ChannelsDto channelsDto;

}
