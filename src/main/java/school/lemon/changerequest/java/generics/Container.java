package school.lemon.changerequest.java.generics;

/**
 * Created by Diana on 12.01.2017.
 */
public class Container<N extends Number> {

    private N[] arr;
    private int size;

    public Container(N arr[]) {

        this.arr = (N[]) new Object[10];
        this.size = 0;
    }

    private void CheckSize() {
        if (size == arr.length) {
            N[] newArr = (N[]) new Object[arr.length * 10];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            arr = newArr;
        }
    }

    public int size() {
        return size;//
    }

    public void clear() {
        size = 0;
    }

    public N getIndex(int index) {

        if (index < 0 || index >= size) {
            return null;
        }
        return arr[index];
    }



}
