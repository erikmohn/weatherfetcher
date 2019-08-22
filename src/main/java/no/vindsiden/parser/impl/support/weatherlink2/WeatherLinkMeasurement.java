package no.vindsiden.parser.impl.support.weatherlink2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WeatherLinkMeasurement {
    @SerializedName("credit")
    @Expose
    private String credit;
    @SerializedName("credit_URL")
    @Expose
    private String creditURL;
    @SerializedName("disclaimer_url")
    @Expose
    private String disclaimerUrl;
    @SerializedName("copyright_url")
    @Expose
    private String copyrightUrl;
    @SerializedName("privacy_policy_url")
    @Expose
    private String privacyPolicyUrl;
    @SerializedName("image")
    @Expose
    private DaviesImage image;
    @SerializedName("suggested_pickup")
    @Expose
    private String suggestedPickup;
    @SerializedName("suggested_pickup_period")
    @Expose
    private String suggestedPickupPeriod;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("observation_time")
    @Expose
    private String observationTime;
    @SerializedName("observation_time_rfc822")
    @Expose
    private String observationTimeRfc822;
    @SerializedName("pressure_in")
    @Expose
    private String pressureIn;
    @SerializedName("pressure_mb")
    @Expose
    private String pressureMb;
    @SerializedName("pressure_string")
    @Expose
    private String pressureString;
    @SerializedName("station_id")
    @Expose
    private String stationId;
    @SerializedName("wind_degrees")
    @Expose
    private String windDegrees;
    @SerializedName("wind_dir")
    @Expose
    private String windDir;
    @SerializedName("wind_kt")
    @Expose
    private String windKt;
    @SerializedName("wind_mph")
    @Expose
    private String windMph;
    @SerializedName("davis_current_observation")
    @Expose
    private DavisCurrentObservation davisCurrentObservation;
    @SerializedName("time_to_generate")
    @Expose
    private String timeToGenerate;

    public String getTempC() {
        return tempC;
    }

    public void setTempC(String tempC) {
        this.tempC = tempC;
    }

    @SerializedName("temp_c")
    @Expose
    private String tempC;

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getCreditURL() {
        return creditURL;
    }

    public void setCreditURL(String creditURL) {
        this.creditURL = creditURL;
    }

    public String getDisclaimerUrl() {
        return disclaimerUrl;
    }

    public void setDisclaimerUrl(String disclaimerUrl) {
        this.disclaimerUrl = disclaimerUrl;
    }

    public String getCopyrightUrl() {
        return copyrightUrl;
    }

    public void setCopyrightUrl(String copyrightUrl) {
        this.copyrightUrl = copyrightUrl;
    }

    public String getPrivacyPolicyUrl() {
        return privacyPolicyUrl;
    }

    public void setPrivacyPolicyUrl(String privacyPolicyUrl) {
        this.privacyPolicyUrl = privacyPolicyUrl;
    }

    public DaviesImage getImage() {
        return image;
    }

    public void setImage(DaviesImage image) {
        this.image = image;
    }

    public String getSuggestedPickup() {
        return suggestedPickup;
    }

    public void setSuggestedPickup(String suggestedPickup) {
        this.suggestedPickup = suggestedPickup;
    }

    public String getSuggestedPickupPeriod() {
        return suggestedPickupPeriod;
    }

    public void setSuggestedPickupPeriod(String suggestedPickupPeriod) {
        this.suggestedPickupPeriod = suggestedPickupPeriod;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getObservationTime() {
        return observationTime;
    }

    public void setObservationTime(String observationTime) {
        this.observationTime = observationTime;
    }

    public String getObservationTimeRfc822() {
        return observationTimeRfc822;
    }

    public void setObservationTimeRfc822(String observationTimeRfc822) {
        this.observationTimeRfc822 = observationTimeRfc822;
    }

    public String getPressureIn() {
        return pressureIn;
    }

    public void setPressureIn(String pressureIn) {
        this.pressureIn = pressureIn;
    }

    public String getPressureMb() {
        return pressureMb;
    }

    public void setPressureMb(String pressureMb) {
        this.pressureMb = pressureMb;
    }

    public String getPressureString() {
        return pressureString;
    }

    public void setPressureString(String pressureString) {
        this.pressureString = pressureString;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getWindDegrees() {
        return windDegrees;
    }

    public void setWindDegrees(String windDegrees) {
        this.windDegrees = windDegrees;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public String getWindKt() {
        return windKt;
    }

    public void setWindKt(String windKt) {
        this.windKt = windKt;
    }

    public String getWindMph() {
        return windMph;
    }

    public void setWindMph(String windMph) {
        this.windMph = windMph;
    }

    public DavisCurrentObservation getDavisCurrentObservation() {
        return davisCurrentObservation;
    }

    public void setDavisCurrentObservation(DavisCurrentObservation davisCurrentObservation) {
        this.davisCurrentObservation = davisCurrentObservation;
    }

    public String getTimeToGenerate() {
        return timeToGenerate;
    }

    public void setTimeToGenerate(String timeToGenerate) {
        this.timeToGenerate = timeToGenerate;
    }
}
