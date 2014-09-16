
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenlrFunctionalRoadClassEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OpenlrFunctionalRoadClassEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FRC0"/>
 *     &lt;enumeration value="FRC1"/>
 *     &lt;enumeration value="FRC2"/>
 *     &lt;enumeration value="FRC3"/>
 *     &lt;enumeration value="FRC4"/>
 *     &lt;enumeration value="FRC5"/>
 *     &lt;enumeration value="FRC6"/>
 *     &lt;enumeration value="FRC7"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OpenlrFunctionalRoadClassEnum")
@XmlEnum
public enum OpenlrFunctionalRoadClassEnum {

    @XmlEnumValue("FRC0")
    FRC_0("FRC0"),
    @XmlEnumValue("FRC1")
    FRC_1("FRC1"),
    @XmlEnumValue("FRC2")
    FRC_2("FRC2"),
    @XmlEnumValue("FRC3")
    FRC_3("FRC3"),
    @XmlEnumValue("FRC4")
    FRC_4("FRC4"),
    @XmlEnumValue("FRC5")
    FRC_5("FRC5"),
    @XmlEnumValue("FRC6")
    FRC_6("FRC6"),
    @XmlEnumValue("FRC7")
    FRC_7("FRC7");
    private final String value;

    OpenlrFunctionalRoadClassEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OpenlrFunctionalRoadClassEnum fromValue(String v) {
        for (OpenlrFunctionalRoadClassEnum c: OpenlrFunctionalRoadClassEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
