package com.leetcode;

import java.util.Stack;

/**
 * dir
 * ⟶ subdir1
 * ⟶ ⟶ file1.ext
 * ⟶ ⟶ subsubdir1
 * ⟶ subdir2
 * ⟶ ⟶ subsubdir2
 * ⟶ ⟶ ⟶ file2.ext
 * 上面的文件系统可以写为 “dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext” 。’\n’ 和 ‘\t’
 *
 * 输入：input = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"
 * 输出：20
 * 解释：只有一个文件，绝对路径为 "dir/subdir2/file.ext" ，路径长度 20
 * 路径 "dir/subdir1" 不含任何文件
 */
public class 文件的最长绝对路劲 {

    public static int lengthLongestPath(String input) {
        if(input.length() == 0){
            return 0;
        }
        int res = 0;
        int [] sum = new int[input.length() + 1];
        for (String s: input.split("\n")){
            int level = s.lastIndexOf('\t') + 2;
            int len = s.length() - (level - 1);
            if(s.contains(".")){
                res = Math.max(res,sum[level - 1] + len);
            }else{
                sum[level]  = sum[level -1] + len + 1;
            }

        }
        return res;
    }


    public static int lengthLongestPath_1(String input) {
        Stack<Integer> sta = new Stack<>();
        int result = 0;
        sta.push(0);
        //1、拆分字符串 \n
        String [] newString = input.split("\n");
        for (int i= 0;i<newString.length;i++){
            //2 、 计算当前字符串的层级
            int level = newString[i].lastIndexOf("\t")+1;
            //如果当前字符串的层级比目前已经计算的层级要大,则将栈内的数据清理干净在计算
            while(sta.size()>level + 1){
                sta.pop();
            }
            //获取当前所有字符串的长度
            int length = sta.size() + (newString[i].length() - level + 1);
            //将当前最新长度存到栈中
            sta.push(length);
            //如果是一个文件，则说明该层级已经到底部,输出本层循环的最终长度即可
            if(newString[i].contains(",")){
                result  = Math.max(result,length -1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(lengthLongestPath_1("dir\\n\\tsubdir1\\n\\tsubdir2\\n\\t\\tfile.ext"));
    }

}
