package ss10_data_structure_algorithms.exercise.array_list;

import java.util.Arrays;

public class MyList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size = 0;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        for (int i = elements.length - 1; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        Object valueDele = new Object();
        for (int i = 0; i < size; i++) {
            if (i == index) {
                valueDele = elements[i];
                size--;
            }
            if (i >= index) {
                elements[i] = elements[i + 1];
            }
        }
        return (E) valueDele;
    }

    public int size() {
        return this.size;
    }

    public E clone() {
        Object arrClone = Arrays.copyOf(elements, elements.length);
        return (E) arrClone;
    }

    public boolean contains(E o) {
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (o == elements[i]) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public int indexOf(E o) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) {
                index = i;
            }
        }
        return index;
    }


    public boolean add(E o) {
      if (size==elements.length){
          elements = Arrays.copyOf(elements, elements.length * 2);
      }
        elements[size]=o;
        size++;
          return true;
    }


    public void ensureCapacity(int minCapacity) {
        int newSize = minCapacity * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public E get(int i) {
        Object getNumber = new Object();
        for (int j = 0; j < size; j++) {
            if (i == j) {
                getNumber = elements[j];
            }
        }
        return (E) getNumber;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    }


