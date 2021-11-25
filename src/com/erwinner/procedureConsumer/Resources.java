package com.erwinner.procedureConsumer;

import java.util.ArrayList;


public class Resources {
	private ArrayList<Integer> resources = new ArrayList<>();
	
	public synchronized int consume() throws InterruptedException { // synchronized para que un solo Hilo pueda accedar a la vez
		while(resources.size()<=0) {
				wait(); // Hace que el hilo actual espere hasta que se despierte, o notifique que hay elementos  
		}
		
		// Se regresa el primer elemento y se elimina
		Integer valor = resources.get(0);
		resources.remove(0);
		return valor;
	}
	
	public synchronized void produce(Integer values) { // synchronized para que un solo Hilo pueda accedar a la vez
		resources.add(values); // Se agregan nuevos elementos
		notifyAll(); // para avisarle a todos los hilos que ya hay elementos 
	}

}
