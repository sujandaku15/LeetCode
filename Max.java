public class Max {
    public static int largest(int[] array){
        int maxNumber=array[0];
        int i=0;

        for(; i<array.length; i++){
            int temp = array[i];
              if(maxNumber<temp){
                  maxNumber= array[i];
              }
        }


        return maxNumber;
    }
    public static void main(String[] args) {
int[] arr = {2, 3, 25, 8, 45, 36};
        System.out.println(largest(arr));
    }
}
