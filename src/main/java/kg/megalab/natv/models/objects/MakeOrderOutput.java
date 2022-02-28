package kg.megalab.natv.models.objects;


import kg.megalab.natv.models.dto.ChannelsDto;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MakeOrderOutput {
    String text;
    ChannelsDto channelsDto;
    double price;
    double totalPrice;
}
