package easy;

public class GuessNumberHigherOrLower {

    public static void main(String[] args) {
        System.out.print(guessNumber(20));
    }

    public static int guess(int num){
        if(num>7){
            return -1;
        }else if(num<7){
            return 1;
        }else {
            return 0;
        }
    }

    public static int guessNumber(int n) {
        int lowerBound = 1;
        int upperBound = n;
        int requiredNumber = 0;
        while (lowerBound<=upperBound){
            //int mid = (lowerBound + upperBound) / 2;
            int mid = lowerBound + (upperBound-lowerBound) / 2;
            int guess = guess(mid);
            if(guess == -1){
                upperBound = mid -1;
            }else if(guess == 1){
                lowerBound = mid+1;
            }else if(guess == 0) {
                requiredNumber = mid;
                return requiredNumber;
            }
        }
        return requiredNumber;
    }

}
