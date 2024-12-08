import java.util.*;
public class PrefixSum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int r=0;r<n;r++)
        arr[r]=sc.nextInt();
        int m=arr.length;
        int pre[]=new int[m];
        pre[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            pre[i]=pre[(i-1)]+arr[i];
        }
        System.out.println(Arrays.toString(pre));
    }
}
