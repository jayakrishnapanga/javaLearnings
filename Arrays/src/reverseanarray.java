
import java.util.Arrays;

public class reverseanarray {
    public static void main(String[] args) {
        int[] arr= {3,4,5,10,6,7,8,11};
        int j=arr.length-1;
        int temp;
        for(int i=0;i<=j;i++){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
