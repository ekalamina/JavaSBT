import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.HashMap;

public class CountMapImplementation<K> implements CountMap<K> {

    private HashMap<K, Integer> _map = new HashMap<>();

    @Override
    void add(K key) {
        if (map.containsKey(key)) {
            Integer value = map.get(key);
            map.remove(key);
            map.put(key, value + 1);
        } else {
            map.put(key, value);
        }
    }

    @Override
    int getCount(K key) {
        return map.get(key);
    }

    @Override
    int remove(K key) {
        Integer value = map.get(key);
        map.remove(key);
        return value;
    }

    @Override
    int size() {
        return map.size();
    }

    @Override
    void addAll(CountMap<? extends K> source) {
        for (Map.Entry<? extends K, Integer> entry : source.toMap().entrySet()) {
            if (map.containsKey(entry.getKey())) {
                Integer value = entry.getValue() + map.get(entry.getKey());
                map.remove(entry.getKey());
                map.put(entry.getKey(), value);
            } else {
                map.put(entry.getKey(), value);
            }
        }
    }

    @Override
    Map toMap() {
        return (Map) map.clone();
    }

    @Override
    void toMap(Map destination) {
        destination = (Map) map.clone();
    }
}