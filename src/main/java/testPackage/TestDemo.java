package testPackage;

import java.util.Random;

public class TestDemo {

	/*
	 *  If both parameters are positive (greater than zero) return the sum of the parameters. If either parameter is zero or negative, throw an IllegalArgumentException with the message "Both parameters must be positive!". IllegalArgumentException is in the java.lang package so you won't need an import statement.
	 * 
	 */
	
	public int addPositive(int a, int b) {
	if (a > 0 && b > 0) {
		return a + b;
			
	}
	else
	{ 
		throw new IllegalArgumentException("Both parameters must be positive!");
		
	}
	
	

	}
	public int randomNumberSquared() {
		int result = getRandomInt();
		
		//Declare a variable to store the result from the getRandomInt() method.  randomNumberSquared() should return the result variable multiplied by itself.


		return result*result;
	}

int getRandomInt() {

    Random random = new Random();

    return random.nextInt(10) + 1;

}

public int randomNumberCubed() {
	int result = getRandomInt();
	
	//Declare a variable to store the result from the getRandomInt() method.  randomNumberSquared() should return the result variable multiplied by itself.


	return result*result*result;
}
}