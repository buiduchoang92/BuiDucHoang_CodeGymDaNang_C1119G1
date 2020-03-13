import java.util.Arrays;

public class MyArrayLisk2<E> {
    private int size = 0;
    private int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyArrayLisk2() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayLisk2(int capacity) {
        elements = new Object[capacity];
    }

    public int getSize() {
        return this.size;
    }

    public E get(int index) {
        return (E) elements[index];
    }

    public void clear() {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public boolean add(E e) {
        elements[size] = e;
        size++;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity < 0) {
            throw new IllegalArgumentException("nhap sai" + minCapacity);
        } else {
            int newsize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newsize);

        }
    }

    public MyArrayLisk<E> clone() {
        MyArrayLisk<E> cloneelisk = new MyArrayLisk<>();
        for (Object itemp : elements) {
            cloneelisk.add((E) itemp);
        }
        return cloneelisk;
//        cloneelisk.elements = Arrays.copyOf(this.elements,this.size);
//        cloneelisk.size() = this.size;
//        return cloneelisk;
    }

    public void add(int index,E e){
        if (index < 0 ){
            throw new IllegalArgumentException("nhap sai"+ index);
        }else {
            for (int i = size+1;i <= index;i--){
                elements[i] = elements[i-1];
            }
            elements[index] = e;
            size++;
        }
    }

    public E remove(int index){
        if (index<0||index>elements.length){
            throw new IllegalArgumentException("nhap sai"+index);
        }else {
            Object element = elements[index];
            for (int i =index;i < size;i++){
                elements[i] = elements[i+1];
            }
            elements[index] = null;
            size--;
            return (E) element;
        }
    }

    public int size() {return this.size;
    }

    public int indexOf(E o){
        int index = -1;
        for (int i = 0;i <size; i++){
            if (elements[i].equals(o)){
                return i;
            }
        }
        return index;
    }
    public boolean contains(E o){
        return this.indexOf(o) >= 0;
    }
}

