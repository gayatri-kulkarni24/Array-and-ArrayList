import java.util.*;
public class arrays{
    public static void kadane_algo(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<arr.length;i++){
            currSum=currSum+arr[i];
            if(currSum<0){
                currSum=0;
            }
        }
        maxSum=Math.max(currSum,maxSum);
        System.out.println("maximum subrray sum=" +maxSum);
    }
    public static void main(String args[]){
      int nums[]={1,2,3,6,7,8,9,9,9};
      kadane_algo(nums);
    }
}
