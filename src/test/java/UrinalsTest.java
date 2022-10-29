import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class UrinalsTest {

    Urinals urinalObj = new Urinals();

    @Test
     void goodString() {
        String name="dhwanil";
        assertEquals(true,urinalObj.goodString(name));
        System.out.println("====== Dhwanil Vashi == TEST ONE EXECUTED=======");
    }

    @Test
    void urinalCount() {
        ArrayList<String> list = new ArrayList<>( Arrays.asList("101","0100010","00100101101010"));
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(0, 1, -1));
        assertEquals(numbers,urinalObj.uriCnt(list));
        System.out.println("======  Dhwanil Vashi == TEST TWO EXECUTED=======");
    }

    @Test
    void opFile() {
        String str = "src/urinal.dat";
        assertEquals(true,urinalObj.opFile(str));
        System.out.println("====== Dhwanil Vashi == TEST THREE EXECUTED=======");
    }

    @Test
    void FileChk() {
        String str = "src/urnal.dat";
        assertEquals(false,urinalObj.chkFile(str));
        System.out.println("====== Dhwanil Vashi == TEST FOUR EXECUTED =======");
}
    @Test
    void dlpfile() throws IOException, IOException {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        assertEquals(true,urinalObj.addinfile(nums));
        System.out.println("====== Dhwanil Vashi == TEST FIVE EXECUTED =======");
}
}