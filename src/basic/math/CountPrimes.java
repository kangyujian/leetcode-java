package basic.math;

import java.util.Arrays;

/**
 * @author dreamcold
 * time:2020-09-13
 * site:https://leetcode-cn.com/problems/count-primes/
 */
public class CountPrimes {

    public int countPrimes(int n) {
        boolean[] isPrime=new boolean[n+1];
        Arrays.fill(isPrime,true);

        int count=0;
        for(int i=2;i<n;i++){
            if(isPrime[i]){
                count++;
                for (int j=2;i*j<n;j++){
                    isPrime[i*j]=false;
                }
            }
        }
        return count;
    }

}
