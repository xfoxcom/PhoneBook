package phonebook;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File find = new File("C:\\Users\\Alexander\\Downloads\\small_find.txt");
        File directory = new File("C:\\Users\\Alexander\\Downloads\\small_directory.txt");

        long[] timePast = linearSearch.searchLinear(find, directory);
        System.out.println();
        jumpSearch.searchJump(find, directory, timePast);
        System.out.println();
        binarySearch.searchBinary(find, directory);

    }
    public int mySqrt(int x) {
        int r = 1;
        x = r*r;
        return r;
    }
}
