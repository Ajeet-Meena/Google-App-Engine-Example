package io.wallmag.backend.WallMagApi.Models.Sources;

import java.util.ArrayList;

/**
 * Created by Ajeet Kumar Meena on 07-12-2016.
 */

public class Source {
    private int id;
    private String name;
    private String thumbnailUrl;
    private String logoUrl;
    private String description;
    private String originalSiteLink;
    private ArrayList<Topic> topics;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOriginalSiteLink() {
        return originalSiteLink;
    }

    public void setOriginalSiteLink(String originalSiteLink) {
        this.originalSiteLink = originalSiteLink;
    }

    public ArrayList<Topic> getTopics() {
        return topics;
    }

    public void setTopics(ArrayList<Topic> topics) {
        this.topics = topics;
    }
}
