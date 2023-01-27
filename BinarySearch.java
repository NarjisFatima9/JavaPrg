/*Java program for Binary Search
* User Narjis Fatima
* Date 1/27/2023*/
public class BinarySearch {

    public static int binarySearch(int[] num, int ind){
        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (ind == num[mid]) {
                return mid;
            }
            if (ind < num[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] num= {10,20,30,40,50,60,70};
        int ind = 50;
        System.out.println(ind+" is found at index: "+binarySearch(num, ind));
    }
}

