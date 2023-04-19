package ru.netolodgy.qa.javaqa5.services;


public class Main {
    public static void main(String[] args) {
        MoneyService service = new MoneyService();
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
//        int income = 10000;
//        int expenses = 3000;
//        int threshold = 20000;
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;

        int savings = income - expenses ;
        int expensesRelax = (money - expenses) - (money - expenses) / 3;


        for (int month = 1; month < 13; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                expensesRelax = (money - expenses) - (money - expenses) / 3;
                System.out.println("Месяц " + month + ". " + "Денег " + money + ". " + "Буду отдыхать. Потратил -" + expenses + ", еще потратил -" + expensesRelax);
                money = (money - expenses) / 3;
            } else {
                System.out.println("Месяц " + month + ". " + "Денег " + money + ". " + "Придется поработать. Заработал +" + income + ", потратил -" + expenses);
                money = money + savings;
              }
        }
    }
}