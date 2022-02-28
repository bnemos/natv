package kg.megalab.natv.models.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import kg.megalab.natv.models.enums.Status;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrdersDto {

    Long id;
    String text;
    String name;
    String phone;
    String email;
    int totalPrice;

    Date editDate;

    Date addDate;
    Status status;
}
