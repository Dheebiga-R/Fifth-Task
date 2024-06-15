package com.TaskFive;

//importing packages
import java.time.LocalDate;
import java.util.Scanner;

public class BirthDateFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //To get the input from users

        LocalDate localdate = LocalDate.now();   //To get the local date

        //Ask the user to enter birthdate
        System.out.println("Enter your birth date in the format of year,month and date");

        //getting input from the users
        int birthyear = input.nextInt(),
                birthmonth = input.nextInt(),
                birthday = input.nextInt();

        //subtracting current year,month and date with birth year,month and date
        int updatedyear = Math.abs(birthyear-localdate.getYear()),
                updatedmonth = Math.abs(localdate.getMonthValue()-birthmonth),
                updatedday = Math.abs(localdate.getDayOfMonth()-birthday);
        int date=0;   //to get the number days for particular month

        //if current month is less than the birth month, reduce the year by one and add 12 to the
        // current month after subtract it from the birth month
        if(localdate.getMonthValue()<birthmonth){
            updatedyear=updatedyear-1;
            updatedmonth=(localdate.getMonthValue()+12)-birthmonth;
        }

        //if current date is less than the birthdate reduce the updated month by one and get the number
        // of days of previous month of current month and add that number of days to the current date
        // and subtract it from the birthdate
        if(localdate.getDayOfMonth()<birthday){
            updatedmonth=updatedmonth-1;

            //to get the previous month of the current month
            int k=localdate.getMonthValue()-1;

            //to check whether the year is leap year or not to get the proper days of feb month
            if(localdate.getYear()/4==0 | localdate.getYear()/400==0){
                date=switch(k){              //switch case is used to get the number of days of the month
                    case 1,3,5,7,9,11:yield 31;
                    case 2           :yield 29;
                    case 4,6,8,10,12 :yield 30;
                    default:
                    throw new IllegalStateException("Unexpected value: " + k);//if k value doesn't match throw an error
                };
            }
            else{
                date=switch(k){
                    case 1,3,5,7,9,11:yield 31;
                    case 2           :yield 28;
                    case 4,6,8,10,12 :yield 30;
                    default:
                        throw new IllegalStateException("Unexpected value: " + k);
                };
            }
            updatedday=(localdate.getDayOfMonth()+date)-birthday; //calculate the updated date
        }

        System.out.println(updatedyear + " years " + updatedmonth + " months " + updatedday + " days");
    }
}
