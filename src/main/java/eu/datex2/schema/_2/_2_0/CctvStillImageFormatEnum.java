
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CctvStillImageFormatEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CctvStillImageFormatEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="jpeg"/>
 *     &lt;enumeration value="gif"/>
 *     &lt;enumeration value="png"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CctvStillImageFormatEnum")
@XmlEnum
public enum CctvStillImageFormatEnum {

    @XmlEnumValue("jpeg")
    JPEG("jpeg"),
    @XmlEnumValue("gif")
    GIF("gif"),
    @XmlEnumValue("png")
    PNG("png");
    private final String value;

    CctvStillImageFormatEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CctvStillImageFormatEnum fromValue(String v) {
        for (CctvStillImageFormatEnum c: CctvStillImageFormatEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
