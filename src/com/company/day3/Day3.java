package com.company.day3;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Day3 {
    public static void solve() {
        int hits =0;
        int i = 0;
        char test;
        String [] arr = new String[323];
        try (Scanner sc = new Scanner(new FileReader("res/Day3.txt"))) {
            while (sc.hasNextLine()){
                arr[i] = sc.nextLine();
                i++;
            }
            i = 0;
            for (int j = 0; j < arr.length; j= j+2) {
                i = i % 31;
                if (arr[j].charAt(i) == 35) {
                    hits++;
                }
                i += 1;
            }
        } catch (IOException e) {
            System.out.println("Error while reading file!");
        }
        System.out.println(hits);
        System.out.println(81*292*89*101*44);
    }
}
