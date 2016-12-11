
package io.wallmag.backend.RSSApi.Models.RetriveRssResponse;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Self {

    @SerializedName("href")
    private String mHref;
    @SerializedName("rel")
    private String mRel;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("type")
    private String mType;

    public String getHref() {
        return mHref;
    }

    public void setHref(String href) {
        mHref = href;
    }

    public String getRel() {
        return mRel;
    }

    public void setRel(String rel) {
        mRel = rel;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
