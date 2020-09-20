package special.week1;

public class SumOfAllOddLengthSubArrays{

    public static void main(String[] args) {
        int[] arr={1,4,2,5,3};
        int res=sumOddLengthSubarrays(arr);
        System.out.println(res);
    }

    public static int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        for(int windowSize=1;windowSize<=arr.length;windowSize+=2){
            for(int start=0,end=start+windowSize-1;end<arr.length;start++,end++){
                int subSum=0;
                for(int i=start;i<=end;i++){
                    subSum+=arr[i];
                }
                sum+=subSum;
            }
        }
        return sum;
    }
}


