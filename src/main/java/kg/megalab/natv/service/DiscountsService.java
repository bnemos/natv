package kg.megalab.natv.service;

import kg.megalab.natv.models.dto.DiscountsDto;
import kg.megalab.natv.models.entity.Discounts;

import java.util.List;

public interface DiscountsService {

        List<DiscountsDto> getDiscounts();

        DiscountsDto saveDiscounts(DiscountsDto discounts);

        List<DiscountsDto> allActiveChannelDiscounts(Long id);
}
