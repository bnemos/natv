package kg.megalab.natv.mappers;

import kg.megalab.natv.models.dto.OrdersDto;
import kg.megalab.natv.models.entity.Orders;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

public interface OrderMapper {
    Orders mapToOrders(OrdersDto ordersDto);
    OrdersDto mapToOrdersDto(Orders orders);
}
