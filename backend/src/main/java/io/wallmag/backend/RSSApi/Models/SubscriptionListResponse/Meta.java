
package io.wallmag.backend.RSSApi.Models.SubscriptionListResponse;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Meta {

    @SerializedName("by_page")
    private Long mByPage;
    @SerializedName("page")
    private Long mPage;
    @SerializedName("search")
    private Search mSearch;
    @SerializedName("total")
    private Long mTotal;

    public Long getByPage() {
        return mByPage;
    }

    public void setByPage(Long by_page) {
        mByPage = by_page;
    }

    public Long getPage() {
        return mPage;
    }

    public void setPage(Long page) {
        mPage = page;
    }

    public Search getSearch() {
        return mSearch;
    }

    public void setSearch(Search search) {
        mSearch = search;
    }

    public Long getTotal() {
        return mTotal;
    }

    public void setTotal(Long total) {
        mTotal = total;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
