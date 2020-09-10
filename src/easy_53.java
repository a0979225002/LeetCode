public class easy_53 {
    public int maxSubArray(int[] nums) {

        int maxNum = Integer.MIN_VALUE;//先給予int 的最小值
        int sumNum = 0;//和數

        for(int i =0; i<nums.length;i++){

            sumNum += nums[i];//讓他往右加數字,相加後是負數,下個回圈從0開始

            maxNum = Math.max(maxNum,sumNum);//比較之前相加後的數字與現在相加的數字哪個大

            sumNum = Math.max(sumNum,0);//如果數字相加是負數讓他變成0

        }

        return maxNum;
    }

    public static void main(String[] args ){
        easy_53  s = new easy_53();

        int[] a = {1,2,3};

        System.out.println(s.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));


    }
}

