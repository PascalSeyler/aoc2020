package com.company.day5;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day5 {
    public static void solve(){
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<Integer> rows = new ArrayList<>();
        ArrayList<Integer> columns = new ArrayList<>();
        try (Scanner sc = new Scanner(new FileReader("res/Day5.txt"))) {
            while (sc.hasNextLine()){
                arr.add(sc.nextLine());
            }
            for (String seat:arr) {
                int counter =0;
                int rowmin =0;
                int rowmax = 127;
                int rowdiff = 128;
                int row = -1;


                for (int j = 0; j <6; j++) {

                    if (seat.charAt(j) == 'B' && j <7) {
                        rowdiff /= 2;
                        rowmin += rowdiff;
                    }else if (seat.charAt(j) == 'F' && j <7){
                        rowdiff /= 2;
                        rowmax -= rowdiff;
                    } else if (rowmax-rowmin ==0 && j <8){
                        rows.add(rowmax);
                    }else System.out.println("hi");
                }
            }
            for (String seats: arr ) {
                int columnmin  = 0;
                int columnmax  = 7;
                int columndiff = 8;
                int column = -1;
                seats=seats.substring(7);
                for (int i = 0; i < seats.length(); i++) {
                    if(i==0) System.out.println("");
                    if (seats.charAt(i) == 'L') {
                        columndiff /= 2;
                        columnmax -= columndiff;
                        //System.out.println("left");
                    }else if (seats.charAt(i) == 'R'){
                        columndiff /= 2;
                        columnmin += columndiff;
                       // System.out.println("right");
                    }
                    if (columnmax-columnmin ==0){
                        column = columnmax;
                        columns.add(column);
                    }else if (i==2){
                        System.out.println("not working properly");
                        System.out.println(columndiff);
                    }
                }
            }
            int max=-1;
            for (int i = 0; i < rows.size(); i++) {
                if ((rows.get(i) * 8 + columns.get(i))>max){
                    max=rows.get(i) * 8 + columns.get(i);
                }
            }
            System.out.println(rows.get(5));
            System.out.println(max);

        } catch (IOException e) {
            System.out.println("Error while reading file!");
        }
    }
}
