
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmsDatexPictogramEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VmsDatexPictogramEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="accident"/>
 *     &lt;enumeration value="advisorySpeed"/>
 *     &lt;enumeration value="animalsOnRoad"/>
 *     &lt;enumeration value="blankVoid"/>
 *     &lt;enumeration value="bridgeClosed"/>
 *     &lt;enumeration value="bridgeSwingInOperation"/>
 *     &lt;enumeration value="carParkFull"/>
 *     &lt;enumeration value="carParkSpacesAvailable"/>
 *     &lt;enumeration value="carriagewayNarrows"/>
 *     &lt;enumeration value="carriagewayNarrowsOnTheLeft"/>
 *     &lt;enumeration value="carriagewayNarrowsOnTheRight"/>
 *     &lt;enumeration value="carriagewayReducedToOneLane"/>
 *     &lt;enumeration value="carriagewayReducedToTwoLanes"/>
 *     &lt;enumeration value="carriagewayReducedToThreeLanes"/>
 *     &lt;enumeration value="chainsOrSnowTyresRecommended"/>
 *     &lt;enumeration value="compulsoryMinimumSpeed"/>
 *     &lt;enumeration value="crossWind"/>
 *     &lt;enumeration value="dangerOfFire"/>
 *     &lt;enumeration value="drivingOfVehiclesLessThanXMetresApartProhibited"/>
 *     &lt;enumeration value="endOfAdvisorySpeed"/>
 *     &lt;enumeration value="endOfCompulsoryMinimumSpeed"/>
 *     &lt;enumeration value="endOfProhibitionOfOvertaking"/>
 *     &lt;enumeration value="endOfProhibitionOfOvertakingForGoodsVehicles"/>
 *     &lt;enumeration value="endOfSpeedLimit"/>
 *     &lt;enumeration value="exitClosed"/>
 *     &lt;enumeration value="fallingRocks"/>
 *     &lt;enumeration value="fastenChildrensSeatBelts"/>
 *     &lt;enumeration value="fastenYourSeatBelt"/>
 *     &lt;enumeration value="fire"/>
 *     &lt;enumeration value="floodingOrFlashFloods"/>
 *     &lt;enumeration value="fog"/>
 *     &lt;enumeration value="footballMatch"/>
 *     &lt;enumeration value="hardShoulderNotRunning"/>
 *     &lt;enumeration value="hardShoulderRunning"/>
 *     &lt;enumeration value="keepASafeDistance"/>
 *     &lt;enumeration value="keepLeft"/>
 *     &lt;enumeration value="keepRight"/>
 *     &lt;enumeration value="lane1ClosedOf2"/>
 *     &lt;enumeration value="lane2ClosedOf2"/>
 *     &lt;enumeration value="lane1ClosedOf3"/>
 *     &lt;enumeration value="lane3ClosedOf3"/>
 *     &lt;enumeration value="lanes1And2ClosedOf3"/>
 *     &lt;enumeration value="lanes2And3ClosedOf3"/>
 *     &lt;enumeration value="lane1ClosedOf4"/>
 *     &lt;enumeration value="lane4ClosedOf4"/>
 *     &lt;enumeration value="lanes1And2ClosedOf4"/>
 *     &lt;enumeration value="lanes3And4ClosedOf4"/>
 *     &lt;enumeration value="lanes1And2And3ClosedOf4"/>
 *     &lt;enumeration value="lanes2And3And4ClosedOf4"/>
 *     &lt;enumeration value="laneClosed"/>
 *     &lt;enumeration value="laneDeviationToLeft"/>
 *     &lt;enumeration value="laneDeviationToRight"/>
 *     &lt;enumeration value="laneOpen"/>
 *     &lt;enumeration value="leftHandLaneClosed"/>
 *     &lt;enumeration value="lightSignals"/>
 *     &lt;enumeration value="looseGravel"/>
 *     &lt;enumeration value="maintenanceVehicleInAction"/>
 *     &lt;enumeration value="maximumSpeedLimitedToTheFigureIndicated"/>
 *     &lt;enumeration value="narrowLanesAead"/>
 *     &lt;enumeration value="noEntry"/>
 *     &lt;enumeration value="noEntryForAnyPowerDrivenVehicleDrawingATrailer"/>
 *     &lt;enumeration value="noEntryForAnyPowerDrivenVehicleDrawingATrailerOtherThanASemiTrailerOrASingleAxleTrailer"/>
 *     &lt;enumeration value="noEntryForGoodsVehicles"/>
 *     &lt;enumeration value="noEntryForVehiclesExceedingXTonnesLadenMass"/>
 *     &lt;enumeration value="noEntryForVehiclesHavingAMassExceedingXTonnesOnOneAxle"/>
 *     &lt;enumeration value="noEntryForVehiclesHavingAnOverallHeightExceedingXMetres"/>
 *     &lt;enumeration value="noEntryForVehiclesHavingAnOverallLengthExceedingXMetres"/>
 *     &lt;enumeration value="noEntryForVehiclesHavingAnOverallWidthExceedingXMetres"/>
 *     &lt;enumeration value="noEntryForVehiclesCarryingDangerousGoods"/>
 *     &lt;enumeration value="otherDangers"/>
 *     &lt;enumeration value="overtakingByGoodsVehiclesProhibited"/>
 *     &lt;enumeration value="overtakingProhibited"/>
 *     &lt;enumeration value="pollutionOrSmogAlert"/>
 *     &lt;enumeration value="queue"/>
 *     &lt;enumeration value="rain"/>
 *     &lt;enumeration value="rightHandLaneClosed"/>
 *     &lt;enumeration value="roadClosedAhead"/>
 *     &lt;enumeration value="roadworks"/>
 *     &lt;enumeration value="slipperyRoad"/>
 *     &lt;enumeration value="smoke"/>
 *     &lt;enumeration value="snow"/>
 *     &lt;enumeration value="snowChainsCompulsory"/>
 *     &lt;enumeration value="snowTyresCompulsory"/>
 *     &lt;enumeration value="snowPloughInAction"/>
 *     &lt;enumeration value="speedCamerasInAction"/>
 *     &lt;enumeration value="trafficCongestion"/>
 *     &lt;enumeration value="trafficDeviatedToOppositeCarriagewayAhead"/>
 *     &lt;enumeration value="trafficPartiallyDeviatedToOppositeCarriagewayAhead"/>
 *     &lt;enumeration value="tunnelClosed"/>
 *     &lt;enumeration value="turnLeft"/>
 *     &lt;enumeration value="turnRight"/>
 *     &lt;enumeration value="twoWayTraffic"/>
 *     &lt;enumeration value="unevenRoad"/>
 *     &lt;enumeration value="vehicleFire"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VmsDatexPictogramEnum")
@XmlEnum
public enum VmsDatexPictogramEnum {

    @XmlEnumValue("accident")
    ACCIDENT("accident"),
    @XmlEnumValue("advisorySpeed")
    ADVISORY_SPEED("advisorySpeed"),
    @XmlEnumValue("animalsOnRoad")
    ANIMALS_ON_ROAD("animalsOnRoad"),
    @XmlEnumValue("blankVoid")
    BLANK_VOID("blankVoid"),
    @XmlEnumValue("bridgeClosed")
    BRIDGE_CLOSED("bridgeClosed"),
    @XmlEnumValue("bridgeSwingInOperation")
    BRIDGE_SWING_IN_OPERATION("bridgeSwingInOperation"),
    @XmlEnumValue("carParkFull")
    CAR_PARK_FULL("carParkFull"),
    @XmlEnumValue("carParkSpacesAvailable")
    CAR_PARK_SPACES_AVAILABLE("carParkSpacesAvailable"),
    @XmlEnumValue("carriagewayNarrows")
    CARRIAGEWAY_NARROWS("carriagewayNarrows"),
    @XmlEnumValue("carriagewayNarrowsOnTheLeft")
    CARRIAGEWAY_NARROWS_ON_THE_LEFT("carriagewayNarrowsOnTheLeft"),
    @XmlEnumValue("carriagewayNarrowsOnTheRight")
    CARRIAGEWAY_NARROWS_ON_THE_RIGHT("carriagewayNarrowsOnTheRight"),
    @XmlEnumValue("carriagewayReducedToOneLane")
    CARRIAGEWAY_REDUCED_TO_ONE_LANE("carriagewayReducedToOneLane"),
    @XmlEnumValue("carriagewayReducedToTwoLanes")
    CARRIAGEWAY_REDUCED_TO_TWO_LANES("carriagewayReducedToTwoLanes"),
    @XmlEnumValue("carriagewayReducedToThreeLanes")
    CARRIAGEWAY_REDUCED_TO_THREE_LANES("carriagewayReducedToThreeLanes"),
    @XmlEnumValue("chainsOrSnowTyresRecommended")
    CHAINS_OR_SNOW_TYRES_RECOMMENDED("chainsOrSnowTyresRecommended"),
    @XmlEnumValue("compulsoryMinimumSpeed")
    COMPULSORY_MINIMUM_SPEED("compulsoryMinimumSpeed"),
    @XmlEnumValue("crossWind")
    CROSS_WIND("crossWind"),
    @XmlEnumValue("dangerOfFire")
    DANGER_OF_FIRE("dangerOfFire"),
    @XmlEnumValue("drivingOfVehiclesLessThanXMetresApartProhibited")
    DRIVING_OF_VEHICLES_LESS_THAN_X_METRES_APART_PROHIBITED("drivingOfVehiclesLessThanXMetresApartProhibited"),
    @XmlEnumValue("endOfAdvisorySpeed")
    END_OF_ADVISORY_SPEED("endOfAdvisorySpeed"),
    @XmlEnumValue("endOfCompulsoryMinimumSpeed")
    END_OF_COMPULSORY_MINIMUM_SPEED("endOfCompulsoryMinimumSpeed"),
    @XmlEnumValue("endOfProhibitionOfOvertaking")
    END_OF_PROHIBITION_OF_OVERTAKING("endOfProhibitionOfOvertaking"),
    @XmlEnumValue("endOfProhibitionOfOvertakingForGoodsVehicles")
    END_OF_PROHIBITION_OF_OVERTAKING_FOR_GOODS_VEHICLES("endOfProhibitionOfOvertakingForGoodsVehicles"),
    @XmlEnumValue("endOfSpeedLimit")
    END_OF_SPEED_LIMIT("endOfSpeedLimit"),
    @XmlEnumValue("exitClosed")
    EXIT_CLOSED("exitClosed"),
    @XmlEnumValue("fallingRocks")
    FALLING_ROCKS("fallingRocks"),
    @XmlEnumValue("fastenChildrensSeatBelts")
    FASTEN_CHILDRENS_SEAT_BELTS("fastenChildrensSeatBelts"),
    @XmlEnumValue("fastenYourSeatBelt")
    FASTEN_YOUR_SEAT_BELT("fastenYourSeatBelt"),
    @XmlEnumValue("fire")
    FIRE("fire"),
    @XmlEnumValue("floodingOrFlashFloods")
    FLOODING_OR_FLASH_FLOODS("floodingOrFlashFloods"),
    @XmlEnumValue("fog")
    FOG("fog"),
    @XmlEnumValue("footballMatch")
    FOOTBALL_MATCH("footballMatch"),
    @XmlEnumValue("hardShoulderNotRunning")
    HARD_SHOULDER_NOT_RUNNING("hardShoulderNotRunning"),
    @XmlEnumValue("hardShoulderRunning")
    HARD_SHOULDER_RUNNING("hardShoulderRunning"),
    @XmlEnumValue("keepASafeDistance")
    KEEP_A_SAFE_DISTANCE("keepASafeDistance"),
    @XmlEnumValue("keepLeft")
    KEEP_LEFT("keepLeft"),
    @XmlEnumValue("keepRight")
    KEEP_RIGHT("keepRight"),
    @XmlEnumValue("lane1ClosedOf2")
    LANE_1_CLOSED_OF_2("lane1ClosedOf2"),
    @XmlEnumValue("lane2ClosedOf2")
    LANE_2_CLOSED_OF_2("lane2ClosedOf2"),
    @XmlEnumValue("lane1ClosedOf3")
    LANE_1_CLOSED_OF_3("lane1ClosedOf3"),
    @XmlEnumValue("lane3ClosedOf3")
    LANE_3_CLOSED_OF_3("lane3ClosedOf3"),
    @XmlEnumValue("lanes1And2ClosedOf3")
    LANES_1_AND_2_CLOSED_OF_3("lanes1And2ClosedOf3"),
    @XmlEnumValue("lanes2And3ClosedOf3")
    LANES_2_AND_3_CLOSED_OF_3("lanes2And3ClosedOf3"),
    @XmlEnumValue("lane1ClosedOf4")
    LANE_1_CLOSED_OF_4("lane1ClosedOf4"),
    @XmlEnumValue("lane4ClosedOf4")
    LANE_4_CLOSED_OF_4("lane4ClosedOf4"),
    @XmlEnumValue("lanes1And2ClosedOf4")
    LANES_1_AND_2_CLOSED_OF_4("lanes1And2ClosedOf4"),
    @XmlEnumValue("lanes3And4ClosedOf4")
    LANES_3_AND_4_CLOSED_OF_4("lanes3And4ClosedOf4"),
    @XmlEnumValue("lanes1And2And3ClosedOf4")
    LANES_1_AND_2_AND_3_CLOSED_OF_4("lanes1And2And3ClosedOf4"),
    @XmlEnumValue("lanes2And3And4ClosedOf4")
    LANES_2_AND_3_AND_4_CLOSED_OF_4("lanes2And3And4ClosedOf4"),
    @XmlEnumValue("laneClosed")
    LANE_CLOSED("laneClosed"),
    @XmlEnumValue("laneDeviationToLeft")
    LANE_DEVIATION_TO_LEFT("laneDeviationToLeft"),
    @XmlEnumValue("laneDeviationToRight")
    LANE_DEVIATION_TO_RIGHT("laneDeviationToRight"),
    @XmlEnumValue("laneOpen")
    LANE_OPEN("laneOpen"),
    @XmlEnumValue("leftHandLaneClosed")
    LEFT_HAND_LANE_CLOSED("leftHandLaneClosed"),
    @XmlEnumValue("lightSignals")
    LIGHT_SIGNALS("lightSignals"),
    @XmlEnumValue("looseGravel")
    LOOSE_GRAVEL("looseGravel"),
    @XmlEnumValue("maintenanceVehicleInAction")
    MAINTENANCE_VEHICLE_IN_ACTION("maintenanceVehicleInAction"),
    @XmlEnumValue("maximumSpeedLimitedToTheFigureIndicated")
    MAXIMUM_SPEED_LIMITED_TO_THE_FIGURE_INDICATED("maximumSpeedLimitedToTheFigureIndicated"),
    @XmlEnumValue("narrowLanesAead")
    NARROW_LANES_AEAD("narrowLanesAead"),
    @XmlEnumValue("noEntry")
    NO_ENTRY("noEntry"),
    @XmlEnumValue("noEntryForAnyPowerDrivenVehicleDrawingATrailer")
    NO_ENTRY_FOR_ANY_POWER_DRIVEN_VEHICLE_DRAWING_A_TRAILER("noEntryForAnyPowerDrivenVehicleDrawingATrailer"),
    @XmlEnumValue("noEntryForAnyPowerDrivenVehicleDrawingATrailerOtherThanASemiTrailerOrASingleAxleTrailer")
    NO_ENTRY_FOR_ANY_POWER_DRIVEN_VEHICLE_DRAWING_A_TRAILER_OTHER_THAN_A_SEMI_TRAILER_OR_A_SINGLE_AXLE_TRAILER("noEntryForAnyPowerDrivenVehicleDrawingATrailerOtherThanASemiTrailerOrASingleAxleTrailer"),
    @XmlEnumValue("noEntryForGoodsVehicles")
    NO_ENTRY_FOR_GOODS_VEHICLES("noEntryForGoodsVehicles"),
    @XmlEnumValue("noEntryForVehiclesExceedingXTonnesLadenMass")
    NO_ENTRY_FOR_VEHICLES_EXCEEDING_X_TONNES_LADEN_MASS("noEntryForVehiclesExceedingXTonnesLadenMass"),
    @XmlEnumValue("noEntryForVehiclesHavingAMassExceedingXTonnesOnOneAxle")
    NO_ENTRY_FOR_VEHICLES_HAVING_A_MASS_EXCEEDING_X_TONNES_ON_ONE_AXLE("noEntryForVehiclesHavingAMassExceedingXTonnesOnOneAxle"),
    @XmlEnumValue("noEntryForVehiclesHavingAnOverallHeightExceedingXMetres")
    NO_ENTRY_FOR_VEHICLES_HAVING_AN_OVERALL_HEIGHT_EXCEEDING_X_METRES("noEntryForVehiclesHavingAnOverallHeightExceedingXMetres"),
    @XmlEnumValue("noEntryForVehiclesHavingAnOverallLengthExceedingXMetres")
    NO_ENTRY_FOR_VEHICLES_HAVING_AN_OVERALL_LENGTH_EXCEEDING_X_METRES("noEntryForVehiclesHavingAnOverallLengthExceedingXMetres"),
    @XmlEnumValue("noEntryForVehiclesHavingAnOverallWidthExceedingXMetres")
    NO_ENTRY_FOR_VEHICLES_HAVING_AN_OVERALL_WIDTH_EXCEEDING_X_METRES("noEntryForVehiclesHavingAnOverallWidthExceedingXMetres"),
    @XmlEnumValue("noEntryForVehiclesCarryingDangerousGoods")
    NO_ENTRY_FOR_VEHICLES_CARRYING_DANGEROUS_GOODS("noEntryForVehiclesCarryingDangerousGoods"),
    @XmlEnumValue("otherDangers")
    OTHER_DANGERS("otherDangers"),
    @XmlEnumValue("overtakingByGoodsVehiclesProhibited")
    OVERTAKING_BY_GOODS_VEHICLES_PROHIBITED("overtakingByGoodsVehiclesProhibited"),
    @XmlEnumValue("overtakingProhibited")
    OVERTAKING_PROHIBITED("overtakingProhibited"),
    @XmlEnumValue("pollutionOrSmogAlert")
    POLLUTION_OR_SMOG_ALERT("pollutionOrSmogAlert"),
    @XmlEnumValue("queue")
    QUEUE("queue"),
    @XmlEnumValue("rain")
    RAIN("rain"),
    @XmlEnumValue("rightHandLaneClosed")
    RIGHT_HAND_LANE_CLOSED("rightHandLaneClosed"),
    @XmlEnumValue("roadClosedAhead")
    ROAD_CLOSED_AHEAD("roadClosedAhead"),
    @XmlEnumValue("roadworks")
    ROADWORKS("roadworks"),
    @XmlEnumValue("slipperyRoad")
    SLIPPERY_ROAD("slipperyRoad"),
    @XmlEnumValue("smoke")
    SMOKE("smoke"),
    @XmlEnumValue("snow")
    SNOW("snow"),
    @XmlEnumValue("snowChainsCompulsory")
    SNOW_CHAINS_COMPULSORY("snowChainsCompulsory"),
    @XmlEnumValue("snowTyresCompulsory")
    SNOW_TYRES_COMPULSORY("snowTyresCompulsory"),
    @XmlEnumValue("snowPloughInAction")
    SNOW_PLOUGH_IN_ACTION("snowPloughInAction"),
    @XmlEnumValue("speedCamerasInAction")
    SPEED_CAMERAS_IN_ACTION("speedCamerasInAction"),
    @XmlEnumValue("trafficCongestion")
    TRAFFIC_CONGESTION("trafficCongestion"),
    @XmlEnumValue("trafficDeviatedToOppositeCarriagewayAhead")
    TRAFFIC_DEVIATED_TO_OPPOSITE_CARRIAGEWAY_AHEAD("trafficDeviatedToOppositeCarriagewayAhead"),
    @XmlEnumValue("trafficPartiallyDeviatedToOppositeCarriagewayAhead")
    TRAFFIC_PARTIALLY_DEVIATED_TO_OPPOSITE_CARRIAGEWAY_AHEAD("trafficPartiallyDeviatedToOppositeCarriagewayAhead"),
    @XmlEnumValue("tunnelClosed")
    TUNNEL_CLOSED("tunnelClosed"),
    @XmlEnumValue("turnLeft")
    TURN_LEFT("turnLeft"),
    @XmlEnumValue("turnRight")
    TURN_RIGHT("turnRight"),
    @XmlEnumValue("twoWayTraffic")
    TWO_WAY_TRAFFIC("twoWayTraffic"),
    @XmlEnumValue("unevenRoad")
    UNEVEN_ROAD("unevenRoad"),
    @XmlEnumValue("vehicleFire")
    VEHICLE_FIRE("vehicleFire"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    VmsDatexPictogramEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VmsDatexPictogramEnum fromValue(String v) {
        for (VmsDatexPictogramEnum c: VmsDatexPictogramEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
