package org.example.service;

import org.example.entities.Afitsant;
import org.example.entities.Foods;

import static org.example.db.DB.*;
import static org.example.utill.Utils.intScan;
import static org.example.utill.Utils.strScan;

public class OrderService {
    public static void service(){
        if (foods == null){
            System.out.println("Sizda hali oziq ovqat mavjud emas!!");
            return;
        }
        if (afitsantsList == null){
            System.out.println("Sizda hali afitsand ham mavjud emas!!");
            return;
        }


        showFoods();
        System.out.println("\nQaysi taomni buyurtma qilasiz\n");
        String enterFoodId = strScan("Enter food ID: ");

        if (getFoods(enterFoodId) == null){
            System.out.println("Bunday taom mavjud emas: ");
            return;
        }

        Integer quantity = intScan("Nechta olasiz: ");

        showAfitsants();
        System.out.println("{ Qaysi afitsant qarayapdi }");
        String afitsantId = strScan("Enter afitsant ID: ");

        if (getAfitsant(afitsantId) == null){
            System.out.println("Bunday afitsant mavjud emas!! ");
            return;
        }

        order(enterFoodId,quantity,afitsantId);
    }

    public static void showFoods(){
        for (Foods food : foods) {
            System.out.println(food);
        }
    }
    public static void showAfitsants(){
        for (Afitsant afitsant : afitsantsList) {
            System.out.println(afitsant);
        }
    }
    public static Foods getFoods(String id){
        for (Foods food : foods) {
            if (food.getId().equals(id)){
                return food;
            }
        }
        return null;
    }
    public static Afitsant getAfitsant(String id){
        for (Afitsant afitsant : afitsantsList) {
            if (afitsant.getId().equals(id)){
                return afitsant;
            }
        }
        return null;
    }
    public static Double getFoodsFullPrice(String id, Integer quantity){
        for (Foods food : foods) {
            if (food.getId().equals(id)){
                return food.getPrice() * quantity;
            }
        }
        return null;
    }

    public static void order(String foodId, Integer quantity, String afitsantId){
        Foods food = getFoods(foodId);
        Double foodsFullPrice = getFoodsFullPrice(foodId, quantity);
        food.setPrice(foodsFullPrice);

        for (Afitsant afitsant : afitsantsList) {
            if (afitsant.getId().equals(afitsantId)){
                afitsant.getFoodsList().add(food);
            }
        }
    }


}
