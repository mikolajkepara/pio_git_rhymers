package edu.kis.vh.nursery;

/**
 * Rhymer typu „Hanoi”, który odrzuca wartości większe niż ostatnia zapisana
 * i zlicza liczbę takich odrzuceń.
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    /**
     * Początkowa wartość licznika odrzuconych elementów.
     */
    private static final int INITIAL_REJECTED_COUNT = 0;

    /**
     * Liczba wszystkich odrzuconych wartości.
     */
    private int totalRejected = INITIAL_REJECTED_COUNT;

    /**
     * Zwraca liczbę odrzuconych elementów.
     * @return liczba odrzuceń
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Dodaje wartość do stosu, jeśli nie jest większa od wartości na jego szczycie.
     * W przeciwnym razie zwiększa licznik odrzuceń.
     *
     * @param in wartość do dodania
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo()) {
            totalRejected++;
        } else {
            super.countIn(in);
        }
    }
}
