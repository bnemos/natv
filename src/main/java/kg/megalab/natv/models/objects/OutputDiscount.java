package kg.megalab.natv.models.objects;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OutputDiscount {
    int minDays;
    double percent;
}
