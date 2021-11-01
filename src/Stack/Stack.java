package Stack;

public class Stack {

    private int[] elements;
    private int numberOfElement;

    public Stack(int capacity) {
        elements = new int[capacity];
    }

    public void push(int element) {
        if (isFull()) throw new OverFlowException("E don full o");
        elements[numberOfElement++] = element;
    }

    public int size() {
        return numberOfElement;
    }

    public int pop() {
        if (isEmpty()) throw new UnderFlowException("nothing dey here");
        return --numberOfElement;
    }


    public boolean isEmpty() {
        return numberOfElement == 0;
    }

    public boolean isFull() {
        return size() == elements.length;
    }

    public class OverFlowException extends RuntimeException {
        public OverFlowException(String message) {
            super(message);
        }
    }

    private class UnderFlowException extends ArrayIndexOutOfBoundsException {
        public UnderFlowException(String message) {
            super(message);
        }
    }
}
