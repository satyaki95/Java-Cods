import java.io.*;
import java.util.*;
public class Main {
    // your code here
    static ArrayList<String> list = new ArrayList<String>();
    public static void main(String args[]) {
        // your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int l = 0;
        int r = str.length() - 1;
        permutate(str,l,r);
        Collections.sort(list);
        for(String i : list){
            System.out.print(i + " ");
        }
    }
    public static void permutate(String str, int l, int r){
        if(l==r){
           list.add(str);
        }
        else{
            for(int i=l;i<=r;i++){
                str= swap(str,l,i);
                permutate(str,l+1,r);
                str=swap(str,l,i);
            }
        }
    }
    public static String swap(String a, int i, int j){
        char temp;
        char [] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}