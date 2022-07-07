package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MyTest {
    @Test
    void test() {
        assertThat(2).isEqualTo(2);
    }
}
