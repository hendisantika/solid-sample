package com.hendisantika.solid.dip;

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
public class PersonService {
    private PersonRepository personRepository;

    public void setPersonRepository(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getAll() {
        return personRepository.findAll();
    }

}