package Lesson24;

import Lesson24.MyArrays.AbstractList.ArrayLists.My_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *     int size();
 *     boolean isEmpty();
 *     boolean contains(E o);
 *     E[] toArray();
 *     Object[] toArrays();
 *     boolean add(E o);
 *     boolean remove(E o);
 *     boolean addAll(E[] c);
 *     E get(int index);
 *     E set(int index, E element);
 *     void add(int index, E element);
 *     E remove(int index);
 *     int indexOf(E o);
 *     boolean removeAll(My_ArrayList<E> s);
 */

public class Main{
    public static void main(String[] args) {
        My_ArrayList<Integer> list = new My_ArrayList<>(15);
        list.add(4);
        list.add(1);
        list.add(3);
        list.add(5);

        My_ArrayList<String> list1 = new My_ArrayList<>(15);
        list1.add("");
        list1.add("");
       
        list.addAll(list1);
        System.out.println(list);


    }
}
