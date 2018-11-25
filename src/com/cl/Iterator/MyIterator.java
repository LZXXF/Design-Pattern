package com.cl.Iterator;

/**
 * Define custom iterator
 * @author Can Li
 */


public interface MyIterator {
    //place cursor on the first element
    void first();

    void next();

    boolean hasNext();
    boolean isFirst();
    boolean isLast();

    Object getCurrentObject();

}
