
package introsde.project.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readPersonGoalsByMeasureResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readPersonGoalsByMeasureResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personMeasureGoals" type="{http://soap.project.introsde/}Goal" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readPersonGoalsByMeasureResponse", propOrder = {
    "personMeasureGoals"
})
public class ReadPersonGoalsByMeasureResponse {

    protected List<Goal> personMeasureGoals;

    /**
     * Gets the value of the personMeasureGoals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personMeasureGoals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonMeasureGoals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Goal }
     * 
     * 
     */
    public List<Goal> getPersonMeasureGoals() {
        if (personMeasureGoals == null) {
            personMeasureGoals = new ArrayList<Goal>();
        }
        return this.personMeasureGoals;
    }

}
