import java.io.*;
import java.util.*;

public class Main
{
    public static void partition(int[] arr,int n, int start, int end){
        
        if(start>=end-1)
            return;
        
        int pivot = arr[start];

        int left[] = new int[n];
        int right[] = new int[n];
        
        for(int i=0;i<n;i++){
            left[i] = -1;
            right[i] = -1;
        }
        
        int leftIndex = 0, rightIndex = 0;

        for(int i=start;i<end;i++){
            if(arr[i]<pivot){
                left[leftIndex++] = arr[i];
            }
            else{
                right[rightIndex++] = arr[i];
            }
        }

        int index = start;
        for(int i=0;i<leftIndex;i++){
            arr[index++] = left[i];
        }
        for(int i=0;i<rightIndex;i++){
            arr[index++] = right[i];
        }
            
        int pivotIndex = start+leftIndex;
        
        partition(arr,n,start,pivotIndex);
        partition(arr,n,pivotIndex+1,end);        
    
        for(int i = start;i<end;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		}
		
		partition(arr,n,0,n);
		return;
	}
}