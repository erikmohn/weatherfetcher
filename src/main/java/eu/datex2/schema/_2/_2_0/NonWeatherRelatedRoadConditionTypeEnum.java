
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonWeatherRelatedRoadConditionTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NonWeatherRelatedRoadConditionTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="dieselOnRoad"/>
 *     &lt;enumeration value="leavesOnRoad"/>
 *     &lt;enumeration value="looseChippings"/>
 *     &lt;enumeration value="looseSandOnRoad"/>
 *     &lt;enumeration value="mudOnRoad"/>
 *     &lt;enumeration value="oilOnRoad"/>
 *     &lt;enumeration value="petrolOnRoad"/>
 *     &lt;enumeration value="roadSurfaceInPoorCondition"/>
 *     &lt;enumeration value="slipperyRoad"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NonWeatherRelatedRoadConditionTypeEnum")
@XmlEnum
public enum NonWeatherRelatedRoadConditionTypeEnum {

    @XmlEnumValue("dieselOnRoad")
    DIESEL_ON_ROAD("dieselOnRoad"),
    @XmlEnumValue("leavesOnRoad")
    LEAVES_ON_ROAD("leavesOnRoad"),
    @XmlEnumValue("looseChippings")
    LOOSE_CHIPPINGS("looseChippings"),
    @XmlEnumValue("looseSandOnRoad")
    LOOSE_SAND_ON_ROAD("looseSandOnRoad"),
    @XmlEnumValue("mudOnRoad")
    MUD_ON_ROAD("mudOnRoad"),
    @XmlEnumValue("oilOnRoad")
    OIL_ON_ROAD("oilOnRoad"),
    @XmlEnumValue("petrolOnRoad")
    PETROL_ON_ROAD("petrolOnRoad"),
    @XmlEnumValue("roadSurfaceInPoorCondition")
    ROAD_SURFACE_IN_POOR_CONDITION("roadSurfaceInPoorCondition"),
    @XmlEnumValue("slipperyRoad")
    SLIPPERY_ROAD("slipperyRoad"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    NonWeatherRelatedRoadConditionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NonWeatherRelatedRoadConditionTypeEnum fromValue(String v) {
        for (NonWeatherRelatedRoadConditionTypeEnum c: NonWeatherRelatedRoadConditionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
