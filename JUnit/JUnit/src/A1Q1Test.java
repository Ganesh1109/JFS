import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class A1Q1Test {

	@Test
	void test() {
		int[] s = {20,25,65,7,51,2,3,5,1};
		A1Q1 T1 = new A1Q1();
		int min = T1.min(s);
		int max = T1.max(s);
		int[] expected = {1,65};
		int[] actual = {min,max};
		assertArrayEquals(expected, actual);
		
	}
	@Test
	void test2() {
		int[] s = {20,25,64,7,51,2,3,5};
		A1Q1 T1 = new A1Q1();
		int min = T1.min(s);
		int max = T1.max(s);
		int[] expected = {2,64};
		int[] actual = {min,max};
		assertArrayEquals(expected, actual);
		
		
	}
	@Test
	void test3() {
		int[] s = {20,25,7,2,3,5,1};
		A1Q1 T1 = new A1Q1();
		int min = T1.min(s);
		int max = T1.max(s);
		int[] expected = {1,25};
		int[] actual = {min,max};
		assertArrayEquals(expected, actual);
		
	}

}
