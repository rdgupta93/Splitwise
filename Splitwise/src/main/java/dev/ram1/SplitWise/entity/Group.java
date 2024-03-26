package dev.ram1.SplitWise.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
@Getter
@Setter
@Entity(name="Splitwise_group")

public class Group extends BaseModel{
    private String name;
    private String description;
    private double totalAmountSpent;
    @Enumerated(EnumType.STRING)
    private Currency defaultCurrency;

    @ManyToMany
    private List<User> users;

    @OneToMany
    private List<Expense>expenses;


}
