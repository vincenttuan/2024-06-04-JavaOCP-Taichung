package ocp;

public class Q042 {
	// No.42 Which method throws an exception for not-a-number and infinite input
	// values?
	// A
	static float validate1(String s) throws IllegalArgumentException {
		return Float.parseFloat(s);

	}

	// B
	static float validate3(String s, float min, float max) throws IllegalArgumentException {
		float f = Float.parseFloat(s);
		if (!Float.isFinite(f) || f < min || f > max) {
			throw new IllegalArgumentException();
		}
		return f;
	}

	// C
	static float validate2(String s, float min, float max) throws IllegalArgumentException {
		float f = Float.parseFloat(s);
		if (f < min || f > max) {
			throw new IllegalArgumentException();
		}
		return f;
	}

	// D
	static float validate4(String s, float min, float max) throws IllegalArgumentException {
		float f = Float.parseFloat(s);
		if (!Float.isFinite(f) && f < min && f > max) {
			throw new IllegalArgumentException();
		}
		return f;
	}

	public static void main(String[] args) throws Exception {
		System.out.println(validate3("NaN", 0, 100));
		System.out.println(validate3("Infinity", 0, 100));

	}
}
