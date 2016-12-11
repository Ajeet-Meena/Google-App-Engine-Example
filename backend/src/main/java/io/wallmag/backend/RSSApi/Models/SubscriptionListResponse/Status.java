
package io.wallmag.backend.RSSApi.Models.SubscriptionListResponse;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Status {

    @SerializedName("bozoRank")
    private Long mBozoRank;
    @SerializedName("code")
    private Long mCode;
    @SerializedName("entriesCountSinceLastMaintenance")
    private Long mEntriesCountSinceLastMaintenance;
    @SerializedName("feed")
    private String mFeed;
    @SerializedName("http")
    private String mHttp;
    @SerializedName("lastFetch")
    private Long mLastFetch;
    @SerializedName("lastMaintenanceAt")
    private Long mLastMaintenanceAt;
    @SerializedName("lastParse")
    private Long mLastParse;
    @SerializedName("nextFetch")
    private Long mNextFetch;
    @SerializedName("period")
    private Long mPeriod;
    @SerializedName("popularity")
    private Long mPopularity;
    @SerializedName("pornRank")
    private Long mPornRank;
    @SerializedName("velocity")
    private Long mVelocity;

    public Long getBozoRank() {
        return mBozoRank;
    }

    public void setBozoRank(Long bozoRank) {
        mBozoRank = bozoRank;
    }

    public Long getCode() {
        return mCode;
    }

    public void setCode(Long code) {
        mCode = code;
    }

    public Long getEntriesCountSinceLastMaintenance() {
        return mEntriesCountSinceLastMaintenance;
    }

    public void setEntriesCountSinceLastMaintenance(Long entriesCountSinceLastMaintenance) {
        mEntriesCountSinceLastMaintenance = entriesCountSinceLastMaintenance;
    }

    public String getFeed() {
        return mFeed;
    }

    public void setFeed(String feed) {
        mFeed = feed;
    }

    public String getHttp() {
        return mHttp;
    }

    public void setHttp(String http) {
        mHttp = http;
    }

    public Long getLastFetch() {
        return mLastFetch;
    }

    public void setLastFetch(Long lastFetch) {
        mLastFetch = lastFetch;
    }

    public Long getLastMaintenanceAt() {
        return mLastMaintenanceAt;
    }

    public void setLastMaintenanceAt(Long lastMaintenanceAt) {
        mLastMaintenanceAt = lastMaintenanceAt;
    }

    public Long getLastParse() {
        return mLastParse;
    }

    public void setLastParse(Long lastParse) {
        mLastParse = lastParse;
    }

    public Long getNextFetch() {
        return mNextFetch;
    }

    public void setNextFetch(Long nextFetch) {
        mNextFetch = nextFetch;
    }

    public Long getPeriod() {
        return mPeriod;
    }

    public void setPeriod(Long period) {
        mPeriod = period;
    }

    public Long getPopularity() {
        return mPopularity;
    }

    public void setPopularity(Long popularity) {
        mPopularity = popularity;
    }

    public Long getPornRank() {
        return mPornRank;
    }

    public void setPornRank(Long pornRank) {
        mPornRank = pornRank;
    }

    public Long getVelocity() {
        return mVelocity;
    }

    public void setVelocity(Long velocity) {
        mVelocity = velocity;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
