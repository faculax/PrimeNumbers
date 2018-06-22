import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Created by Facundo Laxalde.
 */
public class MultiplicationGrid {

    public static void main(String[] args) throws IOException {
        try {
            generateGrid(Integer.parseInt(args[0]));
        } catch (NumberFormatException e){
           e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e2){
            e2.printStackTrace();
        }

    }

    private static void generateGrid(int n) throws IOException {
        int [] [] grid = new int[n][n];
        PrimeNumbers.getInstance().calculateFirstNPrimes(n);
        java.util.ArrayList<Integer> tenPrimes = PrimeNumbers.getInstance().getNFirstPrimes(n);
        for (int i = 0; i<n; i++){
            grid[0][i] = tenPrimes.get(i);
        }
        for (int i = 0; i<n; i++){
            grid[i][0] = tenPrimes.get(i);
        }
        for (int i=1; i<n; i++){
            for (int j=1; j<n; j++) {
                grid[i][j] = tenPrimes.get(i) * tenPrimes.get(j);
            }

        }
        printGrid(grid,n);
    }

    private static void printGrid(int[][] grid, int n) {
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            for (int i=0; i<n; i++){
                for (int j=0; j<n; j++) {
                    out.write(Integer.toString(grid[i][j]));
                    out.write("\t");

                }
                out.newLine();
            }
            out.newLine();
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
