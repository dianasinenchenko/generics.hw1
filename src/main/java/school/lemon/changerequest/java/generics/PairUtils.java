package school.lemon.changerequest.java.generics;

/**
 * Created by Diana on 12.01.2017.
 */
public class PairUtils {
    public static <K, V> boolean equals(Pair<K, V> firstPair, Pair<K, V> secondPair) {
        return firstPair.getKey().equals(secondPair.getKey()) && firstPair.getValue().equals(secondPair.getValue());
    }

    public static <K extends Comparable<K>, V> int compareTo(Pair<K, V> firstPair, Pair<K, V> secondPair) {
        try {
            return firstPair.getKey().compareTo(secondPair.getKey());
        } catch (NullPointerException e) {
            return -1;
        }
    }

    public static <K, V> V[] getValue(Pair<K, V>[] pairValue) {
        V[] arrValue = (V[]) new Object[pairValue.length];
        for (int i = 0; i < pairValue.length; i++) {
            arrValue[i] = (V) pairValue[i].getValue();
        }
        return arrValue;
    }

    public static <K, V> K[] getKey(Pair<K, V>[] pairKey) {
        K[] arrKey = (K[]) new Object[pairKey.length];
        for (int i = 0; i < pairKey.length; i++) {
            arrKey[i] = (K) pairKey[i].getValue();
        }
        return arrKey;
    }

}
