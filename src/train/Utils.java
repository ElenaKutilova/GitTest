package train;

import java.util.Arrays;

public class Utils {

    public static int taskNumber1 = 5;
    public static String n = "\n";
    public static String line = "___________________________________________";

    public static void task(int a) {
        System.out.println("\n" + "____task #" + taskNumber1 + "____" + "\n");
        taskNumber1++;
    }

    public static void verifyEqualsInt(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "Pass" +  "\u001B[0m" + n);
        } else {
            System.out.println("\u001B[31m" + "Fail" +  "\u001B[0m" + n);
        }
    }

    public static void verifyEqualsString(String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult) == true) {
            System.out.println("\u001B[32m" + "Pass" +  "\u001B[0m" + n);
        } else {
            System.out.println("\u001B[31m" + "Fail" +  "\u001B[0m" + n);
        }
    }

    public static void verifyEqualsDouble(double expectedResult, double actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m" + n);
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m" + n);
        }
    }

  /*  public static void countIndexOfArr (int a) {
        int ind = 0;
        int[] arr;
        for (int i = 0; i < arr.length ; i++) {
            ind = ind ++;
        }

    }*/

    public static void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main (String[] args) {


    }

}
