public class MultiDArrays {
    public static void main(String[] args){
        //This is how you initialize a 2Dimensional Array
        String[][] arr = new String[10][5];
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 5; j++){
                arr[i][j] = "row " + i + " col " + j + " ";
            }
        }
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 5; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
