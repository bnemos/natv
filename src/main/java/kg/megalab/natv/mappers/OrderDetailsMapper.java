package kg.megalab.natv.mappers;

import kg.megalab.natv.models.dto.OrderDetailsDto;
import kg.megalab.natv.models.entity.OrderDetails;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderDetailsMapper {

    OrderDetailsMapper INSTANCE = Mappers.getMapper(OrderDetailsMapper.class);

    OrderDetails mapToOrderDetails(OrderDetailsDto orderDetailsDto);
    OrderDetailsDto mapToOrderDetailsDto(OrderDetailsMapper orderDetails);
}
