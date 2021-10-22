package com.company.day1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Day1 {
    public static void solve() {
        int arr[] = new int[200];
        int i = 0;
        try (Scanner sc = new Scanner(new FileReader("res/Day1.txt"))) {
            while (sc.hasNextLine()) {
                arr[i] = Integer.parseInt(sc.nextLine());
                i++;
            }
        } catch (IOException e) {
            System.out.println("Error while reading file!");
        }
        //System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length; j++) {
            for (int k = j+1; k <arr.length ; k++) {
                if (arr[j]+arr[k] == 2020){
                    System.out.println(arr[j]*arr[k]);
                }
            }
        }
        for (int j = 0; j < arr.length; j++) {
            for (int k = j+1; k <arr.length ; k++) {
                for (int l = k+1; l < arr.length ; l++) {
                    if (arr[j]+arr[k]+arr[l] == 2020){
                        System.out.println(arr[j]*arr[k]*arr[l]);
                    }
                }
            }
        }
    }
}
