package kg.megalab.natv.models.dto;


import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChannelsDto {
    Long id;
    String name;
    String photoUrl;
    boolean active;
}
