package com.erwinner.procedureConsumer;

import java.util.Random;

public class Consumer extends Thread{
	private Resources resource;

	public Consumer(Resources resorce,String name) {
		super(name);
		this.resource = resorce;
	}

	@Override
	public void run() {
		while(true) {
			try {
				int value =  resource.consume(); // se copnsume el elemento
				System.out.printf("%s cosumed %d \n",getName(),value);
				Thread.sleep(new Random().nextInt(200));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	

}
