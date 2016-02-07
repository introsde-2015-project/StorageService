
package introsde.project.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readPersonTimelinesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readPersonTimelinesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personTimelines" type="{http://soap.project.introsde/}timeline" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readPersonTimelinesResponse", propOrder = {
    "personTimelines"
})
public class ReadPersonTimelinesResponse {

    protected List<Timeline> personTimelines;

    /**
     * Gets the value of the personTimelines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personTimelines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonTimelines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Timeline }
     * 
     * 
     */
    public List<Timeline> getPersonTimelines() {
        if (personTimelines == null) {
            personTimelines = new ArrayList<Timeline>();
        }
        return this.personTimelines;
    }

}
