package com.konovalov.console;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.konovalov.core.Person;
import com.konovalov.service.PersonService;

public class App {

    private static PersonService personService = new PersonService();

    public static void main(String[] args) throws JsonProcessingException {
        System.out.println("Hello world!");

        Person person = new Person();
        person.setFirstName("Andrew");
        person.setLastName("Marston");
        System.out.println(person);

        String json = personService.convert(person);
        System.out.println(json);

        Person fromJson = personService.parse(json);
        System.out.println(fromJson);
    }

}
