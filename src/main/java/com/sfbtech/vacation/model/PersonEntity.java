package com.sfbtech.vacation.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Persons")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PersonEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String lastName;
    private String firstName;
    private String patronymic;
}
