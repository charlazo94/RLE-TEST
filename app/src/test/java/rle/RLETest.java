package rle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RLETest {
    @Test
    public void testCompress() {
        String original = "AAAAANNNMMMMYYYYuuuuUUUUaaaarWWLLLLJ888DDDDDDDDD";
        String expected = "A5N3M4Y4u4U4a4r1W2L4J183D9";

        String compressed = RLE.compress(original);
        assertEquals(expected, compressed);

    }

    @Test
    public void testDecompress() {
        String compressed = "A5N3M4Y4u4U4a4r1W2L4J183D9";
        String expected = "AAAAANNNMMMMYYYYuuuuUUUUaaaarWWLLLLJ888DDDDDDDDD";

        String decompressed = RLE.decompress(compressed);
        assertEquals(expected, decompressed);
    }
}
