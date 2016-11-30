
package com.example.backend.ExtractApi.Models.ExtractedNewsObject;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class FaviconColor {

    @SerializedName("color")
    @Expose
    private List<Integer> color = new ArrayList<Integer>();
    @SerializedName("weight")
    @Expose
    private Float weight;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FaviconColor() {
    }

    /**
     * 
     * @param weight
     * @param color
     */
    public FaviconColor(List<Integer> color, Float weight) {
        this.color = color;
        this.weight = weight;
    }

    /**
     * 
     * @return
     *     The color
     */
    public List<Integer> getColor() {
        return color;
    }

    /**
     * 
     * @param color
     *     The color
     */
    public void setColor(List<Integer> color) {
        this.color = color;
    }

    /**
     * 
     * @return
     *     The weight
     */
    public Float getWeight() {
        return weight;
    }

    /**
     * 
     * @param weight
     *     The weight
     */
    public void setWeight(Float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
