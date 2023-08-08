package net.media.training.designpattern.composite;

public interface DataNode {

    String getName();
    DataNode getParent();
    void setParent(DataNode directory);
    DataNode getData();
    void remove(DataNode dataEntity);
    boolean exists(String name);

}
