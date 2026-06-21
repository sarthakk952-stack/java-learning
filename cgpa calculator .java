package com;
import java.util.Scanner;
public class Main{
    public static void main (String [] args){
        System.out.println("CGPA calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Subject 1 score");
        int a = sc.nextInt();
        System.out.println("Subject 2 score");
        int b =sc.nextInt();
        System.out.println("Subject 3 score");
        int c = sc.nextInt();
        double cgpa = (((a+b+c)*100.0)/300)/9.5;
        System.out.print("Your CGPA is: ");
        System.out.println(cgpa);
    }

}
