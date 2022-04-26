import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class A1Q2Test {

	@Test
	void test() {
		assertAll(
                () -> assertEquals("Min is 0 Max is 34", A1Q2.minmax(new int[]{0, 1, 2, 34, 5, 6})),
                () -> assertEquals("Min is 1 Max is 10", A1Q2.minmax(new int[]{1, 2, 10, 5, 6})),
                () -> assertEquals("Min is 2 Max is 100", A1Q2.minmax(new int[]{ 100, 2, 34, 5, 6})));
    
	}

}
