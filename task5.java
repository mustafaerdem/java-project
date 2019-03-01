import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
            int[] arr = new int[5];
            Scanner sc = new Scanner(System.in);
            int biggest=0,smallest=0;

            for(int i=0; i<5; i++) {
                System.out.println("input number");
                arr[i] = sc.nextInt();
            }
            smallest=arr[0];

            for(int i=0; i<arr.length; i++)
            {
                if(arr[i]>biggest)
                    biggest=arr[i];
                if(arr[i]<smallest)
                    smallest=arr[i];
            }
            System.out.println("BIGGEST = "+biggest+"\n SMALLEST = "+smallest);



        }
    }

