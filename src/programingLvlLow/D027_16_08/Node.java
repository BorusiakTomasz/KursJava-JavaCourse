package programingLvlLow.D027_16_08;

/**
 * Created by Miver on 2017-08-17.
 */
public class Node {
    private int id;
    private int key;
    private Node right;
    private Node left;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    @Override
    public String toString() {

        String temp = "Node: " + this.key +" key:" + this.id ;
        int leftInt = 0;
        int rightInt = 0;

        if(this.right != null) {
            rightInt = right.key;
            temp += ", right: " + right;
        }

        if(this.left != null) {
            leftInt = left.key;
            temp += ", left: "+left;
        }

        return temp + "\n";
    }
}
