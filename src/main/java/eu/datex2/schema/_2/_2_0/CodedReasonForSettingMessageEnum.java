
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CodedReasonForSettingMessageEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CodedReasonForSettingMessageEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="situation"/>
 *     &lt;enumeration value="operatorCreated"/>
 *     &lt;enumeration value="trafficManagement"/>
 *     &lt;enumeration value="travelTime"/>
 *     &lt;enumeration value="campaign"/>
 *     &lt;enumeration value="default"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CodedReasonForSettingMessageEnum")
@XmlEnum
public enum CodedReasonForSettingMessageEnum {

    @XmlEnumValue("situation")
    SITUATION("situation"),
    @XmlEnumValue("operatorCreated")
    OPERATOR_CREATED("operatorCreated"),
    @XmlEnumValue("trafficManagement")
    TRAFFIC_MANAGEMENT("trafficManagement"),
    @XmlEnumValue("travelTime")
    TRAVEL_TIME("travelTime"),
    @XmlEnumValue("campaign")
    CAMPAIGN("campaign"),
    @XmlEnumValue("default")
    DEFAULT("default");
    private final String value;

    CodedReasonForSettingMessageEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CodedReasonForSettingMessageEnum fromValue(String v) {
        for (CodedReasonForSettingMessageEnum c: CodedReasonForSettingMessageEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
