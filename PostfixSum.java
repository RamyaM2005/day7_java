import java.util.*;
public class PostfixSum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int arr[]=new int[n];
        for(int r=0;r<n;r++)
        {
        arr[r]=sc.nextInt();
        }
        int post[]=new int[m];
        post[0]=arr[(n-1)];
        m--;
        for(int i=1;i<n;i++)
        {
            m--;
            post[i]=post[(i-1)]+arr[m];
           
        }
        System.out.println(Arrays.toString(post));
        sc.close();
    }
}
