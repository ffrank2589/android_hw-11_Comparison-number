package com.example.lib;

import java.util.Scanner;

public class hw11 {
    public static void main(String[] s) {
        int x=0;
        int y=0;
        int z=0;
        int t=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input number:");

        x= scanner.nextInt();
        y= scanner.nextInt();
        z= scanner.nextInt();

        if(x>y)
        {
            t=x;
            x=y;
            y=t;
        }

        if(x>z)
        {
            t=x;
            x=z;
            z=t;
        }

        if(y>z);
        {
            t=y;
            y=z;
            z=t;
        }
        System.out.println(x+","+y+","+z);
    }
}
