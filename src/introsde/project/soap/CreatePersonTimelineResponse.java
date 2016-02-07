
package introsde.project.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createPersonTimelineResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createPersonTimelineResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="newTimeline" type="{http://soap.project.introsde/}timeline" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createPersonTimelineResponse", propOrder = {
    "newTimeline"
})
public class CreatePersonTimelineResponse {

    protected Timeline newTimeline;

    /**
     * Gets the value of the newTimeline property.
     * 
     * @return
     *     possible object is
     *     {@link Timeline }
     *     
     */
    public Timeline getNewTimeline() {
        return newTimeline;
    }

    /**
     * Sets the value of the newTimeline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Timeline }
     *     
     */
    public void setNewTimeline(Timeline value) {
        this.newTimeline = value;
    }

}
