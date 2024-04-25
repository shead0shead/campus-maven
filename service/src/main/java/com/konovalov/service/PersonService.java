package com.konovalov.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.konovalov.core.Person;

public class PersonService {

    ObjectMapper objectMapper = new ObjectMapper();

    public Person parse(String json) throws JsonProcessingException {
        Person person = objectMapper.readValue(json, Person.class);
        return person;
    }

    public String convert(Person person) throws JsonProcessingException {
        return objectMapper.writeValueAsString(person);
    }

}
