import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class T1 {
    public String go(String[] s1,String[] s2){

        List lists1 = new ArrayList();

        for (String a : s1){
            if (lists1.contains(a)){
                lists1.remove(a);
            }else {
                lists1.add(a);
            }
        }

        for (String a : s2) {
            if (lists1.contains(a)){
                lists1.remove(a);
            }else {
                lists1.add(a);
            }
        }

        return lists1.toString();
    }
    public static void main(String[] args) {
        T1 t1 = new T1();
        System.out.println(t1.go(new String[]{"this","apple","apple","is","sweet"}, new String[]{"apple01","this","is","sour"}));
    }
}

