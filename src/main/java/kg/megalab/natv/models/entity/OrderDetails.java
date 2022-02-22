package kg.megalab.natv.models.entity;


import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    int price;
    @ManyToOne
    @JoinColumn(name = "id_channels")
    Channels channels;
    @ManyToOne
    @JoinColumn(name = "id_orders")
    Orders orders;

}
