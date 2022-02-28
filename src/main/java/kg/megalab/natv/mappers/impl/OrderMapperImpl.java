package kg.megalab.natv.mappers.impl;

import kg.megalab.natv.mappers.OrderMapper;
import kg.megalab.natv.models.dto.OrdersDto;
import kg.megalab.natv.models.entity.Orders;
import org.springframework.stereotype.Service;

@Service
public class OrderMapperImpl implements OrderMapper {
    @Override
    public Orders mapToOrders(OrdersDto ordersDto) {
        Orders orders = new Orders();
        orders.setText(ordersDto.getText());
        orders.setId(ordersDto.getId());
        orders.setAddDate(ordersDto.getAddDate());
        orders.setEditDate(ordersDto.getEditDate());
        orders.setEmail(ordersDto.getEmail());
        orders.setName(ordersDto.getName());
        orders.setStatus(ordersDto.getStatus());
        orders.setPhone(ordersDto.getPhone());
        orders.setTotalPrice(ordersDto.getTotalPrice());
        return orders;
    }

    @Override
    public OrdersDto mapToOrdersDto(Orders orders) {
        OrdersDto ordersDto = new OrdersDto();
        ordersDto.setText(orders.getText());
        ordersDto.setId(orders.getId());
        ordersDto.setAddDate(orders.getAddDate());
        ordersDto.setEditDate(orders.getEditDate());
        ordersDto.setEmail(orders.getEmail());
        ordersDto.setName(orders.getName());
        ordersDto.setStatus(orders.getStatus());
        ordersDto.setPhone(orders.getPhone());
        ordersDto.setTotalPrice(orders.getTotalPrice());
        return ordersDto;
    }
}
