package rle;

public class RLE {
    public static String compress(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1));
                compressed.append(count);
                count = 1;
            }
        }

        compressed.append(str.charAt(str.length() - 1));
        compressed.append(count);

        return compressed.toString();
    }

    public static String decompress(String str) {
        StringBuilder decompressed = new StringBuilder();

        for (int i = 0; i < str.length(); i += 2) {
            char ch = str.charAt(i);
            int count = Character.getNumericValue(str.charAt(i + 1));

            for (int j = 0; j < count; j++) {
                decompressed.append(ch);
            }
        }

        return decompressed.toString();
    }
}