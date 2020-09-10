package basic.string;

/**
 * @author dreamcold
 * time:2020-09-10
 * site:https://leetcode-cn.com/problems/count-and-say/
 */
public class CountAndSay {
    public static String countAndSay(int n) {
        if(n<=0){
            return  null;
        }
        String start="1";

        for (int i=1;i<n;i++){
            StringBuilder sb=new StringBuilder();
            char[] sc=start.toCharArray();
            int count=1;
            char pre=sc[0];
            for (int j=1;j<sc.length;j++){
                if (sc[j]==pre){
                    count++;
                }else {
                    sb.append(count).append(pre);
                    pre=sc[j];
                    count=1;
                }
            }
            sb.append(count).append(pre);
            start=sb.toString();
        }
        return start;
    }
}
