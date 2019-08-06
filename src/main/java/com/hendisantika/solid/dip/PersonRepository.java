package com.hendisantika.solid.dip;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : solid-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-08-07
 * Time: 06:07
 */
public interface PersonRepository {
    List<Person> findAll();
}