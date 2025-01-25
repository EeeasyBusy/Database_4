package com.example.DataBaseHibernate_4.repository;

import com.example.DataBaseHibernate_4.entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.transaction.annotation.Transactional;

@org.springframework.stereotype.Repository
public class Repository implements CommandLineRunner {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void run(String... args) throws Exception {

    }

    public Person getPersonsByCity(String city_of_living) {
        return entityManager.find(Person.class, city_of_living);
    }
}
