
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationCodeTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationCodeTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="continent"/>
 *     &lt;enumeration value="road"/>
 *     &lt;enumeration value="junction"/>
 *     &lt;enumeration value="countryGroup"/>
 *     &lt;enumeration value="ringRoad"/>
 *     &lt;enumeration value="intermediatePoint"/>
 *     &lt;enumeration value="country"/>
 *     &lt;enumeration value="firstOrderSegment"/>
 *     &lt;enumeration value="otherLandmarkPoint"/>
 *     &lt;enumeration value="secondOrderSegment"/>
 *     &lt;enumeration value="waterArea"/>
 *     &lt;enumeration value="urbanStreet"/>
 *     &lt;enumeration value="fuzzyArea"/>
 *     &lt;enumeration value="vehicularLink"/>
 *     &lt;enumeration value="firstOrderArea"/>
 *     &lt;enumeration value="secondOrderArea"/>
 *     &lt;enumeration value="thirdOrderArea"/>
 *     &lt;enumeration value="fourthOrderArea"/>
 *     &lt;enumeration value="fifthOrderArea"/>
 *     &lt;enumeration value="applicationRegion"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LocationCodeTypeEnum")
@XmlEnum
public enum LocationCodeTypeEnum {

    @XmlEnumValue("continent")
    CONTINENT("continent"),
    @XmlEnumValue("road")
    ROAD("road"),
    @XmlEnumValue("junction")
    JUNCTION("junction"),
    @XmlEnumValue("countryGroup")
    COUNTRY_GROUP("countryGroup"),
    @XmlEnumValue("ringRoad")
    RING_ROAD("ringRoad"),
    @XmlEnumValue("intermediatePoint")
    INTERMEDIATE_POINT("intermediatePoint"),
    @XmlEnumValue("country")
    COUNTRY("country"),
    @XmlEnumValue("firstOrderSegment")
    FIRST_ORDER_SEGMENT("firstOrderSegment"),
    @XmlEnumValue("otherLandmarkPoint")
    OTHER_LANDMARK_POINT("otherLandmarkPoint"),
    @XmlEnumValue("secondOrderSegment")
    SECOND_ORDER_SEGMENT("secondOrderSegment"),
    @XmlEnumValue("waterArea")
    WATER_AREA("waterArea"),
    @XmlEnumValue("urbanStreet")
    URBAN_STREET("urbanStreet"),
    @XmlEnumValue("fuzzyArea")
    FUZZY_AREA("fuzzyArea"),
    @XmlEnumValue("vehicularLink")
    VEHICULAR_LINK("vehicularLink"),
    @XmlEnumValue("firstOrderArea")
    FIRST_ORDER_AREA("firstOrderArea"),
    @XmlEnumValue("secondOrderArea")
    SECOND_ORDER_AREA("secondOrderArea"),
    @XmlEnumValue("thirdOrderArea")
    THIRD_ORDER_AREA("thirdOrderArea"),
    @XmlEnumValue("fourthOrderArea")
    FOURTH_ORDER_AREA("fourthOrderArea"),
    @XmlEnumValue("fifthOrderArea")
    FIFTH_ORDER_AREA("fifthOrderArea"),
    @XmlEnumValue("applicationRegion")
    APPLICATION_REGION("applicationRegion"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    LocationCodeTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationCodeTypeEnum fromValue(String v) {
        for (LocationCodeTypeEnum c: LocationCodeTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
