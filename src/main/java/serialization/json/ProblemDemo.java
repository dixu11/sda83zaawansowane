package serialization.json;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

import java.io.File;
import java.io.IOException;

class ProblemDemo {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        //globalne przestawienie działania mappera na inne
        mapper.setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
        //nie chcemy wysypywania się na nie znalezionych zmiennych
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            File file = new File("src/main/java/serialization/json/problem.json");
            Problem problem =  mapper.readValue(file, Problem.class);
            System.out.println("Gotowy obiekt:");
            System.out.println(problem);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
