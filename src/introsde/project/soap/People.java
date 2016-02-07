
package introsde.project.soap;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "People", targetNamespace = "http://soap.project.introsde/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface People {


    /**
     * 
     * @param personId
     * @return
     *     returns introsde.project.soap.Person
     */
    @WebMethod
    @WebResult(name = "person", targetNamespace = "")
    @RequestWrapper(localName = "readPerson", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.ReadPerson")
    @ResponseWrapper(localName = "readPersonResponse", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.ReadPersonResponse")
    @Action(input = "http://soap.project.introsde/People/readPersonRequest", output = "http://soap.project.introsde/People/readPersonResponse")
    public Person readPerson(
        @WebParam(name = "personId", targetNamespace = "")
        int personId);

    /**
     * 
     * @return
     *     returns java.util.List<introsde.project.soap.Person>
     */
    @WebMethod
    @WebResult(name = "people", targetNamespace = "")
    @RequestWrapper(localName = "readPersonList", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.ReadPersonList")
    @ResponseWrapper(localName = "readPersonListResponse", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.ReadPersonListResponse")
    @Action(input = "http://soap.project.introsde/People/readPersonListRequest", output = "http://soap.project.introsde/People/readPersonListResponse")
    public List<Person> readPersonList();

    /**
     * 
     * @param measureId
     * @param personId
     * @param measureType
     * @return
     *     returns introsde.project.soap.Measure
     */
    @WebMethod
    @WebResult(name = "measure", targetNamespace = "")
    @RequestWrapper(localName = "readPersonMeasure", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.ReadPersonMeasure")
    @ResponseWrapper(localName = "readPersonMeasureResponse", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.ReadPersonMeasureResponse")
    @Action(input = "http://soap.project.introsde/People/readPersonMeasureRequest", output = "http://soap.project.introsde/People/readPersonMeasureResponse")
    public Measure readPersonMeasure(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "measureType", targetNamespace = "")
        String measureType,
        @WebParam(name = "measureId", targetNamespace = "")
        int measureId);

    /**
     * 
     * @param measure
     * @param personId
     * @return
     *     returns introsde.project.soap.Measure
     */
    @WebMethod
    @WebResult(name = "newMeasure", targetNamespace = "")
    @RequestWrapper(localName = "createPersonMeasure", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.CreatePersonMeasure")
    @ResponseWrapper(localName = "createPersonMeasureResponse", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.CreatePersonMeasureResponse")
    @Action(input = "http://soap.project.introsde/People/createPersonMeasureRequest", output = "http://soap.project.introsde/People/createPersonMeasureResponse")
    public Measure createPersonMeasure(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "measure", targetNamespace = "")
        Measure measure);

    /**
     * 
     * @param measure
     * @param personId
     * @return
     *     returns introsde.project.soap.Measure
     */
    @WebMethod
    @WebResult(name = "updatedMeasure", targetNamespace = "")
    @RequestWrapper(localName = "updatePersonMeasure", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.UpdatePersonMeasure")
    @ResponseWrapper(localName = "updatePersonMeasureResponse", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.UpdatePersonMeasureResponse")
    @Action(input = "http://soap.project.introsde/People/updatePersonMeasureRequest", output = "http://soap.project.introsde/People/updatePersonMeasureResponse")
    public Measure updatePersonMeasure(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "measure", targetNamespace = "")
        Measure measure);

    /**
     * 
     * @param personId
     * @return
     *     returns java.util.List<introsde.project.soap.Goal>
     */
    @WebMethod
    @WebResult(name = "personGoals", targetNamespace = "")
    @RequestWrapper(localName = "readPersonGoals", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.ReadPersonGoals")
    @ResponseWrapper(localName = "readPersonGoalsResponse", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.ReadPersonGoalsResponse")
    @Action(input = "http://soap.project.introsde/People/readPersonGoalsRequest", output = "http://soap.project.introsde/People/readPersonGoalsResponse")
    public List<Goal> readPersonGoals(
        @WebParam(name = "personId", targetNamespace = "")
        int personId);

    /**
     * 
     * @param goal
     * @param personId
     * @return
     *     returns introsde.project.soap.Goal
     */
    @WebMethod
    @WebResult(name = "newGoal", targetNamespace = "")
    @RequestWrapper(localName = "createPersonGoal", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.CreatePersonGoal")
    @ResponseWrapper(localName = "createPersonGoalResponse", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.CreatePersonGoalResponse")
    @Action(input = "http://soap.project.introsde/People/createPersonGoalRequest", output = "http://soap.project.introsde/People/createPersonGoalResponse")
    public Goal createPersonGoal(
        @WebParam(name = "goal", targetNamespace = "")
        Goal goal,
        @WebParam(name = "personId", targetNamespace = "")
        int personId);

    /**
     * 
     * @param goal
     * @param personId
     * @return
     *     returns introsde.project.soap.Goal
     */
    @WebMethod
    @WebResult(name = "updatedGoal", targetNamespace = "")
    @RequestWrapper(localName = "updatePersonGoal", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.UpdatePersonGoal")
    @ResponseWrapper(localName = "updatePersonGoalResponse", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.UpdatePersonGoalResponse")
    @Action(input = "http://soap.project.introsde/People/updatePersonGoalRequest", output = "http://soap.project.introsde/People/updatePersonGoalResponse")
    public Goal updatePersonGoal(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "goal", targetNamespace = "")
        Goal goal);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(name = "goaltypes", targetNamespace = "")
    @RequestWrapper(localName = "readGoalTypes", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.ReadGoalTypes")
    @ResponseWrapper(localName = "readGoalTypesResponse", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.ReadGoalTypesResponse")
    @Action(input = "http://soap.project.introsde/People/readGoalTypesRequest", output = "http://soap.project.introsde/People/readGoalTypesResponse")
    public List<String> readGoalTypes();

    /**
     * 
     * @param personId
     * @param measureType
     * @return
     *     returns java.util.List<introsde.project.soap.Goal>
     */
    @WebMethod
    @WebResult(name = "personMeasureGoals", targetNamespace = "")
    @RequestWrapper(localName = "readPersonGoalsByMeasure", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.ReadPersonGoalsByMeasure")
    @ResponseWrapper(localName = "readPersonGoalsByMeasureResponse", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.ReadPersonGoalsByMeasureResponse")
    @Action(input = "http://soap.project.introsde/People/readPersonGoalsByMeasureRequest", output = "http://soap.project.introsde/People/readPersonGoalsByMeasureResponse")
    public List<Goal> readPersonGoalsByMeasure(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "measureType", targetNamespace = "")
        String measureType);

    /**
     * 
     * @param personId
     * @return
     *     returns java.util.List<introsde.project.soap.Timeline>
     */
    @WebMethod
    @WebResult(name = "personTimelines", targetNamespace = "")
    @RequestWrapper(localName = "readPersonTimelines", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.ReadPersonTimelines")
    @ResponseWrapper(localName = "readPersonTimelinesResponse", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.ReadPersonTimelinesResponse")
    @Action(input = "http://soap.project.introsde/People/readPersonTimelinesRequest", output = "http://soap.project.introsde/People/readPersonTimelinesResponse")
    public List<Timeline> readPersonTimelines(
        @WebParam(name = "personId", targetNamespace = "")
        int personId);

    /**
     * 
     * @param timeline
     * @param personId
     * @return
     *     returns introsde.project.soap.Timeline
     */
    @WebMethod
    @WebResult(name = "newTimeline", targetNamespace = "")
    @RequestWrapper(localName = "createPersonTimeline", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.CreatePersonTimeline")
    @ResponseWrapper(localName = "createPersonTimelineResponse", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.CreatePersonTimelineResponse")
    @Action(input = "http://soap.project.introsde/People/createPersonTimelineRequest", output = "http://soap.project.introsde/People/createPersonTimelineResponse")
    public Timeline createPersonTimeline(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "timeline", targetNamespace = "")
        Timeline timeline);

    /**
     * 
     * @param timelineId
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "deletedTimeline", targetNamespace = "")
    @RequestWrapper(localName = "removeTimeline", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.RemoveTimeline")
    @ResponseWrapper(localName = "removeTimelineResponse", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.RemoveTimelineResponse")
    @Action(input = "http://soap.project.introsde/People/removeTimelineRequest", output = "http://soap.project.introsde/People/removeTimelineResponse")
    public boolean removeTimeline(
        @WebParam(name = "timelineId", targetNamespace = "")
        int timelineId);

    /**
     * 
     * @param measureId
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "deletedMeasure", targetNamespace = "")
    @RequestWrapper(localName = "removeMeasure", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.RemoveMeasure")
    @ResponseWrapper(localName = "removeMeasureResponse", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.RemoveMeasureResponse")
    @Action(input = "http://soap.project.introsde/People/removeMeasureRequest", output = "http://soap.project.introsde/People/removeMeasureResponse")
    public boolean removeMeasure(
        @WebParam(name = "measureId", targetNamespace = "")
        int measureId);

    /**
     * 
     * @param goalId
     * @param personId
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "deletedGoal", targetNamespace = "")
    @RequestWrapper(localName = "removeGoal", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.RemoveGoal")
    @ResponseWrapper(localName = "removeGoalResponse", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.RemoveGoalResponse")
    @Action(input = "http://soap.project.introsde/People/removeGoalRequest", output = "http://soap.project.introsde/People/removeGoalResponse")
    public boolean removeGoal(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "goalId", targetNamespace = "")
        int goalId);

    /**
     * 
     * @param goalId
     * @param personId
     * @return
     *     returns introsde.project.soap.Goal
     */
    @WebMethod
    @WebResult(name = "singleGoal", targetNamespace = "")
    @RequestWrapper(localName = "readSingleGoal", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.ReadSingleGoal")
    @ResponseWrapper(localName = "readSingleGoalResponse", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.ReadSingleGoalResponse")
    @Action(input = "http://soap.project.introsde/People/readSingleGoalRequest", output = "http://soap.project.introsde/People/readSingleGoalResponse")
    public Goal readSingleGoal(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "goalId", targetNamespace = "")
        int goalId);

    /**
     * 
     * @param timelineId
     * @param personId
     * @return
     *     returns introsde.project.soap.Timeline
     */
    @WebMethod
    @WebResult(name = "singleTimeline", targetNamespace = "")
    @RequestWrapper(localName = "readSingleTimeline", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.ReadSingleTimeline")
    @ResponseWrapper(localName = "readSingleTimelineResponse", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.ReadSingleTimelineResponse")
    @Action(input = "http://soap.project.introsde/People/readSingleTimelineRequest", output = "http://soap.project.introsde/People/readSingleTimelineResponse")
    public Timeline readSingleTimeline(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "timelineId", targetNamespace = "")
        int timelineId);

    /**
     * 
     * @param person
     * @return
     *     returns introsde.project.soap.Person
     */
    @WebMethod
    @WebResult(name = "newPerson", targetNamespace = "")
    @RequestWrapper(localName = "createPerson", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.CreatePerson")
    @ResponseWrapper(localName = "createPersonResponse", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.CreatePersonResponse")
    @Action(input = "http://soap.project.introsde/People/createPersonRequest", output = "http://soap.project.introsde/People/createPersonResponse")
    public Person createPerson(
        @WebParam(name = "person", targetNamespace = "")
        Person person);

    /**
     * 
     * @param person
     * @return
     *     returns introsde.project.soap.Person
     */
    @WebMethod
    @WebResult(name = "updatedPerson", targetNamespace = "")
    @RequestWrapper(localName = "updatePerson", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.UpdatePerson")
    @ResponseWrapper(localName = "updatePersonResponse", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.UpdatePersonResponse")
    @Action(input = "http://soap.project.introsde/People/updatePersonRequest", output = "http://soap.project.introsde/People/updatePersonResponse")
    public Person updatePerson(
        @WebParam(name = "person", targetNamespace = "")
        Person person);

    /**
     * 
     * @param personId
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "deletedValue", targetNamespace = "")
    @RequestWrapper(localName = "deletePerson", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.DeletePerson")
    @ResponseWrapper(localName = "deletePersonResponse", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.DeletePersonResponse")
    @Action(input = "http://soap.project.introsde/People/deletePersonRequest", output = "http://soap.project.introsde/People/deletePersonResponse")
    public boolean deletePerson(
        @WebParam(name = "personId", targetNamespace = "")
        int personId);

    /**
     * 
     * @param personId
     * @param measureType
     * @return
     *     returns java.util.List<introsde.project.soap.Measure>
     */
    @WebMethod
    @WebResult(name = "measurehistory", targetNamespace = "")
    @RequestWrapper(localName = "readPersonMeasureHistory", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.ReadPersonMeasureHistory")
    @ResponseWrapper(localName = "readPersonMeasureHistoryResponse", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.ReadPersonMeasureHistoryResponse")
    @Action(input = "http://soap.project.introsde/People/readPersonMeasureHistoryRequest", output = "http://soap.project.introsde/People/readPersonMeasureHistoryResponse")
    public List<Measure> readPersonMeasureHistory(
        @WebParam(name = "personId", targetNamespace = "")
        int personId,
        @WebParam(name = "measureType", targetNamespace = "")
        String measureType);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(name = "measuretypes", targetNamespace = "")
    @RequestWrapper(localName = "readMeasureTypes", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.ReadMeasureTypes")
    @ResponseWrapper(localName = "readMeasureTypesResponse", targetNamespace = "http://soap.project.introsde/", className = "introsde.project.soap.ReadMeasureTypesResponse")
    @Action(input = "http://soap.project.introsde/People/readMeasureTypesRequest", output = "http://soap.project.introsde/People/readMeasureTypesResponse")
    public List<String> readMeasureTypes();

}
