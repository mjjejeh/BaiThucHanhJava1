import java.util.Scanner;

public class SumInputNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        while (true) {
            System.out.print("Nhap So Nguyen: ");
            int number = scanner.nextInt();
            
            sum += number;
            
            if (sum > 100) {
                break;
            }
        }
        
        System.out.println("Tong Cac So Da Nhap: " + sum);
    }
}
