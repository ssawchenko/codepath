package com.codepath.twitterclient.models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;

@Table(name = "user")
public class User extends Model implements Serializable {
    @Column(name = "name")
    private String name;
    @Column(name = "uid")
    private long uid;
    @Column(name = "screen_name")
    private String screenName;
    @Column(name = "profile_image_url")
    private String profileImageUrl;
    @Column(name = "followers_count")
    private long followersCount;
    @Column(name = "friends_count")
    private long friendsCount;
    @Column(name = "description")
    private String description;

    public static User fromJSON(JSONObject json) {
        User user = new User();

        try {
            user.name = json.getString("name");
            user.uid = json.getLong("id");
            user.screenName = json.getString("screen_name");
            user.profileImageUrl = json.getString("profile_image_url");
            user.followersCount = json.getLong("followers_count");
            user.friendsCount = json.getLong("friends_count");
            user.description = json.getString("description");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return user;
    }

    public String getName() {
        return name;
    }

    public long getUid() {
        return uid;
    }

    public String getScreenName() {
        return screenName;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public long getFollowersCount() {
        return followersCount;
    }

    public long getFriendsCount() {
        return friendsCount;
    }

    public String getDescription() {
        return description;
    }
}
