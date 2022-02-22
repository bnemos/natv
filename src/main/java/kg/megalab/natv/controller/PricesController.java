package kg.megalab.natv.controller;

import kg.megalab.natv.mappers.PricesMapper;
import kg.megalab.natv.models.dto.PricesDto;
import kg.megalab.natv.service.PricesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/prices")
public class PricesController {

    @Autowired
    private PricesService pricesService;
    private PricesMapper pricesMapper;

    @PostMapping("/save")
    public PricesDto savePrice(@RequestBody PricesDto pricesDto)
    {
        return pricesService.savePrices(pricesDto);
    }

    @GetMapping("/getPrice")
    public List<PricesDto> getPrices(){
        return pricesService.getAllPrices();
    }
}
