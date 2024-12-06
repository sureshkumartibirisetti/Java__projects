package MiniProjects;

import java.util.Scanner;
import java.util.*;


public class DayChecker {
    static final String blink = "\u001b[5m";
    static final String red =  "\u001b[31;1m";
    static final String green = "\u001b[32;1m";
    static final String yellow = "\u001b[33;1m";
    static final String blue = "\u001b[34;1m";
    static final String purpe = "\u001b[35;1m";
    static final String skblue = "\u001b[36;1m";
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println(green);
        System.out.println("Hey Welcome to Day Finder Calculator click enter After enter the input also click Enter");
        System.out.print("Enter The Date(1-31): ");
        int Date=in.nextInt();
        System.out.print("Enter The Month(ex: January) : ");
        String Month=in.next();
        System.out.print("Enter The Year(ex: 1999): ");
        int Year=in.nextInt();
        System.out.println("Please confirm Your Date of Birth : (" + Date+"/"+Month+"/"+Year+")");
        int result=0;
        //Year last Two Numbers
        int last_two=Year%100;
        result+=last_two;
        int last_two_div=last_two/4;
        result+=last_two_div;
        //Month check code
        switch (Month.toLowerCase())
        {
            case "january":
                result+=0;
                break;
            case "february":
                result+=3;
                break;
            case "march":
                result+=3;
                break;
            case "april":
                result+=6;
                break;
            case "may":
                result+=1;
                break;
            case "june":
                result+=4;
                break;
            case "july":
                result+=6;
                break;
            case "august":
                result+=2;
                break;
            case "september":
                result+=5;
                break;
            case "october":
                result+=0;
                break;
            case "november":
                result+=3;
                break;
            case "december":
                result+=5;
                break;
            default:
                System.out.println("Invalid Month");

        }
        //Year check code
        if(Year>=1500 && 1599>=Year){
            result+=0;
        }else if(Year>=1600 && 1699>=Year){
            result+=6;
        }
        else if(Year>=1700 && 1799>=Year){
            result+=4;
        }
        else if(Year>=1800 && 1899>=Year){
            result+=2;
        }
        else if(Year>=1900 && 1999>=Year){
            result+=0;
        }
        else if(Year>=2000 && 2099>=Year){
            result+=6;
        }
        else if(Year>=2100 && 2199>=Year){
            result+=4;
        }
        else if(Year>=2200 && 2299>=Year){
            result+=2;
        }else{
            System.out.println("please Enter valid Year in the Range(1500-2299) if You further Years we update soon....");
        }
        if(Date>=1 && 31>=Date) {
            result += Date;
            int final_result = result % 7;
            switch (final_result) {
                case 1:
                    System.out.println(green);
                    System.out.println("Your born in Monday");
                    break;
                case 2:
                    System.out.println(yellow);
                    System.out.println("Your born in Tuesday");
                    break;
                case 3:
                    System.out.println(blue);
                    System.out.println("Your born in wednesday");
                    break;
                case 4:
                    System.out.println(purpe);
                    System.out.println("Your born in Thursday");
                    break;
                case 5:
                    System.out.println(skblue);
                    System.out.println("Your born in Friday");
                    break;
                case 6:
                    System.out.println(green);
                    System.out.println("Your born in Saturday");
                    break;
                case 0:
                    System.out.println(yellow);
                    System.out.println("Your born in Sunday");
                    break;
                default:
                    System.out.println(red);
                    System.out.println(blink);
                    System.out.println("If answer is wrong definately your giving wrong inputs");
            }
        }
        System.out.println("Thank you visit again");
        System.out.println(red);
        System.out.println(blink);
        System.out.println("If answer is wrong definately your giving wrong inputs");




    }
}
