package kg.megalab.natv.models.entity;


import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Table(name = "channel")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Channels {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    String photoUrl;
    boolean active;


}
