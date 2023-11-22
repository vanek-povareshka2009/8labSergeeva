package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 Задание");
        List<String> list = new ArrayList<>(Arrays.asList("арбуз", "банан", "тыква", "банан", "арбуз", "рот"));

        System.out.println("Повторяющиеся слова в алфавитном порядке: " +
                list.stream()
                        .collect(groupingBy(Function.identity(), counting()))
                        .entrySet().stream()
                        .filter(entry -> entry.getValue() > 1)
                        .map(Map.Entry::getKey)
                        .sorted()
                        .collect(joining(", ")));
        System.out.println("-------------");
        System.out.println("2 Задание");
        System.out.println(" ");
        List<Scientist> scientists = new ArrayList<>(Arrays.asList(
                new Scientist("Дарвин", 1809, "мужской", "Биология"),
                new Scientist("Эйнштейн", 1879, "мужской", "Физика"),
                new Scientist("Ньютон", 1643, "мужской", "Физика"),
                new Scientist("Склодовская-Кюри", 1867, "женский", "Химия")
        ));

        int N = 3; // Количество искомых ученых мужчин

        List<Scientist> result = scientists.stream()
                .filter(scientist -> "мужской".equals(scientist.getGender()))
                .sorted(Comparator.comparingInt(Scientist::getYear_of_birth))
                .limit(N)
                .sorted(Comparator.comparing(Scientist::getYear_of_birth))
                .collect(Collectors.toList());

        System.out.println(N + " ученых мужчин по области наук в порядке увеличения года рождения: " +
                result.stream().map(Scientist::getSurname).collect(Collectors.joining(", ", "", ";")));
    }
}