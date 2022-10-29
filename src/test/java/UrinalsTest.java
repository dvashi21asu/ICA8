import org.junit.jupiter.api.Test;

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
        assertEquals(numbers,urinalObj.urinalCount(list));
        System.out.println("======  Dhwanil Vashi == TEST TWO EXECUTED=======");
    }

    @Test
    void opFile() {
        String str = "src/urinal.dat";
        assertEquals(true,urinalObj.opFile(str));
        System.out.println("====== Dhwanil Vashi == TEST THREE EXECUTED=======");
    }
}