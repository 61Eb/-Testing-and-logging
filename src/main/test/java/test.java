import Homework30.ArrayReturnNew;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Homework30.ArrayChecker;

public class test {

    private ArrayReturnNew ArrayUtils;
    @Test
    public void testGetArrayAfterLastOne() {
        int[] arr1 = {1, 2, 1, 2, 2};
        int[] result1 = {2, 2};
        Assertions.assertArrayEquals(result1, ArrayUtils.getArrayAfterLastOne(arr1));

        int[] arr2 = {2, 2, 2, 2};
        Assertions.assertThrows(RuntimeException.class, () -> ArrayUtils.getArrayAfterLastOne(arr2));
    }
    private ArrayChecker test2;
    @Test
    public void checkArray() {
        int[] array1 = {1, 2};
        int[] array2 = {1, 1};
        int[] array3 = {1, 3};
        int[] array4 = {1, 2, 2, 1};
    }
}
