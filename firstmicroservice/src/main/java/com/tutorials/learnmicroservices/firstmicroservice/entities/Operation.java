package com.tutorials.learnmicroservices.firstmicroservice.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@EntityScan
@Table(name = "operations")
@AllArgsConstructor
@NoArgsConstructor
public class Operation {

    //String ID, Date DATE, Double VALUE, String DESCRIPTION, String FK_ACCOUNT1, String FK_ACCOUNT2

    @Id
    @Column(name = "ID")
    @Getter
    @Setter
    @NotBlank
    @NotNull
    @NotEmpty
    private String id;

    @Column(name = "DATE")
    @Getter
    @Setter
    private Date date;

    @Column(name = "DESCRIPTION")
    @Getter
    @Setter
    private String description;

    @Column(name = "VALUE")
    @Getter
    @Setter
    @NotNull
    private Double value;

    @Column(name = "FK_ACCOUNT1")
    @Getter
    @Setter
    @NotNull
    @NotBlank
    @NotEmpty
    private String fkAccount1;

    @Column(name = "FK_ACCOUNT2")
    @Getter
    @Setter
    private String fkAccount2;

    // Viene automaticamente inserita la data
    @PrePersist
    void getTimeOperation() {
        this.date = new Date();
    }
}