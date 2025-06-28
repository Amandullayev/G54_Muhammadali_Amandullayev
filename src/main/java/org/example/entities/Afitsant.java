package org.example.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Afitsant {
    private String id;
    private String name;
    private Integer shaxsiyRaqam;
    private Integer age;
    private List<Foods> foodsList;

}
