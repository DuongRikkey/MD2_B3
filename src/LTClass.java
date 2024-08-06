import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LTClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời bạn nhập số phần tử có trong mảng");
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//        for (int i = 0; i < N; i++) {
//        System.out.println("arr["+i+"]=");
//        arr[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//        int[][] arr=new int[3][8];
        //Cú pháp khai bao va cap phat mang
//        int b[][]=new int[3][4];
        //cu phao3:Khai bao,cap phat va khoi tao mang
        int [][] c={{2,3,4},{2,4,5,3},{1,2,4,5,6},{2,3,4,5,6}};
        System.out.println("Mảng ban đầu:");
        System.out.println("Do dai hang 1:" +c[0].length);
        System.out.println("Do dai hang 1:" +c[1].length);
        System.out.println("Do dai hang 1:" +c[2].length);

//
//        for (int[] mangcon:c){
//            for (int giatri:mangcon){
//                System.out.println(" " + giatri);
//            }
//            System.out.println("\n");

          for(int i=0;i<c.length;i++){
              for(int j=0;j<c[i].length;j++){
                  System.out.print(c[i][j]+" ");
              }
              System.out.println();

          }
        c[0][0]=1;
          c[1][0]=100;
          for(int i=0;i<c.length;i++){
              for(int j=0;j<c[i].length;j++){
                  System.out.print(c[i][j]+" ");
              }
              System.out.println();
          }

        //Cách tạo hai mảng ngẫu nhiên
        int rows=4;
          int cols1=4;//Số cột của mảng đầu tiên
          int cols2=5; //Số cột của mảng thứ hai
        //Tạo mảng 2 chiều
        int[][] array1=new int[rows][cols1];
        int[][] array2=new int[rows][cols2];
        Random rand=new Random();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols1;j++){
                array1[i][j]=rand.nextInt(100);
                System.out.print(array1[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols2; j++) {
                array2[i][j] = rand.nextInt(100);
                System.out.print(array2[i][j]+" ");// Giá trị ngẫu nhiên từ 0 đến 99
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Nhập số hàng của mảng: ");
        int rows1=new Scanner(System.in).nextInt();
        System.out.println("Nhập số cột của mảng: ");
        int cols=new Scanner(System.in).nextInt();
        int[][] array=new int[rows][cols];
        //Hiện thị các phần tử của mảng
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("array[" +i+ "]["+ j +"] = " +" ");
                array[i][j]=sc.nextInt();
            }
        }
        //Hiển thị mảng 2 chiều
        System.out.println("Mảng 2 chiều vừa nhập là");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols1;j++){
                System.out.println(array[i][j]+" ");
            }
            System.out.println();

        }
        System.out.println("Mảng 2 chiều vừa nhập là:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // Xuống dòng sau mỗi hàng
        }

        // Hiển thị mảng 2 chiều theo cột
        System.out.println("Mảng 2 chiều vừa nhập theo cột là:");
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // Xuống dòng sau khi in tất cả các phần tử của một cột
        }
        }

    }



