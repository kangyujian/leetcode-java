package middle.sort;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author dreamcold
 * @time 2020-10-10
 * @site https://leetcode-cn.com/problems/top-k-frequent-elements/
 */
public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        PriorityQueue<int[]> pq=new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        }) ;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int num=entry.getKey(),count=entry.getValue();
            if(pq.size()==k){
                if(count>pq.peek()[1]){
                    pq.poll();
                    pq.offer(new int[]{num,count});
                }
            }else{
                pq.offer(new int[]{num,count});
            }
        }
        int[] ret=new int[k];
        for(int i=0;i<k;i++){
            ret[i]=pq.poll()[0];
        }
        return ret;
    }

}
