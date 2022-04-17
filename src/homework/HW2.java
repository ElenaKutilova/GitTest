package homework;

public class HW2 {
    public static void main(String [] args) {

        int k = 5;
        int l = 10;
        int m = 15;

        System.out.println(k + "\n" + l + "\n" + m + "\n");
        System.out.println(k + "" + l + "" + m + "");
        System.out.println(k + ", " + l + ", " + m + ", ");

        System.out.println("\n" + "k = " + k);
        System.out.println("l = " + l);
        System.out.println("m = " + m);

        /*Распечатать следующие выражения, где вместо … будет выведен результат арифметической операции:
        Sum of k and l = …
        k * m = …
        Разность переменных l и m = … */

        int sumKL = k+l;
        int subKM = k*m;
        int divLM = l-m;
        System.out.println("Sum of k and l = " + sumKL);
        System.out.println("k * m = " + subKM);
        System.out.println("Разность переменных l и m = " + divLM + "\n");

        /*Распечатать следующие выражения:
    Результат деления k на l = …, а остаток от деления  = …
       Результат деления k на m = …, а остаток от деления  = …
    Результат деления l на m = …, а остаток от деления  = …
    Результат деления m на k = …, а остаток от деления  = …
    продолжить со всеми возможными вариантами */

        int divKL = k/l;
        int residueKL = k%l;
        int divKM = k/m;
        int residueKM = k%m;
        int div_LM = l/m;
        int residueLM = l%m;
        int divLK = l/k;
        int residueLK = l%k;
        int divMK = m/k;
        int residueMK = m%k;
        int divML = m/l;
        int residueML = m%l;

        System.out.println("Результат деления k на l = " + (divKL) + " а остаток от деления  = " + residueKL);
        System.out.println("Результат деления k на l = " + (1.0*k/l) + " а остаток от деления  = " + residueKL);
        System.out.println("Результат деления k на m = " + (divKM) + " а остаток от деления  = " + residueKM);
        System.out.println("Результат деления k на m = " + (1.0*k/m) + " а остаток от деления  = " + residueKM);

        System.out.println("Результат деления l на m = " + (div_LM) + " а остаток от деления  = " + residueLM + "\n"
                + "Результат деления l на m = " + (1.0*l/m) + " а остаток от деления  = " + residueLM + "\n"
                     + "Результат деления m на k = " + (divMK) + " а остаток от деления  = " + residueMK+"\n"
                            + "Результат деления m на k = " + (1.0*m/k) + " а остаток от деления  = " + residueMK);

        System.out.println("Результат деления l на k = " + (divLK) + " а остаток от деления  = " + residueLK + "\n"
                + "Результат деления l на k = " + (1.0*l/k) + " а остаток от деления  = " + residueLK);

        System.out.println("Результат деления m на l = " + (divML) + " а остаток от деления  = " + residueML + "\n"
                + "Результат деления m на l = " + (1.0*m/l) + " а остаток от деления  = " + residueML);

        /*Создать переменные apple и  student и присвоить им значения 40 и 6 соотетственно. Распечатать выражение:
        Если … яблок поделить на … учеников, то каждый ученик получит по … яблок(a), и … яблок(а) останется учителю.
        Распечатать это же выражение со значениями 100 и 21./
         */

        int apple = 40;
        int student = 6;
        int divAS = apple/student;
        int residueAS = apple % student;
        System.out.println("\n" + "Если " + apple + " яблок поделить на " + student + " учеников, то каждый "
                + "ученик получит по " + divAS + " яблок(a), и " + residueAS + " яблок(а) останется учителю.");


        System.out.println();

        /*Распечатать вычисления и итоговый результат:
        Сумма чисел k, l, m++ и sumKLM-- = …, а разность m++ и  sumLKM */

        int sumLKM = l+k+m;
        int sumKLM = l+k+ m;

        sumKLM--;//m=14
        System.out.println(sumKLM);
        m++; // m=14
        System.out.println("\n" + "k + l + m++ + sumKLM-- =" + (k+l+m++ + sumKLM)); //m=15
        m--;
        System.out.println("m++ - sumLKM = " + (m - sumLKM) + "\n"); //m=16

        /* Показать, что число 48 кратно 8, и что оба этих числа - четные. А числа 47 и 49 - нечетные.8 */
        System.out.println("48 % 8 = " + (48 % 8) + "\n" + "8 % 2 = " + (8 % 2) + "\n" + "48 % 2 = " + (48 % 2) );
        System.out.println("47 % 2 = " + (47 % 2) + "\n" + "49 % 2 = " + (49 % 2) + "\n");

        /*Для всех заданий:
        x = 2,   y = 3,  a = k, b = l, c = m, d = y - x
        a. Вывести на печать математическое выражение из заданий 21, 22 и 23
        b. Посчитать значения из задания a и вывести результат на печать в виде таблицы.
        result21, result22 и result23 - результаты вычислений в каждом выражении */

        int x = 2;
        int y = 3;
        int a = k;
        int b = l;
        int c = --m; //m=15

        int d = y-x;
        int result21 = (x+3)*(x+3);
        int result22 = ((3+4*x)/5) - (10*(y-5)*(a+b+c)/x) + (9*(4/x+(9+x)/y));
       // int result23 = (((5*x+7*y)/(8*x+10*y))/((3*x-y)/(x+y)))/(a+b+c/d+((a+b)/(c+d))+a*b);

        System.out.println("(x+3)*(x+3)");
        System.out.println("((3+4*x)/5) - (10*(y-5)*(a+b+c)/x) + (9*(4/x+(9+x)/y))");
        System.out.println("(((5x+7y)/(8x+10y))/((3x-y)/(x+y)))/(a+b+c/d+((a+b)/(c+d))+a*b)");

        String line = "________________________________";
        String line2 = "--------------------------------";
        String stick = "|";
        System.out.println(line + "\n" + stick + " task " + stick + " result                " + stick + "\n" + line2
                + "\n" + stick + "  21  " + stick + "   " + result21 + "                " + stick + "\n" + line2 + "\n"
                    + stick  + "  22  " + stick + "   " + result22 + "               " +  stick + "\n" + line2
                        + "\n" + stick + "  23  " + stick + "  " + " " + " " + stick + "\n" + line2);




















    }
}
