package com.devmaster.lesson01.lamda_expression;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExpression4 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "Java SpringBoot",
                "C# Netcore",
                "PHP",
                "Javascript"
        );
        list.forEach((item)->System.out.println(item));

        list.forEach(System.out::println);

        LocalDateTime now = LocalDateTime.now();

        // Define a custom pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // Format the date-time object to a string
        String formattedDate = now.format(formatter);
        System.out.println("Formatted Date: " + formattedDate);
    }
}
