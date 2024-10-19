package com.example.trabalho_ap2.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientModel {
    private Long id;
    private String name;
    private int age;
    private String profession;
    private static int Counter = 1;

    public ClientModel(String name, int age, String profession) {
        this.id = (long) Counter++;
        this.name = name;
        this.age = age;
        this.profession = profession;
    }
}
