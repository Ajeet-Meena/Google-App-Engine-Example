
package com.example.backend.ExtractApi.Models.NewsClassification;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Status {

    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("msg")
    @Expose
    private String msg;
    @SerializedName("credits")
    @Expose
    private String credits;
    @SerializedName("remaining_credits")
    @Expose
    private String remainingCredits;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Status() {
    }

    /**
     * 
     * @param remainingCredits
     * @param credits
     * @param code
     * @param msg
     */
    public Status(String code, String msg, String credits, String remainingCredits) {
        this.code = code;
        this.msg = msg;
        this.credits = credits;
        this.remainingCredits = remainingCredits;
    }

    /**
     * 
     * @return
     *     The code
     */
    public String getCode() {
        return code;
    }

    /**
     * 
     * @param code
     *     The code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 
     * @return
     *     The msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 
     * @param msg
     *     The msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 
     * @return
     *     The credits
     */
    public String getCredits() {
        return credits;
    }

    /**
     * 
     * @param credits
     *     The credits
     */
    public void setCredits(String credits) {
        this.credits = credits;
    }

    /**
     * 
     * @return
     *     The remainingCredits
     */
    public String getRemainingCredits() {
        return remainingCredits;
    }

    /**
     * 
     * @param remainingCredits
     *     The remaining_credits
     */
    public void setRemainingCredits(String remainingCredits) {
        this.remainingCredits = remainingCredits;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
