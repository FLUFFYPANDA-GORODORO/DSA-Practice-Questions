//1.Sum of elements of array
//2.Average of elements of array
//3.Occurrence of a number in an array
//4.Smallest number in an array
//5.Largerst number in an array
//6.Array is sorted or not 
//7.Delete an element in an array
//8.Reverse the elements of an array



import java.util.Scanner;

public class basicQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Enter the size of the array : ");
        num = sc.nextInt();

        int[] arr = new int[num];
        int i = 0;

        while(i < arr.length){
            System.out.print("Enter the " + i + " element of the array : ");
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.println();


        i = 0;
        System.out.println("Elements of array : ");
        while(i < arr.length){
            System.out.print(arr[i] + "  ");
            i++;
        }
        System.out.println();

//        int sumOfArray = sum(arr);
//        System.out.println("Sum of array is : " + sumOfArray);

//        int averageOfArray = average(sumOfArray,arr);
//        System.out.println("Average of sum of array is : " + averageOfArray);

//        int number;
//        System.out.println("Enter the number you want to check occurence of : ");
//        number = sc.nextInt();
//        int noOfOccurrence = occurrenceArray(arr , number);
//        System.out.println("The occurrence of " + number + " in the array is " + noOfOccurrence);

//        int min = minArray(arr);
//        System.out.println("Minimum number from the array is : " + min);

//        int max = maxArray(arr);
//        System.out.println("Maximum number from the array is : " + max);

//        boolean isInc = isIncreasing(arr);
//        boolean isDec = isDecreasing(arr);
//        if(isInc || isDec){
//            System.out.println("The array is sorted");
//        }
//        else{
//            System.out.println("The array is not sorted");
//        }

//        System.out.print("Enter the number you want to delete : ");
//        int del = sc.nextInt();
//        int[] newArr = delNumber(arr,del);
//        System.out.println("Elements of your array after deletion are : ");
//        i = 0;
//
//        while(i < newArr.length){
//            System.out.print(newArr[i] + "  ");
//            i++;
//        }

        // arrayReverse(arr);
        // System.out.println("Array Reverse is : ");
        // i = 0;
        // while(i < arr.length){
        //     System.out.print(arr[i] + "  ");
        //     i++;
        // }
        // System.out.println();

        boolean isPalin = isPalindrome(arr);
        if(isPalin){
            System.out.println("The array is Palindrome");
        }
        else{
            System.out.println("The array is not Palindrome");
        }










    }

    public static int sum(int[] arr){
        int sum = 0;
        int i = 0;
        while(i < arr.length){
            sum += arr[i];
            i++;
        }

        return sum;
    }

    public static int average(int sum , int[] arr){
        return sum/ arr.length;
    }

    public static int occurrenceArray(int[] arr , int num){
        int occ = 0;
        int i = 0;

        while(i < arr.length){
            if(arr[i] == num){
                occ++;
            }
            i++;
        }

        return occ;
    }

    public static int minArray(int[] arr){
        int min = Integer.MAX_VALUE;
        int i =0;

        while(i < arr.length){
            if(min > arr[i]){
                min = arr[i];
            }
            i++;
        }
        return min;
    }

    public static int maxArray(int[] arr){
        if(arr.length == 0){
            return Integer.MIN_VALUE;
        }

        int max = arr[0];
        int i = 1;

        while(i < arr.length){
            if(max < arr[i]){
                max = arr[i];
            }
            i++;
        }
        return max;
    }

    public static boolean isIncreasing(int[] arr){
        int i = 1;

        while(i < arr.length){
            if(arr[i] < arr[i-1]){
                return false;
            }
            i++;
        }

        return true;
    }

    public static boolean isDecreasing(int[] arr) {
        int i = 1;

        while (i < arr.length) {
            if (arr[i] > arr[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static int[] delNumber(int[] arr , int del){
        int occ = occurrenceArray(arr,del);
        if(occ == 0){
            return arr;
        }
        int newSize = arr.length - occ;
        int[] newArr = new int[newSize];
//        System.out.println("value of del " + del);

        int i = 0 , j = 0;
        while(i < arr.length){
            if(arr[i] != del){
//                System.out.println(arr[i]);
                newArr[j] = arr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }

    public static void arrayReverse(int[] arr){
        int i = 0;
        while(i < arr.length / 2){
            int swap = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = swap;
            i++;
        }
    }

    public static boolean isPalindrome(int[] arr){
        int i = 0;
        while(i < arr.length/2){
            if(arr[i] != arr[(arr.length - 1) - i]){
                return false;

            }
            i++;
        }

        return true;
    }




}
