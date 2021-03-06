
package com.thed.service.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateRequirement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateRequirement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="remoteRequirementId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="remoteFieldValues" type="{http://soap.service.thed.com/}remoteFieldValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateRequirement", propOrder = {
    "remoteRequirementId",
    "remoteFieldValues",
    "token"
})
public class UpdateRequirement {

    protected Long remoteRequirementId;
    protected List<RemoteFieldValue> remoteFieldValues;
    protected String token;

    /**
     * Gets the value of the remoteRequirementId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRemoteRequirementId() {
        return remoteRequirementId;
    }

    /**
     * Sets the value of the remoteRequirementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRemoteRequirementId(Long value) {
        this.remoteRequirementId = value;
    }

    /**
     * Gets the value of the remoteFieldValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remoteFieldValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemoteFieldValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemoteFieldValue }
     * 
     * 
     */
    public List<RemoteFieldValue> getRemoteFieldValues() {
        if (remoteFieldValues == null) {
            remoteFieldValues = new ArrayList<RemoteFieldValue>();
        }
        return this.remoteFieldValues;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

}
