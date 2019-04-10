package no.vindsiden.parser.impl.support.weatherlink2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DavisCurrentObservation {

    @SerializedName("DID")
    @Expose
    private String dID;
    @SerializedName("station_name")
    @Expose
    private String stationName;
    @SerializedName("observation_age")
    @Expose
    private Integer observationAge;
    @SerializedName("pressure_day_high_in")
    @Expose
    private String pressureDayHighIn;
    @SerializedName("pressure_day_high_time")
    @Expose
    private String pressureDayHighTime;
    @SerializedName("pressure_day_low_in")
    @Expose
    private String pressureDayLowIn;
    @SerializedName("pressure_day_low_time")
    @Expose
    private String pressureDayLowTime;
    @SerializedName("pressure_month_high_in")
    @Expose
    private String pressureMonthHighIn;
    @SerializedName("pressure_month_low_in")
    @Expose
    private String pressureMonthLowIn;
    @SerializedName("pressure_tendency_string")
    @Expose
    private String pressureTendencyString;
    @SerializedName("pressure_year_high_in")
    @Expose
    private String pressureYearHighIn;
    @SerializedName("pressure_year_low_in")
    @Expose
    private String pressureYearLowIn;
    @SerializedName("rain_day_in")
    @Expose
    private String rainDayIn;
    @SerializedName("rain_month_in")
    @Expose
    private String rainMonthIn;
    @SerializedName("rain_rate_day_high_in_per_hr")
    @Expose
    private String rainRateDayHighInPerHr;
    @SerializedName("rain_rate_hour_high_in_per_hr")
    @Expose
    private String rainRateHourHighInPerHr;
    @SerializedName("rain_rate_month_high_in_per_hr")
    @Expose
    private String rainRateMonthHighInPerHr;
    @SerializedName("rain_rate_year_high_in_per_hr")
    @Expose
    private String rainRateYearHighInPerHr;
    @SerializedName("rain_storm_in")
    @Expose
    private String rainStormIn;
    @SerializedName("rain_year_in")
    @Expose
    private String rainYearIn;
    @SerializedName("relative_humidity_in")
    @Expose
    private String relativeHumidityIn;
    @SerializedName("relative_humidity_in_day_high")
    @Expose
    private String relativeHumidityInDayHigh;
    @SerializedName("relative_humidity_in_day_high_time")
    @Expose
    private String relativeHumidityInDayHighTime;
    @SerializedName("relative_humidity_in_day_low")
    @Expose
    private String relativeHumidityInDayLow;
    @SerializedName("relative_humidity_in_day_low_time")
    @Expose
    private String relativeHumidityInDayLowTime;
    @SerializedName("relative_humidity_in_month_high")
    @Expose
    private String relativeHumidityInMonthHigh;
    @SerializedName("relative_humidity_in_month_low")
    @Expose
    private String relativeHumidityInMonthLow;
    @SerializedName("relative_humidity_in_year_high")
    @Expose
    private String relativeHumidityInYearHigh;
    @SerializedName("relative_humidity_in_year_low")
    @Expose
    private String relativeHumidityInYearLow;
    @SerializedName("sunrise")
    @Expose
    private String sunrise;
    @SerializedName("sunset")
    @Expose
    private String sunset;
    @SerializedName("temp_in_day_high_f")
    @Expose
    private String tempInDayHighF;
    @SerializedName("temp_in_day_high_time")
    @Expose
    private String tempInDayHighTime;
    @SerializedName("temp_in_day_low_f")
    @Expose
    private String tempInDayLowF;
    @SerializedName("temp_in_day_low_time")
    @Expose
    private String tempInDayLowTime;
    @SerializedName("temp_in_f")
    @Expose
    private String tempInF;
    @SerializedName("temp_in_month_high_f")
    @Expose
    private String tempInMonthHighF;
    @SerializedName("temp_in_month_low_f")
    @Expose
    private String tempInMonthLowF;
    @SerializedName("temp_in_year_high_f")
    @Expose
    private String tempInYearHighF;
    @SerializedName("temp_in_year_low_f")
    @Expose
    private String tempInYearLowF;
    @SerializedName("wind_day_high_mph")
    @Expose
    private String windDayHighMph;
    @SerializedName("wind_day_high_time")
    @Expose
    private String windDayHighTime;
    @SerializedName("wind_month_high_mph")
    @Expose
    private String windMonthHighMph;
    @SerializedName("wind_ten_min_avg_mph")
    @Expose
    private String windTenMinAvgMph;
    @SerializedName("wind_ten_min_gust_mph")
    @Expose
    private String windTenMinGustMph;
    @SerializedName("wind_year_high_mph")
    @Expose
    private String windYearHighMph;

    public String getDID() {
        return dID;
    }

    public void setDID(String dID) {
        this.dID = dID;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public Integer getObservationAge() {
        return observationAge;
    }

    public void setObservationAge(Integer observationAge) {
        this.observationAge = observationAge;
    }

    public String getPressureDayHighIn() {
        return pressureDayHighIn;
    }

    public void setPressureDayHighIn(String pressureDayHighIn) {
        this.pressureDayHighIn = pressureDayHighIn;
    }

    public String getPressureDayHighTime() {
        return pressureDayHighTime;
    }

    public void setPressureDayHighTime(String pressureDayHighTime) {
        this.pressureDayHighTime = pressureDayHighTime;
    }

    public String getPressureDayLowIn() {
        return pressureDayLowIn;
    }

    public void setPressureDayLowIn(String pressureDayLowIn) {
        this.pressureDayLowIn = pressureDayLowIn;
    }

    public String getPressureDayLowTime() {
        return pressureDayLowTime;
    }

    public void setPressureDayLowTime(String pressureDayLowTime) {
        this.pressureDayLowTime = pressureDayLowTime;
    }

    public String getPressureMonthHighIn() {
        return pressureMonthHighIn;
    }

    public void setPressureMonthHighIn(String pressureMonthHighIn) {
        this.pressureMonthHighIn = pressureMonthHighIn;
    }

    public String getPressureMonthLowIn() {
        return pressureMonthLowIn;
    }

    public void setPressureMonthLowIn(String pressureMonthLowIn) {
        this.pressureMonthLowIn = pressureMonthLowIn;
    }

    public String getPressureTendencyString() {
        return pressureTendencyString;
    }

    public void setPressureTendencyString(String pressureTendencyString) {
        this.pressureTendencyString = pressureTendencyString;
    }

    public String getPressureYearHighIn() {
        return pressureYearHighIn;
    }

    public void setPressureYearHighIn(String pressureYearHighIn) {
        this.pressureYearHighIn = pressureYearHighIn;
    }

    public String getPressureYearLowIn() {
        return pressureYearLowIn;
    }

    public void setPressureYearLowIn(String pressureYearLowIn) {
        this.pressureYearLowIn = pressureYearLowIn;
    }

    public String getRainDayIn() {
        return rainDayIn;
    }

    public void setRainDayIn(String rainDayIn) {
        this.rainDayIn = rainDayIn;
    }

    public String getRainMonthIn() {
        return rainMonthIn;
    }

    public void setRainMonthIn(String rainMonthIn) {
        this.rainMonthIn = rainMonthIn;
    }

    public String getRainRateDayHighInPerHr() {
        return rainRateDayHighInPerHr;
    }

    public void setRainRateDayHighInPerHr(String rainRateDayHighInPerHr) {
        this.rainRateDayHighInPerHr = rainRateDayHighInPerHr;
    }

    public String getRainRateHourHighInPerHr() {
        return rainRateHourHighInPerHr;
    }

    public void setRainRateHourHighInPerHr(String rainRateHourHighInPerHr) {
        this.rainRateHourHighInPerHr = rainRateHourHighInPerHr;
    }

    public String getRainRateMonthHighInPerHr() {
        return rainRateMonthHighInPerHr;
    }

    public void setRainRateMonthHighInPerHr(String rainRateMonthHighInPerHr) {
        this.rainRateMonthHighInPerHr = rainRateMonthHighInPerHr;
    }

    public String getRainRateYearHighInPerHr() {
        return rainRateYearHighInPerHr;
    }

    public void setRainRateYearHighInPerHr(String rainRateYearHighInPerHr) {
        this.rainRateYearHighInPerHr = rainRateYearHighInPerHr;
    }

    public String getRainStormIn() {
        return rainStormIn;
    }

    public void setRainStormIn(String rainStormIn) {
        this.rainStormIn = rainStormIn;
    }

    public String getRainYearIn() {
        return rainYearIn;
    }

    public void setRainYearIn(String rainYearIn) {
        this.rainYearIn = rainYearIn;
    }

    public String getRelativeHumidityIn() {
        return relativeHumidityIn;
    }

    public void setRelativeHumidityIn(String relativeHumidityIn) {
        this.relativeHumidityIn = relativeHumidityIn;
    }

    public String getRelativeHumidityInDayHigh() {
        return relativeHumidityInDayHigh;
    }

    public void setRelativeHumidityInDayHigh(String relativeHumidityInDayHigh) {
        this.relativeHumidityInDayHigh = relativeHumidityInDayHigh;
    }

    public String getRelativeHumidityInDayHighTime() {
        return relativeHumidityInDayHighTime;
    }

    public void setRelativeHumidityInDayHighTime(String relativeHumidityInDayHighTime) {
        this.relativeHumidityInDayHighTime = relativeHumidityInDayHighTime;
    }

    public String getRelativeHumidityInDayLow() {
        return relativeHumidityInDayLow;
    }

    public void setRelativeHumidityInDayLow(String relativeHumidityInDayLow) {
        this.relativeHumidityInDayLow = relativeHumidityInDayLow;
    }

    public String getRelativeHumidityInDayLowTime() {
        return relativeHumidityInDayLowTime;
    }

    public void setRelativeHumidityInDayLowTime(String relativeHumidityInDayLowTime) {
        this.relativeHumidityInDayLowTime = relativeHumidityInDayLowTime;
    }

    public String getRelativeHumidityInMonthHigh() {
        return relativeHumidityInMonthHigh;
    }

    public void setRelativeHumidityInMonthHigh(String relativeHumidityInMonthHigh) {
        this.relativeHumidityInMonthHigh = relativeHumidityInMonthHigh;
    }

    public String getRelativeHumidityInMonthLow() {
        return relativeHumidityInMonthLow;
    }

    public void setRelativeHumidityInMonthLow(String relativeHumidityInMonthLow) {
        this.relativeHumidityInMonthLow = relativeHumidityInMonthLow;
    }

    public String getRelativeHumidityInYearHigh() {
        return relativeHumidityInYearHigh;
    }

    public void setRelativeHumidityInYearHigh(String relativeHumidityInYearHigh) {
        this.relativeHumidityInYearHigh = relativeHumidityInYearHigh;
    }

    public String getRelativeHumidityInYearLow() {
        return relativeHumidityInYearLow;
    }

    public void setRelativeHumidityInYearLow(String relativeHumidityInYearLow) {
        this.relativeHumidityInYearLow = relativeHumidityInYearLow;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public String getTempInDayHighF() {
        return tempInDayHighF;
    }

    public void setTempInDayHighF(String tempInDayHighF) {
        this.tempInDayHighF = tempInDayHighF;
    }

    public String getTempInDayHighTime() {
        return tempInDayHighTime;
    }

    public void setTempInDayHighTime(String tempInDayHighTime) {
        this.tempInDayHighTime = tempInDayHighTime;
    }

    public String getTempInDayLowF() {
        return tempInDayLowF;
    }

    public void setTempInDayLowF(String tempInDayLowF) {
        this.tempInDayLowF = tempInDayLowF;
    }

    public String getTempInDayLowTime() {
        return tempInDayLowTime;
    }

    public void setTempInDayLowTime(String tempInDayLowTime) {
        this.tempInDayLowTime = tempInDayLowTime;
    }

    public String getTempInF() {
        return tempInF;
    }

    public void setTempInF(String tempInF) {
        this.tempInF = tempInF;
    }

    public String getTempInMonthHighF() {
        return tempInMonthHighF;
    }

    public void setTempInMonthHighF(String tempInMonthHighF) {
        this.tempInMonthHighF = tempInMonthHighF;
    }

    public String getTempInMonthLowF() {
        return tempInMonthLowF;
    }

    public void setTempInMonthLowF(String tempInMonthLowF) {
        this.tempInMonthLowF = tempInMonthLowF;
    }

    public String getTempInYearHighF() {
        return tempInYearHighF;
    }

    public void setTempInYearHighF(String tempInYearHighF) {
        this.tempInYearHighF = tempInYearHighF;
    }

    public String getTempInYearLowF() {
        return tempInYearLowF;
    }

    public void setTempInYearLowF(String tempInYearLowF) {
        this.tempInYearLowF = tempInYearLowF;
    }

    public String getWindDayHighMph() {
        return windDayHighMph;
    }

    public void setWindDayHighMph(String windDayHighMph) {
        this.windDayHighMph = windDayHighMph;
    }

    public String getWindDayHighTime() {
        return windDayHighTime;
    }

    public void setWindDayHighTime(String windDayHighTime) {
        this.windDayHighTime = windDayHighTime;
    }

    public String getWindMonthHighMph() {
        return windMonthHighMph;
    }

    public void setWindMonthHighMph(String windMonthHighMph) {
        this.windMonthHighMph = windMonthHighMph;
    }

    public String getWindTenMinAvgMph() {
        return windTenMinAvgMph;
    }

    public void setWindTenMinAvgMph(String windTenMinAvgMph) {
        this.windTenMinAvgMph = windTenMinAvgMph;
    }

    public String getWindTenMinGustMph() {
        return windTenMinGustMph;
    }

    public void setWindTenMinGustMph(String windTenMinGustMph) {
        this.windTenMinGustMph = windTenMinGustMph;
    }

    public String getWindYearHighMph() {
        return windYearHighMph;
    }

    public void setWindYearHighMph(String windYearHighMph) {
        this.windYearHighMph = windYearHighMph;
    }

}