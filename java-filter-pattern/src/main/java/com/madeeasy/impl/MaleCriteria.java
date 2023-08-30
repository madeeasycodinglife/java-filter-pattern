package com.madeeasy.impl;

import com.madeeasy.Criteria;
import com.madeeasy.model.Person;

import java.util.ArrayList;
import java.util.List;

public class MaleCriteria implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("Male")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
