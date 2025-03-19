package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private final int minusOne = -1;
    private final int eleven = 11;
    private final int[] numbers = new int[12];

    public int total = minusOne;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == minusOne;
    }

    public boolean isFull() {
        return total == eleven;
    }

    protected int peekaboo() {
        if (callCheck())
            return minusOne;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return minusOne;
        return numbers[total--];
    }

}
