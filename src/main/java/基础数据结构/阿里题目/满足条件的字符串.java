package 基础数据结构.阿里题目;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 蔡佳新
 * @version 1.0
 * @since 2019/11/21 18:35
 */
public class 满足条件的字符串 {


    private static Character getStr(String str){
        final Map<Character, Integer> map = new HashMap<Character, Integer>();
        final char[] chars = str.toCharArray();
        final int len = chars.length / 2;
        for (char aChar : chars) {
            Integer sum = map.get(aChar);
            if(sum == null){
                map.put(aChar, 1);
                continue;
            }
            sum++;
            if(sum > len){
                return aChar;
            }
            map.put(aChar, sum);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(getStr("1111asdaaaaaa"));
    }



}
