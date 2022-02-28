package kg.megalab.natv.service.impl;

import kg.megalab.natv.mappers.PricesMapper;
import kg.megalab.natv.models.dto.PricesDto;
import kg.megalab.natv.models.entity.Prices;
import kg.megalab.natv.repo.PricesRepo;
import kg.megalab.natv.service.PricesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PricesServiceImpl implements PricesService {

    @Autowired
    private PricesRepo pricesRepo;
    @Autowired
    private PricesMapper pricesMapper;

    public PricesServiceImpl(PricesRepo pricesRepo) {
        this.pricesRepo = pricesRepo;
    }


    @Override
    public PricesDto savePrices(PricesDto pricesDto) {
        return pricesMapper.mapToPricesDto(pricesRepo.save(pricesMapper.mapToPrices(pricesDto)));
    }

    @Override
    public List<PricesDto> getAllPrices() {
        return pricesMapper.toPricesDto(pricesRepo.findAll());
    }

    @Override
    public PricesDto findChannelAndId(Long id) {
        return pricesMapper.mapToPricesDto(pricesRepo.findByChannelsAndId(id));
    }

}
