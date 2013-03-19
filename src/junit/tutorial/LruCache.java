package junit.tutorial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LruCache<T> {
  private Map<T, T> cache = new HashMap<T, T>();
  public List<T> keys = new ArrayList<T>();

  public void put(T k, T v) {
    cache.put(k, v);
    keys.add(k);
  }

  public int size() {
    return cache.size();
  }

  public T get(T key) {
    
    return cache.get(key);
  }
}
