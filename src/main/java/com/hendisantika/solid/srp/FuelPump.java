package com.hendisantika.solid.srp;

/**
 * Created by IntelliJ IDEA.
 * Project : solid-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-08-07
 * Time: 05:50
 */
public class FuelPump {
    public void reFuel(Car car) {
        while (!car.isFull()) {
            car.increment();
        }
    }
}
