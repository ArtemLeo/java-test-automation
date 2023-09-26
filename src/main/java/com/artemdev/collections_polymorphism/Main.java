package com.artemdev.collections_polymorphism;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // ArrayList:
        List<Person> persons = new ArrayList<>();
        Person person1 = new Person(11, "aa");
        Person person2 = new Person(22, "bb");
        Person person3 = new Person(33, "cc");
        Person person4 = new Person(44, "dd");
        Person person5 = new Person(25, "ff");

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);

        System.out.println(persons.get(0));
        System.out.println(persons.get(persons.size() - 1));

        for (int i = persons.size() - 1; i >= 0; i--) {
            System.out.print(persons.get(i) + " ");
        }
        System.out.println();

        persons.set(2, new Person(666, "diablo"));
        System.out.println(persons);

        boolean isPresent = persons.contains(person5);
        System.out.println(isPresent);

        System.out.println(persons.size());

        persons.clear();

        boolean isEmpty = persons.isEmpty();
        System.out.println(isEmpty);
        System.out.println("-------------------------");

        // HashMap:
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, person1);
        map.put(2, person1);
        map.put(3, person1);

        System.out.println(map.get(3));

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getValue().getName());
        }

        map.replace(1, new Person(333, "aaa"));

        map.put(3, person4);
        System.out.println(map);
        System.out.println("------------------------------");

        // Polymorphism:
        Human name = new Human("Ben");
        runAMile(name);
        workHard(name);
        playGame(name);
    }

    public static void runAMile(Runner runner) {
        runner.run();
    }

    public static void workHard(Worker worker) {
        worker.work();
    }

    public static void playGame(Gamer gamer) {
        gamer.play();
    }

}
