package com.devmaster.lesson01.lamda_expression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortLambdaExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "Java springboot",
                "C# netcore",
                "PHP",
                "Javascript"
        );
        Collections.sort(list, (o1, o2) -> o1.compareTo(o2));
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("=========");
        Collections.sort(list, (o1, o2) -> o2.compareTo(o1));
        for (String s : list) {
            System.out.println(s);
        }

    }
}
