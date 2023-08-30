package com.madeeasy;

import com.madeeasy.impl.AndCriteria;
import com.madeeasy.impl.MaleCriteria;
import com.madeeasy.impl.SingleCriteria;
import com.madeeasy.model.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Alice", "Female", "Single"));
        persons.add(new Person("Bob", "Male", "Married"));
        persons.add(new Person("Charlie", "Male", "Single"));

        Criteria maleCriteria = new MaleCriteria();
        Criteria singleCriteria = new SingleCriteria();
        Criteria singleMaleCriteria = new AndCriteria(singleCriteria, maleCriteria);

        List<Person> singleMales = singleMaleCriteria.meetCriteria(persons);
        for (Person person : singleMales) {
            System.out.println("Name: " + person.getName() + ", Gender: " + person.getGender() + ", Marital Status: " + person.getMaritalStatus());
        }
    }
}