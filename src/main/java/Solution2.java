/*
    Given an array arr of size N and an integer K, the task is to find the maximum for each and every contiguous subarray of size K.
    Example Input & Output:
    Input: arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6}, K = 3
    Output: 3 3 4 5 5 5 6
    Input: arr[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13}, K = 4
    Output: 10 10 10 15 15 90 90
 */
public class Solution2 {
    public static void main(String[] args) {
//        int[] arr={1,2,3,1,4,5,2,3,6};
//        int k=3;
        int[] arr={8,5,10,7,9,4,15,12,90,13};
        int k=4;
        maximumOfEachAndEveryContiguos(arr,k);
    }
    static void maximumOfEachAndEveryContiguos(int[] arr, int k){
        int temp=0;
        int eachSubcontiguousMax=0;
        int i=0;
        int n=arr.length;
        int startingofContiguosArray = 0;
        while (i <= n){
            if(temp == k){
                System.out.print(eachSubcontiguousMax+" ");
                temp=0;
                eachSubcontiguousMax = 0;
                startingofContiguosArray ++;
                i=startingofContiguosArray;
            }
            if(i < n && arr[i]> eachSubcontiguousMax ){
                eachSubcontiguousMax = arr[i];
            }
            temp++;
            i++;
        }
    }
}
