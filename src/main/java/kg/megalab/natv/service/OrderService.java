package kg.megalab.natv.service;

import kg.megalab.natv.models.objects.MakeOrderInput;
import kg.megalab.natv.models.objects.MakeOrderOutput;

public interface OrderService {
    MakeOrderOutput makeOrder(MakeOrderInput makeOrderInput);
}
