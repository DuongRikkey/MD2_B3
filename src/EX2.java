import java.util.Arrays;
import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 10;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("arr[" + i + "]=");
            arr[i] = sc.nextInt();
        }
        System.out.println("Mang ban dau");
        System.out.println(Arrays.toString(arr));


        System.out.println("Moi ban nhap so them vao");
        int addChange = sc.nextInt();

        System.out.println("Moi ban nhap vi tri index tu 0 den" + (N - 1));
        int index = sc.nextInt();
        if (index < 0 || index >= N - 1) {
            System.out.println("khong add dc them");
        } else {
            for (int i = N - 1; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = addChange;
        }
        System.out.println("Mang moi");
        System.out.println(Arrays.toString(arr));

    }
}
