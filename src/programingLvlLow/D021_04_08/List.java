package programingLvlLow.D021_04_08;

/**
 * Created by Miver on 2017-08-04.
 */
public class List {
    private ListElement first = null;
    private ListElement last = null;

    public void add(int el) {
        ListElement tmp = new ListElement(el);
        tmp.setPrev(this.last);

        if (this.last != null)
            this.last.setNext(tmp);

        this.last = tmp;

        if (this.first == null)
            this.first = tmp;
    }

    public int get() {
        if (this.first != null && this.last != null) {
            int value = this.first.getValue();

            this.first = this.first.getNext();
            if (this.first != null) {
                this.first.getPrev().setNext(null);
                this.first.setPrev(null);
            }

            return value;
        }
        return -1;
    }

    public void print() {
        ListElement current = this.first;

        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    public void printReverse() {
        ListElement current = this.last;

        while (current != null) {
            System.out.println(current.getValue());
            current = current.getPrev();
        }
    }

    public void addSorted(int el) {
        ListElement tmp = new ListElement(el);

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
    }

    //Przepinamy lapki
    public void bubbleSort() {
        boolean isSorted = false;

        while (!isSorted) {
            ListElement current = this.first;
            isSorted = true;

            if (current != null) {
                ListElement next = this.first.getNext();

                while (next != null) {
                    if (current.getValue() > next.getValue()) {
                        next.setPrev(current.getPrev());
                        current.setPrev(next);
                        current.setNext(next.getNext());
                        next.setNext(current);
                        if (current.getNext() != null)
                            current.getNext().setPrev(current);
                        if (next.getPrev() != null)
                            next.getPrev().setNext(next);
                        else
                            this.first = next;

                        next = current.getNext();
                        isSorted = false;
                    } else {
                        current = current.getNext();
                        next = next.getNext();
                    }
                }
            }
        }
    }
}
