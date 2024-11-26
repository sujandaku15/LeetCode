import java.util.*;
public class CountNumber {
    //creating method to count the total number of digits which divide the number it self evenly
    public static void countDigits(int n){
        // Write your code here.// Write your code here.
        //checking every digit ,
        //do i need to store them as copy of array
        ArrayList<Integer> numArray = new ArrayList<>();
        numArray.add(n);

        //storing that n in a variable so that it will be easier to divide, and creating count variable to count the number
        int count =0;
        int testNumber = n;
        for(int i=0; i<numArray.size(); i++){
            if(testNumber% numArray.get(i) ==0){
                count++;
            }
        }
        System.out.println("Total number = " + count);
    }

    public static void main(String[] args) {
        countDigits(373);
    }
}
