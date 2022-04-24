package homework.hw8;

import train.Utils;

import java.util.Arrays;

import static train.Utils.*;


public class HW8 {

    public static void table (Integer objInt, Integer objInt1, Double objDbl, Double objDbl1, String objStr,
                              String objStr1){
        String line = "_____________________________________________________";
        String line2 = "-----------------------------------------------------";
        String stick = "|";
        String threeTabs = "           ";
        String tab = "  ";
        System.out.println(line);
        System.out.println(stick + "HW8" + threeTabs + stick + "HW8_1" + threeTabs + stick + "areEquals?");
        System.out.println(line2);
        System.out.println(stick + objInt + threeTabs + " " + stick + objInt1 + threeTabs + "   " + stick
                + objInt.equals(objInt1));
        System.out.println(line2);
        System.out.println(stick + objDbl + "         " + stick + objDbl1 + threeTabs + stick + objDbl.equals(objDbl1));
        System.out.println(line2);
        System.out.println(stick + objStr + "  " + stick + objStr1 + "    " + stick + objStr.equals(objStr1));
        System.out.println(line);
    }

    //Написать метод, который принимает на вход 5 целых чисел,  и возвращает массив из этих же чисел
    public static int[] fiveIntbArr (int num1 ,int num2,int num3,int num4,int num5) {
        int[] arr1 = new int[] {num1, num2, num3, num4, num5};
        System.out.println(Arrays.toString(arr1));
        return arr1;
    }

    // Написать метод, который принимает на вход 5 чисел типа double,  и возвращает массив из этих же чисел
    public static double[] fiveDblArr (double num1, double num2, double num3, double num4, double num5) {
       double[] arr2 = new double[] {num1, num2, num3, num4, num5};
        System.out.println(Arrays.toString(arr2));
        return arr2;
    }

    //Написать метод, который принимает на вход 5 слов, и возвращает массив из этих слов
    public static String[] fiveStrArr (String str1, String str2, String str3, String str4, String str5) {
        String [] arr3 = new String[] {str1, str2, str3, str4, str5};
        System.out.println(Arrays.toString(arr3));
        return arr3;
    }

    //Написать метод, который принимает на вход массив целых чисел,  и возвращает массив тех же чисел, умноженных на 2.5
    public static double[] multByTwoDotFive (int num1 ,int num2,int num3,int num4,int num5) {
        double[] arr4 = new double[] {num1, num2, num3, num4, num5};
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = arr4[i] * 2.5;
        }
        System.out.println(Arrays.toString(arr4));
        return arr4;
    }
    //Написать метод, который принимает на вход массив целых положительных чисел,
    // и возвращает количество четных чисел в этом массиве
    public static int evensInArr(int[] arr ) {
        int countEvenIndex = 0;
                for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    countEvenIndex ++;
                }
            }
        System.out.println(countEvenIndex);
        return countEvenIndex;
    }

    //Написать метод, который принимает на вход массив целых положительных чисел,  и возвращает массив нечетных чисел

    public static int oddInArr(int [] arr) {
        int countOddIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                countOddIndex ++;
            }
        }
        System.out.println(countOddIndex);
        return countOddIndex;
    }
    //Написать метод, который принимает на вход массив целых чисел,
    // и возвращает массив значений true или false, если числа больше 10

    public static boolean[] numbMoreThanTen (int[] arr) {
        boolean[] moreThanTen = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 10) {
                moreThanTen[i] = true;
            }else {
                moreThanTen[i] = false;
            }

        }
        System.out.println(Arrays.toString(moreThanTen));
    return moreThanTen;
    }
//Написать метод, который принимает на вход массив слов,  и возвращает строку, состоящую из этих слов
    /*public static String returnThisWords (String[] arr) {
return
    }*/


    public static void main(String[] args) {
        task(5);
        Integer intObject = 47;
        Double dblObject = 23.23;
        String strObject = "take it easy";

        task(6);
        HW8_1 object = new HW8_1();
        table(intObject, object.intObject1, dblObject, object.dblObject1, strObject, object.strObject1);

        task(7);
        fiveIntbArr(1,2,3,4,5);

        task(8);
        fiveDblArr(0.54, 364.33, -367.4, 2.35, 0.0);

        task(9);
        fiveStrArr("корабли", "лавировали", "но", "не", "вылавировали");

        task(10);
        multByTwoDotFive(23, -88, 2490, 9, 0);

        task(11);
        int[] arr = new int[]{4, 6, 3, 77, 119985};
        evensInArr(arr);

        task(12);
        int[] arr1 = new int[]{4, 6, 3, 77, 119985};
        oddInArr(arr1);

        task(13);
        numbMoreThanTen(arr1);




    }



}
