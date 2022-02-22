package kg.megalab.natv.controller;

import kg.megalab.natv.models.dto.DiscountsDto;
import kg.megalab.natv.service.DiscountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/discounts")
public class DiscountsController {

    @Autowired
    private DiscountsService discountsService;

    @GetMapping("/get")
    public List<DiscountsDto> getDiscounts()
    {
        return discountsService.getDiscounts();
    }

    @PostMapping("/save")
    public DiscountsDto saveDiscounts(@RequestBody DiscountsDto discountsDto)
    {
        return discountsService.saveDiscounts(discountsDto);
    }
}
