public class arrays{
  public static boolean linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return true;
            }
        }
        return false;
    }
public static void main(String args[]){
  int arr[]={1,2,3,6,7,8,9,9,9};
  int key=9;
  System.out.println(linearSearch(arr,key));
  
}
}
