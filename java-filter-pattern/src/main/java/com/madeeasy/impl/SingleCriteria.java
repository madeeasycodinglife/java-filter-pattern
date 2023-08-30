package com.madeeasy.impl;

import com.madeeasy.Criteria;
import com.madeeasy.model.Person;

import java.util.ArrayList;
import java.util.List;

public class SingleCriteria implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getMaritalStatus().equalsIgnoreCase("Single")) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
