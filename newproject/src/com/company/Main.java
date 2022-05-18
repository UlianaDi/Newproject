package com.company;

public class Main {

    public static void main(String[] args) {

        Model alla = new Model(1.79, 48, 35);
        alla.setAge(35);
        alla.setHeight(1.79);
        alla.setWeight(48);
        System.out.println("Костромічова: " + alla.getAge() + " роки." + " Ріст: " + alla.getHeight() + ". Вага: " + alla.getWeight() + ".");
        alla.age();
        System.out.println("Індекс маси тіла: " + alla.imtf());
        System.out.println("Індекс маси тіла(2): " + alla.imtf(175,43, 32));

        System.out.println();
        Podium first = new Podium(0.5,2,20);
        first.setHeight(0.5);
        first.setLenght(20);
        first.setWidth(2);
        System.out.println("Подіум. Висота: " + first.getHeight() + ". Ширина: " + first.getWidth() + ". Довжина: " + first.getLenght() + ".");
        first.square();
        System.out.println("Довжина шляху пройденого моделлю по подіуму: " + first.len2x());
        System.out.println("Довжина шляху пройденого моделлю по подіуму(2): " + first.len2x(1, 3,30));

        Podium second = new Podium(40);
        second.setWidth(3);
        second.setLenght(22);
        second.setHeight(1);
        System.out.println(second.getHeight());
        Podium third = new Podium(first);
        System.out.println("Подіум(2). Висота: " + first.getHeight() + ". Ширина: " + first.getWidth() + ". Довжина: " + first.getLenght() + ".");
        Podium fourth = new Podium(1,2,22);
        System.out.println("Подіум(3). Висота: " + fourth.getHeight() + ". Ширина: " + fourth.getWidth() + ". Довжина: " + fourth.getLenght() + ".");

        System.out.println();
        Hall white = new Hall(100, 15, 150);
        white.setPersonnel(15);
        white.setSeat(100);
        white.setSquare(150);
        System.out.println("Зал. Кількість місць: " + white.getSeat() + ". Кількість персоналу: " + white.getPersonnel() + ". Площа приміщення: " + white.getSquare() + ".");
        white.people();
        System.out.println("Кількість території на одну людину: "+ white.terutory());
        System.out.println("Кількість території на одну людину(2): "+ white.terutory(110,20,200));

        Podium podium = new Podium(150, 2, 20);
        white.s(podium);


    }
}
