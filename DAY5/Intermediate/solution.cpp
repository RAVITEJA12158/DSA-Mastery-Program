#include<iostream>
using namespace std;
int partition(int a[],int low,int high)
{
    int pivot=a[high];
    int i=low-1;
    for(int j=low;j<high;j++)
    {
        if(a[j]<pivot)
        {
            i++;
            swap(a[i],a[j]);
        }
    }
    swap(a[i+1],a[high]);
    return i+1;
}
void quick(int a[],int low,int high)
{
    if(low<high)
    {
        int mid = (low+high)/2;
  int p=partition(a,low,high);
  quick(a,low,p-1); 
    quick(a,p+1,high);
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
    quick(a,0,n-1);
    for(int i=0;i<n;i++)
    {
        cout<<a[i]<<" ";
    }
    return 0;
}