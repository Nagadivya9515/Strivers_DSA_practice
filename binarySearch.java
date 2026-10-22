import java.util.Scanner;

public class binarySearch
  {
    public static void main(Stirng[] args)
    {
      
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      int target=sc.nextInt();

      int low=0, high=n-1;
      while(low<=high)
        {
          int mid=(int)(low+high)/2;
          if(arr[mid]==target)
          {
            System.out.print(mid);
          }
          elif(arr[mid]<target)
            {
            low=mid+1;
          }
          else
          {
            high=mid-1;
          }
        }
    }
  }
