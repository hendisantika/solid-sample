package com.hendisantika.solid.dip;

import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : solid-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-08-07
 * Time: 06:08
 */
public class PersonMemoryRepository implements PersonRepository {

    private List<Person> persons = Arrays.asList(new Person("josdem"));

    @Override
    public List<Person> findAll() {
        return persons;
    }

}