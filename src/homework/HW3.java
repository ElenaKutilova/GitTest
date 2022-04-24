package homework;

import java.sql.SQLOutput;

public class HW3 {
    public static void main (String [] args) {
        String line = "_________________________________________________";
        String line2 = "-------------------------------------------------";
        String task = "task #";
        String stick = "|";
        String tab3 = "\t\t\t";
        String tab = "\t";
        String n = "\n";

        System.out.println(n + line + task + "2" + line + n);
        byte a = -23;
        byte b = 116;

        System.out.println( n + line + task + "3" + line+ n);
        short s = Short.MAX_VALUE;
        short t = Short.MAX_VALUE-60000;

        System.out.println( n + line + task + "4" + line+ n);
        int i = Integer.MIN_VALUE;
        int iMin = i;
        i = Integer.MAX_VALUE;
        int iMax = i;
        System.out.println(line + n + stick + tab + "int min" + tab + stick + tab + iMin + tab3 + tab3 + stick + n
                + line2 );
        System.out.println(stick + tab + "int max" + tab + stick + tab + iMax + tab3 + tab3 + stick + n + line2 );

        System.out.println( n + line + task + "5" + line+ n);
        long phoneNumber = 89172288445L;

        System.out.println( n + line + task + "6" + line+ n);
        float f = 100.101101F;
        double d = 100.101101;


        System.out.println( n + line + task + "6 & 7" + line+ n);
        Double dd = 10.09999 + 20.099999;
        Float ff = 10.09999F + 20.099999F;
        System.out.println(line + n + stick + "float f = " + tab + stick + tab + f + tab3 + stick + n
                + line2);
        System.out.println(stick + "double d = " + tab + stick + tab +d + tab3 + stick + n + line2 );
        System.out.println(stick + "double dd" + tab3 + tab + stick + tab + dd + tab + stick + n + line2 );
        System.out.println(stick + "float ff" + tab3 + tab + stick + tab + ff + tab3+ stick + n + line2 );

        System.out.println( n + line + task + "8" + line+ n);
        double result = 10*1.0/3;
        System.out.println(result);


        System.out.println( n + line + task + "9" + line+ n);
        double sum = f+d;
        double product = f*d;
        double quotient = f / d;
        double remainder = f % d;
        String tab2 = "\t\t";
        System.out.println(sum + n + product + n + quotient + n + remainder + n);


        System.out.println( n + line +  task + "10" + line + n);
        System.out.println( n + tab +":" + tab2 + ":" + tab2 + "........" + tab2 + ":" + tab2 + ":" + tab3 + "......");
        System.out.println( n + tab +":" + tab2 + ":" + tab2 + ":" + tab2 + tab2 + ":" + tab2 + ":" + tab3
                + ":    :");
        System.out.println( n + tab +":" + "......."+ ":" + tab2 + ":......." + tab2 + ":" + tab2 + ":" + tab3
                + ":    :");
        System.out.println( n + tab +":" + tab2 + ":" + tab2 + ":" + tab2 + tab2 + ":" + tab2 + ":" + tab3
                + ":    :");
        System.out.println( n + tab +":" + tab2 + ":" + tab2 + "........" + tab2 + ":....." + tab + ":....."
                + tab2 + "......");

        System.out.println( n + line +  task + "11" + line + n);
        Byte t1 = 0;
        Short t2 = 150;
        Byte t3 = -120;
        Float t4 = - 505.505F;
        Integer t5 = 100100;
        Long t6 = 100010001000L;
        Double t7 = 2.66666666666666;
        Float t8 = - 1000000.001F;
        Short t9 = 1010;
        System.out.println("Byte t1 = " + t1 + n + "Short t2 = " + t2 + n + "Byte t3 = " + t3 + n + "Float t4 = " + t4
                + n + "Integer t5 = " + t5 + n + "Long t6 = " + t6 + n + "Double t7 = " + t7 + n + "Float t8 = " + t8
                    + n + "Short t9 = " + t9 + n);

        System.out.println( n + line +  task + "12" + line + n);
        String line3 = "_____________________________________________________________________________";
        String line4 = "-----------------------------------------------------------------------------";
        System.out.println(line3 + n + stick + "type" + tab + stick + "Size in bits" + stick + "min" + tab3 +tab3
                + stick + "max" + tab3 +tab3 + stick);
        System.out.println(line4 + n + stick + Byte.TYPE + tab + stick + Byte.BYTES + tab3 + " " + stick
                + Byte.MIN_VALUE + tab3 + tab3 + stick + Byte.MAX_VALUE + tab3 + tab3 + stick);
        System.out.println(line4 + n + stick + Short.TYPE + tab + stick + Short.BYTES + tab3 + " " + stick
                + Short.MIN_VALUE + tab3 + tab2 + stick + Short.MAX_VALUE + tab3 + tab3 + stick);
        System.out.println(line4 + n + stick + Integer.TYPE + tab + stick + Integer.BYTES + tab3 + tab2 + stick
                + Integer.MIN_VALUE + tab3 + stick + Integer.MAX_VALUE + tab3 + tab + stick);
        System.out.println(line4 + n + stick + Long.TYPE + tab + stick + Long.BYTES + tab3 + " " + stick
                + Long.MIN_VALUE + stick + Long.MAX_VALUE + tab + stick);
        System.out.println(line4 + n + stick + Float.TYPE + tab + stick + Long.BYTES + tab + stick + Long.MIN_VALUE
                + tab3 + tab2 + stick + Long.MAX_VALUE + tab3 + tab2 + stick);
        System.out.println(line4 + n + stick + Double.TYPE + tab + stick + Double.BYTES + tab3 + " " + stick
                + Double.MIN_VALUE + tab3 + tab2 + stick + Double.MAX_VALUE + tab3 + tab2 + stick + n + line4);

        System.out.println( n + line + task + "13" + line + n);
        Integer num1 = 23;
        Integer num2 = 23;
        Boolean equals = num1.equals(num2);
        System.out.println (" Если num1 = num2, то результат сравнения методом .equal = " + equals);
        num1 = 23;
        num2 = 27;
        System.out.println (" Если num1 не равно num2, то результат сравнения методом .equal = " + equals);

        System.out.println( n + line + task + "14" + line + n);
        int number1;
        int number2;
        number1 = 23;
        number2 = 23;
        System.out.println("Если number1 = number2, то результат сравнения методом compare = "
                + Integer.compare(number1,number2));
        number1 = 43;
        number2 = 1002;
        System.out.println("Если number1 < number2, то результат сравнения методом compare =  "
                + Integer.compare(number1,number2));
        number1 = 3;
        number2 = -3;
        System.out.println("Если number1 > number2, то результат сравнения методом compare =  "
                + Integer.compare(number1,number2));

        System.out.println( n + line + task + "15" + line + n);
        Float f1 = 234.9999F; // можно ли с округлением в большую сторону
        System.out.println(f1.intValue());

        System.out.println( n + line + task + "16" + line + n);
        double d1 = 23.23;
        double d2 = -1564.22;
        System.out.println(Double.sum(d1, d2));

        System.out.println( n + line + task + "17" + line + n);
        f1 = 647.01F;
        Float f2 = 5673.0F;
        System.out.println(Integer.sum(f1.intValue(),f2.intValue()));

        System.out.println( n + line + task + "18" + line + n);
        Short short1 = 12000;
        Short short2 = 12300;
        System.out.println("12000 - 12300 = " + Short.compare(short1, short2));
        short1 = 12500;
        System.out.println("12500 - 12300 = " + Short.compare(short1, short2));

        System.out.println( n + line + task + "19" + line + n);
        String str1 = "123.56";
        String str2 = "123.55";
        Double doub1 = 124.56;
        Double doub2 = 123.55;
        System.out.println("doub1 - doub2 = " + (doub1 - doub2));


        System.out.println( n + line + task + "20" + line + n);
        double temp;
        temp = 41.0;
        double tempMax = temp;
        temp = 35.1;
        double tt2 = (tempMax + temp)/2;
        System.out.println(Math.round(tt2));

        System.out.println( n + line + task + "21" + line + n);
        Number j = Long.MAX_VALUE;
        j = 10;
        j = 10.999999999;
        System.out.println("Переменная j может принимать значения:n = " + Long.MAX_VALUE + n
        + "j =  " + j.intValue() + n + j.doubleValue());

        System.out.println( n + line + task + "22" + line + n);
        Integer numberInteger = 100;
        numberInteger.toString();
        System.out.println(numberInteger + 1);
        System.out.println(numberInteger.toString() + 1);
        System.out.println("int - т.к. +1 - суммирование, String - т.к. конкатинация");









































    }





}
