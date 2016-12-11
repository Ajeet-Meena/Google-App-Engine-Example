
package io.wallmag.backend.ExtractionApi.Models.ExtractedNewsObject;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class AppLink {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("namespace")
    @Expose
    private String namespace;
    @SerializedName("app_name")
    @Expose
    private String appName;
    @SerializedName("package")
    @Expose
    private String _package;
    @SerializedName("app_store_id")
    @Expose
    private String appStoreId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("path")
    @Expose
    private String path;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AppLink() {
    }

    /**
     * 
     * @param id
     * @param appName
     * @param _package
     * @param name
     * @param appStoreId
     * @param path
     * @param type
     * @param url
     * @param namespace
     */
    public AppLink(String url, String type, String namespace, String appName, String _package, String appStoreId, String name, String id, String path) {
        this.url = url;
        this.type = type;
        this.namespace = namespace;
        this.appName = appName;
        this._package = _package;
        this.appStoreId = appStoreId;
        this.name = name;
        this.id = id;
        this.path = path;
    }

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The namespace
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * 
     * @param namespace
     *     The namespace
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * 
     * @return
     *     The appName
     */
    public String getAppName() {
        return appName;
    }

    /**
     * 
     * @param appName
     *     The app_name
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * 
     * @return
     *     The _package
     */
    public String getPackage() {
        return _package;
    }

    /**
     * 
     * @param _package
     *     The package
     */
    public void setPackage(String _package) {
        this._package = _package;
    }

    /**
     * 
     * @return
     *     The appStoreId
     */
    public String getAppStoreId() {
        return appStoreId;
    }

    /**
     * 
     * @param appStoreId
     *     The app_store_id
     */
    public void setAppStoreId(String appStoreId) {
        this.appStoreId = appStoreId;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The path
     */
    public String getPath() {
        return path;
    }

    /**
     * 
     * @param path
     *     The path
     */
    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
