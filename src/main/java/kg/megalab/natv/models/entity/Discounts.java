package kg.megalab.natv.models.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Discounts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    double percent;
    @JsonFormat(pattern = "dd-mm-yyyy")
    Date startDate;
    @JsonFormat(pattern = "dd-mm-yyyy")
    Date endDate;
    int minDays;
    @ManyToOne
    @JoinColumn(name = "id_channels")
    Channels channel;

}
