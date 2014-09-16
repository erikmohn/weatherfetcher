
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmsMessageInformationTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VmsMessageInformationTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="campaignMessage"/>
 *     &lt;enumeration value="dateTime"/>
 *     &lt;enumeration value="futureInformation"/>
 *     &lt;enumeration value="instructionOrMessage"/>
 *     &lt;enumeration value="situationWarning"/>
 *     &lt;enumeration value="temperature"/>
 *     &lt;enumeration value="trafficManagement"/>
 *     &lt;enumeration value="travelTime"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VmsMessageInformationTypeEnum")
@XmlEnum
public enum VmsMessageInformationTypeEnum {

    @XmlEnumValue("campaignMessage")
    CAMPAIGN_MESSAGE("campaignMessage"),
    @XmlEnumValue("dateTime")
    DATE_TIME("dateTime"),
    @XmlEnumValue("futureInformation")
    FUTURE_INFORMATION("futureInformation"),
    @XmlEnumValue("instructionOrMessage")
    INSTRUCTION_OR_MESSAGE("instructionOrMessage"),
    @XmlEnumValue("situationWarning")
    SITUATION_WARNING("situationWarning"),
    @XmlEnumValue("temperature")
    TEMPERATURE("temperature"),
    @XmlEnumValue("trafficManagement")
    TRAFFIC_MANAGEMENT("trafficManagement"),
    @XmlEnumValue("travelTime")
    TRAVEL_TIME("travelTime");
    private final String value;

    VmsMessageInformationTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VmsMessageInformationTypeEnum fromValue(String v) {
        for (VmsMessageInformationTypeEnum c: VmsMessageInformationTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
