import java.util.Stack;

/**
 * Created by hp on 2016/12/23.
 */
public class MinStack {
    /** initialize your data structure here. */
    private Stack<Long> mystack;
    private long min;
    public MinStack() {
        mystack = new Stack<Long>();
    }

    public void push(int x) {
        if (mystack.isEmpty()){
            mystack.push((long) 0);
            min=x;
        }else {
            mystack.push(x-min);
            min=Math.min(x,min);
        }
    }

    public void pop() {
        long pop = mystack.pop();
        if (pop<0){
            min=min-pop;
        }
    }

    public int top() {
        long peek = mystack.peek();
        if (peek<0) return (int) min;
        else return (int) (min+peek);
    }

    public int getMin() {
        return (int) min;
    }
}
