package junit.tutorial;

import java.util.HashMap;
import java.util.Map;

public class ItemStock {

	private Map<String, Integer> stocks;
	
	ItemStock() {
		stocks = new HashMap<String, Integer>();
	}
	

	public int size(String string) {
		if (stocks.containsKey(string)) return stocks.get(string);
		return 0;
	}

	public boolean contains(String string) {
		return stocks.containsKey(string);
	}

	public void add(String string, int i) {
		if (stocks.containsKey(string)) {
			stocks.put(string, stocks.get(string) + i);
		} else {
			stocks.put(string, i);
		}
		
	}

}
