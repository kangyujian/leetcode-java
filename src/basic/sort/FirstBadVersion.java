package basic.sort;

/**
 * @author dreamcold
 * time:2020-09-10
 * site:https://leetcode-cn.com/problems/first-bad-version/
 */
class VersionControl{
    //just for test the question...
    boolean isBadVersion(int version){
        if(version>=0&&version<=100){
            return false;
        }else{
            return true;
        }
    }
}

public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        int low=1,high=n;
        while (low<high){
            int m=(low+high)>>>1;
            if(isBadVersion(m)){
                high=m;
            }else {
                low=m+1;
            }
        }
        return low;
    }
}
