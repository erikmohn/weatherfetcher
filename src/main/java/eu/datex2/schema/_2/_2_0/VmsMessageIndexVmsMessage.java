
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _VmsMessageIndexVmsMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_VmsMessageIndexVmsMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vmsMessage" type="{http://datex2.eu/schema/2/2_0}VmsMessage"/>
 *       &lt;/sequence>
 *       &lt;attribute name="messageIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_VmsMessageIndexVmsMessage", propOrder = {
    "vmsMessage"
})
public class VmsMessageIndexVmsMessage {

    @XmlElement(required = true)
    protected VmsMessage vmsMessage;
    @XmlAttribute(name = "messageIndex", required = true)
    protected int messageIndex;

    /**
     * Gets the value of the vmsMessage property.
     * 
     * @return
     *     possible object is
     *     {@link VmsMessage }
     *     
     */
    public VmsMessage getVmsMessage() {
        return vmsMessage;
    }

    /**
     * Sets the value of the vmsMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsMessage }
     *     
     */
    public void setVmsMessage(VmsMessage value) {
        this.vmsMessage = value;
    }

    /**
     * Gets the value of the messageIndex property.
     * 
     */
    public int getMessageIndex() {
        return messageIndex;
    }

    /**
     * Sets the value of the messageIndex property.
     * 
     */
    public void setMessageIndex(int value) {
        this.messageIndex = value;
    }

}
