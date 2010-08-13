package uk.co.sromo.blister;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: daniel
 * Date: 10-Aug-2010
 * Time: 21:45:07
 * To change this template use File | Settings | File Templates.
 */
public class BPArray extends BPExpandableItem implements List<BPItem> {

    private final int[] arrayItemOffsets;
    private final List<BPItem> items = new LinkedList<BPItem>();

    BPArray(int[] arrayItemOffsets) {
        this.arrayItemOffsets = arrayItemOffsets;
    }

    public BPArray() {
        arrayItemOffsets = EMPTY;
    }
    
    @Override
    protected void doExpand(BinaryPlistDecoder decoder) {
        for (int i=0; i< arrayItemOffsets.length; i++) {
            int itemOffset = arrayItemOffsets[i];
            BPItem item = decoder.getItemAtIndex(itemOffset);
            items.add(item);
        }
    }

    public BPArray with(BPItem item) {
        add(item);
        return this;
    }

    public boolean add(BPItem bpItem) {
        return items.add(bpItem);
    }

    public void add(int index, BPItem element) {
        items.add(index, element);
    }

    public boolean addAll(Collection<? extends BPItem> c) {
        return items.addAll(c);
    }

    public boolean addAll(int index, Collection<? extends BPItem> c) {
        return items.addAll(index, c);
    }

    public void clear() {
        items.clear();
    }

    public boolean contains(Object o) {
        return items.contains(o);
    }

    public boolean containsAll(Collection<?> c) {
        return items.containsAll(c);
    }

    @Override
    public boolean equals(Object o) {
        return items.equals(o);
    }

    public BPItem get(int index) {
        return items.get(index);
    }

    @Override
    public int hashCode() {
        return items.hashCode();
    }

    public int indexOf(Object o) {
        return items.indexOf(o);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public Iterator<BPItem> iterator() {
        return items.iterator();
    }

    public int lastIndexOf(Object o) {
        return items.lastIndexOf(o);
    }

    public ListIterator<BPItem> listIterator() {
        return items.listIterator();
    }

    public ListIterator<BPItem> listIterator(int index) {
        return items.listIterator(index);
    }

    public BPItem remove(int index) {
        return items.remove(index);
    }

    public boolean remove(Object o) {
        return items.remove(o);
    }

    public boolean removeAll(Collection<?> c) {
        return items.removeAll(c);
    }

    public boolean retainAll(Collection<?> c) {
        return items.retainAll(c);
    }

    public BPItem set(int index, BPItem element) {
        return items.set(index, element);
    }

    public int size() {
        return items.size();
    }

    public List<BPItem> subList(int fromIndex, int toIndex) {
        return items.subList(fromIndex, toIndex);
    }

    public Object[] toArray() {
        return items.toArray();
    }

    public <T> T[] toArray(T[] a) {
        return items.toArray(a);
    }

    @Override
    public String toString() {
        return "BPArray{" +
                "items=" + items +
                '}';
    }

    @Override
    public Type getType() {
        return Type.Array;
    }

    @Override
    public void accept(BPVisitor visitor) {
        visitor.visit(this);
    }
}
