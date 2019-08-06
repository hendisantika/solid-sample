package com.hendisantika.solid.ocp;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * Project : solid-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-08-07
 * Time: 06:10
 */
public class EmployeeTest {
    @Test
    public void shouldGetTotalSalary() {
        BigDecimal expectedTotal = new BigDecimal(330);
        Employee engineer = new Engineer();
        Employee manager = new Manager();
        Employee salesman = new Salesman();
        List<Employee> employees = Arrays.asList(engineer, manager, salesman);
        assertEquals(expectedTotal, employees.stream().map(Employee::getPaymentAmount).reduce(BigDecimal.ZERO, BigDecimal::add));
    }

}
