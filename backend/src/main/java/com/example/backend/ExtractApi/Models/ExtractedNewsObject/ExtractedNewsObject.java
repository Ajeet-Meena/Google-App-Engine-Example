
package com.example.backend.ExtractApi.Models.ExtractedNewsObject;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

import com.example.backend.ExtractApi.Models.NewsClassification.NewsClassification;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class ExtractedNewsObject {

    @SerializedName("provider_url")
    @Expose
    private String providerUrl;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("embeds")
    @Expose
    private List<Object> embeds = new ArrayList<Object>();
    @SerializedName("safe")
    @Expose
    private Boolean safe;
    @SerializedName("provider_display")
    @Expose
    private String providerDisplay;
    @SerializedName("related")
    @Expose
    private List<Object> related = new ArrayList<Object>();
    @SerializedName("favicon_url")
    @Expose
    private String faviconUrl;
    @SerializedName("authors")
    @Expose
    private List<Author> authors = new ArrayList<Author>();
    @SerializedName("images")
    @Expose
    private List<Image> images = new ArrayList<Image>();
    @SerializedName("cache_age")
    @Expose
    private Integer cacheAge;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("app_links")
    @Expose
    private List<AppLink> appLinks = new ArrayList<AppLink>();
    @SerializedName("original_url")
    @Expose
    private String originalUrl;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("media")
    @Expose
    private Media media;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("offset")
    @Expose
    private Object offset;
    @SerializedName("lead")
    @Expose
    private Object lead;
    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("entities")
    @Expose
    private List<Entity> entities = new ArrayList<Entity>();
    @SerializedName("favicon_colors")
    @Expose
    private List<FaviconColor> faviconColors = new ArrayList<FaviconColor>();
    @SerializedName("keywords")
    @Expose
    private List<Keyword> keywords = new ArrayList<Keyword>();
    @SerializedName("published")
    @Expose
    private Object published;
    @SerializedName("provider_name")
    @Expose
    private String providerName;
    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("news_classification")
    private NewsClassification newsClassification;
    /**
     * No args constructor for use in serialization
     * 
     */
    public ExtractedNewsObject() {
    }

    /**
     * 
     * @param providerDisplay
     * @param lead
     * @param faviconUrl
     * @param embeds
     * @param type
     * @param cacheAge
     * @param related
     * @param authors
     * @param originalUrl
     * @param title
     * @param description
     * @param offset
     * @param published
     * @param safe
     * @param keywords
     * @param faviconColors
     * @param entities
     * @param url
     * @param content
     * @param appLinks
     * @param providerUrl
     * @param providerName
     * @param images
     * @param language
     * @param media
     */
    public ExtractedNewsObject(String providerUrl, String description, List<Object> embeds, Boolean safe, String providerDisplay, List<Object> related, String faviconUrl, List<Author> authors, List<Image> images, Integer cacheAge, String language, List<AppLink> appLinks, String originalUrl, String url, Media media, String title, Object offset, Object lead, String content, List<Entity> entities, List<FaviconColor> faviconColors, List<Keyword> keywords, Object published, String providerName, String type) {
        this.providerUrl = providerUrl;
        this.description = description;
        this.embeds = embeds;
        this.safe = safe;
        this.providerDisplay = providerDisplay;
        this.related = related;
        this.faviconUrl = faviconUrl;
        this.authors = authors;
        this.images = images;
        this.cacheAge = cacheAge;
        this.language = language;
        this.appLinks = appLinks;
        this.originalUrl = originalUrl;
        this.url = url;
        this.media = media;
        this.title = title;
        this.offset = offset;
        this.lead = lead;
        this.content = content;
        this.entities = entities;
        this.faviconColors = faviconColors;
        this.keywords = keywords;
        this.published = published;
        this.providerName = providerName;
        this.type = type;
    }

    /**
     * 
     * @return
     *     The providerUrl
     */
    public String getProviderUrl() {
        return providerUrl;
    }

    /**
     * 
     * @param providerUrl
     *     The provider_url
     */
    public void setProviderUrl(String providerUrl) {
        this.providerUrl = providerUrl;
    }

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The embeds
     */
    public List<Object> getEmbeds() {
        return embeds;
    }

    /**
     * 
     * @param embeds
     *     The embeds
     */
    public void setEmbeds(List<Object> embeds) {
        this.embeds = embeds;
    }

    /**
     * 
     * @return
     *     The safe
     */
    public Boolean getSafe() {
        return safe;
    }

    /**
     * 
     * @param safe
     *     The safe
     */
    public void setSafe(Boolean safe) {
        this.safe = safe;
    }

    /**
     * 
     * @return
     *     The providerDisplay
     */
    public String getProviderDisplay() {
        return providerDisplay;
    }

    /**
     * 
     * @param providerDisplay
     *     The provider_display
     */
    public void setProviderDisplay(String providerDisplay) {
        this.providerDisplay = providerDisplay;
    }

    /**
     * 
     * @return
     *     The related
     */
    public List<Object> getRelated() {
        return related;
    }

    /**
     * 
     * @param related
     *     The related
     */
    public void setRelated(List<Object> related) {
        this.related = related;
    }

    /**
     * 
     * @return
     *     The faviconUrl
     */
    public String getFaviconUrl() {
        return faviconUrl;
    }

    /**
     * 
     * @param faviconUrl
     *     The favicon_url
     */
    public void setFaviconUrl(String faviconUrl) {
        this.faviconUrl = faviconUrl;
    }

    /**
     * 
     * @return
     *     The authors
     */
    public List<Author> getAuthors() {
        return authors;
    }

    /**
     * 
     * @param authors
     *     The authors
     */
    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    /**
     * 
     * @return
     *     The images
     */
    public List<Image> getImages() {
        return images;
    }

    /**
     * 
     * @param images
     *     The images
     */
    public void setImages(List<Image> images) {
        this.images = images;
    }

    /**
     * 
     * @return
     *     The cacheAge
     */
    public Integer getCacheAge() {
        return cacheAge;
    }

    /**
     * 
     * @param cacheAge
     *     The cache_age
     */
    public void setCacheAge(Integer cacheAge) {
        this.cacheAge = cacheAge;
    }

    /**
     * 
     * @return
     *     The language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * 
     * @param language
     *     The language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * 
     * @return
     *     The appLinks
     */
    public List<AppLink> getAppLinks() {
        return appLinks;
    }

    /**
     * 
     * @param appLinks
     *     The app_links
     */
    public void setAppLinks(List<AppLink> appLinks) {
        this.appLinks = appLinks;
    }

    /**
     * 
     * @return
     *     The originalUrl
     */
    public String getOriginalUrl() {
        return originalUrl;
    }

    /**
     * 
     * @param originalUrl
     *     The original_url
     */
    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
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
     *     The media
     */
    public Media getMedia() {
        return media;
    }

    /**
     * 
     * @param media
     *     The media
     */
    public void setMedia(Media media) {
        this.media = media;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The offset
     */
    public Object getOffset() {
        return offset;
    }

    /**
     * 
     * @param offset
     *     The offset
     */
    public void setOffset(Object offset) {
        this.offset = offset;
    }

    /**
     * 
     * @return
     *     The lead
     */
    public Object getLead() {
        return lead;
    }

    /**
     * 
     * @param lead
     *     The lead
     */
    public void setLead(Object lead) {
        this.lead = lead;
    }

    /**
     * 
     * @return
     *     The content
     */
    public String getContent() {
        return content;
    }

    /**
     * 
     * @param content
     *     The content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 
     * @return
     *     The entities
     */
    public List<Entity> getEntities() {
        return entities;
    }

    /**
     * 
     * @param entities
     *     The entities
     */
    public void setEntities(List<Entity> entities) {
        this.entities = entities;
    }

    /**
     * 
     * @return
     *     The faviconColors
     */
    public List<FaviconColor> getFaviconColors() {
        return faviconColors;
    }

    /**
     * 
     * @param faviconColors
     *     The favicon_colors
     */
    public void setFaviconColors(List<FaviconColor> faviconColors) {
        this.faviconColors = faviconColors;
    }

    /**
     * 
     * @return
     *     The keywords
     */
    public List<Keyword> getKeywords() {
        return keywords;
    }

    /**
     * 
     * @param keywords
     *     The keywords
     */
    public void setKeywords(List<Keyword> keywords) {
        this.keywords = keywords;
    }

    /**
     * 
     * @return
     *     The published
     */
    public Object getPublished() {
        return published;
    }

    /**
     * 
     * @param published
     *     The published
     */
    public void setPublished(Object published) {
        this.published = published;
    }

    /**
     * 
     * @return
     *     The providerName
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * 
     * @param providerName
     *     The provider_name
     */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    public NewsClassification getNewsClassification() {
        return newsClassification;
    }

    public void setNewsClassification(NewsClassification newsClassification) {
        this.newsClassification = newsClassification;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
