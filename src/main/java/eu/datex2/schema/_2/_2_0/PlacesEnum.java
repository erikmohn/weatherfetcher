
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlacesEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PlacesEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="aroundBendsInTheRoad"/>
 *     &lt;enumeration value="atCustomsPosts"/>
 *     &lt;enumeration value="atHighAltitudes"/>
 *     &lt;enumeration value="atTollPlazas"/>
 *     &lt;enumeration value="inBuiltUpAreas"/>
 *     &lt;enumeration value="inContraflowSections"/>
 *     &lt;enumeration value="inForestedAreas"/>
 *     &lt;enumeration value="inGalleries"/>
 *     &lt;enumeration value="inLowLyingAreas"/>
 *     &lt;enumeration value="inRoadworksAreas"/>
 *     &lt;enumeration value="inRuralAreas"/>
 *     &lt;enumeration value="inShadedAreas"/>
 *     &lt;enumeration value="inTheCityCentre"/>
 *     &lt;enumeration value="inTheInnerCityAreas"/>
 *     &lt;enumeration value="inTunnels"/>
 *     &lt;enumeration value="onBridges"/>
 *     &lt;enumeration value="onDownHillSections"/>
 *     &lt;enumeration value="onDualCarriagewaySections"/>
 *     &lt;enumeration value="onElevatedSections"/>
 *     &lt;enumeration value="onEnteringOrLeavingTunnels"/>
 *     &lt;enumeration value="onEnteringTheCountry"/>
 *     &lt;enumeration value="onFlyovers"/>
 *     &lt;enumeration value="onLeavingTheCountry"/>
 *     &lt;enumeration value="onMotorways"/>
 *     &lt;enumeration value="onNonMotorways"/>
 *     &lt;enumeration value="onPasses"/>
 *     &lt;enumeration value="onRoundabouts"/>
 *     &lt;enumeration value="onSingleCarriagewaySections"/>
 *     &lt;enumeration value="onSlipRoads"/>
 *     &lt;enumeration value="onUndergroundSections"/>
 *     &lt;enumeration value="onUnderpasses"/>
 *     &lt;enumeration value="onUpHillSections"/>
 *     &lt;enumeration value="overTheCrestOfHills"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PlacesEnum")
@XmlEnum
public enum PlacesEnum {

    @XmlEnumValue("aroundBendsInTheRoad")
    AROUND_BENDS_IN_THE_ROAD("aroundBendsInTheRoad"),
    @XmlEnumValue("atCustomsPosts")
    AT_CUSTOMS_POSTS("atCustomsPosts"),
    @XmlEnumValue("atHighAltitudes")
    AT_HIGH_ALTITUDES("atHighAltitudes"),
    @XmlEnumValue("atTollPlazas")
    AT_TOLL_PLAZAS("atTollPlazas"),
    @XmlEnumValue("inBuiltUpAreas")
    IN_BUILT_UP_AREAS("inBuiltUpAreas"),
    @XmlEnumValue("inContraflowSections")
    IN_CONTRAFLOW_SECTIONS("inContraflowSections"),
    @XmlEnumValue("inForestedAreas")
    IN_FORESTED_AREAS("inForestedAreas"),
    @XmlEnumValue("inGalleries")
    IN_GALLERIES("inGalleries"),
    @XmlEnumValue("inLowLyingAreas")
    IN_LOW_LYING_AREAS("inLowLyingAreas"),
    @XmlEnumValue("inRoadworksAreas")
    IN_ROADWORKS_AREAS("inRoadworksAreas"),
    @XmlEnumValue("inRuralAreas")
    IN_RURAL_AREAS("inRuralAreas"),
    @XmlEnumValue("inShadedAreas")
    IN_SHADED_AREAS("inShadedAreas"),
    @XmlEnumValue("inTheCityCentre")
    IN_THE_CITY_CENTRE("inTheCityCentre"),
    @XmlEnumValue("inTheInnerCityAreas")
    IN_THE_INNER_CITY_AREAS("inTheInnerCityAreas"),
    @XmlEnumValue("inTunnels")
    IN_TUNNELS("inTunnels"),
    @XmlEnumValue("onBridges")
    ON_BRIDGES("onBridges"),
    @XmlEnumValue("onDownHillSections")
    ON_DOWN_HILL_SECTIONS("onDownHillSections"),
    @XmlEnumValue("onDualCarriagewaySections")
    ON_DUAL_CARRIAGEWAY_SECTIONS("onDualCarriagewaySections"),
    @XmlEnumValue("onElevatedSections")
    ON_ELEVATED_SECTIONS("onElevatedSections"),
    @XmlEnumValue("onEnteringOrLeavingTunnels")
    ON_ENTERING_OR_LEAVING_TUNNELS("onEnteringOrLeavingTunnels"),
    @XmlEnumValue("onEnteringTheCountry")
    ON_ENTERING_THE_COUNTRY("onEnteringTheCountry"),
    @XmlEnumValue("onFlyovers")
    ON_FLYOVERS("onFlyovers"),
    @XmlEnumValue("onLeavingTheCountry")
    ON_LEAVING_THE_COUNTRY("onLeavingTheCountry"),
    @XmlEnumValue("onMotorways")
    ON_MOTORWAYS("onMotorways"),
    @XmlEnumValue("onNonMotorways")
    ON_NON_MOTORWAYS("onNonMotorways"),
    @XmlEnumValue("onPasses")
    ON_PASSES("onPasses"),
    @XmlEnumValue("onRoundabouts")
    ON_ROUNDABOUTS("onRoundabouts"),
    @XmlEnumValue("onSingleCarriagewaySections")
    ON_SINGLE_CARRIAGEWAY_SECTIONS("onSingleCarriagewaySections"),
    @XmlEnumValue("onSlipRoads")
    ON_SLIP_ROADS("onSlipRoads"),
    @XmlEnumValue("onUndergroundSections")
    ON_UNDERGROUND_SECTIONS("onUndergroundSections"),
    @XmlEnumValue("onUnderpasses")
    ON_UNDERPASSES("onUnderpasses"),
    @XmlEnumValue("onUpHillSections")
    ON_UP_HILL_SECTIONS("onUpHillSections"),
    @XmlEnumValue("overTheCrestOfHills")
    OVER_THE_CREST_OF_HILLS("overTheCrestOfHills"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    PlacesEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlacesEnum fromValue(String v) {
        for (PlacesEnum c: PlacesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
