package edu.sjsu.assignment1;

import java.util.Scanner;

public class MyTime {
    public static void printTimeDifference(String x, String y){
        int time_x=Integer.parseInt(x); //change data type to int
        int time_y=Integer.parseInt(y);

        int hour_x = time_x/100; //get hours
        int minu_x = time_x%100; //get minutes

        int hour_y = time_y/100;
        int minu_y = time_y%100;

        if (time_x>time_y){
            int h = (((hour_y+24)*60+minu_y) - (hour_x*60+minu_x))/60;
            int m = (((hour_y+24)*60+minu_y) - (hour_x*60+minu_x))%60;
            System.out.printf("%d hours %d minutes", h,m);
        }else {
            int h = ((hour_y*60+minu_y) - (hour_x*60+minu_x))/60;
            int m = ((hour_y*60+minu_y) - (hour_x*60+minu_x))%60;
            System.out.printf("%d hours %d minutes", h,m);
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("first time");
        String time1 = scanner.nextLine();
        System.out.println("second time");
        String time2 = scanner.nextLine();
        printTimeDifference(time1,time2);
    }

}