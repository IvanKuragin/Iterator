import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    protected Random random;
    private final int min;
    private final int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        random = new Random();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new IntegerIterator();
    }

    private class IntegerIterator implements Iterator<Integer> {
        int index;
        @Override
        public boolean hasNext() {
            return index < max;
        }

        @Override
        public Integer next() {
            return random.nextInt(max+1 - min) + min;
        }
    }
}
