package Patterns;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of lines: ");
        int n=sc.nextInt();
        pat(n);
    }
    static void pat(int lines){
        for (int row=1;row<=lines;row++){
            for(int cols=1;cols<=4;cols++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
