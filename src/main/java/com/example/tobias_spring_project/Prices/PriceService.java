package com.example.tobias_spring_project.Prices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
// Skrevet af Tobias

@Service
public class PriceService {
    private final PriceRepository priceRepository;

    @Autowired
    public PriceService(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    public List<Price> getPrices() {
        return priceRepository.findAll();
    }

    public void addNewPrice(Price price) {priceRepository.save(price);}

    public Optional<Price> getPriceById(Long priceId) {
        boolean exists = priceRepository.existsById(priceId);
        if (!exists) {
            throw new IllegalStateException(
                    "student with id " + priceId + " does not exist");
        }
        return priceRepository.findById(priceId);
    }

    public Price updateCustomer(Long priceId, Price price) {
        boolean exists = priceRepository.existsById(priceId);
        if (!exists) {
            throw new IllegalStateException(
                    "student with id " + priceId + " does not exist");
        }
        return priceRepository.save(price);
    }
}
