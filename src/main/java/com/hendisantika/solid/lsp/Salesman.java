package com.hendisantika.solid.lsp;

import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA.
 * Project : solid-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-08-07
 * Time: 06:00
 */
public class Salesman implements Employee {
    private BigDecimal commission = new BigDecimal(10);

    public BigDecimal getPaymentAmount() {
        return monthlySalary.add(commission);
    }
}