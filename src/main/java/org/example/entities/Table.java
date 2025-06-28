package org.example.entities;

import lombok.Data;

import java.util.List;
import java.util.UUID;
@Data
public class Table {
    private static final String id = UUID.randomUUID().toString();
    private Integer tableCount;
    private List<Foods> foods;
}
