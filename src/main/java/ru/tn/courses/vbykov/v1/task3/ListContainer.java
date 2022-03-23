package ru.tn.courses.vbykov.v1.task3;
import java.util.Collection;

public class ListContainer<T> {
    private T[] values;
    private int size;
    public ListContainer() {
        this.values = (T[]) new Object[10];
        this.size = 0;
    }
    public ListContainer(T... values) {
        this.values = (T[]) new Object[values.length];
        for (int i = 0; i < values.length; i++) {
            this.add(values[i]);
        }
    }
    public T[] getValues() {
        var list = (T[]) new Object[this.size];
        for (int i = 0; i < this.size; i++) {
            list[i] = this.values[i];
        }
        return list;
    }
    public void add(T value) {
        if (this.size < this.values.length) {
            this.values[size++] = value;
        } else {
            T[] temp = (T[]) new Object[2 * size];
            for (int i = 0; i < size; i++) {
                temp[i] = this.values[i];
            }
            this.values = temp;
            this.values[size++] = value;
        }
    }
    public void add(T value, int index) {
        if (this.values.length >= this.size + 1) {
            T[] temp = (T[]) new Object[2 * size];
            for (int i = 0; i < size; i++) {
                temp[i] = (T) this.values[i];
            }
            this.values = temp;
        }
        for (int i = size; i > index; i--) {
            this.values[i] = this.values[i - 1];
        }
        if (index > size) {
            add(value);
        } else {
            this.values[index] = value;
        }
    }
    public void remove(int index) {
        if (index < this.size) {
            for (int i = index; i <= this.size - 1; i++) {
                this.values[i] = this.values[i + 1];
            }
            size--;
        } else {
            throw new RuntimeException("за пределами массива");
        }
    }
    public T get(int index) {
        if (index <= size) {
            return (T) this.values[index];
        } else {
            throw new RuntimeException("за пределами массива");
        }
    }
    public T get(T value) {
        int i = 0;
        while (i < size) {
            if (value.equals(this.values[i])) {
                return (T) this.values[i];
            }
            i++;
        }
        return null;
    }
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ListContainer)) {
            return false;
        }
        var listConteiners = (ListContainer<T>) o;
        for (int i = 0; i < size; i++) {
            if (!listConteiners.values[i].equals(this.values[i])) {
                return false;
            }
        }
        return true;
    }
    @Override
    public int hashCode() {
        int hash = 0;
        for (int i = 0; i < size; i++) {
            hash += 13 * hash + this.values[i].hashCode();
        }
        return hash;
    }
    public void addCollection(Collection<? extends T> collection) {
        T[] collectionElements = (T[]) new Object[collection.size()];
        int i = 0;
        for (T element : collection) {
            collectionElements[i++] = element;
        }

        for (i = 0; i < collectionElements.length; i++) {
            add(collectionElements[i]);
        }
    }
    public int getSize() {
        return this.size;
    }
    public ListContainer<T> getSubConteiner(int[] indexes) {
        var listContainer = new ListContainer<T>();
        for (int i = 0; i < indexes.length; i++) {
            if (indexes[i] > size) {
                throw new RuntimeException("индекс за пределами массива");
            }
            listContainer.add(this.values[indexes[i]]);
        }
        return listContainer;
    }
    public String toString() {
        // это ток для себя, не использую arrays utils
        return "(values=" + java.util.Arrays.deepToString(this.getValues()) + ", size=" + this.getSize() + ")";
    }
}
