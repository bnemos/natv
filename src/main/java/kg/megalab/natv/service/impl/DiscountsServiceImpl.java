package kg.megalab.natv.service.impl;

import kg.megalab.natv.mappers.DiscountsMapper;
import kg.megalab.natv.models.dto.DiscountsDto;
import kg.megalab.natv.models.entity.Discounts;
import kg.megalab.natv.repo.DiscountsRepo;
import kg.megalab.natv.service.DiscountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscountsServiceImpl implements DiscountsService {

    @Autowired
    private DiscountsRepo discountsRepo;

    @Autowired
    private DiscountsMapper discountsMapper;

    public DiscountsServiceImpl(DiscountsRepo discountsRepo) {
        this.discountsRepo = discountsRepo;
    }

    @Override
    public List<DiscountsDto> getDiscounts() {
        return discountsMapper.toDiscountsDto(discountsRepo.findAll());
    }

    @Override
    public DiscountsDto saveDiscounts(DiscountsDto discountsDto) {
        return discountsMapper.mapToDiscountsDto(discountsRepo.save(discountsMapper.mapToDiscounts(discountsDto)));
    }

    @Override
    public List<DiscountsDto> allActiveChannelDiscounts(Long id) {
        return discountsMapper.toDiscountsDto(discountsRepo.allActiveChannelDiscounts(id));
    }


}
