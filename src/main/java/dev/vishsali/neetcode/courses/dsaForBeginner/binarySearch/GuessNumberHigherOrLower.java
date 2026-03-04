package dev.vishsali.neetcode.courses.dsaForBeginner.binarySearch;

public class GuessNumberHigherOrLower extends GuessGame {

    public int solution_1(int n) {
        int left = 0,
                right = n;

        while (true){
            int mid = left + (right - left) / 2;

            int num = guess(mid);
            if(num == 0) return mid ;
            if(num > 0) left = mid + 1;
            else right = mid -1 ;
        }
    }
}


class  GuessGame{
    int guess(int num) {
        return 0;
    }
}
