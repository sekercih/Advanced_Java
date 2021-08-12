package generics;

public class G06IkiParametreliGenericSinif     {

}

// K: Key
// V: Value
// 2 parametreli Generic class oluşuturulmasi
class Kisi<K,V> {
    private K key;
    private V value;

    public Kisi(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}