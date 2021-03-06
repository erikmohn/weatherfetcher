
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadOrCarriagewayOrLaneManagementTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoadOrCarriagewayOrLaneManagementTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="carPoolLaneInOperation"/>
 *     &lt;enumeration value="carriagewayClosures"/>
 *     &lt;enumeration value="clearALaneForEmergencyVehicles"/>
 *     &lt;enumeration value="clearALaneForSnowploughsAndGrittingVehicles"/>
 *     &lt;enumeration value="closedPermanentlyForTheWinter"/>
 *     &lt;enumeration value="contraflow"/>
 *     &lt;enumeration value="doNotUseSpecifiedLanesOrCarriageways"/>
 *     &lt;enumeration value="hardShoulderRunningInOperation"/>
 *     &lt;enumeration value="heightRestrictionInOperation"/>
 *     &lt;enumeration value="intermittentShortTermClosures"/>
 *     &lt;enumeration value="keepToTheLeft"/>
 *     &lt;enumeration value="keepToTheRight"/>
 *     &lt;enumeration value="laneClosures"/>
 *     &lt;enumeration value="lanesDeviated"/>
 *     &lt;enumeration value="narrowLanes"/>
 *     &lt;enumeration value="newRoadworksLayout"/>
 *     &lt;enumeration value="overnightClosures"/>
 *     &lt;enumeration value="roadCleared"/>
 *     &lt;enumeration value="roadClosed"/>
 *     &lt;enumeration value="rollingRoadBlock"/>
 *     &lt;enumeration value="rushHourLaneInOperation"/>
 *     &lt;enumeration value="singleAlternateLineTraffic"/>
 *     &lt;enumeration value="tidalFlowLaneInOperation"/>
 *     &lt;enumeration value="turnAroundInOperation"/>
 *     &lt;enumeration value="useOfSpecifiedLanesOrCarriagewaysAllowed"/>
 *     &lt;enumeration value="useSpecifiedLanesOrCarriageways"/>
 *     &lt;enumeration value="vehicleStorageInOperation"/>
 *     &lt;enumeration value="weightRestrictionInOperation"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoadOrCarriagewayOrLaneManagementTypeEnum")
@XmlEnum
public enum RoadOrCarriagewayOrLaneManagementTypeEnum {

    @XmlEnumValue("carPoolLaneInOperation")
    CAR_POOL_LANE_IN_OPERATION("carPoolLaneInOperation"),
    @XmlEnumValue("carriagewayClosures")
    CARRIAGEWAY_CLOSURES("carriagewayClosures"),
    @XmlEnumValue("clearALaneForEmergencyVehicles")
    CLEAR_A_LANE_FOR_EMERGENCY_VEHICLES("clearALaneForEmergencyVehicles"),
    @XmlEnumValue("clearALaneForSnowploughsAndGrittingVehicles")
    CLEAR_A_LANE_FOR_SNOWPLOUGHS_AND_GRITTING_VEHICLES("clearALaneForSnowploughsAndGrittingVehicles"),
    @XmlEnumValue("closedPermanentlyForTheWinter")
    CLOSED_PERMANENTLY_FOR_THE_WINTER("closedPermanentlyForTheWinter"),
    @XmlEnumValue("contraflow")
    CONTRAFLOW("contraflow"),
    @XmlEnumValue("doNotUseSpecifiedLanesOrCarriageways")
    DO_NOT_USE_SPECIFIED_LANES_OR_CARRIAGEWAYS("doNotUseSpecifiedLanesOrCarriageways"),
    @XmlEnumValue("hardShoulderRunningInOperation")
    HARD_SHOULDER_RUNNING_IN_OPERATION("hardShoulderRunningInOperation"),
    @XmlEnumValue("heightRestrictionInOperation")
    HEIGHT_RESTRICTION_IN_OPERATION("heightRestrictionInOperation"),
    @XmlEnumValue("intermittentShortTermClosures")
    INTERMITTENT_SHORT_TERM_CLOSURES("intermittentShortTermClosures"),
    @XmlEnumValue("keepToTheLeft")
    KEEP_TO_THE_LEFT("keepToTheLeft"),
    @XmlEnumValue("keepToTheRight")
    KEEP_TO_THE_RIGHT("keepToTheRight"),
    @XmlEnumValue("laneClosures")
    LANE_CLOSURES("laneClosures"),
    @XmlEnumValue("lanesDeviated")
    LANES_DEVIATED("lanesDeviated"),
    @XmlEnumValue("narrowLanes")
    NARROW_LANES("narrowLanes"),
    @XmlEnumValue("newRoadworksLayout")
    NEW_ROADWORKS_LAYOUT("newRoadworksLayout"),
    @XmlEnumValue("overnightClosures")
    OVERNIGHT_CLOSURES("overnightClosures"),
    @XmlEnumValue("roadCleared")
    ROAD_CLEARED("roadCleared"),
    @XmlEnumValue("roadClosed")
    ROAD_CLOSED("roadClosed"),
    @XmlEnumValue("rollingRoadBlock")
    ROLLING_ROAD_BLOCK("rollingRoadBlock"),
    @XmlEnumValue("rushHourLaneInOperation")
    RUSH_HOUR_LANE_IN_OPERATION("rushHourLaneInOperation"),
    @XmlEnumValue("singleAlternateLineTraffic")
    SINGLE_ALTERNATE_LINE_TRAFFIC("singleAlternateLineTraffic"),
    @XmlEnumValue("tidalFlowLaneInOperation")
    TIDAL_FLOW_LANE_IN_OPERATION("tidalFlowLaneInOperation"),
    @XmlEnumValue("turnAroundInOperation")
    TURN_AROUND_IN_OPERATION("turnAroundInOperation"),
    @XmlEnumValue("useOfSpecifiedLanesOrCarriagewaysAllowed")
    USE_OF_SPECIFIED_LANES_OR_CARRIAGEWAYS_ALLOWED("useOfSpecifiedLanesOrCarriagewaysAllowed"),
    @XmlEnumValue("useSpecifiedLanesOrCarriageways")
    USE_SPECIFIED_LANES_OR_CARRIAGEWAYS("useSpecifiedLanesOrCarriageways"),
    @XmlEnumValue("vehicleStorageInOperation")
    VEHICLE_STORAGE_IN_OPERATION("vehicleStorageInOperation"),
    @XmlEnumValue("weightRestrictionInOperation")
    WEIGHT_RESTRICTION_IN_OPERATION("weightRestrictionInOperation"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    RoadOrCarriagewayOrLaneManagementTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoadOrCarriagewayOrLaneManagementTypeEnum fromValue(String v) {
        for (RoadOrCarriagewayOrLaneManagementTypeEnum c: RoadOrCarriagewayOrLaneManagementTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
