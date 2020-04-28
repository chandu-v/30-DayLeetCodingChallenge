package Week3;

public class NumberOfIslands {

    public static void main(String[] args) {
        int [][] grid = new int[][]{{1,1,1,1,0},
            {1,1,0,1,0},
            {1,1,0,0,0},
            {0,0,0,0,0}};
    }
    public static int numIslands(char[][] grid) {
        int NumberOfIslands = 0 ;
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[i].length ; j++){
                //is in horizontal edge
                //is in vertical edge
                //check 1*1 array
                //check 2*2 array
                //...check length-1 * length-1 array
            }
        }
        return NumberOfIslands;
    }
}