package kg.megalab.natv.models.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

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
