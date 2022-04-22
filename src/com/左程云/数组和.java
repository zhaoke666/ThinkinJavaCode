package com.左程云;

import java.util.ArrayList;
import java.util.List;

public class 数组和 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};

        System.out.println(numOfSubarrays(arr));
    }

    public static int numOfSubarrays(int[] arr) {
        int mod = 1000000007;
        //记录所有子数组的和
        List<Integer> aList = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            aList.add(arr[i]);
        }
        List<int[]> sonSet2 = getSonSet2(arr, arr.length);
        for(int [] ar:sonSet2){
            int sum = 0;

            for (int i  = 0 ; i<ar.length;i++){
                sum += ar[i];

            }
            if(sum%2==1){
                aList.add(Integer.valueOf(sum));
            }
        }
       // System.out.println(sonSet2.size());
        int result = mod%aList.size();

        return result;
    }

    /*
     *按位对应法。 获取数组的子数组
     */
    private static List<int []> getSonSet2(int[] arr, int length) {
        List<int []> list = new ArrayList<>();
        int mark=0;
        int nEnd=1<<length;
        boolean bNullSet=false;
        for(mark=0;mark<nEnd;mark++){
            bNullSet=true;
            List<Integer> aslist = new ArrayList<>();
            for(int i=0;i<length;i++){
                if(((1<<i)&mark)!=0){//该位有元素输出
                    bNullSet=false;
                    //System.out.print(arr[i]+",");
                    aslist.add(arr[i]);
                }
            }
            int [] ar = new int[aslist.size()];
            for (int i = 0; i<aslist.size();i++){
                ar[i] = aslist.get(i);
            }
            list.add(ar);

        }
        return list;
    }


}




