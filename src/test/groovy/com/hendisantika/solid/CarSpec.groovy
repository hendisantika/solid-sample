package com.hendisantika.solid

import com.hendisantika.solid.srp.Car
import spock.lang.Specification

/**
 * Created by IntelliJ IDEA.
 * Project : solid-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-08-08
 * Time: 06:22
 */
class CarSpec extends Specification {
    void "should start with empty tank"() {
        when: 'A car'
        Car car = new Car()
        then: 'We expect is empty gas'
        car.isEmpty() == true
    }
}