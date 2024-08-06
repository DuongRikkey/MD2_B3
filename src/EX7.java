import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số dòng và cột cho ma trận vuông ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        System.out.println("Nhập giá trị cho ma trận vuông nhé");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("arr["+i+"]["+j+"]=");
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int sum1=0;
        int sum2=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j){
                    sum1+=arr[i][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i+j==n-1){
                    sum2+=arr[i][j];
                }
            }
        }
        System.out.println("Tổng giá trị của đường chéo chính: "+sum1);
        System.out.println("Tổng giá trị của đường chéo phụ: "+sum2);
    }
}
