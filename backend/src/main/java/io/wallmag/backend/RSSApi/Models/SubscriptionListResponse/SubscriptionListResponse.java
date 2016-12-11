
package io.wallmag.backend.RSSApi.Models.SubscriptionListResponse;

import java.util.List;
import javax.annotation.Generated;

import io.wallmag.backend.Retrofit.ApiResponse;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class SubscriptionListResponse extends ApiResponse{

    @SerializedName("meta")
    private Meta mMeta;
    @SerializedName("subscriptions")
    private List<Subscription> mSubscriptions;

    public Meta getMeta() {
        return mMeta;
    }

    public void setMeta(Meta meta) {
        mMeta = meta;
    }

    public List<Subscription> getSubscriptions() {
        return mSubscriptions;
    }

    public void setSubscriptions(List<Subscription> subscriptions) {
        mSubscriptions = subscriptions;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
