package com.madeeasy;

import com.madeeasy.model.Person;

import java.util.List;

public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
