
package introsde.project.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for removeTimelineResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="removeTimelineResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deletedTimeline" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removeTimelineResponse", propOrder = {
    "deletedTimeline"
})
public class RemoveTimelineResponse {

    protected boolean deletedTimeline;

    /**
     * Gets the value of the deletedTimeline property.
     * 
     */
    public boolean isDeletedTimeline() {
        return deletedTimeline;
    }

    /**
     * Sets the value of the deletedTimeline property.
     * 
     */
    public void setDeletedTimeline(boolean value) {
        this.deletedTimeline = value;
    }

}
