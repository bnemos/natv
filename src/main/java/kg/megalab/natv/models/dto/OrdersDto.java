package kg.megalab.natv.models.dto;

import kg.megalab.natv.models.enums.Status;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrdersDto {

    Long id;
    String text;
    String name;
    String phone;
    String email;
    int totalPrice;
    LocalDate editDate;
    LocalDate addDate;
    Status status;
}
