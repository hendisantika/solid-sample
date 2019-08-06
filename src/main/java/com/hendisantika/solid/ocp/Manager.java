package com.hendisantika.solid.ocp;

import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA.
 * Project : solid-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-08-07
 * Time: 05:53
 */
public class Manager implements Employee {
    private BigDecimal bonus = new BigDecimal(20);

    public BigDecimal getPaymentAmount() {
        return monthlySalary.add(bonus);
    }
}