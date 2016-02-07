
package introsde.project.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for timeline complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="timeline">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JSONString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timelineId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "timeline", propOrder = {
    "date",
    "jsonString",
    "timelineId"
})
public class Timeline {

    protected String date;
    @XmlElement(name = "JSONString")
    protected String jsonString;
    protected int timelineId;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the jsonString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJSONString() {
        return jsonString;
    }

    /**
     * Sets the value of the jsonString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJSONString(String value) {
        this.jsonString = value;
    }

    /**
     * Gets the value of the timelineId property.
     * 
     */
    public int getTimelineId() {
        return timelineId;
    }

    /**
     * Sets the value of the timelineId property.
     * 
     */
    public void setTimelineId(int value) {
        this.timelineId = value;
    }

}
