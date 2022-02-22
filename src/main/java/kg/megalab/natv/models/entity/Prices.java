package kg.megalab.natv.models.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
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
public class Prices {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @JsonFormat(pattern = "dd-mm-yyyy")
    Date startDate;
    @JsonFormat(pattern = "dd-mm-yyyy")
    Date endDate;
    double price;
    @ManyToOne
    @JoinColumn(name = "id_channels")
    Channels channels;
}
