package src;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class My_ArrayList<T> implements List<T> {

    T[] arr;
    int ic;
    int size;

    public My_ArrayList() {
        ic = 100;
        size = 0;
        arr = (T[]) new Object[ic];

    }

    public My_ArrayList(int ic) {
        this.ic = ic;
        size = 0;
        arr = (T[]) new Object[ic];

    }

    private void checkCapacity(int K) {
        if (size + K >= ic) {
            if (ic * 2 > ic + K) {
                ic *= 2;
            } else {
                ic = ic + K;
            }
            T[] bigger = (T[]) new Object[ic];
            System.arraycopy(arr, 0, bigger, 0, size);
            arr = bigger;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object e) {
        if (!isEmpty()) {

            for (int i = 0; i <= size - 1; i++) {
                if (arr[i].equals(e)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {

        T[] copy = Arrays.copyOf(arr, size);
        return Arrays.asList(copy).iterator();
    }

    @Override
    public Object[] toArray() {
        T[] copy = Arrays.copyOf(arr, size);
        return copy;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    @Override
    public boolean add(T e) {
        checkCapacity(1);
        arr[size] = e;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {

        int Z = indexOf(o);
        if (Z == -1) {
            return false;
        } else {

            for (int i = Z; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            size--;
            return true;
        }
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    @Override
    public boolean addAll(Collection<? extends T> list) {
        // for(int i =0; i<list.size(); i++)
        // arr[size]=list[i];
        for (T e : list) {
            add(e);
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> lis) {
        checkCapacity(lis.size());
        for (int i = size - 1; i >= index; i--) {
            arr[i + lis.size()] = arr[i];
        }
        for (T e : lis) {
            arr[index] = e;
            index++;
        }
        size = size + lis.size();
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> list) {
        boolean a = false;
        for (Object e : list) {
            a = remove(e);
        }
        return a;

    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            arr[i] = null;
        }
        size = 0;
    }

    @Override
    public T get(int index) {
        if (index >= 0 && index < size) {

            return arr[index];
        }
        return null;
    }

    @Override
    public T set(int index, T element) {
        if (index > -1 && index < size) {

            T x = arr[index];
            arr[index] = element;
            T z = arr[index];
            System.out.println("The index (" + index + "," + x + ") is updated to (" + index + "," + z + ")");
            return z;
        }
        return null;
    }

    @Override
    public void add(int index, T e) {
        if (index >= 0 && index < size) {
            checkCapacity(1);
            for (int i = size - 1; i >= index; i--) {
                arr[i + 1] = arr[i];
            }
            arr[index] = e;
            size++;
        }
    }

    @Override
    public T remove(int index) {

        if (index >= 0 && index < size) {
            T z = arr[index];
            for (int i = index; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            size--;
            return z;
        }
        return null;
    }

    @Override
    public int indexOf(Object o) {

        for (int i = 0; i < size; i++) {
            if (o.equals(arr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {

        for (int i = size - 1; i >= 0; i--) {
            if (o.equals(arr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public ListIterator<T> listIterator() {
        T[] copy = Arrays.copyOf(arr, size);
        return Arrays.asList(copy).listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        T[] copy = Arrays.copyOf(arr, size);
        return Arrays.asList(copy).listIterator(index);
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {

        if (fromIndex >= 0 && toIndex < size) {
            T[] copy = Arrays.copyOfRange(arr, fromIndex, toIndex);
            return Arrays.asList(copy);
        }
        return null;

    }

}
