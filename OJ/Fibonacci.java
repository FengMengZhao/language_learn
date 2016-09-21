public class Fibonacci{
    public int fib_recur(int n){
        if(n < 2)
            return 1;
        return fib_recur(n -1) + fib_recur(n - 2);
    }

    public int fib_dp(int n){
        int[] memory = new int[n + 1];
        if(n < 2)
            return 1;
        else{
            memory[0] = memory[1] = 1;
            for(int i = 2; i < memory.length; i++)
                memory[i] = memory[i - 1] + memory[i - 2];
        }
        return memory[n];

    }

    private int fib_tail(int a, int b, int count){
        if(count <= 0)
            return a;
        return fib_tail(b, a + b, --count);
    }

    public int fib_tail_recur(int n){
        if(n < 2)
            return 1;
        return fib_tail(1, 1, n);
    }

    public static void main(String args[]){
        Fibonacci f = new Fibonacci();
        System.out.println(f.fib_recur(45));
        //System.out.println(f.fib_dp(45));
        //System.out.println(f.fib_tail_recur(45));
    }
}
