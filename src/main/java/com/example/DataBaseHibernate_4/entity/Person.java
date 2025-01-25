package com.example.DataBaseHibernate_4.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Person implements Serializable {

    @Id
    @EmbeddedId
    private Contact contact;
    @Column
    private long phoneNumber;
    @Column(nullable = false)
    private String city_of_living;

}
