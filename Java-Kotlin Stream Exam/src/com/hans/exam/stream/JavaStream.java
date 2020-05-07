package com.hans.exam.stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class JavaStream {
    public static void main(String[] args) {

        JavaStream exam = new JavaStream();

        exam.filterExam();
        System.out.println("=========================");
        exam.mapExam();
        System.out.println("=========================");
        exam.sortedExam();
        System.out.println("=========================");
        exam.limitExam();
        System.out.println("=========================");
        exam.skipExam();
        System.out.println("=========================");
        exam.reduceExam();
        System.out.println("=========================");
        exam.practiceExam1();
        System.out.println("=========================");
        exam.practiceExam2();
    }


    public void filterExam() {
        List<String> strings = Arrays.asList("aabcd", "bbcde", "abcded");

        strings.stream()
                .filter(it -> it.contains("abc"))
                .forEach(System.out::println);
    }

    public void mapExam() {
        List<String> strings = Arrays.asList("aabcd", "bbcde", "abcded");

        strings.stream()
                .map(it -> { return it.concat("zzz"); })
                .forEach(System.out::println);
    }

    public void sortedExam() {
        List<Integer> integers = Arrays.asList(0,9,7,5,3,1,2,4,6,8);
        integers.stream()
                .sorted()
                .forEach(System.out::println);
    }

    public void limitExam() {
        List<Integer> integers = Arrays.asList(0,9,7,5,3,1,2,4,6,8);
        integers.stream().filter(it -> it > 3)
                .limit(3)
                .sorted()
                .forEach(System.out::println);
    }

    public void skipExam() {
        List<Integer> integers = Arrays.asList(0,9,7,5,3,1,2,4,6,8);
        integers.stream().filter(it -> it > 3)
                .sorted()
                .skip(3)
                .forEach(System.out::println);
    }

    public void reduceExam() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        int reduceSum = integers.stream().reduce((b, c) -> {
            System.out.println("b = " + b + ", c = " + c);
            return b+c;
        }).get();

        System.out.println("reduce = " + reduceSum);
    }

    public void practiceExam1() {
        List<Company> companies = Arrays.asList(
        new Company("Apple", "Electronic"),
        new Company("Samsung Electronic", "Electronic"),
        new Company("LG", "Electronic"),
        new Company("Kia", "Automobile"),
        new Company("Hyundai Motors", "Automobile"));

        companies.stream().map(it -> it.category)
                .distinct()
                .forEach(System.out::println);
    }

    public void practiceExam2() {
        List<Company> companies = Arrays.asList(
                new Company("Apple", "Electronic"),
                new Company("Samsung Electronic", "Electronic"),
                new Company("LG", "Electronic"),
                new Company("Kia", "Automobile"),
                new Company("Hyundai Motors", "Automobile"));

        companies.stream()
                .flatMap(it -> Stream.of(it.name, it.category))
                .distinct()
                .forEach(System.out::println);
    }

    class Company {
        String name;
        String category;

        public Company(String name, String category) {
            this.name = name;
            this.category = category;
        }
    }
}
