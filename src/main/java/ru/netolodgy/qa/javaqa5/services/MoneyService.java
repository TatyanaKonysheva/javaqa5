package ru.netolodgy.qa.javaqa5.services;
public class MoneyService {
    public int calculate(int income, int expenses, int threshold, int expected) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        int savings = income - expenses ;
        for (int month = 1; month < 13; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3;
            } else {
                money = money + savings;

            }
        }
        return count;
    }
}
