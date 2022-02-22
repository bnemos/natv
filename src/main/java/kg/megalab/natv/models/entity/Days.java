package kg.megalab.natv.models.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.sql.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Days {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    Date day;

    @ManyToOne
    @JoinColumn(name = "id_order_detail")
    OrderDetails orderDetails;
}
