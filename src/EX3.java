import java.util.Arrays;
import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap so phan tu co trong mang1");
        int numberAr1 = sc.nextInt();

        int[] arr1 = new int[numberAr1];
        ;
        System.out.println("Moi ban nhap so phan tu co trong mang2");
        int numberAr2 = sc.nextInt();
        int[] arr2 = new int[numberAr1];
        ;
        for (int i = 0; i < numberAr1; i++) {
            System.out.println("numberAr1[" + i + "]=");
            arr1[i] = sc.nextInt();
        }
        System.out.println("----------------");
        for (int i = 0; i < numberAr2; i++) {
            System.out.println("numberAr2[" + i + "]=");
            arr2[i] = sc.nextInt();
        }
        int total = numberAr1 + numberAr2;
        int[] arr3 = new int[total];

        for (int i = 0; i < numberAr1; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < numberAr2; i++) {
            arr3[i + numberAr1] = arr2[i];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
