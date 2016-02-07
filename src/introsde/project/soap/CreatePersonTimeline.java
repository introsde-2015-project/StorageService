
package introsde.project.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createPersonTimeline complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createPersonTimeline">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="timeline" type="{http://soap.project.introsde/}timeline" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createPersonTimeline", propOrder = {
    "personId",
    "timeline"
})
public class CreatePersonTimeline {

    protected int personId;
    protected Timeline timeline;

    /**
     * Gets the value of the personId property.
     * 
     */
    public int getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     */
    public void setPersonId(int value) {
        this.personId = value;
    }

    /**
     * Gets the value of the timeline property.
     * 
     * @return
     *     possible object is
     *     {@link Timeline }
     *     
     */
    public Timeline getTimeline() {
        return timeline;
    }

    /**
     * Sets the value of the timeline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Timeline }
     *     
     */
    public void setTimeline(Timeline value) {
        this.timeline = value;
    }

}
