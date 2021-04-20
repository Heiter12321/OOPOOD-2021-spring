package Databases;

import java.util.Collection;

public interface Database<K, V> {
    void add(K key, V value);
    Collection<V> select(K key);
}
