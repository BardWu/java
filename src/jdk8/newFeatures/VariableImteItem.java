package jdk8.newFeatures;

import myLang.MyInnerClass;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2020-08-07 14:03
 **/
public class VariableImteItem {
    private Integer item ;

    public VariableImteItem(Integer item) {
        this.item = item;
    }

    public VariableImteItem() {
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }
}
