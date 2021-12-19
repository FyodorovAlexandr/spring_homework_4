package ru.iteco.spring_homework_4.service;

import org.springframework.http.ResponseEntity;
import ru.iteco.spring_homework_4.model.dto.BankBookDto;
import ru.iteco.spring_homework_4.model.exceptions.BankBookException;
import ru.iteco.spring_homework_4.model.exceptions.BankBookNotFoundException;

import java.util.List;

public interface BankBookService {

    List<BankBookDto> findByUserId(Integer userId) throws BankBookNotFoundException;
    BankBookDto findById(Integer bankBookId) throws BankBookNotFoundException;
    BankBookDto createBankBook(BankBookDto bankBookDto) throws BankBookException;
    BankBookDto updateBankBook(BankBookDto bankBookDto) throws BankBookException;
    ResponseEntity<String> deleteBankBookById(Integer bankBookId);
    ResponseEntity<String> deleteBankBookByUserId(Integer userId);
}
