package kg.megalab.natv.mappers;

import kg.megalab.natv.models.dto.PricesDto;
import kg.megalab.natv.models.entity.Prices;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;


public interface PricesMapper {

    Prices mapToPrices(PricesDto pricesDto);
    PricesDto mapToPricesDto(Prices prices);

    List<PricesDto> toPricesDto(List<Prices> pricesList);
    List<Prices> toPrices(List<PricesDto> pricesDtoList);
}
