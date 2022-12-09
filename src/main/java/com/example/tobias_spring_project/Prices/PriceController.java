package com.example.tobias_spring_project.Prices;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
// Skrevet af Tobias
@RestController
// husk cross origin er vigtig for at kunne hente fra databasen eller kan man ikke gøre det pga cors
@CrossOrigin
@RequestMapping("api/v1/price")
public class PriceController {

    private PriceService priceService;

    @Autowired
    public void StudentController(PriceService priceService) {
        this.priceService = priceService;
    }

    // kan også stå som GetMapping("/")
    @GetMapping
    public List<Price> getPrices() {return priceService.getPrices();}

    // kan også stå sådan her alternativt /{priceId}
    @GetMapping("findPriceById/{priceId}")
    // pathvariable bruges til at definere en variabel i sit endpoint
    public Optional<Price> getPriceById(@PathVariable("priceId") Long priceId) {
        return priceService.getPriceById(priceId);
    }

    @PostMapping("/addPrice")
    public void registerNewPrice(@RequestBody Price price) { priceService.addNewPrice(price);
    }

    @PutMapping(path = "updatePriceById/{priceId}")
    public Optional<Price> updatePriceById(@PathVariable("priceId") Long priceId,
                                           @RequestBody Price price) {
        return Optional.ofNullable(priceService.updateCustomer(priceId, price));
    }

}
