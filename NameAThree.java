package com.TaskFive;

//importing packages
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NameAThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Getting 10 students name as input
        System.out.println("Enter the students name::");
        List<String> student_list = new ArrayList<>(10);

        for(int i=0;i<10;i++){
            student_list.add(input.nextLine());
        }

        //count number of students name start with 'A'
        long count=student_list.stream()                 //convert stream source to stream instance
                .filter(str->str.charAt(0)=='A')         //performing filter operation to get the student name starts with 'A'
                .collect(Collectors.counting());         //counting operation

        //if count is zero printing student are not eligible for gifts, else printing the list of student name
        if(count==0) System.out.println("None of the student name starts with 'A'!!");
        else {
            System.out.println("Hey Students!! special gifts are waiting for you");
            System.out.println("List of the students name::");
            List<String> name = student_list.stream()
                    .filter(str->str.charAt(0)=='A')
                    .collect(Collectors.toList());       //collecting student name starts with alphabet 'A'
            System.out.println(name);                    //printing students name
        }


    }
}


