package programingLvlMid.D033_24_08;

import java.lang.reflect.Array;

/**
 * Created by Miver on 2017-08-24.
 */
public class CustomStack<T> {
    private int index = 0;
    private int size = 0;
    T[] stack;

    //konstruktor, ktory przyjmuje max rozmiar dla stosu
    public CustomStack(Class<T> t, int size) {
        this.stack = (T[]) Array.newInstance(t, size);
        this.size = size;
    }

    //dodawanie do tablicy
    public void push(T s) {
        if (index < size)
            stack[index++] = s;
        else
            System.out.println("Stos pelny");
    }

    //usuwanie z tablicy
    public T pop() {
        T result = null;
        try {
            result = stack[--index];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Stos pusty");
        }
        return result;
        /*
        if (index >= 0) {
            T element = stack[--index];
            stack[index] = null;
            return element;
        } else
            throw new ArrayIndexOutOfBoundException("Stos jest pusty");
         */
    }

    public int getIndex() {
        return index;
    }
}
