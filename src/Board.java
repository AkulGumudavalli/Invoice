public class Board {
    private String[][] grid;

    public Board() {
        grid = new String[3][3];
    }

    public boolean isCellEmpty(int row, int col) {
        return grid[row][col] == null;
    }

    public void setCell(int row, int col, String symbol) {
        grid[row][col] = symbol;
    }

    public boolean checkWin(String symbol) {
        for (int i = 0; i < 3; i++) {
            if ((grid[i][0] == symbol && grid[i][1] == symbol && grid[i][2] == symbol) ||
                    (grid[0][i] == symbol && grid[1][i] == symbol && grid[2][i] == symbol)) {
                return true;
            }
        }
        return (grid[0][0] == symbol && grid[1][1] == symbol && grid[2][2] == symbol) ||
                (grid[0][2] == symbol && grid[1][1] == symbol && grid[2][0] == symbol);
    }
}