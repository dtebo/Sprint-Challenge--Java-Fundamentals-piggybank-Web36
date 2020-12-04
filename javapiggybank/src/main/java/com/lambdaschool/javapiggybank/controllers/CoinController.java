package com.lambdaschool.javapiggybank.controllers;

import com.lambdaschool.javapiggybank.models.Coin;
import com.lambdaschool.javapiggybank.repositories.CoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CoinController {
    @Autowired
    CoinRepository coinRepository;

    @GetMapping(value = "/total", produces = "application/json")
    public ResponseEntity<?> getTotalCoins(){
        List<Coin> myCoins = new ArrayList<>();
        coinRepository.findAll().iterator().forEachRemaining(myCoins::add);

        return new ResponseEntity<>(myCoins, HttpStatus.OK);
    }
}
