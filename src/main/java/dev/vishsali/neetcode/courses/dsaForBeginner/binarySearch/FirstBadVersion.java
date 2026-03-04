package dev.vishsali.neetcode.courses.dsaForBeginner.binarySearch;

public class FirstBadVersion extends VersionControl {
    public int solution_1(int n) {
        for(int i = 1; i <= n; i++){
            if (isBadVersion(i)) return i;
        }

        return -1;
    }


    public int solution_2(int n) {
        int left = 1,
                right = n;

        while(left <= right){
            int mid = left + (right - left) / 2;
            boolean curr = isBadVersion(mid);
            boolean prev = isBadVersion(mid -1);

            if(curr == true && prev == false) return mid ;
            if (curr) right = mid -1;
            else left = mid + 1;


        }


        return -1;
    }
}


class VersionControl {
    boolean isBadVersion(int n){
        return true;
    }
}