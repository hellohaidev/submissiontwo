package com.techinfo.mymoviecatalog;

import android.os.Parcel;
import android.os.Parcelable;

public class MovieData implements Parcelable {
    
    private int photo;
    private String name;
    private String description;
    
    
    public int getPhoto() {
        return photo;
    }
    
    public void setPhoto(int photo) {
        this.photo = photo;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    @Override
    public int describeContents() {
        return 0;
    }
    
    @Override
    public void writeToParcel(Parcel dest, int flags) {
    
        dest.writeInt(photo);
        dest.writeString(name);
        dest.writeString(description);
    }
    protected MovieData(Parcel in) {
        photo = in.readInt();
        name = in.readString();
        description = in.readString();
    }
    
    public static final Creator<MovieData> CREATOR = new Creator<MovieData>() {
        @Override
        public MovieData createFromParcel(Parcel in) {
            return new MovieData(in);
        }
        
        @Override
        public MovieData[] newArray(int size) {
            return new MovieData[size];
        }
    };
    
}
