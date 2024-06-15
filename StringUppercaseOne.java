package com.TaskFive;

//importing packages
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringUppercaseOne {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("aBc","d","ef");  //Stream of string values as input
        List<String> result = names                                //reference of the stream values of string
                .map(name->name.toUpperCase())        //performing map operation to map every value to uppercase value by using method reference
                .collect(Collectors.toList());        //collect every value of string which are converted to upper string and convert to list
        System.out.println(result);                                //printing the uppercase of every value in a list

    }
}
