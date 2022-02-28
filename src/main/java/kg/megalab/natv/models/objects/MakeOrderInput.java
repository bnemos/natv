package kg.megalab.natv.models.objects;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MakeOrderInput {
    String adText;
    String clientName;
    String clientPhone;
    String clientEmail;
    List<InputChannelData> channels;
}
