package com.company.day4;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Day4 {
    public static ArrayList<String[]> getData(File f){
        Scanner sc = null;
        try{
            sc = new Scanner(f);
        }
        catch (FileNotFoundException e){
            System.out.println("File could not be opened");
        }
        String s = "";
        while(sc.hasNextLine()){
            s = s + sc.nextLine() + "\n";
        }
        String[] individualPassportStrings = s.split("\\n\\n");
        ArrayList<String[]> individualPassportArrays = new ArrayList<>();
        for(String passportString : individualPassportStrings){
            for(int i = 0; i < passportString.length(); i++){
                if(passportString.charAt(i) == '\n'){
                    passportString = passportString.substring(0,i) + " " + passportString.substring(i+1);
                }
            }
            String[] passportArray = passportString.split(" ");
            individualPassportArrays.add(passportArray);
        }
        return individualPassportArrays;
    }

    public static void main(String[] args) {
        File f = new File("src\\day4\\passports");
        ArrayList<String[]> data = getData(f);
        int validPassportCounter = 0;
        for(int h = 0; h < data.size();h++){
            boolean hasByr = false;
            boolean hasIyr = false;
            boolean hasEyr = false;
            boolean hasHgt = false;
            boolean hasHcl = false;
            boolean hasEcl = false;
            boolean hasPid = false;
            for(int u = 0; u < data.get(h).length; u++){
                if(data.get(h)[u].substring(0,3).equals("byr")){
                    hasByr = true;
                }
                if(data.get(h)[u].substring(0,3).equals("iyr")){
                    hasIyr = true;
                }
                if(data.get(h)[u].substring(0,3).equals("eyr")){
                    hasEyr = true;
                }
                if(data.get(h)[u].substring(0,3).equals("hgt")){
                    hasHgt = true;
                }
                if(data.get(h)[u].substring(0,3).equals("hcl")){
                    hasHcl = true;
                }
                if(data.get(h)[u].substring(0,3).equals("ecl")){
                    hasEcl = true;
                }
                if(data.get(h)[u].substring(0,3).equals("pid")){
                    hasPid = true;
                }
            }
            if(hasByr && hasIyr && hasEyr && hasHgt && hasHcl && hasEcl && hasPid){
                validPassportCounter++;
            }
        }
        for(String[] k : data){
            System.out.println(Arrays.toString(k));
        }
        System.out.println("Number of valid passports: " + validPassportCounter);
    }
}
