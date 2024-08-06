//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public Ex1() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{1, 2, 3, 5, 5};
        int n = arr.length;
        System.out.println("Mảng gốc: ");

        int x;
        for(x = 0; x < arr.length; ++x) {
            System.out.print(arr[x] + " ");
        }

        System.out.println();
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhập phần tử cần xóa");
        x = sc.nextInt();
        boolean check = true;
        String vitri = "";
        int solanxuathien = 0;

        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] == x) {
                check = false;
                ++solanxuathien;
                vitri = vitri + i + " ";
            }
        }

        if (!check) {
            System.out.print("" + x + " nằm tại vị trí index là " + vitri);
        } else {
            System.out.println("Không tồn tại");
        }

        if (solanxuathien == 0) {
            System.out.println("Không tồn tại");
        } else {
            int[] Newarray = new int[n - solanxuathien];
            int j = 0;

            int i;
            for(i = 0; i < n; ++i) {
                if (arr[i] != x) {
                    Newarray[j++] = arr[i];
                }
            }

            System.out.println("Mảng mới: ");

            for(i = 0; i < Newarray.length; ++i) {
                System.out.print(Newarray[i] + " ");
            }

            System.out.println();
            System.out.println(Arrays.toString(Newarray));
        }

    }
}

