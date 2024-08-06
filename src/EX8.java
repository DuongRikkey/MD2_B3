import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bước 1: Khai báo một chuỗi và gán cho nó một giá trị
        System.out.print("Nhập một chuỗi: ");
        String str = sc.nextLine();

        // Bước 2: Khai báo một biến ký tự và gán hoặc nhập từ bàn phím một giá trị
        System.out.print("Nhập ký tự cần đếm: ");
        char ch = sc.next().charAt(0);

        // Bước 3: Khai báo biến count và gán giá trị 0
        int count = 0;

        // Bước 4: Sử dụng vòng lặp duyệt từng ký tự trong chuỗi
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        // In ra số lần xuất hiện của ký tự trong chuỗi
        System.out.println("Ký tự '" + ch + "' xuất hiện " + count + " lần trong chuỗi.");
    }
}
