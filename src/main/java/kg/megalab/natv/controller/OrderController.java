package kg.megalab.natv.controller;

import kg.megalab.natv.models.objects.MakeOrderInput;
import kg.megalab.natv.models.objects.MakeOrderOutput;
import kg.megalab.natv.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PutMapping("/make_order")
    public MakeOrderOutput makeOrder(@RequestBody MakeOrderInput makeOrderInput){
        return orderService.makeOrder(makeOrderInput);
    }
}
