package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    private static final int EMPTY_TOTAL = -1;
    private static final int DEFAULT_RETURN_VALUE = -1;
    private static final int LAST_INDEX = CAPACITY - 1;

    private final int[] numbers = new int[CAPACITY];
    private int total = EMPTY_TOTAL;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull()) {
            numbers[++total] = in;
        }
    }

    public boolean callCheck() {
        return total == EMPTY_TOTAL;
    }

    public boolean isFull() {
        return total == LAST_INDEX;
    }

    protected int peekaboo() {
        if (callCheck()) {
            return DEFAULT_RETURN_VALUE;
        }
        return numbers[total];
    }

    public int countOut() {
        if (callCheck()) {
            return DEFAULT_RETURN_VALUE;
        }
        return numbers[total--];
    }
}
