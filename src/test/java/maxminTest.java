import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class maxminTest {

    @Test
    public void findmax()  {
        List<Integer> numbers = Arrays.asList(25, 14, 56, 15, 36, 56, 77, 18, 29, 49);

        int max = maxmin.findMax(numbers);

        assertThat(max).isEqualTo(77);
    }
    @Test
    public void findmin()  {
        List<Integer> numbers = Arrays.asList(25, 14, 56, 15, 36, 56, 77, 18, 29, 49);

        int min = maxmin.findMax(numbers);

        assertThat(min).isEqualTo(14);
    }
//Write a Java program to find the maximum and minimum value of an array. Exercise 10
}