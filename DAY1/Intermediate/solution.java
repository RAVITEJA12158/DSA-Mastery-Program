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
        for(int j=0;j<n-i-1;j++)
        {
            if(a[j]>a[j+1])
            {
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
       }
       System.out.println("The sorted array is ");
         for(int i=0;i<n;i++)
         {
          System.out.print(a[i]+" ");
         }
    }
}
