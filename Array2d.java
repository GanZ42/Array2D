public class Array2d {
    public static void main(String[] args) {
        int [] [] piksel = new int [2] [3];
        piksel [0] [0] = 70;
        piksel [0] [1] = 30;
        piksel [0] [2] = 50;
        piksel [1] [0] = 20;
        piksel [1] [1] = 66;
        piksel [1] [2] = 20;
        int i, j;
        for (i=0; i<2; i++){
            for (j=0; j<3; j++)
            System.out.print(piksel[i][j] + " ");
            System.out.println("");
        }
    }
}
