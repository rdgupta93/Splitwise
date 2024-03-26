package dev.ram1.SplitWise.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
@MappedSuperclass
@Getter
@Setter

public abstract class  BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @CreatedDate
    @Temporal(value=TemporalType.DATE)
    private LocalDateTime createdAt;

    @CreatedDate
    @Temporal(value = TemporalType.DATE)
    private LocalDateTime lastModifiedAt;

}
