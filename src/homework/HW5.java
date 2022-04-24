package homework;

import java.sql.SQLOutput;

public class HW5 {

    public static int taskNumber = 2;
    public static String n = "\n";
    public static String line = "___________________________________________";

    public static void numberOfTask() {
        String line1 = "_________________________________ Task# ";
        String line2 = "_________________________________";
        System.out.println(n + line1 + taskNumber + line2);
        taskNumber++;
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
            System.out.println("\u001B[32m" + "Pass" +  "\u001B[0m" + n);
        } else {
            System.out.println("\u001B[31m" + "Fail" +  "\u001B[0m" + n);
        }

    }

    public static String dayOfWeek (int dayNumb) {
        String dayToday = " ";

        if (dayNumb == 1) {
            dayToday = "понедельник";
        }
        if (dayNumb == 2) {
            dayToday = "вторник";
        }
        if (dayNumb == 3) {
            dayToday = "среда";
        }
        if (dayNumb == 4) {
            dayToday = "четврег";
        }
        if (dayNumb == 5) {
            dayToday = "пятница";
        }
        if (dayNumb == 6) {
            dayToday = "суббота";
        }
        if (dayNumb == 7) {
            dayToday = "воскресенье";
        }
        System.out.println(dayToday);

        return dayToday;
    }

    public static int maxValueOfThree (int numb1, int numb2, int numb3) {
        int largest = 0;
        if (numb1 > numb2 && numb1 > numb3) {
            largest = numb1;
        } else if (numb2 > numb1 && numb2 > numb3) {
            largest = numb2;
        } else {
            largest = numb3;
        }
        System.out.println("the largest value = " + largest);
        return largest;
    }

    public static int minValueOfThree (int numb1, int numb2, int numb3 ) {
        int min = 0;
        if (numb1 < numb2) {
            min = numb1;
        }else {
            min = numb2;
        }
        if (min > numb3) {
            min = numb3;
        }else {
            min = min;
        }
        System.out.println(min);
        return min;
    }

    public static double averageCatsTemp (double numb1,double numb2,double numb3,double numb4,double numb5){
        double[] catArr = {numb1,numb2,numb3, numb4, numb5};
        int i = 0;
        double catsSumTemp = 0;
        double averageTemp;
        for (i = 0; i < catArr.length; i++) {
            catsSumTemp += catArr[i];
        }
        averageTemp = catsSumTemp / catArr.length;
        System.out.println(averageTemp);

        return averageTemp;
    }

    public static int minOfThree (int numb1, int numb2, int numb3) {

        System.out.println(Math.min(Math.min(numb1, numb2), numb3));
        return Math.min(Math.min(numb1, numb2), numb3);
    }

    //написать метод, который принимает на вход десятичное число (например, 10.75), и возвращает строку “10 руб 75 коп”

    public static String howManyMoney (double numb) {

        int numbInt = (int) numb;
        String text = numbInt + " рублей " + Math.round((numb % 1) * 100) + " копеек";
        return text;
    }

    //Написать метод, который принимает на вход десятичное число и возвращает строку “10 кг 75 гр”.
    public static String howManyKg (double numb) {
        int numbInt = (int) numb;
        String text = numbInt + " кг " + Math.round((numb % 1)*1000) + " гр";

        return text;

        }


    //Написать метод, который принимает на вход 2 параметра -  цену и количество товара
    // (может быть вес товара, или количество в штуках). Алгоритм возвращает сумму покупки в виде десятичного числа
        public static double howMuchIsTheFish (double numb1, double numb2) {
           // String text1 = numb1 + " руб.";
            //String text2 = numb2 + " кг.";
           // System.out.println(text1 + "    " + text2 + "    " + "сумма покупки " + numb1*numb2 + " руб.");
            return numb1 * numb2;

            }

//Написать метод, который принимает на вход необходимые параметры, и печатает чек.
//Например:
//
//Яблоки
//Цена за 1 кг			50 руб 13 коп
//Количество товара	         3 кг 400 гр
    public static String checkPlease (String productToBuy, double numb1, double numb2) {

         String check = productToBuy + n + "цена за 1 кг.            " + howManyMoney(numb1)  + n
                + "количество товара        " + howManyKg(numb2) + n + line + n +  "сумма к оплате             "
                    + howMuchIsTheFish(numb1,numb2);
        System.out.println(check);

        return check;
    }
    /*написать метод, который принимает на вход год рождения и возвращает ваше счастливое число. Счастливое число
    рассчитывается по формуле: сумма всех чисел, если результат больше 9, снова считается сумма всех чисел.

            Например:
    год рождения 1999
            1 + 9 + 9 + 9 = 28
            2 + 8 = 10
            1 + 0 = 1
    Счастливое число - 1 */
    public static int happyNumb (int numb) {
        int sum = (numb % 1000) + (numb % 100) + (numb % 10) + (numb % 1);
            if (sum > 10) {
            sum = sum / 10 + sum / 1;
            System.out.println(sum);
        } else {
            System.out.println(sum) ;
        }
         return sum;

    }



    //19 Написать метод, который возвращает случайное число в пределах от 1 до 99 включительно.
    public static int randomInt () {
        int num1 = (int) (Math.random() * 99) + 1;
        return num1;
    }

    public static void main (String [] args){

        String str = "";

        numberOfTask();
        verifyEqualsString("среда",dayOfWeek(3));

        numberOfTask();
        int x = 16;
        int y = -567;
        int z = 783;
        int largest = z;
        verifyEqualsInt(largest,maxValueOfThree(x, y, z));

        numberOfTask();
        int a = 9;
        int b = -8;
        int c = 123;
        verifyEqualsInt(b,minOfThree(a, b, c));
        verifyEqualsInt(b,minValueOfThree(a, b, c));

        //Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота
        numberOfTask();
        double average = ((37.8 + 40.3 + 38.2 + 37.4 + 39.0)/5);
        verifyEqualsDouble(average,averageCatsTemp(37.8, 40.3, 38.2, 37.4, 39.0));

        numberOfTask();
        //написать метод, который принимает на вход десятичное число (например, 10.75), и возвращает строку “10 руб 75 коп”
       str = "6 рублей 5 копеек";
       verifyEqualsString(str, howManyMoney(6.05));

       numberOfTask();
       //Написать метод, который принимает на вход десятичное число и возвращает строку “10 кг 75 гр”.
        double numb = 10.75;
        str = "10 кг 75 гр";
        verifyEqualsString(str, howManyKg(10.75));

        //Написать метод, который принимает на вход 2 параметра -  цену и количество товара
        // (может быть вес товара, или количество в штуках). Алгоритм возвращает сумму покупки в виде десятичного числа.

        numberOfTask();
        double cost = 634.80;
        double count = 10.01;
        verifyEqualsDouble(cost*count, howMuchIsTheFish(cost,count));

//Написать метод, который принимает на вход необходимые параметры, и печатает чек.
        numberOfTask();
        str = "рыба";
        String howMuchIsTheFish  =  str + n + "цена за 1 кг.            634 рублей 88 копеек" + n
                + "количество товара        10 кг 10 гр"  + n + line + n +  "сумма к оплате             "
                + cost * count;
                verifyEqualsString(howMuchIsTheFish,checkPlease(str,cost,count));

        numberOfTask();
        //  Написать метод, который принимает на вход количество часов работы в день и стоимость одного часа работы, и возвращает заработную плату в месяц
        numberOfTask();
        //Написать метод, который принимает на вход необходимые параметры и печатает строку ведомости выдачи зарплаты сотрудникам.
        numberOfTask();
        // Записать в виде метода:
        numberOfTask();
        happyNumb(1999);























    }


}