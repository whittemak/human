package ru.skypro;

public class Main {

    public static void main(String[] args) {
	Human maksim = new Human(1988, "Максим", "Минск", "бренд-менеджер");
    Human anya = new Human(1993, "Аня", "Москва", "методист");
    Human katya = new Human(1992, "Катя", "Калининград", "продакт-менеджер");
    Human artem = new Human(1995, "Артем", "Москва", "директор по развитию бизнеса");
    maksim.mySelf();
    anya.mySelf();
    katya.mySelf();
    artem.mySelf();
    }

}
