
package com.example.backend.ExtractApi.Models;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Image {

    @SerializedName("caption")
    @Expose
    private Object caption;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("colors")
    @Expose
    private List<Color> colors = new ArrayList<Color>();
    @SerializedName("entropy")
    @Expose
    private Float entropy;
    @SerializedName("size")
    @Expose
    private Integer size;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Image() {
    }

    /**
     * 
     * @param height
     * @param entropy
     * @param colors
     * @param width
     * @param caption
     * @param url
     * @param size
     */
    public Image(Object caption, String url, Integer height, Integer width, List<Color> colors, Float entropy, Integer size) {
        this.caption = caption;
        this.url = url;
        this.height = height;
        this.width = width;
        this.colors = colors;
        this.entropy = entropy;
        this.size = size;
    }

    /**
     * 
     * @return
     *     The caption
     */
    public Object getCaption() {
        return caption;
    }

    /**
     * 
     * @param caption
     *     The caption
     */
    public void setCaption(Object caption) {
        this.caption = caption;
    }

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The height
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * 
     * @param height
     *     The height
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * 
     * @return
     *     The width
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * 
     * @param width
     *     The width
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * 
     * @return
     *     The colors
     */
    public List<Color> getColors() {
        return colors;
    }

    /**
     * 
     * @param colors
     *     The colors
     */
    public void setColors(List<Color> colors) {
        this.colors = colors;
    }

    /**
     * 
     * @return
     *     The entropy
     */
    public Float getEntropy() {
        return entropy;
    }

    /**
     * 
     * @param entropy
     *     The entropy
     */
    public void setEntropy(Float entropy) {
        this.entropy = entropy;
    }

    /**
     * 
     * @return
     *     The size
     */
    public Integer getSize() {
        return size;
    }

    /**
     * 
     * @param size
     *     The size
     */
    public void setSize(Integer size) {
        this.size = size;
    }

}
