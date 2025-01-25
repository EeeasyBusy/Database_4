package com.example.DataBaseHibernate_4.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class Contact implements Serializable {
    private String name;
    private String surName;
    private int age;
}
