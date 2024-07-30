package day16;

// Java 8 只有單一抽象方法的介面稱為 FunctionalInterface
// 可以利用 Lambda 來實現
@FunctionalInterface
public interface Calculate {
	int calc(int x, int y);
}
