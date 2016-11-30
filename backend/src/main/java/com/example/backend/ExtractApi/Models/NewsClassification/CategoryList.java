
package com.example.backend.ExtractApi.Models.NewsClassification;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class CategoryList {

    private String code;
    private String label;
    private String absRelevance;
    private String relevance;
    private List<TermList> termList = new ArrayList<TermList>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public CategoryList() {
    }

    /**
     * 
     * @param termList
     * @param relevance
     * @param label
     * @param code
     * @param absRelevance
     */
    public CategoryList(String code, String label, String absRelevance, String relevance, List<TermList> termList) {
        this.code = code;
        this.label = label;
        this.absRelevance = absRelevance;
        this.relevance = relevance;
        this.termList = termList;
    }

    /**
     * 
     * @return
     *     The code
     */
    public String getCode() {
        return code;
    }

    /**
     * 
     * @param code
     *     The code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 
     * @return
     *     The label
     */
    public String getLabel() {
        return label;
    }

    /**
     * 
     * @param label
     *     The label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * 
     * @return
     *     The absRelevance
     */
    public String getAbsRelevance() {
        return absRelevance;
    }

    /**
     * 
     * @param absRelevance
     *     The abs_relevance
     */
    public void setAbsRelevance(String absRelevance) {
        this.absRelevance = absRelevance;
    }

    /**
     * 
     * @return
     *     The relevance
     */
    public String getRelevance() {
        return relevance;
    }

    /**
     * 
     * @param relevance
     *     The relevance
     */
    public void setRelevance(String relevance) {
        this.relevance = relevance;
    }

    /**
     * 
     * @return
     *     The termList
     */
    public List<TermList> getTermList() {
        return termList;
    }

    /**
     * 
     * @param termList
     *     The term_list
     */
    public void setTermList(List<TermList> termList) {
        this.termList = termList;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
