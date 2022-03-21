package Ss11.StackQueue.BaiTap;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class DaoNguocStack<T> {
    private LinkedList<T> stack;
    public DaoNguocStack(){
        stack = new LinkedList();
    }
    public void push(T element){
        stack.addFirst(element);
    }
    public T pop(){
        return stack.removeFirst();
    }
}
