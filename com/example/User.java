package com.example;

import java.util.List;

public class User {
    //Создайте класс User с полями id, name, age и phoneNumbers.
    private String id;
    private String name;
    private Integer age;
    private List<String> phoneNumbers;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public User(String id, String name, Integer age, List<String> phoneNumbers) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumbers = phoneNumbers;
    }

    public User() {
    }
}
