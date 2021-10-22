package com.company.day2;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Day2 {
    public static void solve() {
            int min,max;
            char letter;
            String password;
            int counter;
            int confirm = 0;
            int confirm2 =0;
        try (Scanner sc = new Scanner(new FileReader("res/Day2.txt"))) {
            String read;
            while (sc.hasNextLine()) {
                counter =0;
                read = sc.nextLine();
                if(read.charAt(1) == 45){
                    min = Integer.parseInt(read.substring(0,1));
                    read= read.substring(2);
                }else{
                    min = Integer.parseInt(read.substring(0,2));
                    read= read.substring(3);
                }
                if(read.charAt(1) == 32){
                    max = Integer.parseInt(read.substring(0,1));
                    read= read.substring(2);
                }else{
                    max = Integer.parseInt(read.substring(0,2));
                    read= read.substring(3);
                }
                letter = read.charAt(0);
                password = read.substring(3);
                for (int i = 0; i < password.length() ; i++) {
                    if (password.charAt(i) == letter){
                        counter++;
                    }
                }
                if (min <= counter && max >= counter){
                    confirm++;
                }
                counter = 0;

                    if ((password.charAt(min-1) == letter) && (password.charAt(max-1) != letter)){
                        confirm2++;
                    }
                    if  (((password.charAt(min-1) != letter) && (password.charAt(max-1) == letter))){
                        confirm2++;
                    }
            }
            System.out.println(confirm);
            System.out.println(confirm2);
        } catch (IOException e) {
            System.out.println("Error while reading file!");
        }
    }
}
