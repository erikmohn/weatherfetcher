
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CctvCameraTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CctvCameraTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="colourCcd"/>
 *     &lt;enumeration value="blackAndWhiteCcd"/>
 *     &lt;enumeration value="colourTube"/>
 *     &lt;enumeration value="blackAndWhiteTube"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CctvCameraTypeEnum")
@XmlEnum
public enum CctvCameraTypeEnum {

    @XmlEnumValue("colourCcd")
    COLOUR_CCD("colourCcd"),
    @XmlEnumValue("blackAndWhiteCcd")
    BLACK_AND_WHITE_CCD("blackAndWhiteCcd"),
    @XmlEnumValue("colourTube")
    COLOUR_TUBE("colourTube"),
    @XmlEnumValue("blackAndWhiteTube")
    BLACK_AND_WHITE_TUBE("blackAndWhiteTube");
    private final String value;

    CctvCameraTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CctvCameraTypeEnum fromValue(String v) {
        for (CctvCameraTypeEnum c: CctvCameraTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
