package middle.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author dreamcold
 * time:2020-09-19
 * site:https://leetcode-cn.com/problems/group-anagrams/
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        for (String str:strs){
            char[] sc=str.toCharArray();
            Arrays.sort(sc);
            String stemp=new String(sc);
            if(!map.containsKey(stemp)) map.put(stemp,new ArrayList<>());
            map.get(stemp).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
