import java.util.Arrays;

public class MyLisk<E> {
    private int size = 0;
    private int DEFAUlT_CAPACITY;
    Object[] elements;

    public MyLisk() {
        elements = new Object[DEFAUlT_CAPACITY];
    }
    public void ensureCapa(){
        int newsize = elements.length*2;
        elements = Arrays.copyOf(elements,newsize);
    }
    public void add(int element){
        if (size == elements.length){
            ensureCapa();
        }
        elements[size] = element;
        size++;

    }


    public E getElements(int i) {
        if (i >= size||i < 0){
            throw new IllegalArgumentException("Index" + i +",size" + i);
        }
        return (E) elements[i];
    }
}
