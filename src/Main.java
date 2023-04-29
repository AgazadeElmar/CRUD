import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
        System.out.println("""
                1-Telebe elave etmek
                2-Butun qeydiyyatda olan telebeleri gormek ucun
                3-ID-ye gore melumatlari deyismek
                4-ID-ye gore silmek
                0-Sistemi sonlandirmaq""");
        System.out.print("Yerine yetirmek istediyiniz emeliyyat nomresini daxil edin: ");
        int input = scanner.nextInt();
        switch (input) {
            case 0:
                System.out.println("Sistem sonlandirildi");
                System.exit(0);
            case 1:
                Crud.creatStudent();
                break;
            case 2:
                Crud.readAll();
                break;
            case 3:
                Crud.updateById();
                break;
            case 4:
                Crud.removeById();
                break;
            default:
                System.out.println("Bele bir emeliyyat movcud deyil!!!");


        }
        }
    }
}