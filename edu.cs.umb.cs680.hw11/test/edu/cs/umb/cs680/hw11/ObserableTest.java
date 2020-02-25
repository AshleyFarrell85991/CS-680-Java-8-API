package edu.cs.umb.cs680.hw11;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

import edu.cs.umb.cs680.hw11.Obserable.DIJAQuoteObservable;
import edu.cs.umb.cs680.hw11.Obserable.StockQuoteObservable;

class ObserableTest {

	@Test
	public void testDIJAObserver()
	{
		DIJAQuoteObservable dJIAQuoteObservable = new DIJAQuoteObservable();
		 Set<Float> data = new HashSet<Float>();
			dJIAQuoteObservable.addObservers(new PieChartObserver());
			dJIAQuoteObservable.addObservers(new TableObserver());
			dJIAQuoteObservable.addObservers(new ThreeDObserver());
		 dJIAQuoteObservable.changeQuote(1);
		dJIAQuoteObservable.changeQuote(2);
		dJIAQuoteObservable.changeQuote(3);
		data.add((float) 1);
		data.add((float) 2);
		data.add((float) 3);
		assertTrue(dJIAQuoteObservable.getData().containsAll(data));
	}

	

	@Test
	public void testStockQuoteObserver()
	{
		StockQuoteObservable sqObservable = new StockQuoteObservable();
		 HashMap<String,Float> data = new HashMap<String,Float>();
		 sqObservable.addObservers(new PieChartObserver());
		 sqObservable.addObservers(new TableObserver());
		 sqObservable.addObservers(new ThreeDObserver());
		 sqObservable.changeQuote("AMZN", 1);
		 sqObservable.changeQuote("B", 2);
		 sqObservable.changeQuote("Home Dept",3);
		 data.put("AMZN",(float)1);
		 data.put("B",(float)2);
		 data.put("Home Dept",(float)3);


		 assertThat(sqObservable.getMap(),is(data));
			
			assertThat(sqObservable.getMap().size(), is(3));
		
		assertTrue(data.equals(sqObservable.getMap()));
		 
		 
		 
	}

	
	
	
}
