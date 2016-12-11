
package io.wallmag.backend.RSSApi.Models.RetriveRssResponse;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Source {

    @SerializedName("id")
    private String mId;
    @SerializedName("permalinkUrl")
    private String mPermalinkUrl;
    @SerializedName("published")
    private Long mPublished;
    @SerializedName("standardLinks")
    private StandardLinks mStandardLinks;
    @SerializedName("status")
    private Status mStatus;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("updated")
    private Long mUpdated;

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
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

    public StandardLinks getStandardLinks() {
        return mStandardLinks;
    }

    public void setStandardLinks(StandardLinks standardLinks) {
        mStandardLinks = standardLinks;
    }

    public Status getStatus() {
        return mStatus;
    }

    public void setStatus(Status status) {
        mStatus = status;
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
