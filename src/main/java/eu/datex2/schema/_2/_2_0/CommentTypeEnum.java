
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommentTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommentTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="abnormalLoadMovementNote"/>
 *     &lt;enumeration value="dataProcessingNote"/>
 *     &lt;enumeration value="description"/>
 *     &lt;enumeration value="internalNote"/>
 *     &lt;enumeration value="locationDescriptor"/>
 *     &lt;enumeration value="warning"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommentTypeEnum")
@XmlEnum
public enum CommentTypeEnum {

    @XmlEnumValue("abnormalLoadMovementNote")
    ABNORMAL_LOAD_MOVEMENT_NOTE("abnormalLoadMovementNote"),
    @XmlEnumValue("dataProcessingNote")
    DATA_PROCESSING_NOTE("dataProcessingNote"),
    @XmlEnumValue("description")
    DESCRIPTION("description"),
    @XmlEnumValue("internalNote")
    INTERNAL_NOTE("internalNote"),
    @XmlEnumValue("locationDescriptor")
    LOCATION_DESCRIPTOR("locationDescriptor"),
    @XmlEnumValue("warning")
    WARNING("warning"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    CommentTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommentTypeEnum fromValue(String v) {
        for (CommentTypeEnum c: CommentTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
