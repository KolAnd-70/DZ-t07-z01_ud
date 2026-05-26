package ru.netology.services;

    public class VacationService {

        public int calculate(int income, int expenses, int threshold) {
            int vacations = 0; // счётчик месяцев отдыха
            int money = 0; // количество денег на счету
            for (int i = 0; i < 12; i++) {
                if (money >= threshold) {
                    int i1 = vacations++;
                    money -= expenses; // money = money - expenses
                    money /= 3; // money = money / 3
                } else {
                    money += money - expenses;
                }
            }
            return vacations;
        }
    }

}
