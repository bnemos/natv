package kg.megalab.natv.models.objects;

import kg.megalab.natv.models.entity.Discounts;
import lombok.Data;

import java.util.List;

@Data
public class OutputChannel {
    private Long id;
    private String channelName;
    private String photoUrl;
    private double price;
    private List<OutputDiscount> discounts;
}
