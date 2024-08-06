import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số dòng");
        int row = sc.nextInt();
        System.out.println("Mời bạn nhập số cột");
        int col = sc.nextInt();

        int [][] arr= new int[row][col];
        System.out.println("Mời nhập giá trị cho các mảng tương ứng");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("arr["+i+"]["+j+"]=");
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Số cột cần tính tổng(từ 1 đến"+col+"):");
        int y = sc.nextInt();
        while (y<1 || y>col) {
            System.out.println("Số cột ko hợp lệ");
            y = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < row; i++) {
            sum += arr[i][y - 1];
        }

        System.out.println("Tổng các phần tử tại cột " + y + " là: " + sum);

    }
}
