
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CctvCameraVideoOrImageAvailabilityEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CctvCameraVideoOrImageAvailabilityEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="videoOrImagesAvailable"/>
 *     &lt;enumeration value="videoOrImagesUnavailableDueToCameraFault"/>
 *     &lt;enumeration value="videoOrImagesBlankedByOperator"/>
 *     &lt;enumeration value="videoOrImagesBlankedByPolice"/>
 *     &lt;enumeration value="videoOrImagesBlankedBySystem"/>
 *     &lt;enumeration value="videoOrImagesBlankedBySystemAdministrator"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CctvCameraVideoOrImageAvailabilityEnum")
@XmlEnum
public enum CctvCameraVideoOrImageAvailabilityEnum {

    @XmlEnumValue("videoOrImagesAvailable")
    VIDEO_OR_IMAGES_AVAILABLE("videoOrImagesAvailable"),
    @XmlEnumValue("videoOrImagesUnavailableDueToCameraFault")
    VIDEO_OR_IMAGES_UNAVAILABLE_DUE_TO_CAMERA_FAULT("videoOrImagesUnavailableDueToCameraFault"),
    @XmlEnumValue("videoOrImagesBlankedByOperator")
    VIDEO_OR_IMAGES_BLANKED_BY_OPERATOR("videoOrImagesBlankedByOperator"),
    @XmlEnumValue("videoOrImagesBlankedByPolice")
    VIDEO_OR_IMAGES_BLANKED_BY_POLICE("videoOrImagesBlankedByPolice"),
    @XmlEnumValue("videoOrImagesBlankedBySystem")
    VIDEO_OR_IMAGES_BLANKED_BY_SYSTEM("videoOrImagesBlankedBySystem"),
    @XmlEnumValue("videoOrImagesBlankedBySystemAdministrator")
    VIDEO_OR_IMAGES_BLANKED_BY_SYSTEM_ADMINISTRATOR("videoOrImagesBlankedBySystemAdministrator");
    private final String value;

    CctvCameraVideoOrImageAvailabilityEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CctvCameraVideoOrImageAvailabilityEnum fromValue(String v) {
        for (CctvCameraVideoOrImageAvailabilityEnum c: CctvCameraVideoOrImageAvailabilityEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
