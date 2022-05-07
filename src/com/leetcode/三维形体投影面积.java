package com.leetcode;


/**
 * 在 n * n 的网格 grid 中，我们放置了一些与 x，y，z 三轴对齐的 1 x 1 x 1 立方体。
 *
 * 每个值 v = grid[i][j] 表示 v 个正方体叠放在单元格 (i, j) 上。
 *
 * 现在，我们查看这些立方体在 xy 、yz 和 zx 平面上的投影。
 *
 * 投影 就像影子，将 三维 形体映射到一个 二维 平面上。从顶部、前面和侧面看立方体时，我们会看到“影子”。
 *
 * 返回 所有三个投影的总面积 。

 */
public class 三维形体投影面积 {

    public static  int projectionArea(int[][] grid) {
        //默认该输入的数组是一个二维数组
        //侧视图
        int n = grid.length;
        int sumC = 0; //测试图面积之和 是最大列之和
        int sumZ = 0;  //正试图面积之和 是最大行之和
        int sumF = 0; //俯视图面积之和  是柱子的个数
        //循环二维数组
        for(int i = 0; i<n;i++){
            int maxC = 0, maxZ = 0;
            //获取数组s 中的最大值
            for (int j = 0; j < n; j++) {
                //System.out.println(grid[i][j]);
                sumF += grid[i][j] > 0 ? 1 : 0;
                maxZ = Math.max(maxZ, grid[j][i]); //比较并获得 最大行的值
                maxC = Math.max(maxC, grid[i][j]); //比较并获得 最大列的值
            }
            sumC += maxC;
            sumZ += maxZ;
        }
        //System.out.println(sumF);
        return sumC + sumZ + sumF;

    }

    public static void main(String[] args) {
        int [] []  arr ={{1,2},{3,4}};
        System.out.println( projectionArea(arr));
    }
}
