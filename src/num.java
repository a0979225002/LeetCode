import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class num {

    public static int[] aa(int a,int b ,int c){

        int[] nums = {a,b,c};

        int tmp = 0;
        System.out.println("length:"+nums.length);
        for (int i =1;i<nums.length;i++){

            for (int j = i-1 ; j>=0 ;j--){

                if (nums[i]<nums[j]){
                  tmp = nums[j];
                  nums[j] = nums[i];
                  nums[i] = tmp;
                }
            }


        }


        return nums;
    }

    public static void main(String[] args) {


        List list =Arrays.stream(num.aa(10,3,7)).boxed().collect(Collectors.toList());

        System.out.println(list.remove(2));

    }
}
