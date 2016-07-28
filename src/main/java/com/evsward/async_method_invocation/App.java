package com.evsward.async_method_invocation;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class App {
	private static <T> Callable<T> lazyval(T value, long delayMillis) {
		return () -> {
			Thread.sleep(delayMillis);
			log("Task completed with: " + value);
			return value;
		};
	}

	private static <T> AsyncCallback<T> callback(String name) {
		return (value, ex) -> {
			if (ex.isPresent()) {
				log(name + " failed: " + ex.map(Exception::getMessage).orElse(""));
			} else {
				log(name + ": " + value);
			}
		};
	}

	private static void log(String msg) {
		System.out.println(String.format("[%1$-10s] - %2$s", Thread.currentThread().getName(), msg));
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		AsyncExecutor executor = new ThreadAsyncExecutor();
		AsyncResult<Integer> asyncResult1 = executor.startProcess(lazyval(10, 500));
		AsyncResult<String> asyncResult2 = executor.startProcess(lazyval("test", 300));
		AsyncResult<Long> asyncResult3 = executor.startProcess(lazyval(50L, 700));
		AsyncResult<Integer> asyncResult4 = executor.startProcess(lazyval(20, 400), callback("Callback result 4"));
		AsyncResult<String> asyncResult5 = executor.startProcess(lazyval("callback", 600),
				callback("Callback result 5"));

		Thread.sleep(350);
		log("Some hard work done");

		Integer result1 = executor.endProcess(asyncResult1);
		String result2 = executor.endProcess(asyncResult2);
		Long result3 = executor.endProcess(asyncResult3);
		asyncResult4.await();
		asyncResult5.await();

		log("Result 1: " + result1);
		log("Result 2: " + result2);
		log("Result 3: " + result3);
	}
}
