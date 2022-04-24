package lessons.school;

public class Teacher {

    public static void main(String[] args) {

        String line= "__________________";
        String lastName= "Васечкина";
        String name = "Мария Ивановна";
        String subject = "русский язык и литература";
        int age = 35;
        String years ="лет";

        System.out.println(line);
        System.out.println(lastName + " " + name);
        System.out.println(subject);
        System.out.println(line);
        System.out.print(age + " " + years + "\n");

        String lastName2 = " Серебряков";
        String name2= "Иван Петрович";
        String years2 = " лет";
        int age2 = 55;
        String subj = "математика";

        System.out.println(line);
        System.out.println(name2 + lastName2 + "\n" + subj + "\n" + line + "\n" + age2 + years2);
    }
}
