package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создайте класс User с полями id, name, age и phoneNumbers.
        // Поле phoneNumbers должно быть списком. Сделайте конструктор
        // с параметрами для заполнения всех полей объектов при их создании.
        // Создайте два объекта полученного класса.

        User user1 = new User();
        user1.setId("1");
        user1.setAge(64);
        user1.setName("Аркадий");
        List<String> list = new ArrayList<>();
        list.add("+777777777777");
        list.add("+888888888888");
        list.add("+999999999999");
        user1.setPhoneNumbers(list);
        System.out.println("User1:");
        System.out.println(user1.getId());
        System.out.println(user1.getAge());
        System.out.println(user1.getName());
        System.out.println(user1.getPhoneNumbers());

        User user2 = new User();
        user2.setId("2");
        user2.setAge(97);
        user2.setName("Валерий");
        List<String> list1 = new ArrayList<>();
        list1.add("+376984564");
        list1.add("+845458487");
        user2.setPhoneNumbers(list1);
        System.out.println("User2:");
        System.out.println(user2.getId());
        System.out.println(user2.getAge());
        System.out.println(user2.getName());
        System.out.println(user2.getPhoneNumbers());
    }
}
