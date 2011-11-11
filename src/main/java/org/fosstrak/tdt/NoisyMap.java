package org.fosstrak.tdt;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * NoisyMap is a front-end for a String to String Map that prints
 * a message to System.out every time an entry is updated.
 * It is intended for testing purposes only.
 */

public class NoisyMap implements Map<String, String> {
    private Map<String, String> map;

    public NoisyMap(Map<String, String> map) {
        this.map = map;
    }

    /**
     * Removes all mappings from this map (optional operation).
     */
    public void clear() {
        map.clear();
    }

    /**
     * Returns true if this map contains a mapping for the specified key.
     *
     * @param key
     * @return
     */
    public boolean containsKey(Object key) {
        return map.containsKey(key);
    }

    /**
     * Returns true if this map maps one or more keys to the specified value.
     *
     * @param value
     * @return
     */
    public boolean containsValue(Object value) {
        return map.containsValue(value);
    }

    /**
     * Returns a set view of the mappings contained in this map.
     *
     * @return
     */
    public Set<Map.Entry<String, String>> entrySet() {
        return map.entrySet();
    }

    /**
     * Compares the specified object with this map for equality.
     *
     * @param o
     * @return
     */
    public boolean equals(Object o) {
        return map.equals(o);
    }

    /**
     * Returns the value to which this map maps the specified key.
     *
     * @param key
     * @return
     */
    public String get(Object key) {
        return map.get(key);
    }

    /**
     * Returns the hash code value for this map.
     *
     * @return
     */
    public int hashCode() {
        return map.hashCode();
    }

    /**
     * Returns true if this map contains no key-value mappings.
     *
     * @return
     */
    public boolean isEmpty() {
        return map.isEmpty();
    }

    /**
     * Returns a set view of the keys contained in this map.
     *
     * @return
     */
    public Set<String> keySet() {
        return map.keySet();
    }

    /**
     * Associates the specified value with the specified key in this map (optional operation).
     *
     * @param key
     * @param value
     * @return
     */
    public String put(String key, String value) {
        System.out.println("   " + key + " := " + value + " (" + value.length() + " chars)");
        return map.put(key, value);
    }

    /**
     * Copies all of the mappings from the specified map to this map (optional operation).
     *
     * @param t
     */
    public void putAll(Map<? extends String, ? extends String> t) {
        map.putAll(t);
    }

    /**
     * Removes the mapping for this key from this map if it is present (optional operation).
     *
     * @param key
     * @return
     */
    public String remove(Object key) {
        return map.remove(key);
    }

    /**
     * Returns the number of key-value mappings in this map.
     *
     * @return
     */
    public int size() {
        return map.size();
    }

    /**
     * Returns a collection view of the values contained in this map.
     *
     * @return
     */
    public Collection<String> values() {
        return map.values();
    }
}