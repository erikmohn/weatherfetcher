
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationCodeSubTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationCodeSubTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="continent"/>
 *     &lt;enumeration value="countryGroup"/>
 *     &lt;enumeration value="country"/>
 *     &lt;enumeration value="waterArea"/>
 *     &lt;enumeration value="sea"/>
 *     &lt;enumeration value="lake"/>
 *     &lt;enumeration value="fuzzyArea"/>
 *     &lt;enumeration value="touristArea"/>
 *     &lt;enumeration value="metropolitanArea"/>
 *     &lt;enumeration value="industrialArea"/>
 *     &lt;enumeration value="trafficArea"/>
 *     &lt;enumeration value="metrologicalArea"/>
 *     &lt;enumeration value="carpoolArea"/>
 *     &lt;enumeration value="parkAndRideSite"/>
 *     &lt;enumeration value="carParkArea"/>
 *     &lt;enumeration value="firstOrderArea"/>
 *     &lt;enumeration value="secondOrderArea"/>
 *     &lt;enumeration value="thirdOrderArea"/>
 *     &lt;enumeration value="ruralCountry"/>
 *     &lt;enumeration value="urbanCountry"/>
 *     &lt;enumeration value="fourthOrderArea"/>
 *     &lt;enumeration value="fifthOrderArea"/>
 *     &lt;enumeration value="applicationRegion"/>
 *     &lt;enumeration value="road"/>
 *     &lt;enumeration value="motorway"/>
 *     &lt;enumeration value="firstClassRoad"/>
 *     &lt;enumeration value="secondClassRoad"/>
 *     &lt;enumeration value="thirdClassRoad"/>
 *     &lt;enumeration value="ringRoad"/>
 *     &lt;enumeration value="ringMotorway"/>
 *     &lt;enumeration value="otherRingRoad"/>
 *     &lt;enumeration value="firstOrderSegment"/>
 *     &lt;enumeration value="secondOrderSegment"/>
 *     &lt;enumeration value="urbanStreet"/>
 *     &lt;enumeration value="vehicularLink"/>
 *     &lt;enumeration value="ferry"/>
 *     &lt;enumeration value="vehicularRailLink"/>
 *     &lt;enumeration value="junction"/>
 *     &lt;enumeration value="motorwayIntersection"/>
 *     &lt;enumeration value="motorwayTriangle"/>
 *     &lt;enumeration value="motorwayJunction"/>
 *     &lt;enumeration value="motorwayExit"/>
 *     &lt;enumeration value="motorwayEntrance"/>
 *     &lt;enumeration value="flyover"/>
 *     &lt;enumeration value="underpass"/>
 *     &lt;enumeration value="roundabout"/>
 *     &lt;enumeration value="trafficLight"/>
 *     &lt;enumeration value="crossroads"/>
 *     &lt;enumeration value="tJunction"/>
 *     &lt;enumeration value="intermediateNode"/>
 *     &lt;enumeration value="connection"/>
 *     &lt;enumeration value="exit"/>
 *     &lt;enumeration value="intermediatePoint"/>
 *     &lt;enumeration value="distanceMarker"/>
 *     &lt;enumeration value="trafficMonitoringStation"/>
 *     &lt;enumeration value="otherLandmark"/>
 *     &lt;enumeration value="tunnel"/>
 *     &lt;enumeration value="bridge"/>
 *     &lt;enumeration value="serviceArea"/>
 *     &lt;enumeration value="restArea"/>
 *     &lt;enumeration value="viewPoint"/>
 *     &lt;enumeration value="carpoolPoint"/>
 *     &lt;enumeration value="parkAndRideSitePoint"/>
 *     &lt;enumeration value="carParkPoint"/>
 *     &lt;enumeration value="kiosk"/>
 *     &lt;enumeration value="kioskWithWC"/>
 *     &lt;enumeration value="petrolStation"/>
 *     &lt;enumeration value="petrolStationWithKiosk"/>
 *     &lt;enumeration value="motel"/>
 *     &lt;enumeration value="border"/>
 *     &lt;enumeration value="customsPost"/>
 *     &lt;enumeration value="tollPlaza"/>
 *     &lt;enumeration value="ferryTerminal"/>
 *     &lt;enumeration value="harbour"/>
 *     &lt;enumeration value="square"/>
 *     &lt;enumeration value="fair"/>
 *     &lt;enumeration value="garage"/>
 *     &lt;enumeration value="undergroundGarage"/>
 *     &lt;enumeration value="retailPark"/>
 *     &lt;enumeration value="themePark"/>
 *     &lt;enumeration value="touristAttraction"/>
 *     &lt;enumeration value="university"/>
 *     &lt;enumeration value="airport"/>
 *     &lt;enumeration value="station"/>
 *     &lt;enumeration value="hospital"/>
 *     &lt;enumeration value="church"/>
 *     &lt;enumeration value="stadium"/>
 *     &lt;enumeration value="castle"/>
 *     &lt;enumeration value="townHall"/>
 *     &lt;enumeration value="exhibitionCentre"/>
 *     &lt;enumeration value="communities"/>
 *     &lt;enumeration value="placeName"/>
 *     &lt;enumeration value="dam"/>
 *     &lt;enumeration value="dike"/>
 *     &lt;enumeration value="aqueduct"/>
 *     &lt;enumeration value="lock"/>
 *     &lt;enumeration value="mountainCrossing"/>
 *     &lt;enumeration value="railRoadCrossing"/>
 *     &lt;enumeration value="wade"/>
 *     &lt;enumeration value="ferryPoint"/>
 *     &lt;enumeration value="industrialAreaPoint"/>
 *     &lt;enumeration value="viaduct"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LocationCodeSubTypeEnum")
@XmlEnum
public enum LocationCodeSubTypeEnum {

    @XmlEnumValue("continent")
    CONTINENT("continent"),
    @XmlEnumValue("countryGroup")
    COUNTRY_GROUP("countryGroup"),
    @XmlEnumValue("country")
    COUNTRY("country"),
    @XmlEnumValue("waterArea")
    WATER_AREA("waterArea"),
    @XmlEnumValue("sea")
    SEA("sea"),
    @XmlEnumValue("lake")
    LAKE("lake"),
    @XmlEnumValue("fuzzyArea")
    FUZZY_AREA("fuzzyArea"),
    @XmlEnumValue("touristArea")
    TOURIST_AREA("touristArea"),
    @XmlEnumValue("metropolitanArea")
    METROPOLITAN_AREA("metropolitanArea"),
    @XmlEnumValue("industrialArea")
    INDUSTRIAL_AREA("industrialArea"),
    @XmlEnumValue("trafficArea")
    TRAFFIC_AREA("trafficArea"),
    @XmlEnumValue("metrologicalArea")
    METROLOGICAL_AREA("metrologicalArea"),
    @XmlEnumValue("carpoolArea")
    CARPOOL_AREA("carpoolArea"),
    @XmlEnumValue("parkAndRideSite")
    PARK_AND_RIDE_SITE("parkAndRideSite"),
    @XmlEnumValue("carParkArea")
    CAR_PARK_AREA("carParkArea"),
    @XmlEnumValue("firstOrderArea")
    FIRST_ORDER_AREA("firstOrderArea"),
    @XmlEnumValue("secondOrderArea")
    SECOND_ORDER_AREA("secondOrderArea"),
    @XmlEnumValue("thirdOrderArea")
    THIRD_ORDER_AREA("thirdOrderArea"),
    @XmlEnumValue("ruralCountry")
    RURAL_COUNTRY("ruralCountry"),
    @XmlEnumValue("urbanCountry")
    URBAN_COUNTRY("urbanCountry"),
    @XmlEnumValue("fourthOrderArea")
    FOURTH_ORDER_AREA("fourthOrderArea"),
    @XmlEnumValue("fifthOrderArea")
    FIFTH_ORDER_AREA("fifthOrderArea"),
    @XmlEnumValue("applicationRegion")
    APPLICATION_REGION("applicationRegion"),
    @XmlEnumValue("road")
    ROAD("road"),
    @XmlEnumValue("motorway")
    MOTORWAY("motorway"),
    @XmlEnumValue("firstClassRoad")
    FIRST_CLASS_ROAD("firstClassRoad"),
    @XmlEnumValue("secondClassRoad")
    SECOND_CLASS_ROAD("secondClassRoad"),
    @XmlEnumValue("thirdClassRoad")
    THIRD_CLASS_ROAD("thirdClassRoad"),
    @XmlEnumValue("ringRoad")
    RING_ROAD("ringRoad"),
    @XmlEnumValue("ringMotorway")
    RING_MOTORWAY("ringMotorway"),
    @XmlEnumValue("otherRingRoad")
    OTHER_RING_ROAD("otherRingRoad"),
    @XmlEnumValue("firstOrderSegment")
    FIRST_ORDER_SEGMENT("firstOrderSegment"),
    @XmlEnumValue("secondOrderSegment")
    SECOND_ORDER_SEGMENT("secondOrderSegment"),
    @XmlEnumValue("urbanStreet")
    URBAN_STREET("urbanStreet"),
    @XmlEnumValue("vehicularLink")
    VEHICULAR_LINK("vehicularLink"),
    @XmlEnumValue("ferry")
    FERRY("ferry"),
    @XmlEnumValue("vehicularRailLink")
    VEHICULAR_RAIL_LINK("vehicularRailLink"),
    @XmlEnumValue("junction")
    JUNCTION("junction"),
    @XmlEnumValue("motorwayIntersection")
    MOTORWAY_INTERSECTION("motorwayIntersection"),
    @XmlEnumValue("motorwayTriangle")
    MOTORWAY_TRIANGLE("motorwayTriangle"),
    @XmlEnumValue("motorwayJunction")
    MOTORWAY_JUNCTION("motorwayJunction"),
    @XmlEnumValue("motorwayExit")
    MOTORWAY_EXIT("motorwayExit"),
    @XmlEnumValue("motorwayEntrance")
    MOTORWAY_ENTRANCE("motorwayEntrance"),
    @XmlEnumValue("flyover")
    FLYOVER("flyover"),
    @XmlEnumValue("underpass")
    UNDERPASS("underpass"),
    @XmlEnumValue("roundabout")
    ROUNDABOUT("roundabout"),
    @XmlEnumValue("trafficLight")
    TRAFFIC_LIGHT("trafficLight"),
    @XmlEnumValue("crossroads")
    CROSSROADS("crossroads"),
    @XmlEnumValue("tJunction")
    T_JUNCTION("tJunction"),
    @XmlEnumValue("intermediateNode")
    INTERMEDIATE_NODE("intermediateNode"),
    @XmlEnumValue("connection")
    CONNECTION("connection"),
    @XmlEnumValue("exit")
    EXIT("exit"),
    @XmlEnumValue("intermediatePoint")
    INTERMEDIATE_POINT("intermediatePoint"),
    @XmlEnumValue("distanceMarker")
    DISTANCE_MARKER("distanceMarker"),
    @XmlEnumValue("trafficMonitoringStation")
    TRAFFIC_MONITORING_STATION("trafficMonitoringStation"),
    @XmlEnumValue("otherLandmark")
    OTHER_LANDMARK("otherLandmark"),
    @XmlEnumValue("tunnel")
    TUNNEL("tunnel"),
    @XmlEnumValue("bridge")
    BRIDGE("bridge"),
    @XmlEnumValue("serviceArea")
    SERVICE_AREA("serviceArea"),
    @XmlEnumValue("restArea")
    REST_AREA("restArea"),
    @XmlEnumValue("viewPoint")
    VIEW_POINT("viewPoint"),
    @XmlEnumValue("carpoolPoint")
    CARPOOL_POINT("carpoolPoint"),
    @XmlEnumValue("parkAndRideSitePoint")
    PARK_AND_RIDE_SITE_POINT("parkAndRideSitePoint"),
    @XmlEnumValue("carParkPoint")
    CAR_PARK_POINT("carParkPoint"),
    @XmlEnumValue("kiosk")
    KIOSK("kiosk"),
    @XmlEnumValue("kioskWithWC")
    KIOSK_WITH_WC("kioskWithWC"),
    @XmlEnumValue("petrolStation")
    PETROL_STATION("petrolStation"),
    @XmlEnumValue("petrolStationWithKiosk")
    PETROL_STATION_WITH_KIOSK("petrolStationWithKiosk"),
    @XmlEnumValue("motel")
    MOTEL("motel"),
    @XmlEnumValue("border")
    BORDER("border"),
    @XmlEnumValue("customsPost")
    CUSTOMS_POST("customsPost"),
    @XmlEnumValue("tollPlaza")
    TOLL_PLAZA("tollPlaza"),
    @XmlEnumValue("ferryTerminal")
    FERRY_TERMINAL("ferryTerminal"),
    @XmlEnumValue("harbour")
    HARBOUR("harbour"),
    @XmlEnumValue("square")
    SQUARE("square"),
    @XmlEnumValue("fair")
    FAIR("fair"),
    @XmlEnumValue("garage")
    GARAGE("garage"),
    @XmlEnumValue("undergroundGarage")
    UNDERGROUND_GARAGE("undergroundGarage"),
    @XmlEnumValue("retailPark")
    RETAIL_PARK("retailPark"),
    @XmlEnumValue("themePark")
    THEME_PARK("themePark"),
    @XmlEnumValue("touristAttraction")
    TOURIST_ATTRACTION("touristAttraction"),
    @XmlEnumValue("university")
    UNIVERSITY("university"),
    @XmlEnumValue("airport")
    AIRPORT("airport"),
    @XmlEnumValue("station")
    STATION("station"),
    @XmlEnumValue("hospital")
    HOSPITAL("hospital"),
    @XmlEnumValue("church")
    CHURCH("church"),
    @XmlEnumValue("stadium")
    STADIUM("stadium"),
    @XmlEnumValue("castle")
    CASTLE("castle"),
    @XmlEnumValue("townHall")
    TOWN_HALL("townHall"),
    @XmlEnumValue("exhibitionCentre")
    EXHIBITION_CENTRE("exhibitionCentre"),
    @XmlEnumValue("communities")
    COMMUNITIES("communities"),
    @XmlEnumValue("placeName")
    PLACE_NAME("placeName"),
    @XmlEnumValue("dam")
    DAM("dam"),
    @XmlEnumValue("dike")
    DIKE("dike"),
    @XmlEnumValue("aqueduct")
    AQUEDUCT("aqueduct"),
    @XmlEnumValue("lock")
    LOCK("lock"),
    @XmlEnumValue("mountainCrossing")
    MOUNTAIN_CROSSING("mountainCrossing"),
    @XmlEnumValue("railRoadCrossing")
    RAIL_ROAD_CROSSING("railRoadCrossing"),
    @XmlEnumValue("wade")
    WADE("wade"),
    @XmlEnumValue("ferryPoint")
    FERRY_POINT("ferryPoint"),
    @XmlEnumValue("industrialAreaPoint")
    INDUSTRIAL_AREA_POINT("industrialAreaPoint"),
    @XmlEnumValue("viaduct")
    VIADUCT("viaduct"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    LocationCodeSubTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationCodeSubTypeEnum fromValue(String v) {
        for (LocationCodeSubTypeEnum c: LocationCodeSubTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
