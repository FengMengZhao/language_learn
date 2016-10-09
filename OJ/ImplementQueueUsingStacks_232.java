public class ImplementQueueUsingStacks_232{
    private List<Integer> stack_in = new LinkedList<>();
    private List<Integer> stack_out = new LinkedList<>();
    public void push(int x){
        stack_in.push(x);
    }

    public void pop(){
        if(!stack_out.isEmpty())
            stack_out.pop();
        else{
            while(!stack_in.isEmpty())
                stack_out.push(stack_in.pop());
            stack_out.pop();
        }
    }

    public int peek(){
        if(!stack_out.isEmpty())
            stack_out.peek();
        else{
            while(!stack_out.isEmpty())
                stack_out.push(stack_in.peek());
            stack_out.peek();
        }
    }

    public boolean empty(){
        return stack_in.isEmpty() && stack_out.isEmpty();
    }
}
