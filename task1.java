import java.util.Arrays;
import java.util.Scanner;
public class gui1 {
    public static void main(String[] args) {
        int m, n,toplam=0,k,l=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("ilk dizi boyutunu giriniz");
        m = sc.nextInt();
        System.out.println("ikinci dizi boyutunu giriniz");
        n = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[n];
        int[] ortak = new int[n];
        for (int i = 0, j = 0; i < m + n; i++) {
            if (i < m) {
                System.out.println("a dizisi icin eleman giriniz");
                a[i] = sc.nextInt();
            } else if (i >= m) {
                System.out.println("b dizisi icin eleman giriniz");
                b[j] = sc.nextInt();
                j++;
            }
        }
        for (int i = 0; i <n; i++) {

            for (k = 0; k <m; k++) {

                if (b[i]==a[k]){
                    toplam++;
                    ortak[l]=toplam;
                }
            }
            toplam=0;
            l++;
        }
        for (int i = 0; i < n;i++)

        System.out.print("B["+i+"] = "+ortak[i]+" ");
    }
}





