package kg.megalab.natv.models.dto;


import kg.megalab.natv.models.entity.Channels;
import kg.megalab.natv.models.entity.Orders;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderDetailsDto {
    Long id;
    int price;
    Channels channels;
    OrdersDto orders;
}
