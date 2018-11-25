package com.cl.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Custom concrete aggregate class
 */

public class ConcreteMyAggregate {

    private List<Object> list = new ArrayList<>();

    public void addObject(Object object) {
        this.list.add(object);
    }

    public void remove(Object object) {
        this.list.remove(object);
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public MyIterator getIterator() {
        return new ConcreteIterator();
    }

    //use inner class to define iterator, inner class can use members of external class
    private class ConcreteIterator implements MyIterator {

        private int cursor;

        @Override
        public void first() {
            cursor = 0;
        }

        @Override
        public void next() {
            if (cursor < list.size()) {
                cursor++;
            }
        }

        @Override
        public boolean hasNext() {
            if (cursor < list.size()) {
             return true;
            }
            return false;
        }

        @Override
        public boolean isFirst() {
            return cursor == 0;
        }

        @Override
        public boolean isLast() {
            return cursor == list.size() - 1;
        }

        @Override
        public Object getCurrentObject() {
            return list.get(cursor);
        }
    }
}
