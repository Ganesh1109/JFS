import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class minmaxTest {

	 @org.junit.jupiter.api.Test
	    void findMinMax2() {
	        assertAll(
	                () -> assertEquals("Min is 0 Max is 34", minmax.findMinMax(new int[]{0, 1, 2, 34, 5, 6})),
	                () -> assertEquals("Min is 1 Max is 10", minmax.findMinMax(new int[]{1, 2, 10, 5, 6})),
	                () -> assertEquals("Min is 2 Max is 100", minmax.findMinMax(new int[]{ 100, 2, 34, 5, 6})));
	    }

}
