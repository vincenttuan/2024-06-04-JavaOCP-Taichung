package day16;

// Java 8 只有單一抽象方法的介面稱為 FunctionalInterface
@FunctionalInterface
public interface Calculate {
	int calc(int x, int y);
}
