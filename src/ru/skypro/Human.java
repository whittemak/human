package ru.skypro;

public class Human {
    int yearOfBirth;
    public String name;
    public String town;
    public String jobTitle;

    public Human(int yearOfBirth, String name, String town, String jobTitle) {
        if (yearOfBirth >= 0){
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
        if (name != null){
            this.name = name;
        } else {
            System.out.println("Информация не указана");
        }
        if (town != null){
            this.town = town;
        } else {
            System.out.println("Информация не указана");
        }
        if (jobTitle != null){
            this.jobTitle = jobTitle;
        } else {
            System.out.println("Информация не указана");
        }
        }

        void mySelf () {
            System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
        }
    }

