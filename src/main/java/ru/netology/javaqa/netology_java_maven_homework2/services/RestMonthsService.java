package ru.netology.javaqa.netology_java_maven_homework2.services;

public class RestMonthsService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 1; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = money - expenses;
                money = (int) money / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}
