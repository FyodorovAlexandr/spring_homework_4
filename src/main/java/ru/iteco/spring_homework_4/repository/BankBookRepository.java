package ru.iteco.spring_homework_4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.iteco.spring_homework_4.model.entity.BankBookEntity;
import ru.iteco.spring_homework_4.model.entity.CurrencyEntity;

import java.util.List;
import java.util.Optional;

public interface BankBookRepository extends JpaRepository<BankBookEntity, Integer> {

    List<BankBookEntity> findAllByUserId(Integer userId);
    Optional<BankBookEntity> findByUserIdAndNumberAndCurrency(Integer userId, String number, CurrencyEntity currency);
    void deleteAllByUserId(Integer userId);
}