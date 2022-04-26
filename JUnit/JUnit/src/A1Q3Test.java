import static org.junit.Assert.assertThrows;
import org.junit.jupiter.api.Test;

class A1Q3Test {

	@Test
	void test() {
			assertThrows(InsufficientFundsExpcetion.class, () -> A1Q3.withdraw(1100));
	}
}