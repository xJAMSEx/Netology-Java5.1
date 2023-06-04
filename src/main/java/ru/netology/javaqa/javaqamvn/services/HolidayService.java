package ru.netology.javaqa.javaqamvn.services;

public class HolidayService {
    public int calculate(int income, int expenses) {
        int count = 0; // счётчик месяцев
        int threshold = 0; // предел денег на счету для отдыха
        for (int mounth = 0; mounth < 12; mounth++) {
            if (threshold >= expenses) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                threshold = threshold - expenses;
            } else {
                threshold = threshold + income;
            }
        }
        return count;
    }
}

