
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferentTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReferentTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="boundary"/>
 *     &lt;enumeration value="intersection"/>
 *     &lt;enumeration value="referenceMarker"/>
 *     &lt;enumeration value="landmark"/>
 *     &lt;enumeration value="roadNode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReferentTypeEnum")
@XmlEnum
public enum ReferentTypeEnum {

    @XmlEnumValue("boundary")
    BOUNDARY("boundary"),
    @XmlEnumValue("intersection")
    INTERSECTION("intersection"),
    @XmlEnumValue("referenceMarker")
    REFERENCE_MARKER("referenceMarker"),
    @XmlEnumValue("landmark")
    LANDMARK("landmark"),
    @XmlEnumValue("roadNode")
    ROAD_NODE("roadNode");
    private final String value;

    ReferentTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReferentTypeEnum fromValue(String v) {
        for (ReferentTypeEnum c: ReferentTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
