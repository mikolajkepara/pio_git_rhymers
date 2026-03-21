package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int size_array = 12;
    private static final int num2 = -1;
    private static final int num3 = 11;

    private final int[] numbers = new int[size_array];

    private int total = num2;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == num2;
    }

    public boolean isFull() {
        return total == num3;
    }

    protected int peekaboo() {
        if (callCheck())
            return num2;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return num2;
        return numbers[total--];
    }

}
