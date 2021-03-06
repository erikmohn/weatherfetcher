
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeasuredOrDerivedDataTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MeasuredOrDerivedDataTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="humidityInformation"/>
 *     &lt;enumeration value="individualVehicleMeasurements"/>
 *     &lt;enumeration value="pollutionInformation"/>
 *     &lt;enumeration value="precipitationInformation"/>
 *     &lt;enumeration value="pressureInformation"/>
 *     &lt;enumeration value="radiationInformation"/>
 *     &lt;enumeration value="roadSurfaceConditionInformation"/>
 *     &lt;enumeration value="temperatureInformation"/>
 *     &lt;enumeration value="trafficConcentration"/>
 *     &lt;enumeration value="trafficFlow"/>
 *     &lt;enumeration value="trafficHeadway"/>
 *     &lt;enumeration value="trafficSpeed"/>
 *     &lt;enumeration value="trafficStatusInformation"/>
 *     &lt;enumeration value="travelTimeInformation"/>
 *     &lt;enumeration value="visibilityInformation"/>
 *     &lt;enumeration value="windInformation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MeasuredOrDerivedDataTypeEnum")
@XmlEnum
public enum MeasuredOrDerivedDataTypeEnum {

    @XmlEnumValue("humidityInformation")
    HUMIDITY_INFORMATION("humidityInformation"),
    @XmlEnumValue("individualVehicleMeasurements")
    INDIVIDUAL_VEHICLE_MEASUREMENTS("individualVehicleMeasurements"),
    @XmlEnumValue("pollutionInformation")
    POLLUTION_INFORMATION("pollutionInformation"),
    @XmlEnumValue("precipitationInformation")
    PRECIPITATION_INFORMATION("precipitationInformation"),
    @XmlEnumValue("pressureInformation")
    PRESSURE_INFORMATION("pressureInformation"),
    @XmlEnumValue("radiationInformation")
    RADIATION_INFORMATION("radiationInformation"),
    @XmlEnumValue("roadSurfaceConditionInformation")
    ROAD_SURFACE_CONDITION_INFORMATION("roadSurfaceConditionInformation"),
    @XmlEnumValue("temperatureInformation")
    TEMPERATURE_INFORMATION("temperatureInformation"),
    @XmlEnumValue("trafficConcentration")
    TRAFFIC_CONCENTRATION("trafficConcentration"),
    @XmlEnumValue("trafficFlow")
    TRAFFIC_FLOW("trafficFlow"),
    @XmlEnumValue("trafficHeadway")
    TRAFFIC_HEADWAY("trafficHeadway"),
    @XmlEnumValue("trafficSpeed")
    TRAFFIC_SPEED("trafficSpeed"),
    @XmlEnumValue("trafficStatusInformation")
    TRAFFIC_STATUS_INFORMATION("trafficStatusInformation"),
    @XmlEnumValue("travelTimeInformation")
    TRAVEL_TIME_INFORMATION("travelTimeInformation"),
    @XmlEnumValue("visibilityInformation")
    VISIBILITY_INFORMATION("visibilityInformation"),
    @XmlEnumValue("windInformation")
    WIND_INFORMATION("windInformation");
    private final String value;

    MeasuredOrDerivedDataTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeasuredOrDerivedDataTypeEnum fromValue(String v) {
        for (MeasuredOrDerivedDataTypeEnum c: MeasuredOrDerivedDataTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
