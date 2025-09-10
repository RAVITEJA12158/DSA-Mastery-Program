import java.util.*;
class solution{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       int n;
       System.out.println("Enter the size of the array");
       n=sc.nextInt();
       int[] a=new int[n];
       for(int i=0;i<n;i++)
       {
        System.out.println("Enter the number");
        a[i]=sc.nextInt();
       }
       for(int i=1;i<n;i++)
       {
        int j=i-1;
        int key=a[i];
        while(j>=0 && key<a[j])
        {
            a[j+1]=a[j];
            j--;
        }
        a[j+1]=key;
       }
       System.out.println("The sorted array is ");
         for(int i=0;i<n;i++)
         {
          System.out.print(a[i]+" ");
         }
    }
}
