import java.util.*;
public class arrays{
public static int trappedWater(int height[]){
        int n=height.length;
        //calculate left max 
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<leftMax.length;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
        }
        //calculate right max 
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],height[i]);
        }
        int trappedWater=0;
        for(int i=0;i<n;i++){
            int waterLevel=Math.min(leftMax[i],rightMax[i]);
            trappedWater+=waterLevel-height[i];
        }
        return trappedWater;
    }
  public static void main(String args[]){
    int height[]={4,2,0,6,3,2,5};
    System.out.println(  trappedWater(height));
  }
}
