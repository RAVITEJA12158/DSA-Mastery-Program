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
       for(int i=0;i<n-1;i++)
       {
      int  minindex=i;
        for(int j=i+1;j<n;j++)
        {
            if(a[i]>a[j])
            {
                minindex=j;
            }
        }
        int temp=a[i];
        a[i]=a[minindex];
        a[minindex]=temp;
       }
       System.out.println("The sorted array is ");
         for(int i=0;i<n;i++)
         {
          System.out.print(a[i]+" ");
         }
    }
}