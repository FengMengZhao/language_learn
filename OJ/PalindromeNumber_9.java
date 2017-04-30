public class PalindromeNumber_9{
    public boolean isPalindrome(int x){
        if(x < 0)
            return false;
        if(x < 10)
            return true;
        int f = x / 10;
        int t = x % 10;

        while(f > t){
            x /= 10;
            t = 10*t + x % 10;
            f = x;
        }
        return f == t ? true : (f == t / 10 ? true : false);
    }

    public static void main(String args[]){
        System.out.println(new PalindromeNumber_9().isPalindrome(1));
        System.out.println(new PalindromeNumber_9().isPalindrome(11));
        System.out.println(new PalindromeNumber_9().isPalindrome(121));
        System.out.println(new PalindromeNumber_9().isPalindrome(1212));
        System.out.println(new PalindromeNumber_9().isPalindrome(1234554321));
    }
}
