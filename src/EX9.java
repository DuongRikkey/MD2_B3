import java.util.Arrays;
import java.util.Scanner;

public class EX9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu co trong mang");
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("arr[" + i + "]=");
            arr[i] = sc.nextInt();
        }
        if (N < 2) {
            System.out.println("ko co lon thu 2 dau");
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int largest = arr[arr.length - 1];
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < largest) {
                secondLargest = arr[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("ko co so lon thu 2");
        } else {
            System.out.println("SO LON THU 2 LA " + secondLargest);
        }
    }
}
