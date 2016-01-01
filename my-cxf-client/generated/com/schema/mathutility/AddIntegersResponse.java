
package com.schema.mathutility;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addIntegersReturn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "addIntegersReturn"
})
@XmlRootElement(name = "addIntegersResponse")
public class AddIntegersResponse {

    protected int addIntegersReturn;

    /**
     * Gets the value of the addIntegersReturn property.
     * 
     */
    public int getAddIntegersReturn() {
        return addIntegersReturn;
    }

    /**
     * Sets the value of the addIntegersReturn property.
     * 
     */
    public void setAddIntegersReturn(int value) {
        this.addIntegersReturn = value;
    }

}
