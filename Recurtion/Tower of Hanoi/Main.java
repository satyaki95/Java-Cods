import java.util.*;
public class Main
{
    static void towerOfHanoi(int n, char A, char B, char C)
    {
    	if ((n > 0) || (n <= 16))
    	{
            if (n == 1)
            {
                System.out.println(A+ "->" +C);
                return;
            }
            towerOfHanoi(n - 1, A, C, B);
            System.out.println(A + "->" + C);
            towerOfHanoi(n - 1, B, A, C);
    	}
    }
    
    public static void main(String args[])
    {
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of disks
    	towerOfHanoi(n, 'A', 'B', 'C'); // A, B and C are names of rods
    }
}