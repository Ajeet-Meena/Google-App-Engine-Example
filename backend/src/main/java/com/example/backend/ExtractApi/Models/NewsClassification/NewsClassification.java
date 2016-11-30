
package com.example.backend.ExtractApi.Models.NewsClassification;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class NewsClassification {

    private Status status;
    private List<CategoryList> categoryList = new ArrayList<CategoryList>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public NewsClassification() {
    }

    /**
     * 
     * @param categoryList
     * @param status
     */
    public NewsClassification(Status status, List<CategoryList> categoryList) {
        this.status = status;
        this.categoryList = categoryList;
    }

    /**
     * 
     * @return
     *     The status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The categoryList
     */
    public List<CategoryList> getCategoryList() {
        return categoryList;
    }

    /**
     * 
     * @param categoryList
     *     The category_list
     */
    public void setCategoryList(List<CategoryList> categoryList) {
        this.categoryList = categoryList;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}