package Array1D;
import java.util.Scanner;
public class Circular_array_rotation {
    public static void main(String args[]) {
        // your code here
        Scanner sc=new Scanner(System.in);
        int n,k,q;
        n=sc.nextInt();
        k=sc.nextInt();
        q=sc.nextInt();

        int arr[]=new int[n];
        int arr2[]=new int[n];


        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        

        for(int i=0;i<n;i++)
        {
            int index=(i+k)%n;
            arr2[index]=arr[i];

        }

        for(int i=0;i<q;i++)
        {
            int index2=sc.nextInt();
            System.out.println(arr2[index2]);
        }
        
    }
}
