
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmsDatexSupplementalPictogramEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VmsDatexSupplementalPictogramEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="distanceToTheBeginningofTheApplicationZone"/>
 *     &lt;enumeration value="exceptAnyPowerDrivenVehicleDrawingTrailer"/>
 *     &lt;enumeration value="exceptBus"/>
 *     &lt;enumeration value="exceptGoodsVehicles"/>
 *     &lt;enumeration value="exceptSemiTrailer"/>
 *     &lt;enumeration value="exceptVehiclesCarryingDangerousGoods"/>
 *     &lt;enumeration value="inCaseOfIceOrSnow"/>
 *     &lt;enumeration value="lengthOfTheApplicationZone"/>
 *     &lt;enumeration value="restrictedToAnyPowerDrivenVehicleDrawingTrailer"/>
 *     &lt;enumeration value="restricetdToBus"/>
 *     &lt;enumeration value="restrictedToGoodsVehicles"/>
 *     &lt;enumeration value="restrictedToSemiTrailer"/>
 *     &lt;enumeration value="restrictedToVehiclesCarryingDangerousGoods"/>
 *     &lt;enumeration value="maintenanceVehicles"/>
 *     &lt;enumeration value="snowPloughs"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VmsDatexSupplementalPictogramEnum")
@XmlEnum
public enum VmsDatexSupplementalPictogramEnum {

    @XmlEnumValue("distanceToTheBeginningofTheApplicationZone")
    DISTANCE_TO_THE_BEGINNINGOF_THE_APPLICATION_ZONE("distanceToTheBeginningofTheApplicationZone"),
    @XmlEnumValue("exceptAnyPowerDrivenVehicleDrawingTrailer")
    EXCEPT_ANY_POWER_DRIVEN_VEHICLE_DRAWING_TRAILER("exceptAnyPowerDrivenVehicleDrawingTrailer"),
    @XmlEnumValue("exceptBus")
    EXCEPT_BUS("exceptBus"),
    @XmlEnumValue("exceptGoodsVehicles")
    EXCEPT_GOODS_VEHICLES("exceptGoodsVehicles"),
    @XmlEnumValue("exceptSemiTrailer")
    EXCEPT_SEMI_TRAILER("exceptSemiTrailer"),
    @XmlEnumValue("exceptVehiclesCarryingDangerousGoods")
    EXCEPT_VEHICLES_CARRYING_DANGEROUS_GOODS("exceptVehiclesCarryingDangerousGoods"),
    @XmlEnumValue("inCaseOfIceOrSnow")
    IN_CASE_OF_ICE_OR_SNOW("inCaseOfIceOrSnow"),
    @XmlEnumValue("lengthOfTheApplicationZone")
    LENGTH_OF_THE_APPLICATION_ZONE("lengthOfTheApplicationZone"),
    @XmlEnumValue("restrictedToAnyPowerDrivenVehicleDrawingTrailer")
    RESTRICTED_TO_ANY_POWER_DRIVEN_VEHICLE_DRAWING_TRAILER("restrictedToAnyPowerDrivenVehicleDrawingTrailer"),
    @XmlEnumValue("restricetdToBus")
    RESTRICETD_TO_BUS("restricetdToBus"),
    @XmlEnumValue("restrictedToGoodsVehicles")
    RESTRICTED_TO_GOODS_VEHICLES("restrictedToGoodsVehicles"),
    @XmlEnumValue("restrictedToSemiTrailer")
    RESTRICTED_TO_SEMI_TRAILER("restrictedToSemiTrailer"),
    @XmlEnumValue("restrictedToVehiclesCarryingDangerousGoods")
    RESTRICTED_TO_VEHICLES_CARRYING_DANGEROUS_GOODS("restrictedToVehiclesCarryingDangerousGoods"),
    @XmlEnumValue("maintenanceVehicles")
    MAINTENANCE_VEHICLES("maintenanceVehicles"),
    @XmlEnumValue("snowPloughs")
    SNOW_PLOUGHS("snowPloughs"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    VmsDatexSupplementalPictogramEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VmsDatexSupplementalPictogramEnum fromValue(String v) {
        for (VmsDatexSupplementalPictogramEnum c: VmsDatexSupplementalPictogramEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
