
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MonthOfYearEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MonthOfYearEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="january"/>
 *     &lt;enumeration value="february"/>
 *     &lt;enumeration value="march"/>
 *     &lt;enumeration value="april"/>
 *     &lt;enumeration value="may"/>
 *     &lt;enumeration value="june"/>
 *     &lt;enumeration value="july"/>
 *     &lt;enumeration value="august"/>
 *     &lt;enumeration value="september"/>
 *     &lt;enumeration value="october"/>
 *     &lt;enumeration value="november"/>
 *     &lt;enumeration value="december"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MonthOfYearEnum")
@XmlEnum
public enum MonthOfYearEnum {

    @XmlEnumValue("january")
    JANUARY("january"),
    @XmlEnumValue("february")
    FEBRUARY("february"),
    @XmlEnumValue("march")
    MARCH("march"),
    @XmlEnumValue("april")
    APRIL("april"),
    @XmlEnumValue("may")
    MAY("may"),
    @XmlEnumValue("june")
    JUNE("june"),
    @XmlEnumValue("july")
    JULY("july"),
    @XmlEnumValue("august")
    AUGUST("august"),
    @XmlEnumValue("september")
    SEPTEMBER("september"),
    @XmlEnumValue("october")
    OCTOBER("october"),
    @XmlEnumValue("november")
    NOVEMBER("november"),
    @XmlEnumValue("december")
    DECEMBER("december");
    private final String value;

    MonthOfYearEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MonthOfYearEnum fromValue(String v) {
        for (MonthOfYearEnum c: MonthOfYearEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
