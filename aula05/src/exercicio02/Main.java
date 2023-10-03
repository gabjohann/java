package exercicio02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInputName;
        Map<String, Integer> peopleMap = new HashMap<>();

        peopleMap.put("Lucas", 21);
        peopleMap.put("Gabriel", 21);
        peopleMap.put("Vivian", 22);
        peopleMap.put("Eva", 83);
        peopleMap.put("Marlene", 75);

        System.out.print("Digite o nome da pessoa que deseja buscar: ");
        userInputName = scanner.next();

        if (peopleMap.containsKey(userInputName)) {
            int age = peopleMap.get(userInputName);
            System.out.println(userInputName + " tem " + age + " anos.");
        } else {
            System.out.println("Pessoa não cadastrada.\n");
        }

        getElderlyPeople(peopleMap);
    }

    public static void getElderlyPeople(Map<String, Integer> elderlyPeopleMap) {
        System.out.println("Grupo de pessoas na terceira idade: ");

        for (Map.Entry<String, Integer> entry : elderlyPeopleMap.entrySet()) {
            String name = entry.getKey();
            int age = entry.getValue();

            if (age >= 60) {
                System.out.println(name);
            }
        }
    }
}
