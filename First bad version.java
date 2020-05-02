/* This is the solution of first bad version problem
    published on May 1,2020.. */


public class Solution extends VersionControl{
    public int firstBadVersion(int n){
        //Logic is strightforward just apply binary search
        int start=1;
        int end=n;
        while(end>start)
        {
            int mid = start + (end-start)/2;
            
            if(isBadVersion(mid))
            end=mid;
            else
            start=mid+1;
        }

        return isBadVersion(start)?low:-1;
    }
}
