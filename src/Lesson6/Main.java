package Lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if(i % 3 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }

        int  i = 0;
        while(i < 10){
            System.out.print(i + " ");
            i++;
        }



        Scanner scanner = new Scanner(System.in);
        int n3 = 0;
        do {
            n3 = scanner.nextInt();
            System.out.println(n3);

        } while (n3 !=0);


    }
}
