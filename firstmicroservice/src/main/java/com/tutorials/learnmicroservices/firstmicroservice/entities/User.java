package com.tutorials.learnmicroservices.firstmicroservice.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@AllArgsConstructor // Lombok crea un costruttore di default
@NoArgsConstructor // Lombok crea un costruttore senza parametri
@EntityScan // Indica che e' entità delle JPA
@Table(name = "users") // Mappa una tabella
@SpringBootApplication
public class User {

    @Id                               //JPA id of the table
    @Column(name = "ID")                //JPA (if column name is different from variable name)
    @NotEmpty
    @NotBlank @NotNull      //JSR-303 Validation
    @Getter
    @Setter // Lombok crea dei meteodi pubblici di default
    private String id;

    @Column(name = "USERNAME")          //JPA (if column name is different from variable name)
    @NotEmpty @NotBlank @NotNull      //JSR-303 Validation
    @Getter
    @Setter
    private String username;

    @Column(name = "PASSWORD")          //JPA (if column name is different from variable name)
    @NotEmpty @NotBlank @NotNull      //JSR-303 Validation
    @Getter
    @Setter
    private String password;

    @Column(name = "PERMISSION")        //JPA (if column name is different from variable name)
    @NotEmpty @NotBlank @NotNull      //JSR-303 Validation
    @Getter
    @Setter
    private String permission;

}
