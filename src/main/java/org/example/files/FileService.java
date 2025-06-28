package org.example.files;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class FileService {
//    public void writeToAfitsantJson(List<WriterAfitsan> allInputs) {
//        Gson gson = new Gson();
//        String json = gson.toJson(allInputs);
//
//        try {
//            Files.writeString(Path.of("src/main/resources/afitsant.json"), json, StandardCharsets.UTF_8);
//        } catch (IOException ignored) {
//        }
//    }
//
//    public List<Input> readFromAfitsantJson() {
//        Gson gson = new Gson();
//        Type type = new TypeToken<List<Input>>() {
//        }.getType();
//
//        try {
//            String json = Files.readString(Path.of("src/main/resources/outputs.json"));
//            return gson.fromJson(json, type);
//        } catch (IOException ignored) {
//        }
//        return Collections.emptyList();
//    }
//
//
//    public void writeToOrderJson(List<Input> allInputs) {
//        Gson gson = new Gson();
//        String json = gson.toJson(allInputs);
//
//        try {
//            Files.writeString(Path.of("src/main/resources/inputs.json"), json, StandardCharsets.UTF_8);
//        } catch (IOException ignored) {
//        }
//    }
//
//    public List<Input> readFromOrderJson() {
//        Gson gson = new Gson();
//        Type type = new TypeToken<List<Input>>() {
//        }.getType();
//
//        try {
//            String json = Files.readString(Path.of("src/main/resources/outputs.json"));
//            return gson.fromJson(json, type);
//        } catch (IOException ignored) {
//        }
//        return Collections.emptyList();
//    }
}
