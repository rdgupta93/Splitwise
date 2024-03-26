package dev.ram1.SplitWise.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Currency;
import java.util.List;

@Getter
@Setter
@Entity(name="Splitwise_Expense")
public class Expense extends BaseModel{
    private String description;
    private double amount;

    @Enumerated(EnumType.STRING)
    private Currency currency;

    @OneToMany
    private List<UserExpense> userExpenses;
}
