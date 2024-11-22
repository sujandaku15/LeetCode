public class Pattern {
    public static void nPattern(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        nPattern(3);

    }
}
//outer for loop is for row, each run of outer loop gives the row
//inner for loop increase the number of column