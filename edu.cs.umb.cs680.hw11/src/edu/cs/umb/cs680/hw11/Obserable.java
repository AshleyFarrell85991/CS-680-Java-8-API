package edu.cs.umb.cs680.hw11;
import java.util.*;
public class Obserable {
	
	private ArrayList<Observer> obs;
	private ArrayList<Observer> observers;
	
	
	public Obserable() {
		
		observers = new ArrayList<Observer>();
	}
	
	public void addObservers(Observer o) {
		observers.add(o);
	}
	
	public void setChanged() {
		return;
	}
	public boolean hasChanged() {
		return true;
	}
	public void clearChanged() {
		return;
	}
	public void notifyObservers() {
		notifyObservers(null);
	}
	public void notifyObservers(Object arg) {
		
		if(hasChanged())
		{
			for (int counter = 0; counter < observers.size(); counter++)
			{ 		      
				
				
		          observers.get(counter).Update(this, arg);
		     }  
		}
		clearChanged();
	}
	
	
	
	static class StockQuoteObservable extends Obserable {
		
		private HashMap<String, Float> map;
		
		public HashMap<String, Float> getMap() {
			return map;
		}

		public StockQuoteObservable() {
			map = new HashMap<>();
		}
		
		public void changeQuote(String t,float q) {
			
			this.map.put(t,q);
			setChanged();
			notifyObservers(new StockEvent(t,q));
		}
		
		
		
		
	}
	
	
	static class DIJAQuoteObservable extends Obserable{
		
		private float quote;
		private Set<Float> data = new HashSet<Float>();
		
		public Set<Float> getData() {
			return data;
		}

		public void changeQuote(float q)
		{
			notifyObservers(new DIJAEvent(q));		
			this.quote = q;
			data.add(q);
			setChanged();
			notifyObservers( new Float(quote));
			
		}
		
	}
	
	
}
