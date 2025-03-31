import java.util.Scanner;

public class binarySearch {

    public static void main(String[] args) {
        int[] arr = {2,4,5,6,8,11,18,20,25,28,34,58,96,100,102};
        int target = 25;

        int ans = binarySearch(arr,target);
//        System.out.println(ans);
        if(ans == target){
            System.out.println("Present in array");
        }
        else{
            System.out.println("Not Present in array");
        }
    }

    public static int binarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            //int mid = (start + end)/2;
            //might be possible that (start + end) exceeds the range of the array/ integer etc
            //So better way to this thing is
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return arr[mid];
            }
        }
        return -1;
    }
}
