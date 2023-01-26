package Lesson5;

public class Main {
    public static void main(String[] args) {

        int number = -13;

        boolean evenOrGraterZero = number % 2 == 0 && number > 0;
        boolean notEqualThirtheen = number != 13;
        if(evenOrGraterZero || notEqualThirtheen){
            System.out.println(number + " is even or > 0");
        } else{
            System.out.println("not equals");
        }

        int number2 = 1;

        if (number2 == 3){
            System.out.println("1");
        } else if (number2 == 2){
            System.out.println("2");
        } else if (number2 == 3){
            System.out.println("3");
        }  else {
            System.out.println(number2);


            double a = 5.0d;
            long l = 6;
            var al = a + l;

            }
        }



}










