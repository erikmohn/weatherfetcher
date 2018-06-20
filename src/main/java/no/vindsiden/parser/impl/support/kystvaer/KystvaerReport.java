
package no.vindsiden.parser.impl.support.kystvaer;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

public class KystvaerReport {

    @SerializedName("Commands")
    private List<Object> mCommands;
    @SerializedName("Enable")
    private Boolean mEnable;
    @SerializedName("FreeInterval")
    private List<FreeInterval> mFreeInterval;
    @SerializedName("Hourly")
    private List<Hourly> mHourly;
    @SerializedName("Id")
    private Long mId;
    @SerializedName("Instantaneous")
    private List<Instantaneous> mInstantaneous;
    @SerializedName("Latitude")
    private Double mLatitude;
    @SerializedName("Longitude")
    private Double mLongitude;
    @SerializedName("MessageAlarm")
    private List<MessageAlarm> mMessageAlarm;
    @SerializedName("Minute10")
    private List<Object> mMinute10;
    @SerializedName("Name")
    private String mName;
    @SerializedName("Text")
    private String mText;

    public List<Object> getCommands() {
        return mCommands;
    }

    public void setCommands(List<Object> commands) {
        mCommands = commands;
    }

    public Boolean getEnable() {
        return mEnable;
    }

    public void setEnable(Boolean enable) {
        mEnable = enable;
    }

    public List<FreeInterval> getFreeInterval() {
        return mFreeInterval;
    }

    public void setFreeInterval(List<FreeInterval> freeInterval) {
        mFreeInterval = freeInterval;
    }

    public List<Hourly> getHourly() {
        return mHourly;
    }

    public void setHourly(List<Hourly> hourly) {
        mHourly = hourly;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public List<Instantaneous> getInstantaneous() {
        return mInstantaneous;
    }

    public void setInstantaneous(List<Instantaneous> instantaneous) {
        mInstantaneous = instantaneous;
    }

    public Double getLatitude() {
        return mLatitude;
    }

    public void setLatitude(Double latitude) {
        mLatitude = latitude;
    }

    public Double getLongitude() {
        return mLongitude;
    }

    public void setLongitude(Double longitude) {
        mLongitude = longitude;
    }

    public List<MessageAlarm> getMessageAlarm() {
        return mMessageAlarm;
    }

    public void setMessageAlarm(List<MessageAlarm> messageAlarm) {
        mMessageAlarm = messageAlarm;
    }

    public List<Object> getMinute10() {
        return mMinute10;
    }

    public void setMinute10(List<Object> minute10) {
        mMinute10 = minute10;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public Double getWindDirection() {
        return getDoubleValue("Vindretning");
    }

    public Double getWindNow() {
        return getDoubleValue("WINDSPD");
    }

    public Double getWindMax() {
        return getDoubleValue("WINDGUS");
    }

    public Double getWindAvg() {
        return getDoubleValue("Vindhastighet");
    }

    private Double getDoubleValue(String value) {
        for (Instantaneous i : getInstantaneous()) {
            if (value.equals(i.getName())) {
                return i.getValue().getValue();
            }
        }
       return null;
    }
}
