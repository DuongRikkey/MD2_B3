

import java.util.Scanner;

public class EX4 {
    public EX4() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng của mảng: ");
        int rows = sc.nextInt();
        System.out.print("Nhập số cột của mảng: ");
        int cols = sc.nextInt();
        int[][] array = new int[rows][cols];
        System.out.println("Nhập các phần tử cho mảng:");

        int max;
        int i;
        for(max = 0; max < rows; ++max) {
            for(i = 0; i < cols; ++i) {
                System.out.print("array[" + max + "][" + i + "] = ");
                array[max][i] = sc.nextInt();
            }
        }

        max = array[0][0];

        for(i = 0; i < rows; ++i) {
            for(int j = 0; j < cols; ++j) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }

        System.out.println("Phần tử lớn nhất trong mảng là: " + max);
    }
}

