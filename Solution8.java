class Solution8 {

    // 深度优先搜索（DFS），用于“淹没”当前岛屿上的所有陆地
    void dfs(char[][] grid, int r, int c) {
        int nr = grid.length;     // 获取网格的行数
        int nc = grid[0].length;  // 获取网格的列数

        // 边界条件判断：
        // 若行或列越界，或当前位置不是陆地('1')，直接返回
        if (r < 0 || c < 0 || r >= nr || c >= nc || grid[r][c] == '0') {
            return;
        }

        // 将当前陆地标记为'0'，表示已访问（防止重复计算）
        grid[r][c] = '0';

        // 递归访问上下左右四个方向的相邻位置
        dfs(grid, r - 1, c);  // 上
        dfs(grid, r + 1, c);  // 下
        dfs(grid, r, c - 1);  // 左
        dfs(grid, r, c + 1);  // 右
    }

    // 主函数：计算网格中“岛屿”的数量
    public int numIslands(char[][] grid) {
        // 特殊情况判断：空网格直接返回 0
        if (grid == null || grid.length <= 0) {
            return 0;
        }

        int nr = grid.length;     // 行数
        int nc = grid[0].length;  // 列数
        int num_islands = 0;      // 统计岛屿数量

        // 遍历整个网格
        for (int r = 0; r < nr; ++r) {
            for (int c = 0; c < nc; ++c) {
                // 如果当前位置是陆地（'1'），说明发现了一个新岛屿
                if (grid[r][c] == '1') {
                    ++num_islands;     // 岛屿计数加1
                    dfs(grid, r, c);   // 调用DFS“淹没”整座岛屿
                }
            }
        }

        // 返回总岛屿数量
        return num_islands;
    }
}
