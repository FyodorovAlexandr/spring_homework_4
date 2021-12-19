package ru.iteco.spring_homework_4.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "bank.book", schema = "dict")
public class BankBookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Column(name = "number", nullable = false)
    private String number;

    @Column(name = "amount", nullable = false)
    private BigDecimal amount;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "currency", referencedColumnName = "id")
    private CurrencyEntity currency;


}
