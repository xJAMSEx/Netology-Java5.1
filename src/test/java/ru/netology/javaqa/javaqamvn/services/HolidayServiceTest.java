package ru.netology.javaqa.javaqamvn.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class HolidayServiceTest {
    @Test
   public void shouldCalculate() {
        HolidayService service = new HolidayService();
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        long actual = service.calculate(income, expenses);
    }

}
