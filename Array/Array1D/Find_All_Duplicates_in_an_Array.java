package Array1D;

import java.util.*;
import java.io.*;
import java.util.Map.Entry;

public class Find_All_Duplicates_in_an_Array {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        printDuplicates(arr, n);
    }
private static void printDuplicates(int[] arr, int n)
{
    Map<Integer,Integer> map = new HashMap<>();
    int count = 0;
    boolean dup = false;
    for(int i = 0; i < n; i++){
        if(map.containsKey(arr[i])){
            count = map.get(arr[i]);
            map.put(arr[i], count + 1);
        }
        else{
            map.put(arr[i], 1);
        }
    }
     
    for(Entry<Integer, Integer> entry : map.entrySet())
    {
        // if frequency is more than 1
        // print the element
        if(entry.getValue() > 1){
            System.out.print(entry.getKey()+ " ");
            dup = true;
        }
    }
    // no duplicates present
    if(!dup){
        System.out.println("-1");
    }
}

     /*   Arrays.sort(arr);

        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.print(arr[i]+" ");
            }
        }
    }*/
}
