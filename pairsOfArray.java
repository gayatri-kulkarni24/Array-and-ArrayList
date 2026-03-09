import java.util.*;
public class arrays{
  public static void pairsOfArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("(" + curr + "," + arr[j] + ")");
            }
        }
        
    }
public static void main(String args[]){
  int nums[]={1,2,3,6,7,8,9,9,9};  
  pairsOfArray(nums);
}
}
