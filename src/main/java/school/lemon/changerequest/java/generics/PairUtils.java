package school.lemon.changerequest.java.generics;

/**
 * Created by Diana on 12.01.2017.
 */
public class PairUtils {
    public static <K, V> boolean equals(Pair<K, V> firstPair, Pair<K, V> secondPair) {
        return firstPair.getKey().equals(secondPair.getKey()) && firstPair.getValue().equals(secondPair.getValue());
    }
}
