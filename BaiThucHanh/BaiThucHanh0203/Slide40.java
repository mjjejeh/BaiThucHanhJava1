import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day;

        System.out.print("Nhap vao mot so tu 1 den 7: ");
        day = input.nextInt();

        switch (day) {
            case 1:
                System.out.println("Chu Nhat");
                break;
            case 2:
                System.out.println("Thu 2");
                break;
            case 3:
                System.out.println("Thu 3");
                break;
            case 4:
                System.out.println("Thu 4");
                break;
            case 5:
                System.out.println("Thu 5");
                break;
            case 6:
                System.out.println("Thu 6");
                break;
            case 7:
                System.out.println("Thu 7");
                break;
            default:
                System.out.println("So nhap khong hop le");
                break;
        }
    }
}
