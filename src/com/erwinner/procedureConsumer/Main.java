package com.erwinner.procedureConsumer;

public class Main {

	public static void main(String[] args) {
		Resources resorce = new Resources();
		
		Producer producer1 = new Producer(resorce,"Producer 1");
		Producer producer2 = new Producer(resorce,"Producer 2");
		
		Consumer consumer1 = new Consumer(resorce,"Consumer 1");
		Consumer consumer2 = new Consumer(resorce,"Consumer 2");
		
		producer1.start();
		producer2.start();
		
		consumer1.start();
		consumer2.start();

	}

}
