/*Java program for linear search
* User Narjis Fatima
* Date 1/27/2023*/
public class PrgLinearSearch {
            public static int linearSearch(int[] arr, int ind){
            for(int i=0;i<arr.length;i++){
                if(arr[i] == ind){
                    return i;
                }
            }
            return -1;
        }
        public static void main(String a[]){
            int[] a1= {101,102,103,104,105,106};
            int ind = 104;
            System.out.println(ind+" is found at index: "+linearSearch(a1, ind));
        }
    }



