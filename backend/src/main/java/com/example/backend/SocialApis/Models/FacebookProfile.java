
package com.example.backend.SocialApis.Models;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

public class FacebookProfile {

    private String id;
    private String name;
    private String email;
    private AgeRange ageRange;
    private List<Device> devices = new ArrayList<Device>();
    private String birthday;
    private String gender;
    private Hometown hometown;

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
     *     The email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email
     *     The email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     * @return
     *     The ageRange
     */
    public AgeRange getAgeRange() {
        return ageRange;
    }

    /**
     * 
     * @param ageRange
     *     The age_range
     */
    public void setAgeRange(AgeRange ageRange) {
        this.ageRange = ageRange;
    }

    /**
     * 
     * @return
     *     The devices
     */
    public List<Device> getDevices() {
        return devices;
    }

    /**
     * 
     * @param devices
     *     The devices
     */
    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    /**
     * 
     * @return
     *     The birthday
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * 
     * @param birthday
     *     The birthday
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * 
     * @return
     *     The gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 
     * @param gender
     *     The gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 
     * @return
     *     The hometown
     */
    public Hometown getHometown() {
        return hometown;
    }

    /**
     * 
     * @param hometown
     *     The hometown
     */
    public void setHometown(Hometown hometown) {
        this.hometown = hometown;
    }

}
