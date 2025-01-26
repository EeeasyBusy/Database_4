package com.example.DataBaseHibernate_4.controller;

import com.example.DataBaseHibernate_4.entity.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
public class Controller {
    Controller controller;
    @GetMapping("/persons/by-city")
    public List<Person> getPersonsByCity(@RequestParam("city_of_living") String cityOfLiving) throws SQLException {
        return controller.getPersonsByCity(cityOfLiving);
    }
}
