
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConstructionWorkTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConstructionWorkTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="blastingWork"/>
 *     &lt;enumeration value="constructionWork"/>
 *     &lt;enumeration value="demolitionWork"/>
 *     &lt;enumeration value="roadImprovementOrUpgrading"/>
 *     &lt;enumeration value="roadWideningWork"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConstructionWorkTypeEnum")
@XmlEnum
public enum ConstructionWorkTypeEnum {

    @XmlEnumValue("blastingWork")
    BLASTING_WORK("blastingWork"),
    @XmlEnumValue("constructionWork")
    CONSTRUCTION_WORK("constructionWork"),
    @XmlEnumValue("demolitionWork")
    DEMOLITION_WORK("demolitionWork"),
    @XmlEnumValue("roadImprovementOrUpgrading")
    ROAD_IMPROVEMENT_OR_UPGRADING("roadImprovementOrUpgrading"),
    @XmlEnumValue("roadWideningWork")
    ROAD_WIDENING_WORK("roadWideningWork");
    private final String value;

    ConstructionWorkTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConstructionWorkTypeEnum fromValue(String v) {
        for (ConstructionWorkTypeEnum c: ConstructionWorkTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
