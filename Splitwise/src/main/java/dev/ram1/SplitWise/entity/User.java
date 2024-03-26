package dev.ram1.SplitWise.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
@Entity(name="Splitwise_user")
public class User extends BaseModel {
    private String name;
    private String phoneNumber;
    private String email;
    @ManyToMany
    private List<Group>groups;


}
