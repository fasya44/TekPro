package Case3;

public class MathUtils {
	// -------------------------------------------------------------
		// Returns the factorial of the argument given
		// -------------------------------------------------------------
		public static int factorial(int n) throws IllegalArgumentException {
			if (n < 0)
				throw new IllegalArgumentException("Negative Value Exception");
			else if (n > 16)
				throw new IllegalArgumentException("Arithmetic Overflow");
			int fac = 1;
			for (int i = n; i > 0; i--)
				fac *= i;
			return fac;
		}

}
