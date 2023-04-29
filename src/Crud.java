import java.util.Scanner;

public class Crud {
    public static Scanner sc = new Scanner(System.in);

    public static void creatStudent() {
        System.out.print("ID=");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Ad=");
        String name = sc.nextLine();

        System.out.print("Soyad=");
        String surName = sc.nextLine();

        System.out.print("Universitet=");
        String uni = sc.nextLine();

        System.out.print("Ixtisas=");
        String ixtisas = sc.nextLine();

        Student student = new Student(name, surName, id, uni, ixtisas);
        Data.students.add(student);
    }

    public static void readAll() {
        for (Student student : Data.students) {
            System.out.println(student);
        }


    }

    public static void updateById() {
        System.out.print("Deyismek istediyiniz ID=  ");
        int input = sc.nextInt();
        sc.nextLine();
        for (Student student : Data.students) {

            if (student.getId() == input) {
                System.out.print("Adi=");
                student.setName(sc.nextLine());

                System.out.print("Soyadi=");
                student.setSurname(sc.nextLine());

                System.out.print("Ixtisas=");
                student.setIxtisas(sc.nextLine());

                System.out.print("Universitet=");
                student.setUniversitet(sc.nextLine());
                break;

            }
        }
    }

    public static void removeById() {
        System.out.print("Silmek istediyiniz ID=");
        Data.students.remove(sc.nextInt()-1);
    }
}
