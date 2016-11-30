
package com.example.backend.ExtractApi.Models.ExtractedNewsObject;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Author {

    @SerializedName("url")
    @Expose
    private Object url;
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Author() {
    }

    /**
     * 
     * @param name
     * @param url
     */
    public Author(Object url, String name) {
        this.url = url;
        this.name = name;
    }

    /**
     * 
     * @return
     *     The url
     */
    public Object getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(Object url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }


}
