package kg.megalab.natv.mappers;

import kg.megalab.natv.models.dto.OrdersDto;
import kg.megalab.natv.models.entity.Orders;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    Orders mapToOrders(OrdersDto ordersDto);
    OrdersDto mapToOrdersDto(Orders orders);
}
