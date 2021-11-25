package com.erwinner.procedureConsumer;

import java.util.Random;

public class Producer extends Thread{
	private Resources resource;

	public Producer(Resources resource,String name) {
		super(name); // se le pasa el nombre del hilo al padre
		this.resource = resource;
	}

	@Override
	public void run() {
		while(true) {
			try {
				int value=new Random().nextInt(1000); // se genera numeros aleatorios  del 0 a 1000
				System.out.printf("%s se Porduce: %d \n",getName(),value);
				resource.produce(value); // se inserta el elemento
				Thread.sleep(new Random().nextInt(300));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
}
