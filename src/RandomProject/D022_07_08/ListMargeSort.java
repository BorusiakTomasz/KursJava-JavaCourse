package RandomProject.D022_07_08;

import RandomProject.D021_04_08.ListElement;

/**
 * Created by Miver on 2017-08-07.
 */
public class ListMargeSort {
    private ListElement first = null;
    private ListElement last = null;
    private int counter = 0;

    public ListMargeSort(ListElement first, ListElement last, int counter) {
        this.first = first;
        this.last = last;
        this.counter = counter;
    }

    public ListMargeSort() {}

    public ListElement getFirst() {
        return first;
    }

    public ListElement getLast() {
        return last;
    }

    public void add(int el) {
        ListElement tmp = new ListElement(el);
        tmp.setPrev(this.last);

        counter++;
        if (this.last != null)
            this.last.setNext(tmp);

        this.last = tmp;

        if (this.first == null)
            this.first = tmp;
    }

    public ListElement get() {
        if (this.first != null && this.last != null) {
            ListElement value = this.first;

            this.first = this.first.getNext();
            if (this.first != null) {
                this.first.getPrev().setNext(null);
                this.first.setPrev(null);
            }

            counter--;
            value.setNext(null);
            value.setPrev(null);
            return value;
        }
        return null;
    }

    public void print() {
        ListElement current = this.first;

        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    public void mergeSort() {
        int _counter = this.counter / 2;
        ListElement current = this.first;

        for (int i = 0; i < _counter; i++) {
            current = current.getNext();
        }

        ListMargeSort newList1 = new ListMargeSort(this.first, current.getPrev(), _counter);
        ListMargeSort newList2 = new ListMargeSort(current, this.last, this.counter - _counter);

        current.getPrev().setNext(null);
        current.setPrev(null);

        //newList1
        if (_counter > 1)
            newList1.mergeSort();

        //newList2
        if (this.counter - _counter > 1)
            newList2.mergeSort();

        newList1.mergeLists(newList2);

        this.first = newList1.getFirst();
        this.last = newList1.getLast();
    }

    public void mergeLists(ListMargeSort listToMerge) {
        ListElement element = null;
        ListElement current = this.first;

        while ((element = listToMerge.get()) != null) {
            //this.addSorted(element);
            boolean isAdded = false;

            while (current != null && !isAdded) {
                if (current.getValue() > element.getValue()) {
                    element.setPrev(current.getPrev());
                    current.setPrev(element);
                    element.setNext(current);
                    if (element.getPrev() != null)
                        element.getPrev().setNext(element);
                    else
                        this.first = element;
                    isAdded = true;
                }
                else
                    current = current.getNext();
            }

            if (!isAdded) {
                current = element;
                element.setPrev(this.last);
                this.last.setNext(element);
                this.last = element;
            }

        }
    }

    /*public void addSorted(ListElement tmp) {
        if (this.first == null) {
            this.first = tmp;
            this.last = tmp;
        } else {
            ListElement current = this.first;
            boolean isAdded = false;

            while (current != null && !isAdded) {
                if (current.getValue() > tmp.getValue()) {
                    tmp.setPrev(current.getPrev());
                    current.setPrev(tmp);
                    tmp.setNext(current);
                    if (tmp.getPrev() != null)
                        tmp.getPrev().setNext(tmp);
                    else
                        this.first = tmp;
                    isAdded = true;
                }
                current = current.getNext();
            }

            if (!isAdded) {
                tmp.setPrev(this.last);
                this.last.setNext(tmp);
                this.last = tmp;
            }
        }
    }*/
}
