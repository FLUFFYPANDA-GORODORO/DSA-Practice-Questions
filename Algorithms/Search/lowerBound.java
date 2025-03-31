import java.util.Scanner;

public class lowerBound {

    public static void main(String[] args) {
        int[] arr = {2,4,5,6,8,11,18,20,25,28,34,58,96,100,102};
        int target = 60;

        int ans = binarySearch(arr,target);
        System.out.println(ans);

    }

    public static int binarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        int result = arr.length;

        while(start <= end){
            //int mid = (start + end)/2;
            //might be possible that (start + end) exceeds the range of the array/ integer etc
            //So better way to this thing is
            int mid = start + (end - start) / 2;

            if(target <= arr[mid]){
                result = mid;
                end = mid - 1;
                //start = mid + 1 (for descending order)
            }

            else{
                start = mid + 1;
                //end = mid - 1 (for descending order)
            }
        }
        return result;
    }
}
