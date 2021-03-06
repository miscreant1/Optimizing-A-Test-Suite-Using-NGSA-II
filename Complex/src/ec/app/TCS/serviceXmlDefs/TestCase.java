//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.21 at 11:07:43 AM BST 
//


package ec.app.TCS.serviceXmlDefs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="coveredBranches" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="invokedServices" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TestCaseID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "coveredBranches",
    "invokedServices"
})
@XmlRootElement(name = "TestCase")
public class TestCase {

    @XmlElement(required = true)
    protected List<String> coveredBranches;
    @XmlElement(required = true)
    protected List<String> invokedServices;
    @XmlAttribute(name = "TestCaseID")
    protected String testCaseID;

    /**
     * Gets the value of the coveredBranches property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coveredBranches property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoveredBranches().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCoveredBranches() {
        if (coveredBranches == null) {
            coveredBranches = new ArrayList<String>();
        }
        return this.coveredBranches;
    }

    /**
     * Gets the value of the invokedServices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invokedServices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvokedServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInvokedServices() {
        if (invokedServices == null) {
            invokedServices = new ArrayList<String>();
        }
        return this.invokedServices;
    }

    /**
     * Gets the value of the testCaseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestCaseID() {
        return testCaseID;
    }

    /**
     * Sets the value of the testCaseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestCaseID(String value) {
        this.testCaseID = value;
    }
    
    public void addCoveredBranch(String branchID){
        if(!getCoveredBranches().contains(branchID)){
            this.coveredBranches.add(branchID);
        }
    }
    
    public void addInvokedService(String serviceID){
        if(!getInvokedServices().contains(serviceID)){
            this.invokedServices.add(serviceID);
        }
    }

}
