
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HeightGradeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HeightGradeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="aboveGrade"/>
 *     &lt;enumeration value="atGrade"/>
 *     &lt;enumeration value="belowGrade"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HeightGradeEnum")
@XmlEnum
public enum HeightGradeEnum {

    @XmlEnumValue("aboveGrade")
    ABOVE_GRADE("aboveGrade"),
    @XmlEnumValue("atGrade")
    AT_GRADE("atGrade"),
    @XmlEnumValue("belowGrade")
    BELOW_GRADE("belowGrade");
    private final String value;

    HeightGradeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HeightGradeEnum fromValue(String v) {
        for (HeightGradeEnum c: HeightGradeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
