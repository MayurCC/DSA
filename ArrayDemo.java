import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDemo {	
		
    public static int[] rotate(int[] arr, int d) {
        int index=0;
        int[] newArray = new int[arr.length];
        
        for(int i=d;i<arr.length;i++) {
            newArray[index]=arr[i];
            index++;
        }
        
        for(int i=0;i<d;i++) {
            newArray[index]=arr[i];
            index++;
        }
        return newArray;
    }
    
    public void reverseArray(int[] arr) {
        int a=0;
        int b=arr.length-1;
        while(a<b) {
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a=a+1;
            b=b-1;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args)throws Exception {
        int[] arr= {1,2,3,4,5,6,7,8,9,10};
        int d=2;
        int[] res=rotate(arr,d);
        
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(res));
        ArrayDemo n1=new ArrayDemo();
        n1.reverseArray(arr);			
    }
}
