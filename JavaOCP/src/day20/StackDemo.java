package day20;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		// Stack 堆疊 FIFO
		Stack<Integer> stack = new Stack<>();
		stack.push(90);
		stack.push(80);
		stack.push(100);
		System.out.println(stack);
		// 取出元素
		while (!stack.isEmpty()) {
			Integer data = stack.pop();
			System.out.println("取得:" + data);
		}
		System.out.println(stack);
	}
}
