package com.hendisantika.solid.srp;

/**
 * Created by IntelliJ IDEA.
 * Project : solid-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-08-07
 * Time: 05:49
 */
public class Car {
    private static final int MAX_FUEL = 40;
    private int fuel;

    public void increment() {
        this.fuel++;
    }

    public boolean isFull() {
        return fuel == MAX_FUEL;
    }

    public boolean isEmpty() {
        return fuel == 0;
    }

}