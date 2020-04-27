public class PartTwo2D {
    public static void main(String[] args) {
        int [][] arr = new int[12][12];
        for (int i = 0; i < 12; i++){
            for (int j = 0; j < 12; j++){
                arr[i][j] = (i+1) * (j+1);
            }
        }
        for (int i = 0; i < 12; i++){
            for (int j = 0; j < 12; j++){
                if (Integer.toString(arr[i][j]).length() < 2){
                    System.out.print(arr[i][j] + "   ");
                } else if (Integer.toString(arr[i][j]).length() == 2){
                    System.out.print(arr[i][j] + "  ");
                } else if (Integer.toString(arr[i][j]).length() > 2) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
