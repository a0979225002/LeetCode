import java.util.*;

/**
 * 題目:
 *有隨機兩組句子,要找出兩組句子有不相同的單字,如果其中一組單字內有重複那將可無視規則
 * 注意：句子中只包含小寫,單字與單字間包含空格
 *
 * Example 1:
 *
 * Input: A = "this apple is sweet", B = "this apple is sour"
 * Output: ["sweet","sour"]
 *
 * Example 2:
 *
 * Input: A = "apple apple", B = "banana"
 * Output: ["banana"]
 *
 */

public class easy_884 {

    static String[] Solution(String sentencesA,String sentencesB){

        //解題思維,使用Map的key作為判斷是否有重複的特性,只要重複就讓value+1
        Map<String,Integer> map = new HashMap();
        //取出A句子
        for (String a: sentencesA.split(" ")) {
            map.put(a,map.getOrDefault(a,0)+1);
        }
        //取出Ｂ句子,的同時能順便比對是否有跟A句子重複的單字
        for (String a: sentencesB.split(" ")) {
            map.put(a,map.getOrDefault(a,0)+1);
        }

        System.out.println("測試map內的值:"+map.toString());

        List<String> list = new ArrayList<>();
        for (String a:map.keySet()){
            if (map.get(a)==1){
                list.add(a);
            }
        }

        return list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {
        List answer =
                Arrays.asList(Solution("this apple is sweet", "this apple is sour"));

        System.out.println("解答："+answer);

    }

}
