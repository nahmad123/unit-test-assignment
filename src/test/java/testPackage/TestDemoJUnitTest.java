package testPackage;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TestDemoJUnitTest {
	private TestDemo testDemo;

	@BeforeEach
	void setUp() throws Exception {
		testDemo = new TestDemo();
		
	}

	@ParameterizedTest
	@MethodSource("testPackage.TestDemoJUnitTest#argumentsForAddPositive")
	void assertThatTwoPositiveNumbersAreAddedCorrectly(int a, int b, int expected, boolean expectException) {
		
		/*
		 * add four parameters to assertThatTwoPositiveNumbersAreAddedCorrectly as shown */
		 
	 
		
		if(!expectException) {
			assertThat(testDemo.addPositive(a, b)).isEqualTo(expected);
			
			}else
			{
		
		//Remove the fail line
		//fail("Not yet implemented");
		
		//Add the test for the thrown exception in an else clause. Use assertThatThrownBy for this. 

		
		assertThatThrownBy(() -> testDemo.addPositive(a, b)).isInstanceOf(IllegalArgumentException.class);
			}

}
	static Stream<Arguments> argumentsForAddPositive() {
		return Stream.of(
				arguments(1, 5, 6, false)
				
				);
		
	}
	@Test
	void assertThatPairsOfPositiveNumbersAreAddedCorrectly() {	
		
		assertThat(testDemo.addPositive(4,5)).isEqualTo(9);
		assertThat(testDemo.addPositive(40,50)).isEqualTo(90);
		
}
	@Test
	void assertThatNumberSquaredIsCorrect() {
	
	TestDemo mockDemo = spy(testDemo);
	

	doReturn(5).when(mockDemo).getRandomInt();
	
	int fiveSquared = mockDemo.randomNumberSquared();

	assertThat(fiveSquared).isEqualTo(25);
	
	}
	
	
	@Test
	void assertThatNumberCubedIsCorrect() {
	
	TestDemo mockDemo = spy(testDemo);
	

	doReturn(5).when(mockDemo).getRandomInt();
	
	int fiveSquared = mockDemo.randomNumberCubed();

	assertThat(fiveSquared).isEqualTo(125);

	}
	
}

		

