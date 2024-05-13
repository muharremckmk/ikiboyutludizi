import java.util.Scanner;
import java.util.Random;
public class Main{
    public static void main(String[]args){

    Scanner sc=new Scanner(System.in);
    Random random=new Random();

    int[][]dizi1=new int[3][3];
    int[][]dizi2=new int[3][3];

        for (int i = 0; i < dizi1.length; i++) {
            for (int j = 0; j < dizi1[1].length; j++) {
                dizi1[i][j]=random.nextInt(50);
            }
        }
        for (int i = 0; i < dizi2.length; i++) {
            for (int j = 0; j < dizi2[2].length; j++) {
                System.out.print("dizinin"+(i+1)+"'e "+(j+1)+" olan elemanını girin: ");
                dizi2[i][j]= sc.nextInt();
            }
        }
        System.out.println("1.dizi: ");
        diziyazdirma(dizi1);
        System.out.println("2.dizi:");
        diziyazdirma(dizi2);
        System.out.println("1.dizinin en büyük elemanı: "+ max(dizi1));
        System.out.println("2.dizinin en büyük elemanı:"+max(dizi2));
        System.out.println("iki dizinin toplam dizisi");
        diziyazdirma(toplama(dizi1,dizi2));
        System.out.println("iki dizinin çarpımlarının dizisi:");
        diziyazdirma(carpma(dizi1,dizi2));
    }

    public static void diziyazdirma(int[][] array){
        for (int i = 0; i < array[1].length; i++) {
            for (int j = 0; j < array[1].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    public static int max(int[][] array){
        int max=array[0][0];
        for (int i = 0; i < array[1].length ; i++) {
            for (int j = 0; j < array.length; j++) {
               if (max<array[i][j]){
                   max=array[i][j];
               }
            }
        }
        return max;
    }
    public static int[][] toplama(int[][]array1,int[][]array2){
        int[][] toplama=new int[3][3];
        for (int i = 0; i < array2[2].length; i++) {
            for (int j = 0; j < array2.length ; j++) {
                toplama[i][j]=array1[i][j]+array2[i][j];
            }
        }
    return toplama;
    }
    public static int[][] carpma(int[][]array1,int[][]array2){
        int[][] carpma=new int[3][3];
        for (int i = 0; i < array2[1].length; i++) {
            for (int j = 0; j < array2.length; j++) {
                for (int k = 0; k < array2.length; k++) {
                 carpma[i][j]+=array1[i][k]*array2[k][j];
                }
            }
        }
    return carpma;
    }
}