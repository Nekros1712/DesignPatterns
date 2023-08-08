package net.media.training.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 19, 2011
 * Time: 9:18:51 PM
 * To change this template use pre_refactoring.File | Settings |
 * pre_refactoring.File Templates.
 */
public class Directory implements DataNode {
    private String name;
    private List<DataNode> dataEntities;
    private Directory parent;

    public String getName() {
        return name;
    }

    public Directory(String name, List<DataNode> dataEntities) {
        this.name = name;
        this.dataEntities = dataEntities;
    }

    public int getSize(DataNode dataEntity) {

        int sum = 0;
        if (getContents(dataEntity)!=null) {
            for (DataNode data : getContents(dataEntity)) {
                sum += getSize(data);
            } return sum;
        } return 0;
    }

    public void setParent(Directory parent) {
        this.parent = parent;
    }

    public void delete() {
        while (dataEntities.size() > 0) {
            DataNode dataEntity = dataEntities.get(0);
            dataEntity.getParent().remove(dataEntity);
        }

        if (parent != null) {
            parent.dataEntities.remove(this);
        }
    }

    public void add(DataNode dataEntity) {
        dataEntities.add(dataEntity);
    }

    public boolean exists(String name) {
        for (DataNode dataEntity : dataEntities) {
            if (dataEntity instanceof File && dataEntity.exists(name)) {
                return true;
            } else if (dataEntity instanceof Directory && dataEntity.exists(name)) {
                return true;
            }
        }

        return false;
    }

    public List<DataNode> getContents(DataNode data) {
        return this.dataEntities;
    }

    public Directory getParent() {
        return parent;
    }

    public void setParent(DataNode directory) {

    }

    public DataNode getData() {
        return null;
    }

    public void remove(DataNode dataEntity) {

    }

}