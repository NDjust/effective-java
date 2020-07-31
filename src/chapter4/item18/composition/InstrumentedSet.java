package chapter4.item18.composition;

import chapter4.item18.InstrumentHashSet;

import java.util.Collection;
import java.util.Set;

public class InstrumentedSet<E> extends ForwardingSet<E> {

    private int addCount = 0;

    public InstrumentedSet(final Set<E> s) {
        super(s);
    }

    @Override
    public boolean add(final E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(final Collection<? extends E> collection) {
        addCount += collection.size();
        return super.addAll(collection);
    }

    public int getAddCount() {
        return addCount;
    }
}
