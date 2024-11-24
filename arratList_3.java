import java.util.Arrays;

public class arratList_3 {
    public static void main(String args[]){
        int [] arr={1,45,35,87,95};
        swap(arr,2,4);
        System.out.println(Arrays.toString(arr));
        System.out.println(max_ele(arr));
        System.out.println(maxRange(arr,1,3));
    }
    static void swap(int []arr,int I1,int I2){
        int temp=arr[I1];
        arr[I1]=arr[I2];
        arr[I2]=temp;
    }
    static int max_ele(int [] arr){
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int maxRange(int [] arr,int I1,int I2){
       int max=arr[I1];
        for(int i=I1;i<=I2;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
