package com.hendisantika.solid

import com.hendisantika.solid.srp.Car
import com.hendisantika.solid.srp.FuelPump
import spock.lang.Specification

/**
 * Created by IntelliJ IDEA.
 * Project : solid-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-08-08
 * Time: 06:23
 */
class FuelPumpSpec extends Specification {
    FuelPump fuelPump = new FuelPump()

    void "should fuel a car"() {
        given: 'A car'
        Car car = new Car()
        when: 'We do a gas fill up'
        fuelPump.reFuel(car)
        then: 'Car is full of gas'
        car.isFull() == true
    }
}