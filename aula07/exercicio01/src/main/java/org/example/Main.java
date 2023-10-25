package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> technologies = Arrays.asList("React", "Flutter", "Vue", "Angular", "React Native", "Ionic", "React", "Flutter");
        long technologiesListLengh = technologies.size();

        System.out.println("Há " + technologiesListLengh + " tecnologias listadas.");

        String longestTechnologyName = technologies.stream().max(Comparator.comparingInt(String::length)).orElse("");
        System.out.println("A tecnologia com nome mais longo é: " + longestTechnologyName);

        Map<String, Long> stringFrequency = technologies.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        stringFrequency.entrySet().stream()
                .sorted((entry1, entry2) -> Long.compare(entry2.getValue(), entry1.getValue()))
                .limit(5)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}