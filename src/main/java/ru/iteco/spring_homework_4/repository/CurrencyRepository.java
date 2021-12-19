package ru.iteco.spring_homework_4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.iteco.spring_homework_4.model.entity.CurrencyEntity;

public interface CurrencyRepository extends JpaRepository<CurrencyEntity, Integer> {

    CurrencyEntity findByName(String name);
}

