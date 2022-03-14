package ss10.DanhSach.BaiTap.Bai1;

import java.util.Arrays;

public class MyList<E> {
    public MyList() {
        element = new Object[DEFAUL_CAPACITY];
    }

    private int size = 0;
    private static final int DEFAUL_CAPACITY = 10;
    Object element[];

    public MyList(int capacity) {
        if(capacity>=0) {
            element = new Object[capacity];
        }else{
            throw new IllegalArgumentException("capacity: "+capacity);
        }
    }

    public int size(){
        return this.size;
    }

    public void clean(){
        size = 0;
        for(int i =0; i<element.length;i++){
            element[i] = null;
        }
    }

    public boolean add(E elements){
        if(element.length == size){
            this.ensureCapacity(5);
        }
        element[size] = elements;
        size++;
        return true;
    }

    public void ensureCapacity(int minCapacity){
        if(minCapacity>=0){
            int newsize = this.element.length + minCapacity;
            element  = Arrays.copyOf(element,newsize);
        }else{
            throw  new IllegalArgumentException("minCapacity:  "+ minCapacity);
        }
    }

    public void add(int index, E elements){
        if(index>element.length){
            throw  new IllegalArgumentException("index: "+index);
        } else if(element.length == size){
            this.ensureCapacity(5);
        }
        if(element[index]==null){
            element[index] = elements;
            size++;
        } else{
            for (int i =size+1;i>=index;i--){
                element[i] = element[i-1];
            }
            element[index] = elements;
            size++;
        }
    }


}
