
package io.wallmag.backend.RSSApi.Models.RetriveRssResponse;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Item {

    @SerializedName("categories")
    private List<String> mCategories;
    @SerializedName("id")
    private String mId;
    @SerializedName("language")
    private String mLanguage;
    @SerializedName("permalinkUrl")
    private String mPermalinkUrl;
    @SerializedName("published")
    private Long mPublished;
    @SerializedName("source")
    private Source mSource;
    @SerializedName("standardLinks")
    private StandardLinks mStandardLinks;
    @SerializedName("summary")
    private String mSummary;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("updated")
    private Long mUpdated;

    public List<String> getCategories() {
        return mCategories;
    }

    public void setCategories(List<String> categories) {
        mCategories = categories;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getLanguage() {
        return mLanguage;
    }

    public void setLanguage(String language) {
        mLanguage = language;
    }

    public String getPermalinkUrl() {
        return mPermalinkUrl;
    }

    public void setPermalinkUrl(String permalinkUrl) {
        mPermalinkUrl = permalinkUrl;
    }

    public Long getPublished() {
        return mPublished;
    }

    public void setPublished(Long published) {
        mPublished = published;
    }

    public Source getSource() {
        return mSource;
    }

    public void setSource(Source source) {
        mSource = source;
    }

    public StandardLinks getStandardLinks() {
        return mStandardLinks;
    }

    public void setStandardLinks(StandardLinks standardLinks) {
        mStandardLinks = standardLinks;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Long getUpdated() {
        return mUpdated;
    }

    public void setUpdated(Long updated) {
        mUpdated = updated;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
