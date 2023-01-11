import org.junit.jupiter.api.Test;

import static com.example.kata_java.ReverseWords.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


class SolutionTest {
    @Test
    void sampleTests() {
        assertEquals("world! hello", reverseWords("hello world!"));
        assertEquals("this like speak doesn't yoda", reverseWords("yoda doesn't speak like this"));
        assertEquals("foobar", reverseWords("foobar"));
        assertEquals("editor kata", reverseWords("kata editor"));
        assertEquals("boat your row row row", reverseWords("row row row your boat"));
        assertEquals("", reverseWords(""));
    }
}