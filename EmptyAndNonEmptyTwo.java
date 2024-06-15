package com.TaskFive;

//importing packages
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmptyAndNonEmptyTwo {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("abc","","bc","efg","abcd","","jkl");
        long count = strings.stream().filter(str->str.isEmpty()).count();    //count the empty elements in a list

        //To check whether the Strings in the list are empty or not
        if(count==0) System.out.println("Strings are not empty in a list");
        else System.out.println("Strings are empty in a list");

        //To print the strings that are non-empty in a list
        System.out.println("Non-empty strings in a list are::");
        List<String> res = strings.stream()
                .filter(str -> !str.isEmpty())
                .collect(Collectors.toList());
        System.out.println(res);

    }
}
