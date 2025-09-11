#include<iostream>
using namespace std;
void merge(int a[],int low,int mid,int high)
{
    int i=low,j=mid+1,k=low;
    int b[high+1];
    while(i<=mid && j<=high)
    {
        if(a[i]<a[j])
        {
            b[k++]=a[i++];
        }
        else
        {
            b[k++]=a[j++];
        }
    }
    if(i<=mid)
    {
        while(i<=mid)
        {
            b[k++]=a[i++];
        }
    }
    else
    {
        while(j<=high)
        {
            b[k++]=a[j++];
        }
    }
    for(int i=low;i<=high;i++)
    {
        a[i]=b[i];
    }

}
void mergesort(int a[],int low,int high)
{
    if(low<high)
    {
        int mid = (low+high)/2;
        mergesort(a,low,mid);
        mergesort(a,mid+1,high);
        merge(a,low,mid,high);
    }

}
int main()
{
    int n;
    cout<<"ENter the size of the array"<<endl;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++)
    {
        cout<<"Enter the number"<<endl;
        cin>>a[i];
    }
    mergesort(a,0,n-1);
    for(int i=0;i<n;i++)
    {
        cout<<a[i]<<" ";
    }
    return 0;
}