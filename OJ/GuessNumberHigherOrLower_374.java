public class GuessNumberHigherOrLower_374{
    public int guessNumber(int n, int target){
        if(guess(n, target) == 0)
            return n;
        if(target == 1)
            return 1;
        int lower = 1;
        int upper = n;
        int current = (1 + n) >> 1;
        while(guess(current, target) != 0){
            if(guess(current, target) == -1)
                lower = current;
            
            if(guess(current, target) == 1)
                upper = current;
            current = lower % 2 != 0 || upper % 2 != 0 ? (lower >> 1) + (upper >> 1) + 1
                                                       : (lower >> 1) + (upper >> 1);
        }
        return current;
    }

    public int guess(int guessNum, int target){
        if(guessNum < target)
            return -1;
        else if(guessNum > target)
            return 1;
        else return 0;
    }

    public static void main(String args[]){
        System.out.println(new GuessNumberHigherOrLower_374().guessNumber(2126753390, 1702766719));
        System.out.println(new GuessNumberHigherOrLower_374().guessNumber(10, 1));
        System.out.println(new GuessNumberHigherOrLower_374().guessNumber(10, 6));
        System.out.println(new GuessNumberHigherOrLower_374().guessNumber(10, 7));
        System.out.println(new GuessNumberHigherOrLower_374().guessNumber(10, 8));
        System.out.println(new GuessNumberHigherOrLower_374().guessNumber(10, 9));
        System.out.println(new GuessNumberHigherOrLower_374().guessNumber(10, 10));
    }
}

