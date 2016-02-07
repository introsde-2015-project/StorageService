
package introsde.project.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for removeMeasureResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="removeMeasureResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deletedMeasure" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removeMeasureResponse", propOrder = {
    "deletedMeasure"
})
public class RemoveMeasureResponse {

    protected boolean deletedMeasure;

    /**
     * Gets the value of the deletedMeasure property.
     * 
     */
    public boolean isDeletedMeasure() {
        return deletedMeasure;
    }

    /**
     * Sets the value of the deletedMeasure property.
     * 
     */
    public void setDeletedMeasure(boolean value) {
        this.deletedMeasure = value;
    }

}
