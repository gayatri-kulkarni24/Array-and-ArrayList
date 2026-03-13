import java.util.*;
public class arrays{
  public static boolean isValuesRepeatedOrNot(int arr[]){ 
        for(int i=0;i<arr.length;i++){
            int value=arr[i];
            for(int j=i+1;j<arr.length;j++){
            if(value==arr[j]){
                return true;
            }
            }    
        }
        return false;
    }
  public static void main(String args[]){
      int arr[]={1,2,3,6,7,8,9,9,9};
      System.out.println(isValuesRepeatedOrNot(arr));
  }
}
