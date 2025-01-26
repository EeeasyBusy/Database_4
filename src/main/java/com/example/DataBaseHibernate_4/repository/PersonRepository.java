package com.example.DataBaseHibernate_4.repository;

import com.example.DataBaseHibernate_4.entity.Contact;
import com.example.DataBaseHibernate_4.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Contact> {
    List<Person> findByCityOfLiving(String cityOfLiving);
    List<Person> findByContactOrderByAge(int age);

    Optional<Person> findByContact(String name, String surName);
}
