import java.util.Iterator;
import java.util.Random;
import java.util.PrimitiveIterator;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected PrimitiveIterator.OfInt randomIterator;
    int min;
    int max;


    public Randoms(int min, int max) {
        randomIterator = new Random().ints(min, (max + 1)).iterator();
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }
            @Override
            public Integer next() {
                return randomIterator.nextInt();
            }

        };


    }
}

