//Write a program to Find the union & Intersection of two arrays of two arrays

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class unionAndIntersection {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer[] arr1 = {1,2,3,4,5};
        Integer[] arr2 = {1,2,3,4,7};

        unionOfArrays(arr1,arr2);
        IntersectionOfArrays(arr1,arr2);

    }

    public static void unionOfArrays(Integer[] arr1, Integer[] arr2){
        Set<Integer> union = new HashSet<>();

        union.addAll(Arrays.asList(arr1));
        union.addAll(Arrays.asList(arr2));
        System.out.println(union);
    }

    public static void IntersectionOfArrays(Integer[] arr1 , Integer[] arr2){
        Set<Integer> intersection = new HashSet<>();

        intersection.addAll(Arrays.asList(arr1));
        intersection.retainAll(Arrays.asList(arr2));

        System.out.println(intersection);
    }
}



