package kg.megalab.natv.mappers;

import kg.megalab.natv.models.dto.DiscountsDto;
import kg.megalab.natv.models.entity.Discounts;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

public interface DiscountsMapper {

    Discounts mapToDiscounts(DiscountsDto discountsDto);
    DiscountsDto mapToDiscountsDto(Discounts discounts);

    List<Discounts> toDiscounts(List<DiscountsDto> discountsDto);
    List<DiscountsDto> toDiscountsDto(List<Discounts> discounts);

}
