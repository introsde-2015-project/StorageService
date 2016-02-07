
package introsde.project.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readSingleTimelineResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readSingleTimelineResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="singleTimeline" type="{http://soap.project.introsde/}timeline" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readSingleTimelineResponse", propOrder = {
    "singleTimeline"
})
public class ReadSingleTimelineResponse {

    protected Timeline singleTimeline;

    /**
     * Gets the value of the singleTimeline property.
     * 
     * @return
     *     possible object is
     *     {@link Timeline }
     *     
     */
    public Timeline getSingleTimeline() {
        return singleTimeline;
    }

    /**
     * Sets the value of the singleTimeline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Timeline }
     *     
     */
    public void setSingleTimeline(Timeline value) {
        this.singleTimeline = value;
    }

}
