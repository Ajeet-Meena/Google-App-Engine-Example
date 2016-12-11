
package io.wallmag.backend.RSSApi.Models.RetriveRssResponse;

import java.util.List;
import javax.annotation.Generated;

import io.wallmag.backend.Retrofit.ApiResponse;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class RetriveRssResponse extends ApiResponse{

    @SerializedName("items")
    private List<Item> mItems;
    @SerializedName("standardLinks")
    private StandardLinks mStandardLinks;
    @SerializedName("status")
    private Status mStatus;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("updated")
    private String mUpdated;

    public List<Item> getItems() {
        return mItems;
    }

    public void setItems(List<Item> items) {
        mItems = items;
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

    public String getUpdated() {
        return mUpdated;
    }

    public void setUpdated(String updated) {
        mUpdated = updated;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
