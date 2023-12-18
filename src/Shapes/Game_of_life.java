package Shapes;

public class Game_of_life {
    public Cell[][] grid;

    public static void main(String[] args) {

    }

    public void update() {
        Cell[][] nextGrid = new Cell[grid.length][grid[0].length];

        grid = nextGrid;
    }
}
