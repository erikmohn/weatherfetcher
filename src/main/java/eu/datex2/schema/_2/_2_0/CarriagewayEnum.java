
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarriagewayEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CarriagewayEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="connectingCarriageway"/>
 *     &lt;enumeration value="entrySlipRoad"/>
 *     &lt;enumeration value="exitSlipRoad"/>
 *     &lt;enumeration value="flyover"/>
 *     &lt;enumeration value="leftHandFeederRoad"/>
 *     &lt;enumeration value="leftHandParallelCarriageway"/>
 *     &lt;enumeration value="mainCarriageway"/>
 *     &lt;enumeration value="oppositeCarriageway"/>
 *     &lt;enumeration value="parallelCarriageway"/>
 *     &lt;enumeration value="rightHandFeederRoad"/>
 *     &lt;enumeration value="rightHandParallelCarriageway"/>
 *     &lt;enumeration value="roundabout"/>
 *     &lt;enumeration value="serviceRoad"/>
 *     &lt;enumeration value="slipRoads"/>
 *     &lt;enumeration value="underpass"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CarriagewayEnum")
@XmlEnum
public enum CarriagewayEnum {

    @XmlEnumValue("connectingCarriageway")
    CONNECTING_CARRIAGEWAY("connectingCarriageway"),
    @XmlEnumValue("entrySlipRoad")
    ENTRY_SLIP_ROAD("entrySlipRoad"),
    @XmlEnumValue("exitSlipRoad")
    EXIT_SLIP_ROAD("exitSlipRoad"),
    @XmlEnumValue("flyover")
    FLYOVER("flyover"),
    @XmlEnumValue("leftHandFeederRoad")
    LEFT_HAND_FEEDER_ROAD("leftHandFeederRoad"),
    @XmlEnumValue("leftHandParallelCarriageway")
    LEFT_HAND_PARALLEL_CARRIAGEWAY("leftHandParallelCarriageway"),
    @XmlEnumValue("mainCarriageway")
    MAIN_CARRIAGEWAY("mainCarriageway"),
    @XmlEnumValue("oppositeCarriageway")
    OPPOSITE_CARRIAGEWAY("oppositeCarriageway"),
    @XmlEnumValue("parallelCarriageway")
    PARALLEL_CARRIAGEWAY("parallelCarriageway"),
    @XmlEnumValue("rightHandFeederRoad")
    RIGHT_HAND_FEEDER_ROAD("rightHandFeederRoad"),
    @XmlEnumValue("rightHandParallelCarriageway")
    RIGHT_HAND_PARALLEL_CARRIAGEWAY("rightHandParallelCarriageway"),
    @XmlEnumValue("roundabout")
    ROUNDABOUT("roundabout"),
    @XmlEnumValue("serviceRoad")
    SERVICE_ROAD("serviceRoad"),
    @XmlEnumValue("slipRoads")
    SLIP_ROADS("slipRoads"),
    @XmlEnumValue("underpass")
    UNDERPASS("underpass");
    private final String value;

    CarriagewayEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CarriagewayEnum fromValue(String v) {
        for (CarriagewayEnum c: CarriagewayEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
