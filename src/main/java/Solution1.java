import java.util.Arrays;

/*
    Given arrival and departure times of all trains that reach a railway station, the task is to find the minimum number of platforms required for the railway station so that no train waits.
    We are given two arrays which represent arrival and departure times of trains that stop.
    Example Input & Output:
    Input: arr[] = {9:00, 9:40, 9:50, 11:00, 15:00, 18:00}
    dep[] = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00}
    Output: 3
    Input: arr[] = {9:00, 9:40}
    dep[] = {9:10, 12:00}
    Output: 1
 */
public class Solution1 {
    public static void main(String[] args) {
        //int arr[]={900,940,950,1100,1500,1800};
        //int dep[]={910,1200,1120,1130,1900,2000};
        int arr[]={900,940};
        int dep[]={1200,910};
        int output = findMinimumNumerOfPlatform(arr,dep);
        System.out.println("Minimum Platform Required is: "+output);
    }
    static int findMinimumNumerOfPlatform(int[] arr, int[] dep){
        int n=arr.length;
        if(n > 0){
            Arrays.sort(dep);
            Arrays.sort(arr);
            int i=1, j=0, platformRequired=1, result=1;
            while (i<n && j<n) {
                if(arr[i]<=dep[j]){
                    platformRequired++;
                    i++;
                } else if(arr[i]>dep[j]){
                    platformRequired--;
                    j++;
                }
                if(platformRequired>result){
                    result = platformRequired;
                }
            }
            return result;
        }
        throw new RuntimeException("Invalid Arguments");
    }
}
