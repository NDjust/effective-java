package chapter4.item18;

import java.util.Collection;
import java.util.HashSet;

public class InstrumentHashSet<E> extends HashSet<E> {

    private int addCount = 0;

    public InstrumentHashSet() {

    }

    public InstrumentHashSet(int initCap, float loadFactor) {
        super(initCap, loadFactor);
    }

    @Override
    public boolean add(final E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(final Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}
