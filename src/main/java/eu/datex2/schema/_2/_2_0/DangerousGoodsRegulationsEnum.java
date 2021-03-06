
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DangerousGoodsRegulationsEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DangerousGoodsRegulationsEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="adr"/>
 *     &lt;enumeration value="iataIcao"/>
 *     &lt;enumeration value="imoImdg"/>
 *     &lt;enumeration value="railroadDangerousGoodsBook"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DangerousGoodsRegulationsEnum")
@XmlEnum
public enum DangerousGoodsRegulationsEnum {

    @XmlEnumValue("adr")
    ADR("adr"),
    @XmlEnumValue("iataIcao")
    IATA_ICAO("iataIcao"),
    @XmlEnumValue("imoImdg")
    IMO_IMDG("imoImdg"),
    @XmlEnumValue("railroadDangerousGoodsBook")
    RAILROAD_DANGEROUS_GOODS_BOOK("railroadDangerousGoodsBook");
    private final String value;

    DangerousGoodsRegulationsEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DangerousGoodsRegulationsEnum fromValue(String v) {
        for (DangerousGoodsRegulationsEnum c: DangerousGoodsRegulationsEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
