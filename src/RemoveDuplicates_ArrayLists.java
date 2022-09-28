import java.util.*;
public class RemoveDuplicates_ArrayLists {


    public static ArrayList<Integer> RemoveDuplicates(int[] arr){
        ArrayList<Integer> NoDuplicates = new ArrayList<>();
        NoDuplicates.add(arr[0]);

        for( int i = 1 ; i < arr.length; i++){
            if(arr[i]!=arr[i-1]) {
                NoDuplicates.add(arr[i]);
            }


        }
        return NoDuplicates;
    }
    public static void main(String[] args) {



        int[] intArray =  new int[10];
        Scanner sc = new Scanner(System.in);
        for( int i = 0 ; i < 10 ; i++){
            intArray[i] = sc.nextInt();
        }
        ArrayList<Integer> result = RemoveDuplicates(intArray);
        for(int i =0 ;i < result.size() ; i++){
            System.out.println(result.get(i));
        }






        sc.close();
    }
}
