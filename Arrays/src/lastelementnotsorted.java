import java.util.*;
public class lastelementnotsorted {

    public static  void main(String[] args) {
        int[] arr={1,3,4,6,7,9,11,15,8};
        int temp=8;
        for(int i=arr.length-2;i>=0;i--){
                if (arr[i]>temp){
                    arr[i+1]=arr[i];
                    arr[i]=temp;
                }else {
                  break;
                }
        }
        System.out.println(Arrays.toString(arr));
    }
}
