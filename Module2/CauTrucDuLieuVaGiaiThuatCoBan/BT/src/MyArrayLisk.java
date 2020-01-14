import java.util.Arrays;

public class MyArrayLisk<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[];

    public MyArrayLisk() {
        element = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayLisk(int capacity) {
        if (capacity > 0) {
            element = new Object[capacity];
        } else {
            throw new IllegalArgumentException("nhap sai " + capacity);
        }
    }

    public int size() {
        return this.size;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity > 0) {
            int newsize = this.element.length + minCapacity;
            element = Arrays.copyOf(element, newsize);
        } else {
            throw new IllegalArgumentException("nhap sai " + minCapacity);
        }
    }

    public E get(int index) {
        return (E) this.element[index];
    }

    public void clear() {
        for (int i = 0; i < element.length; i++) {
            element[i] = null;
        }
        size = 0;
    }

    public boolean add(E e) {
        if (element.length == size) {
            ensureCapacity(5);
        }
        element[size] = e;
        size++;
        return true;
    }

    public void add(int index, E e) {
        if (index < 0 || index > element.length) {
            throw new IllegalArgumentException("nhap sai " + index);
        } else {
            for (int i = size + 1; i >= index; i--) {
                element[i] = element[i - 1];
            }
            element[index] = e;
            size++;
        }
    }

    public MyArrayLisk<E> clone() {
        MyArrayLisk<E> cloneLisk = new MyArrayLisk<>();
        for (Object itemp : element) {
            cloneLisk.add((E) itemp);
        }
        return cloneLisk;
    }

    public E remove(int index) {
        if (index < 0 || index > element.length) {
            throw new IllegalArgumentException("nhap sai " + index);
        } else {
            for (int i = index; i < size; i++) {
                element[i] = element[i + 1];
            }
           Object elements = element[index];
            element[size-1] = null;
            size--;
            return (E) elements;
        }
    }


}