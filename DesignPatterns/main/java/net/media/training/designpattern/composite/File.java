package net.media.training.designpattern.composite;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 19, 2011
 * Time: 9:18:04 PM
 * To change this template use pre_refactoring.File | Settings | pre_refactoring.File Templates.
 */
public class File implements DataNode{
    private final String name;
    private int size;
    private DataNode parent;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void setParent(DataNode parent) {
        this.parent = parent;
    }

    public DataNode getData() {
        return null;
    }

    public void remove(DataNode dataEntity) {
        this.getParent().remove(this);
    }

    public boolean exists(String name) {
        return true;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public Directory getParent() {
        return parent;
    }
}
