import java.util.*;
class solution{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the size of first array");
        int n=sc.nextInt();
        System.out.println("Enter the array of second size");
        int m=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the first array elemmnt");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            System.out.println("Enter the second array element");
            b[i]=sc.nextInt();
        }
        int i=0,j=0;
        while(i<n&&j<m)
        {
            if(a[i]<=b[j])
            {
                i++;  
            }
            else if(a[i]>b[j])
            {
               int temp = a[i];
               a[i] = b[j];
               b[j] = temp;
                i++;
                Arrays.sort(b);
            }
        }
        Arrays.sort(b);
        System.out.println("First array after merging");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Second array after merging");
        for(i=0;i<m;i++)
        {
            System.out.print(b[i]+" ");
        }
        sc.close();

    }

}