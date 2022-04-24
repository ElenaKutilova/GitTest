package homework;

import train.Utils;
//Написать метод, который принимает на вход параметры start,  end, step, и печатает последовательность
// десятичных  чисел, начиная с числа start, с шагом step. Точка выхода из цикла - число end.


public class HW6 {
    Utils taskNumb = new Utils();

    /*public static void startEndStep (double start, double end, double step) {
        if(step == 0) {
            System.out.println("false");
        }
        if(start == end) {
            System.out.println("false");
        }
        if (end > start) {
            step = -step;
        }
        for (double i = start;  i < end; i += step){
                    String ii = String.format("%,2f",i);
                    System.out.println(ii);
                }
    }*/

    // Написать метод, который принимает параметр l и печатает  последовательность четных чисел от нуля.
    // Длина последовательности = l.
    public static void methodOfL(int l) {

            for (int i = 0; i <= l*2; i++ ){
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    public static double formatDouble(double number, int d) {
        int num = (int) Math.round(number * Math.pow(10, d));
        number = num / Math.pow(10, d);
        return number;
    }

    public static void main (String [] args) {
        Utils.task(1);
        //Распечатать последовательность чисел от 0 до 9 включительно.
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        Utils.task(2);
        //Распечатать последовательность чисел от 10 исключительно до 0 включительно.
        for (int i = 9; i > -1 ; i--) {
            System.out.println(i);
        }

        Utils.task(3);
        //Распечатать последовательность чисел от 50 до 55 включительно с шагом 2.
        for (int i = 50; i < 56; i +=5) {
            System.out.println(i);
        }

        Utils.task(4);
        //Распечатать последовательность чисел, кратных 7, в промежутке (327, 300)
        for (int i = 326; i > 300; i--) {
            if ( i % 7 == 0) {
                System.out.println(i);
            }
        }

        Utils.task(5);
        //Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1
        for (double i = 12; i <=13; i+= 0.1) {
                      System.out.println(i);
        }

        Utils.task(6);
        //Распечатать последовательность четных чисел от 215 до 237 включительно
        for (int i = 215; i < 238; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        Utils.task(7);
        //Распечатать последовательность чисел, кратных 7, в промежутке от 7 исключительно до 14 исключительно.
        for (int i = 8; i < 14; i ++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }

        Utils.task(8);
        //Распечатать последовательность которая начинается с минимального значения типа данных short и заканчивается
        // максимальным значением short. Числа в последовательности должны быть кратны 15001.
        for ( short i = Short.MIN_VALUE; i < Short.MAX_VALUE; i++) {
            if (i % 15001 == 0) {
                System.out.println(i);
            }
        }

        Utils.task(9);
        //Распечатать последовательность чисел в промежутке от -10 до 34 включительно. Числа, кратные 11, должны быть
        // распечатаны синим цветом. Числа, кратные 12, должны быть распечатаны красным цветом. А ноль необходимо
        // распечатать словом ZERO.
        for (int i = -10; i < 35; i++) {
            if (i % 11 == 0 && i != 0) {
                System.out.println("\u001B[36m" + i + "\u001B[0m");
            }
            if (i % 12 == 0 && i != 0) {
                System.out.println("\u001B[31m" + i + "\u001B[0m" );
            }
            if (i == 0) {
                System.out.println("Zero");
            }
        }

        Utils.task(10);
        //Написать метод, который принимает на вход параметры start,  end, step, и печатает последовательность
        // десятичных  чисел, начиная с числа start, с шагом step. Точка выхода из цикла - число end.
        //startEndStep(0.5, 2.5, 0.5);

        Utils.task(11);
        //Написать метод, который принимает параметр l и печатает  последовательность четных чисел от нуля.
        // Длина последовательности = l.
        methodOfL(11);

        Utils.task(19);
        //public static double formatDouble(double number, int d){
        //        int num = (int)Math.round(number * Math.pow(10, d));
        //        number = num / Math.pow(10, d);
        //        return number;






    }





}
