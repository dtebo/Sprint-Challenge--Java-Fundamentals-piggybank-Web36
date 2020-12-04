package com.lambdaschool.javapiggybank.repositories;

import com.lambdaschool.javapiggybank.models.Coin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface CoinRepository extends CrudRepository<Coin, Long> {
}
