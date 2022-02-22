package kg.megalab.natv.models.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import kg.megalab.natv.models.enums.Status;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String text;
    String name;
    String phone;
    String email;
    int totalPrice;
    @JsonFormat(pattern = "dd-mm-yyyy")
    Date editDate;
    @JsonFormat(pattern = "dd-mm-yyyy")
    Date addDate;
    Status status;
}
