package com.example.DataBaseHibernate_4.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class Person implements Serializable {

    @Id
    @EmbeddedId
    private Contact contact;
    @Column
    private long phoneNumber;
    @Column(nullable = false)
    private String cityOfLiving;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return phoneNumber == person.phoneNumber && Objects.equals(contact, person.contact) && Objects.equals(cityOfLiving, person.cityOfLiving);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contact, phoneNumber, cityOfLiving);
    }
}
