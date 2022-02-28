package kg.megalab.natv.service;

import kg.megalab.natv.models.dto.PricesDto;
import kg.megalab.natv.models.entity.Prices;

import java.util.List;

public interface PricesService {

    PricesDto savePrices(PricesDto pricesDto);

    List<PricesDto> getAllPrices();

    PricesDto findChannelAndId(Long id);
}
