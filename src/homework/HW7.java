package homework;

import train.Utils;

import java.util.Arrays;

public class HW7 {
    public static String line = "___________";
    // Написать метод, который принимает на вход массив int, и возвращает среднее значение. Проверить работу метода тестом, если параметр - массив catsAges

    public static double avarage(int[] arr) {
        double sumArr = 0;
        for (int i = 0; i < arr.length; i++) {
            sumArr += arr[i];
        }
        double avarageArr = sumArr / arr.length;

        return avarageArr;
    }

    public static void verifyEqualsDouble(double expectedResult, double actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m" + "\n");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m" + "\n");
        }
    }

    //Создать метод, который принимает на вход массив int,  и возвращает минимальное значение, максимальное значение
// и среднее значение всех чисел массива. Проверить работу метода на массиве из задания 20.

    /*public static void minMaxAver(int[] random) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double averageSum = 0;

        for (int i = 0; i < random.length; i++) {
            if (min > random[i]) {
                min = random[i];
            }
        }
        System.out.println("min = " + random[i]);

        for (int j = 0; j < random.length; j++) {
            if (max < random[j]) {
                max = random[j];
            }
         }
            System.out.println("max = " + random[j]);

        //averageSum += random[i];
    }

   // double averageTotal = averageSum / random.length;


          //  System.out.println("average = "+ averageTotal); */



    //Создать массив четных чисел и массив нечетных чисел из элементов массива из задания 20.
   /* public static void arrays (int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                int[] arr1 = new int[i];
                System.out.println(arr1[arr1.length]);
            }
            if (arr[i] % 2 != 0){
                int[] arr2 = new int[i];
                System.out.println(arr[arr2.length]);
            }
        }
    } */






    public static void main(String[] args) {
        Utils.task(1);
        String[] catsNames = new String[8];
        catsNames[0] = "Мурзик";
        catsNames[1] = "Васька";
        catsNames[2] = "Мурка";
        catsNames[3] = "Степан";
        catsNames[4] = "Маруська";
        catsNames[5] = "Леопольд";
        catsNames[6] = "Матильда";
        catsNames[7] = "Сократ";

        Utils.task(2);
        catsNames[1] = "Черныш";
        catsNames[4] = "Рыжик";

        Utils.task(3);
        String[] catsColors = new String[]{"серый", "red", "серый", "черепаховый", "рыжий", "серый", "рыжий",
                "серый"};

        Utils.task(4);
        int[] catsAges = new int[8];
        catsAges[0] = 1;
        catsAges[1] = 3;
        catsAges[2] = 4;
        catsAges[3] = 2;
        catsAges[4] = 10;
        catsAges[5] = 4;
        catsAges[6] = 1;
        catsAges[7] = 13;
        System.out.println(Arrays.toString(catsAges));

        Utils.task(5);
        String red = "рыжий";
        boolean[] isCatRed = new boolean[]{red.equals(catsColors[0]), red.equals(catsColors[1]),
                red.equals(catsColors[2]), red.equals(catsColors[3]), red.equals(catsColors[4]),
                red.equals(catsColors[5]), red.equals(catsColors[6]), red.equals(catsColors[7])};
        //{false, false, false, false, true, false, true, false};

       /* isCatRed [0] = red.equals(catsColors[0]);
        isCatRed [1] = red.equals(catsColors[1]);
        isCatRed [2] = red.equals(catsColors[2]);
        isCatRed [3] = red.equals(catsColors[3]);
        isCatRed [4] = red.equals(catsColors[4]);
        isCatRed [5] = red.equals(catsColors[5]);
        isCatRed [6] = red.equals(catsColors[6]);
        isCatRed [7] = red.equals(catsColors[7]); */

        for (int i = 0; i < 8; i++) {
            System.out.println(isCatRed[i]);
        }

        Utils.task(6);
        System.out.println(catsNames[6]);
        System.out.println(line);
//имена котов из коробок с четными индексами
        for (int i = 0; i < 8; i += 2) {
            System.out.println(catsNames[i]);
        }
        System.out.println(line);

//имена котов из коробок, чьи индексы кратны 4
        for (int i = 0; i < 8; i++) {
            if (i % 4 == 0) {
                System.out.println(catsNames[i]);
            }
        }
        System.out.println(line);

//цвет котов из коробок с нечетными индексами
        for (int i = 0; i < 8; i++) {
            if (i % 2 != 0) {
                System.out.println(catsColors[i]);
            }
        }
        System.out.println(line);

//цвет котов из коробок, чьи индексы кратны 3
        for (int i = 0; i < 8; i++) {
            if (i % 3 == 0) {
                System.out.println(catsColors[i]);
            }
        }
        System.out.println(line);

        Utils.task(7);
//Распечатать “Накорми кота!” для всех серых котов
        for (int i = 0; i < 8; i++) {
            if (catsColors[i].equals("серый")) {
                System.out.println(i + "(" + catsNames[i] + ") накорми кота ");

            }
        }

        Utils.task(8);
//Распечатать “Отнеси кота на прививку!”, если возраст кота меньше 2 лет
        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] < 2) {
                System.out.println(i + "(" + catsNames[i] + ") отнеси кота на прививку");
            }
        }

        Utils.task(9);
        //Для кота в последней коробке распечатать имя, цвет, возраст
        for (int i = 0; i < catsNames.length ; i++) {
            if (catsNames.length == catsColors.length && catsNames.length==catsAges.length)
                if ( i == (catsNames.length-1)){
                    System.out.println(catsNames[7] + " " + catsColors[7] + " " + catsAges[7]);
                }
        }

        Utils.task(10);
//Распечатать имена всех котов, чей возраст больше 2 лет
        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] > 2) {
                System.out.println(catsNames[i]);
            }
        }

        Utils.task(11);
        //Распечатать “Накорми кота!” если имя кота “Рыжик” и значение isCatRed == true
       if (catsNames.length == isCatRed.length && catsNames.length !=0) {
           for (int i = 0; i < catsNames.length; i++) {
               if (catsNames[i].equals("Рыжик") && isCatRed[i] == true) {
                   System.out.println(i + " (" + catsNames[i] + ")" + " Накорми кота!");
               }
           }
       }
        Utils.task(12);
//Распечатать средний возраст котов из массива catsAges
        double sum = 0;
        for (int i = 0; i < catsAges.length; i++) {
            sum += catsAges[i];
        }
        double catsAgeAvarage = sum / catsAges.length;
        System.out.println(catsAgeAvarage);

        Utils.task(13);
// Распечатать возраст самого молодого кота
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < catsAges.length; i++) {
            if (min > catsAges[i]) {
                min = catsAges[i];
            }
        }
        System.out.println(min);

        Utils.task(14);
        //Распечатать возраст самого старого кота
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < catsAges.length; i++) {
            if (max < catsAges[i]) {
                max = catsAges[i];
            }
        }
        System.out.println(max);

        Utils.task(15);
        int greyCats = 0;
        for (int i = 0; i < catsAges.length; i++) {
            if (catsColors[i].equals("серый")) {
                greyCats = greyCats + 1;
            }
        }
        System.out.println(greyCats);


        Utils.task(16);
        //Распечатать имя кота, если кот находится в коробке с четным индексом и его возраст не больше 3 лет
        if (catsAges.length == catsNames.length && catsNames.length != 0){
        for (int i = 0; i < catsNames.length; i++) {
            if (i % 2 == 0 && catsAges[i] < 4) {
                System.out.println(catsNames[i]);
                }
            }
        }

        Utils.task(17);
        // Создать массив четных положительных чисел, значения которых не больше 10. (заполняем значения с
        // помощью цикла for)
        int countIndex = 0;
        for (int i = 0; i < 11; i += 2) {
            countIndex = countIndex + 1; //количество элементов массива
        }
        int[] arrEven = new int[countIndex];
        int value = 0;
        for (int j = 0; j < arrEven.length; j++) {
            arrEven[j] = value;
            value += 2;
            System.out.println(arrEven[j]);
        }
// Написать метод, который принимает на вход массив int, и возвращает среднее значение. Проверить работу метода
// тестом, если параметр - массив catsAges
        Utils.task(18);
        avarage(catsAges);
        System.out.println(avarage(catsAges));
        verifyEqualsDouble(4.75, avarage(catsAges));

// Создать массив нечетных отрицательных чисел в промежутке от -1000 до -900

        Utils.task(19);
        int countIndex2 = 0;
        for (int i = -999; i < -900; i += 2) {
            countIndex2 = countIndex2 + 1;
        }
        System.out.println(countIndex2);

        int[] arrMinuss = new int[countIndex2];
        int val = -999;
        for (int j = 0; j < arrMinuss.length; j++) {
            arrMinuss[j] = val;
            val += 2;
            System.out.println(arrMinuss[j]);
        }

        Utils.task(20);
        // Создать массив из 10 случайных положительных целых чисел
        int[] randomNumbs = new int[10];
               for (int i = 0; i < randomNumbs.length; i++) {
            randomNumbs[i] = (int) (Math.random() * Integer.MAX_VALUE);
            System.out.println(randomNumbs[i]);
        }

        Utils.task(21);
//Создать метод, который принимает на вход массив int,  и возвращает минимальное значение, максимальное значение
// и среднее значение всех чисел массива. Проверить работу метода на массиве из задания 20.


        Utils.task(22);
        //Создать массив четных чисел и массив нечетных чисел из элементов массива из задания 20.












    }






}
