package edu.cs.umb.cs680.hw11;

public class TableObserver implements Observer{

	@Override
	public void Update(Obserable obs, Object arg) {
		// TODO Auto-generated method stub
		if(arg instanceof DIJAEvent) {
			DIJAEvent dJIAEvent = (DIJAEvent) arg;
			System.out.println(dJIAEvent.getDjia());
		}else if(arg instanceof StockEvent) {
			StockEvent stockevent = (StockEvent) arg;
			System.out.println(stockevent.getTicker()+ "  "+ stockevent.getQuote());
	}
	}
	
	
	

}
