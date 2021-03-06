
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpegLoc01FramedPointLocationSubtypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TpegLoc01FramedPointLocationSubtypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="framedPoint"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TpegLoc01FramedPointLocationSubtypeEnum")
@XmlEnum
public enum TpegLoc01FramedPointLocationSubtypeEnum {

    @XmlEnumValue("framedPoint")
    FRAMED_POINT("framedPoint");
    private final String value;

    TpegLoc01FramedPointLocationSubtypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TpegLoc01FramedPointLocationSubtypeEnum fromValue(String v) {
        for (TpegLoc01FramedPointLocationSubtypeEnum c: TpegLoc01FramedPointLocationSubtypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
