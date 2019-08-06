package com.hendisantika.solid.lsp;

import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA.
 * Project : solid-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-08-07
 * Time: 05:56
 */
public interface Employee {
    BigDecimal monthlySalary = new BigDecimal(100);

    BigDecimal getPaymentAmount();
}
