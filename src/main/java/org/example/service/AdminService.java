package org.example.service;

import org.example.entities.Afitsant;
import org.example.entities.Foods;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.example.db.DB.*;
import static org.example.utill.Utils.*;

public class AdminService {
    public void adminService() {
        mainWhile:
        while (true) {
            System.out.println("""
                    1. Afitsant qo'shish
                    2. Oziq ovqat qo'shish
                    3. Buyurtmani qabul qilish
                    4. Afitsantni ko'rish
                    
                    0. Exit
                    """);
            switch (intScan(">>>")) {
                case 1 -> {
                    creatAfitsant();
                }
                case 2 -> {
                    crearFoods();
                }
                case 3 -> {
                    OrderService orderService = new OrderService();
                    orderService.service();
                }
                case 4 -> {
                    showAfitsant();
                }

                case 0 -> {
                    break mainWhile;
                }
                default -> {
                    System.out.println("Invalid input");
                }
            }
        }
    }

    public static void creatAfitsant() {
        String afitsantName = strScan("Enter afitsant name: ");
        Integer afitsantAge = intScan("Enter afitsant age: ");
        Integer aftsantRaqami =  intScan("Enter afitsant number: ");

        for (Afitsant afitsant : afitsantsList) {
            if (afitsant.getShaxsiyRaqam().equals(aftsantRaqami)) {
                System.out.println("Afitsant " + afitsant.getName() + " is already exist!!");
                System.out.println("Ma'lumotlarni qayta kiriting:\n");
                creatAfitsant();
            }
        }
        Afitsant afitsant = new Afitsant(UUID.randomUUID().toString(), afitsantName, aftsantRaqami, afitsantAge, new ArrayList<>());
        afitsantsList.add(afitsant);

        System.out.println("Afitsant " + afitsant.getName() + " has been created\n");
    }

    public static void crearFoods() {
        String foodsName = strScan("Enter food name: ");
        Double foodsPrice = doubleScan("Enter food price: ");

        for (Foods food : foods) {
            if (food.getName().equals(foodsName)) {
                System.out.println("Food " + food.getName() + " is already exist");
                System.out.println("Ma'lumotlarni qayta kiriting");
                crearFoods();
            }
        }

        Foods food = new Foods(UUID.randomUUID().toString(),foodsName, foodsPrice, 0D);
        foods.add(food);
        System.out.println("Food " + food.getName() + " has been created\n");
    }

    public static void showAfitsant() {
        System.out.println("===========>Afitsants<===========");
        for (Afitsant afitsant : afitsantsList) {
            System.out.println("Afitsant name: " + afitsant.getName() + " ID: " + afitsant.getId());
            System.out.println("--------------------------------------------------------");
        }
    }

    public static void showAfitsantRepo(){
        if (afitsantsList.isEmpty()){
            System.out.println("There is no Afitsants in the database");
            return;
        }
        showAfitsant();
        System.out.println("Qaysi afitsandni ko'rmoqchisiz:");
        String getId = strScan("Enter afitsant ID: ");

        for (Afitsant afitsant : afitsantsList) {
            if (afitsant.getId().equals(getId)) {
                System.out.println(afitsant);
            }
        }
    }
}













