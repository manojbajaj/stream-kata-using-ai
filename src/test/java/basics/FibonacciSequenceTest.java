package basics;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;

/**
 * By doing this tasks you will learn how to use:
 * <p>
 * - {@link java.util.stream.Stream#iterate)}
 * - {@link java.util.stream.Stream#reduce)}
 */
class FibonacciSequenceTest {

    // <editor-fold defaultstate="collapsed" desc="Click here to see the answer">
    /*
        return Stream
            .iterate(new long[]{1, 1}, (long[] results) -> new long[]{results[1], results[0] + results[1]})
            .limit(sequenceNumber)
            .reduce((a, b) -> b)
            .orElse(new long[]{0, 0})[0];
     */
    //</editor-fold>
    /**
     * Calculates {@param sequenceIndex} of Fibonacci sequence.
     *
     * @see <a href="https://simple.wikipedia.org/wiki/Fibonacci_number">Wikipedia</a>
     */
    static long fibonacciSequence(long sequenceIndex) {
        throw new IllegalStateException("Not implemented yet");
    }

    @Test
    @DisplayName("Task: Calculate Fibonacci Sequence")
    void task() {
        assertThat(fibonacciSequence(0), is(0L));
        assertThat(fibonacciSequence(1), is(1L));
        assertThat(fibonacciSequence(2), is(1L));
        assertThat(fibonacciSequence(3), is(2L));
        assertThat(fibonacciSequence(10), is(55L));
        assertThat(
                (double) fibonacciSequence(20) / fibonacciSequence(19),
                closeTo(1.61d, 0.2d)
        );
    }


}