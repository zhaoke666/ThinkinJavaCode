package com.leetcode;


import java.util.*;

/**
 * 在一个二维的花园中，有一些用 (x, y) 坐标表示的树。由于安装费用十分昂贵，你的任务是先用最短的绳子围起所有的树。
 * 只有当所有的树都被绳子包围时，花园才能围好栅栏。你需要找到正好位于栅栏边界上的树的坐标
 *
 */
public class 安装栅栏 {

    public static int[][] outerTrees(int[][] trees) {
        int n = trees.length;
        if (n < 4) return trees;
        //早到最做边界点 及在二维数组中最大或最小的横纵左边的点
        int[] leftMaxTree = trees[0]; //先假设第一个坐标是最左边的边界左边
        //最左边的点,及横左边最小点
        for (int i = 1; i < n; i++) {
            int[] tree = trees[i];
            if (tree[0] < leftMaxTree[0]) {
                leftMaxTree = tree;
            }
        }
        //做小的点与每个点进行连接，判断其余的点在不在同一边
        int []  startTree = leftMaxTree;
        //int [][] resultTrees = new int[2][];
        List<Integer> treeIndex = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(arrisEqual(trees[i],startTree)){
                continue;
            }
            int point = 0;  //带你的位置 如果在线的左边就是1,线上就是0,,线的右边就是2
            for (int j = 0; j< n;j++){
                if(arrisEqual(trees[j],startTree)||j==i){
                    continue;
            }
                //判断该点的位置
                int i1 = lineAndPoint(startTree, trees[i], trees[j]);
                if(point == 0){
                    point = i1 >0 ? 1:i1 < 0? 2: point;
                }else {
                    if(i1>0&&point != 1){
                        point = 4; //该直线不属于边界线
                        break;
                    }
                    if(i1<0&&point!=2){
                        point = 4;
                        break;
                    }

                }

            }
            if(point != 4){
                treeIndex.add(Integer.valueOf(i));
                startTree = trees[i];
            }
        }
        Set<Integer> indexSet = new HashSet<>(treeIndex);
        treeIndex = new ArrayList<>(indexSet);
        int [][] result = new int[treeIndex.size() +1][2];
        for (int i = 0;i<treeIndex.size();i++){
            int index  = treeIndex.get(i);
            result[i] = trees[index];
        }
        result[treeIndex.size()] = leftMaxTree;
        return result;

    }


    public static boolean arrisEqual(int[] array1, int [] array2){
        if(Arrays.equals(array1, array2)){
            return true;
        }
        return false;
    }


    public static int lineAndPoint(int [] lineStart,int [] lineEnd,int [] point){
        return (lineEnd[0] - lineStart[0]) * (point[1] - lineEnd[1]) - (lineEnd[1] - lineStart[1]) * (point[0] - lineEnd[0]);
    }

    public static void printArr2(int [][] arr){
        for (int[] date : arr){
           System.out.print(Arrays.toString(date));
        }
    }


    //官方答案
    public static int [][] outerTrees_1(int [][] trees){
        int n = trees.length;
        if (n < 4) {
            return trees;
        }
        int leftMost = 0;
        for (int i = 0; i < n; i++) {
            if (trees[i][0] < trees[leftMost][0]) {
                leftMost = i;
            }
        }

        List<int[]> res = new ArrayList<int[]>();
        boolean[] visit = new boolean[n];
        int p = leftMost;
        do {
            int q = (p + 1) % n;
            for (int r = 0; r < n; r++) {
                /* 如果 r 在 pq 的右侧，则 q = r */
                if (lineAndPoint(trees[p], trees[q], trees[r]) < 0) {
                    q = r;
                }
            }
            /* 是否存在点 i, 使得 p 、q 、i 在同一条直线上 */
            for (int i = 0; i < n; i++) {
                if (visit[i] || i == p || i == q) {
                    continue;
                }
                if (lineAndPoint(trees[p], trees[q], trees[i]) == 0) {
                    res.add(trees[i]);
                    visit[i] = true;
                }
            }
            if  (!visit[q]) {
                res.add(trees[q]);
                visit[q] = true;
            }
            p = q;
        } while (p != leftMost);
        return res.toArray(new int[][]{});
    }





    public static void main(String[] args) {
        int [][] arr = {{1,1},{2,2},{2,0},{2,4},{3,3},{4,2}};
        printArr2(arr);
        int[][] ints = outerTrees_1(arr);
        System.out.println();
        printArr2(ints);
    }
}
