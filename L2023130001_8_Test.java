/**
 * @description: 用于测试 Solution8 的岛屿数量计算功能
 */
public class L2023130001_8_Test {
    public static void main(String[] args) {
        Solution8 solution = new Solution8();

        char[][] grid1 = {
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'}
        };

        char[][] grid2 = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };

        System.out.println("示例1岛屿数量：" + solution.numIslands(grid1));
        System.out.println("示例2岛屿数量：" + solution.numIslands(grid2));
    }
}
