import java.util.*;
public class arrays{
  public static void printSubArrays(int arr[]){
        int totsubarr=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k] +" ");
                   sum=sum+arr[k]; 
                }
            totsubarr++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrys="+totsubarr);
         System.out.println("total sum="+sum);
    }
public static void main(String args[]){
  int nums[]={1,2,3,6,7,8,9,9,9};
  printSubArrays(nums);
}
}
