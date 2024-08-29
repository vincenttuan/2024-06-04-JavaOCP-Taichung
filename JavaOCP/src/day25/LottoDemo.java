package day25;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class LottoDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Callable<Integer> lotto = new Lotto();
		
		ExecutorService service = Executors.newCachedThreadPool();
		Future<Integer> future = service.submit(lotto);
		
		System.out.printf("樂透號碼:" + future.get());
	}

}
