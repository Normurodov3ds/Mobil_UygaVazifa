package NewArray;

import java.util.Arrays;

public class MyArray<E> {
    private Object []object;
    public int size;  //
    public int capasity;

    public MyArray(int capasity) {
        this.capasity = capasity;
        object = new Object[capasity];
    }

    public MyArray() {
        capasity = 10;
        object = new Object[capasity]; // [ null ,null, ..] size = 0
    }

    public MyArray(E[] e) {
        this.object = e;
        capasity();
    }

    private int size(){
        int s = 0;
        for (Object o : this.object) {
            if (o!=null){
                s++;
            }
        }
        size = s;
        return size;
    }

    private void capasity(){
        if (capasity-size()<=0){
            capasity = (capasity*3/2)+1;
        }
    }

    public boolean add(E e){
        capasity();
        Object [] objects = new Object[capasity];//  [ null// ,1, ..] size 1
        int k =0;
        for (int i = 0; i < size(); i++) {
            objects[k++] = object[i];
        }
        objects[k] = e;
        object = objects;
        capasity();
        return true;
    }
    public void remove(E e){
        Object [] objects = new Object[capasity];
        int k = 0;
        for (int i = 0; i < size(); i++) {
            if (object[i]==e){
                continue;
            }
            objects[k++] = object[i];
        }
        object = objects;
        size();
    }

    @Override
    public String toString() {
        Object[] objects = new Object[size()];
        for (int i = 0; i < size; i++) {
         objects[i] = object[i];
        }
        return Arrays.toString(objects);
    }
}
