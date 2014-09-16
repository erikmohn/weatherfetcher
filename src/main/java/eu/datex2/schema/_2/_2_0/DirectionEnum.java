
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DirectionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DirectionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="allDirections"/>
 *     &lt;enumeration value="bothWays"/>
 *     &lt;enumeration value="clockwise"/>
 *     &lt;enumeration value="anticlockwise"/>
 *     &lt;enumeration value="innerRing"/>
 *     &lt;enumeration value="outerRing"/>
 *     &lt;enumeration value="northBound"/>
 *     &lt;enumeration value="northEastBound"/>
 *     &lt;enumeration value="eastBound"/>
 *     &lt;enumeration value="southEastBound"/>
 *     &lt;enumeration value="southBound"/>
 *     &lt;enumeration value="southWestBound"/>
 *     &lt;enumeration value="westBound"/>
 *     &lt;enumeration value="northWestBound"/>
 *     &lt;enumeration value="inboundTowardsTown"/>
 *     &lt;enumeration value="outboundFromTown"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="opposite"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DirectionEnum")
@XmlEnum
public enum DirectionEnum {

    @XmlEnumValue("allDirections")
    ALL_DIRECTIONS("allDirections"),
    @XmlEnumValue("bothWays")
    BOTH_WAYS("bothWays"),
    @XmlEnumValue("clockwise")
    CLOCKWISE("clockwise"),
    @XmlEnumValue("anticlockwise")
    ANTICLOCKWISE("anticlockwise"),
    @XmlEnumValue("innerRing")
    INNER_RING("innerRing"),
    @XmlEnumValue("outerRing")
    OUTER_RING("outerRing"),
    @XmlEnumValue("northBound")
    NORTH_BOUND("northBound"),
    @XmlEnumValue("northEastBound")
    NORTH_EAST_BOUND("northEastBound"),
    @XmlEnumValue("eastBound")
    EAST_BOUND("eastBound"),
    @XmlEnumValue("southEastBound")
    SOUTH_EAST_BOUND("southEastBound"),
    @XmlEnumValue("southBound")
    SOUTH_BOUND("southBound"),
    @XmlEnumValue("southWestBound")
    SOUTH_WEST_BOUND("southWestBound"),
    @XmlEnumValue("westBound")
    WEST_BOUND("westBound"),
    @XmlEnumValue("northWestBound")
    NORTH_WEST_BOUND("northWestBound"),
    @XmlEnumValue("inboundTowardsTown")
    INBOUND_TOWARDS_TOWN("inboundTowardsTown"),
    @XmlEnumValue("outboundFromTown")
    OUTBOUND_FROM_TOWN("outboundFromTown"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("opposite")
    OPPOSITE("opposite"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    DirectionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DirectionEnum fromValue(String v) {
        for (DirectionEnum c: DirectionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
