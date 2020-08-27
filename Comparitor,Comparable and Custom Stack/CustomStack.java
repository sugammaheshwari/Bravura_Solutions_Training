package Day6;

import java.util.*;

public class CustomStack<T>
{
    ArrayList<T> st;
    int idx;
    
    public CustomStack() {
        this.st = new ArrayList<T>();
        this.idx = 0;
    }
    
    public void push(final T x) {
        if (this.idx == 10) {
            System.out.println("Stack full ! ,pop some elements first to insert more");
            return;
        }
        this.st.add(x);
        ++this.idx;
        System.out.println("push successfull");
    }
    
    public void pop() {
        if (this.idx == 0) {
            System.out.println("cant remove element , stack is empty");
            return;
        }
        this.st.remove(--this.idx);
        System.out.println("pop successfull");
    }
}