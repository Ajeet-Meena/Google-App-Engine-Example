
package io.wallmag.backend.RSSApi.Models.RetriveRssResponse;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class StandardLinks {

    @SerializedName("alternate")
    private List<Alternate> mAlternate;
    @SerializedName("hub")
    private List<Hub> mHub;
    @SerializedName("self")
    private List<Self> mSelf;

    public List<Alternate> getAlternate() {
        return mAlternate;
    }

    public void setAlternate(List<Alternate> alternate) {
        mAlternate = alternate;
    }

    public List<Hub> getHub() {
        return mHub;
    }

    public void setHub(List<Hub> hub) {
        mHub = hub;
    }

    public List<Self> getSelf() {
        return mSelf;
    }

    public void setSelf(List<Self> self) {
        mSelf = self;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
