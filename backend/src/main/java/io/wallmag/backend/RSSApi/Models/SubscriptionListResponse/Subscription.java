
package io.wallmag.backend.RSSApi.Models.SubscriptionListResponse;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Subscription {

    @SerializedName("endpoint")
    private String mEndpoint;
    @SerializedName("feed")
    private Feed mFeed;
    @SerializedName("format")
    private String mFormat;
    @SerializedName("secret")
    private Object mSecret;
    @SerializedName("subscription")
    private Subscription mSubscription;

    public String getEndpoint() {
        return mEndpoint;
    }

    public void setEndpoint(String endpoint) {
        mEndpoint = endpoint;
    }

    public Feed getFeed() {
        return mFeed;
    }

    public void setFeed(Feed feed) {
        mFeed = feed;
    }

    public String getFormat() {
        return mFormat;
    }

    public void setFormat(String format) {
        mFormat = format;
    }

    public Object getSecret() {
        return mSecret;
    }

    public void setSecret(Object secret) {
        mSecret = secret;
    }

    public Subscription getSubscription() {
        return mSubscription;
    }

    public void setSubscription(Subscription subscription) {
        mSubscription = subscription;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
