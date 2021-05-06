package com.ca.mahima.graph;

import java.util.LinkedList;

/*https://www.geeksforgeeks.org/shortest-distance-two-cells-matrix-grid/
 * Time complexity =  O(V^2) (vertices)
 * */
public class ShortestDisctanceBtwn2dMatrixGrid {
    public static void main(String[] args) {

        char[][] grid = {{'0', '*', '0', 's'},
                {'*', '0', '*', '*'},
                {'0', '*', '*', '*'},
                {'d', '*', '*', '*'}};

        System.out.print(minDistance(grid));
    }

    private static int minDistance(char[][] grid) {
        LinkedList<QItem> que = new LinkedList<>();
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        QItem source = new QItem(0, 0, 0);

        //find out the source position and update QItem
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 's') {
                    source.row = i;
                    source.col = j;
                    break;
                }
            }
        }

        que.add(source);
        visited[source.row][source.col] = true;

        while (!que.isEmpty()) {
            QItem p = que.remove();

            if (grid[p.row][p.col] == 'd') {
                return p.dist;
            }
            //go up
            if (isValidCell(p.row - 1, p.col, grid, visited)) {
                que.add(new QItem(p.row - 1, p.col, p.dist + 1));
                visited[p.row - 1][p.col] = true;
            }
            //go down
            if (isValidCell(p.row + 1, p.col, grid, visited)) {
                que.add(new QItem(p.row + 1, p.col, p.dist + 1));
                visited[p.row + 1][p.col] = true;
            }
            //go left
            if (isValidCell(p.row, p.col - 1, grid, visited)) {
                que.add(new QItem(p.row, p.col - 1, p.dist + 1));
                visited[p.row][p.col - 1] = true;
            }
            //go right
            if (isValidCell(p.row, p.col + 1, grid, visited)) {
                que.add(new QItem(p.row, p.col + 1, p.dist + 1));
                visited[p.row][p.col + 1] = true;
            }
        }
        return -1;
    }

    static boolean isValidCell(int x, int y, char[][] grid, boolean[][] visited) {
        if (x >= 0 && y >= 0 && x < grid.length && y < grid[0].length && grid[x][y] != '0' && visited[x][y] == false) {
            return true;
        }
        return false;
    }
}

class QItem {
    int row, col, dist;

    public QItem(int row, int col, int dist) {
        this.row = row;
        this.col = col;
        this.dist = dist;

    }
}
