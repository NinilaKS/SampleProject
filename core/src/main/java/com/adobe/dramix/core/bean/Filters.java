package com.adobe.dramix.core.bean;

import java.util.List;

public class Filters {
    
    private String parentFilter;
    private List<Filter> childFilterList;
    public String getParentFilter() {
        return parentFilter;
    }
    public void setParentFilter(String parentFilter) {
        this.parentFilter = parentFilter;
    }
    public List<Filter> getChildFilterList() {
        return childFilterList;
    }
    public void setChildFilterList(List<Filter> childFilterList) {
        this.childFilterList = childFilterList;
    }
    
}
