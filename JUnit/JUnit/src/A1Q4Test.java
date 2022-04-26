import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


//@TestInstance(TestInstance.Lifecycle.PER_METHOD)  //per method in instance class is default instance method
//@TestInstance(TestInstance.Lifecycle.PER_CLASS) //per class is in instance class which is used to create instance class for only once. by this @beforeAll method static variable is not needed to be called as we r calling instance class

class A1Q4Test {
	A1Q4 z;
	
	@BeforeAll
	static void BeforeAllTests() {
		System.out.println("Start\n");
	}
	
	@BeforeEach
	void BeforeEachTest() {
		z = new A1Q4();
		System.out.println("++++ Before each is printing ++++");
	}
	
	@DisplayName("Addition") //display name annotation used for overwriting the method (test1) name into given name
	@Test
	void test1() {
		int expected = 9;
		int actual = z.Add(7,2);
		assertEquals(expected, actual );
		System.out.println("Test 1 is printing");
	}
	
	@Test
	void test2() {
		int expected = 3;
		assertEquals(expected, z.Sub(5,2));
		System.out.println("Test 2 is printing");
	}
	
	@Nested // nested class. it is a child class of main class
	class AddnSub {
		@DisplayName("Addition") 
		@Test
		void test1() {
			int expected = 9;
			int actual = z.Add(7,2);
			assertEquals(expected, actual );
			System.out.println("Test 1 is printing");
		}
		
		@DisplayName("Subtraction")
		@Test
		void test2() {
			int expected = 3;
			assertEquals(expected, z.Sub(5,2));
			System.out.println("Test 2 is printing");
		}
	}
	
	//@Disabled  //it is used to skip the test and run remaining tests
	@Test
	@Tag("Mul")  //used in importing or exporting of different tags while working on large project
	void test3() {
		assertEquals(18, z.Mul(9,2));
		System.out.println("Test 3 is printing");
	}
	
	@RepeatedTest(2) //used to repeat tests	
	void test4() {
		assertEquals(2, z.Div(10,5),"Error in result");
		System.out.println("Test 4 is printing");

	} 
	
	@Test
	void test5(){
		assertAll(
				()->assertEquals(2, z.Div(10,5)),
				()->assertEquals(18, z.Mul(9,2))
				);  //assertall used to run all the tests in one test. in this tests are called using lambda functions
	}
	
	 @AfterEach
	  void AfterEachTest() {
	    System.out.println("---- After each is printing ----\n");
	  }
	 
	@AfterAll
	static void AfterAllTests() {
	    System.out.println("End");
	  }

}