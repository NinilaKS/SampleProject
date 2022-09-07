package com.adobe.dramix.core.models;

import java.util.List;

import com.adobe.dramix.core.bean.Filters;
import com.adobe.dramix.core.bean.ListingResults;

public interface Listing {
    
    public List<ListingResults> fetchResults();

    public List<Filters> fetchFilters();

}
