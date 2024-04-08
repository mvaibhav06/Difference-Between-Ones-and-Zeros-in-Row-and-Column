import java.util.Arrays;

public class DifferenceMatrix {
    public static int[][] onesMinusZeros(int[][] grid) {
        int[] col = new int[grid[0].length];
        for(int i=0; i<col.length; i++){
            int count = 0;
            for(int j=0; j<grid.length; j++){
                if(grid[j][i] == 1){
                    count++;
                }
            }
            col[i] = count;
        }

        int[] row = new int[grid.length];
        for(int i=0; i<grid.length; i++){
            int count = 0;
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j] == 1){
                    count++;
                }
            }
            row[i] = count;
        }

        int[][] out = new int[grid.length][grid[0].length];

        for(int i=0; i<out.length; i++){
            for(int j=0; j<out[i].length; j++){
                out[i][j] = row[i]+col[j]-(row.length-row[i])-(col.length-col[j]);
            }
        }
        return out;
    }

    public static void main(String[] args) {
        int[][] nums = {{1,1,1},{1,1,1}};
        int[][] out = onesMinusZeros(nums);
        for (int i=0; i<out.length; i++){
            System.out.println(Arrays.toString(out[i]));
        }
    }
}
