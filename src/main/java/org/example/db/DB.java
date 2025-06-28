package org.example.db;

import org.example.entities.Afitsant;
import org.example.entities.Foods;

import java.util.ArrayList;
import java.util.List;


public interface DB {
    List<Foods> foods = new ArrayList<>();
    List<Afitsant> afitsantsList = new ArrayList<>();

}





/*
        oshxona projecti bo'yicha:

        afitsant qo'shadi
        oziq ovqat qo'shadi

        Eslatma: ovqatlarga buyurtma tugagach uni o'zgartirish mumkuin emas
        {
            Eslatma: ovqatlar oldindan yaratib qo'yilgan bo'lishi kerak
            Eslatma: Afitsantlar oldindan yaratib qo'yilgan bo'lishi kerak

            Eslatma: agar shu yuqoridagi ikkitasi bo'lmasa buyurtma olib bo'lmaydi!!

            Eslatma: keyin stollga ovqat biriktiradi va stollga afitsant biriktiradi
        }

        afitsant ni ko'rish tugmasi bosilganda

        stoll (raqami)
        oziq ovaqat
        ------------
        stoll (raqami)
        oziq ovqat
        ===============
        oxirida (umumiy summa: (narx) )

 */