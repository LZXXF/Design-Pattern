package com.cl.composite;

/**
 * Abstract component
 * @author Can Li
 */

public interface Component {
    void operate();
}

//Leaf component
interface Leaf extends Component {

}

//Composite component
interface Composite extends Component {
    void add(Component c);
    void remove(Component c);
    Component getChild(int index);
}
