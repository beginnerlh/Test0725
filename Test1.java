package written_test0725;

import java.util.Arrays;
//数组中次数出现超过一半的数字
public class Test1 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] array = {2};
        int a = s.MoreThanHalfNum_Solution(array);
        System.out.println(a);
    }
}


class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array.length == 0 ){
            return 0;
        }
        Arrays.sort(array);
        int a = array[0];
        int count = 1;
        for(int i =1;i<array.length;i++){
            if(a == array[i]){
                count ++;
            }else{
                if(count > array.length/2){
                    return a;
                }
                a = array[i];
                count = 1;
            }
        }
        if(count > array.length/2){
            return a;
        }
        return 0;
    }
}