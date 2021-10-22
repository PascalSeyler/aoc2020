package com.company;

import com.company.day1.Day1;
import com.company.day2.Day2;
import com.company.day3.Day3;
import com.company.day4.Day4;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day;
        while (true) {
            System.out.println("Which day you want to solve?");
            day = sc.nextInt();
            if (day<26 && day >0)break;
        }
        switch (day){
            case 1:     Day1.solve();
                break;
            case 2:     Day2.solve();
                break;
            case 3:     Day3.solve();
                break;
            case 4:     Day4.solve();
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            default:


        }
    }
}
