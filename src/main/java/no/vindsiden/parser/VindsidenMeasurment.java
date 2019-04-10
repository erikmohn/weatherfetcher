package no.vindsiden.parser;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VindsidenMeasurment {

    @SerializedName("StationID")
    @Expose
    private Integer stationID;
    @SerializedName("Show")
    @Expose
    private Boolean show;
    @SerializedName("ShowWind")
    @Expose
    private Boolean showWind;
    @SerializedName("ShowTemp1")
    @Expose
    private Boolean showTemp1;
    @SerializedName("ShowTemp2")
    @Expose
    private Boolean showTemp2;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Region")
    @Expose
    private String region;
    @SerializedName("City")
    @Expose
    private String city;
    @SerializedName("Text")
    @Expose
    private String text;
    @SerializedName("Copyright")
    @Expose
    private String copyright;
    @SerializedName("CopyrightShort")
    @Expose
    private Object copyrightShort;
    @SerializedName("MeteogramUrl")
    @Expose
    private String meteogramUrl;
    @SerializedName("Image")
    @Expose
    private String image;
    @SerializedName("Latitude")
    @Expose
    private Double latitude;
    @SerializedName("Longitude")
    @Expose
    private Double longitude;
    @SerializedName("Altitude")
    @Expose
    private Double altitude;
    @SerializedName("Logo")
    @Expose
    private String logo;
    @SerializedName("LogoUrl")
    @Expose
    private String logoUrl;
    @SerializedName("LogoText")
    @Expose
    private String logoText;
    @SerializedName("LastMeasurementTime")
    @Expose
    private String lastMeasurementTime;
    @SerializedName("WebcamImage")
    @Expose
    private String webcamImage;
    @SerializedName("WebcamUrl")
    @Expose
    private String webcamUrl;
    @SerializedName("WebcamText")
    @Expose
    private String webcamText;
    @SerializedName("MarinogramUrl")
    @Expose
    private String marinogramUrl;
    @SerializedName("StatusMessage")
    @Expose
    private String statusMessage;
    @SerializedName("SoftwareVersion")
    @Expose
    private String softwareVersion;
    @SerializedName("Battery")
    @Expose
    private Double battery;

    public Integer getStationID() {
        return stationID;
    }

    public void setStationID(Integer stationID) {
        this.stationID = stationID;
    }

    public Boolean getShow() {
        return show;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public Boolean getShowWind() {
        return showWind;
    }

    public void setShowWind(Boolean showWind) {
        this.showWind = showWind;
    }

    public Boolean getShowTemp1() {
        return showTemp1;
    }

    public void setShowTemp1(Boolean showTemp1) {
        this.showTemp1 = showTemp1;
    }

    public Boolean getShowTemp2() {
        return showTemp2;
    }

    public void setShowTemp2(Boolean showTemp2) {
        this.showTemp2 = showTemp2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public Object getCopyrightShort() {
        return copyrightShort;
    }

    public void setCopyrightShort(Object copyrightShort) {
        this.copyrightShort = copyrightShort;
    }

    public String getMeteogramUrl() {
        return meteogramUrl;
    }

    public void setMeteogramUrl(String meteogramUrl) {
        this.meteogramUrl = meteogramUrl;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getAltitude() {
        return altitude;
    }

    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getLogoText() {
        return logoText;
    }

    public void setLogoText(String logoText) {
        this.logoText = logoText;
    }

    public String getLastMeasurementTime() {
        return lastMeasurementTime;
    }

    public void setLastMeasurementTime(String lastMeasurementTime) {
        this.lastMeasurementTime = lastMeasurementTime;
    }

    public String getWebcamImage() {
        return webcamImage;
    }

    public void setWebcamImage(String webcamImage) {
        this.webcamImage = webcamImage;
    }

    public String getWebcamUrl() {
        return webcamUrl;
    }

    public void setWebcamUrl(String webcamUrl) {
        this.webcamUrl = webcamUrl;
    }

    public String getWebcamText() {
        return webcamText;
    }

    public void setWebcamText(String webcamText) {
        this.webcamText = webcamText;
    }

    public String getMarinogramUrl() {
        return marinogramUrl;
    }

    public void setMarinogramUrl(String marinogramUrl) {
        this.marinogramUrl = marinogramUrl;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public Double getBattery() {
        return battery;
    }

    public void setBattery(Double battery) {
        this.battery = battery;
    }

}
