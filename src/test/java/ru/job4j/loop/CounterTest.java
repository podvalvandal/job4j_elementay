package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {
    @Test
    void sum0to100() {
        int start = 0;
        int finish = 100;
        int result = Counter.sum(start, finish);
        int expected = 5150;
    }

    @Test
    void sum0to1() {
        int start = 0;
        int finish = 1;
        int result = Counter.sum(start, finish);
        int expected = 1;
    }

    @Test
    void sum5to0() {
        int start = 5;
        int finish = 0;
        int result = Counter.sum(start, finish);
        int expected = 0;
    }

}