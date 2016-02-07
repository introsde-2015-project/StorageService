
package introsde.project.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the introsde.project.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RemoveGoalResponse_QNAME = new QName("http://soap.project.introsde/", "removeGoalResponse");
    private final static QName _RemoveMeasureResponse_QNAME = new QName("http://soap.project.introsde/", "removeMeasureResponse");
    private final static QName _ReadPersonGoals_QNAME = new QName("http://soap.project.introsde/", "readPersonGoals");
    private final static QName _RemoveGoal_QNAME = new QName("http://soap.project.introsde/", "removeGoal");
    private final static QName _ReadMeasureTypesResponse_QNAME = new QName("http://soap.project.introsde/", "readMeasureTypesResponse");
    private final static QName _CreatePersonGoalResponse_QNAME = new QName("http://soap.project.introsde/", "createPersonGoalResponse");
    private final static QName _ReadPersonGoalsByMeasure_QNAME = new QName("http://soap.project.introsde/", "readPersonGoalsByMeasure");
    private final static QName _RemoveTimeline_QNAME = new QName("http://soap.project.introsde/", "removeTimeline");
    private final static QName _RemoveTimelineResponse_QNAME = new QName("http://soap.project.introsde/", "removeTimelineResponse");
    private final static QName _ReadPersonTimelines_QNAME = new QName("http://soap.project.introsde/", "readPersonTimelines");
    private final static QName _ReadGoalTypesResponse_QNAME = new QName("http://soap.project.introsde/", "readGoalTypesResponse");
    private final static QName _ReadPersonListResponse_QNAME = new QName("http://soap.project.introsde/", "readPersonListResponse");
    private final static QName _DeletePersonResponse_QNAME = new QName("http://soap.project.introsde/", "deletePersonResponse");
    private final static QName _ReadPersonMeasureHistory_QNAME = new QName("http://soap.project.introsde/", "readPersonMeasureHistory");
    private final static QName _UpdatePersonMeasureResponse_QNAME = new QName("http://soap.project.introsde/", "updatePersonMeasureResponse");
    private final static QName _ReadPersonList_QNAME = new QName("http://soap.project.introsde/", "readPersonList");
    private final static QName _RemoveMeasure_QNAME = new QName("http://soap.project.introsde/", "removeMeasure");
    private final static QName _CreatePersonGoal_QNAME = new QName("http://soap.project.introsde/", "createPersonGoal");
    private final static QName _UpdatePersonGoal_QNAME = new QName("http://soap.project.introsde/", "updatePersonGoal");
    private final static QName _ReadSingleTimeline_QNAME = new QName("http://soap.project.introsde/", "readSingleTimeline");
    private final static QName _DeletePerson_QNAME = new QName("http://soap.project.introsde/", "deletePerson");
    private final static QName _CreatePersonResponse_QNAME = new QName("http://soap.project.introsde/", "createPersonResponse");
    private final static QName _UpdatePersonGoalResponse_QNAME = new QName("http://soap.project.introsde/", "updatePersonGoalResponse");
    private final static QName _ReadSingleTimelineResponse_QNAME = new QName("http://soap.project.introsde/", "readSingleTimelineResponse");
    private final static QName _CreatePersonTimeline_QNAME = new QName("http://soap.project.introsde/", "createPersonTimeline");
    private final static QName _CreatePerson_QNAME = new QName("http://soap.project.introsde/", "createPerson");
    private final static QName _ReadPersonGoalsByMeasureResponse_QNAME = new QName("http://soap.project.introsde/", "readPersonGoalsByMeasureResponse");
    private final static QName _ReadSingleGoal_QNAME = new QName("http://soap.project.introsde/", "readSingleGoal");
    private final static QName _CreatePersonTimelineResponse_QNAME = new QName("http://soap.project.introsde/", "createPersonTimelineResponse");
    private final static QName _ReadMeasureTypes_QNAME = new QName("http://soap.project.introsde/", "readMeasureTypes");
    private final static QName _ReadPersonGoalsResponse_QNAME = new QName("http://soap.project.introsde/", "readPersonGoalsResponse");
    private final static QName _CreatePersonMeasureResponse_QNAME = new QName("http://soap.project.introsde/", "createPersonMeasureResponse");
    private final static QName _CreatePersonMeasure_QNAME = new QName("http://soap.project.introsde/", "createPersonMeasure");
    private final static QName _UpdatePersonMeasure_QNAME = new QName("http://soap.project.introsde/", "updatePersonMeasure");
    private final static QName _UpdatePersonResponse_QNAME = new QName("http://soap.project.introsde/", "updatePersonResponse");
    private final static QName _ReadPersonResponse_QNAME = new QName("http://soap.project.introsde/", "readPersonResponse");
    private final static QName _ReadGoalTypes_QNAME = new QName("http://soap.project.introsde/", "readGoalTypes");
    private final static QName _ReadPersonMeasureHistoryResponse_QNAME = new QName("http://soap.project.introsde/", "readPersonMeasureHistoryResponse");
    private final static QName _ReadPerson_QNAME = new QName("http://soap.project.introsde/", "readPerson");
    private final static QName _ReadPersonTimelinesResponse_QNAME = new QName("http://soap.project.introsde/", "readPersonTimelinesResponse");
    private final static QName _ReadSingleGoalResponse_QNAME = new QName("http://soap.project.introsde/", "readSingleGoalResponse");
    private final static QName _ReadPersonMeasure_QNAME = new QName("http://soap.project.introsde/", "readPersonMeasure");
    private final static QName _ReadPersonMeasureResponse_QNAME = new QName("http://soap.project.introsde/", "readPersonMeasureResponse");
    private final static QName _UpdatePerson_QNAME = new QName("http://soap.project.introsde/", "updatePerson");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde.project.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RemoveGoalResponse }
     * 
     */
    public RemoveGoalResponse createRemoveGoalResponse() {
        return new RemoveGoalResponse();
    }

    /**
     * Create an instance of {@link RemoveMeasureResponse }
     * 
     */
    public RemoveMeasureResponse createRemoveMeasureResponse() {
        return new RemoveMeasureResponse();
    }

    /**
     * Create an instance of {@link ReadPersonGoals }
     * 
     */
    public ReadPersonGoals createReadPersonGoals() {
        return new ReadPersonGoals();
    }

    /**
     * Create an instance of {@link RemoveGoal }
     * 
     */
    public RemoveGoal createRemoveGoal() {
        return new RemoveGoal();
    }

    /**
     * Create an instance of {@link ReadMeasureTypesResponse }
     * 
     */
    public ReadMeasureTypesResponse createReadMeasureTypesResponse() {
        return new ReadMeasureTypesResponse();
    }

    /**
     * Create an instance of {@link CreatePersonGoalResponse }
     * 
     */
    public CreatePersonGoalResponse createCreatePersonGoalResponse() {
        return new CreatePersonGoalResponse();
    }

    /**
     * Create an instance of {@link ReadPersonGoalsByMeasure }
     * 
     */
    public ReadPersonGoalsByMeasure createReadPersonGoalsByMeasure() {
        return new ReadPersonGoalsByMeasure();
    }

    /**
     * Create an instance of {@link RemoveTimeline }
     * 
     */
    public RemoveTimeline createRemoveTimeline() {
        return new RemoveTimeline();
    }

    /**
     * Create an instance of {@link RemoveTimelineResponse }
     * 
     */
    public RemoveTimelineResponse createRemoveTimelineResponse() {
        return new RemoveTimelineResponse();
    }

    /**
     * Create an instance of {@link ReadPersonTimelines }
     * 
     */
    public ReadPersonTimelines createReadPersonTimelines() {
        return new ReadPersonTimelines();
    }

    /**
     * Create an instance of {@link ReadGoalTypesResponse }
     * 
     */
    public ReadGoalTypesResponse createReadGoalTypesResponse() {
        return new ReadGoalTypesResponse();
    }

    /**
     * Create an instance of {@link ReadPersonListResponse }
     * 
     */
    public ReadPersonListResponse createReadPersonListResponse() {
        return new ReadPersonListResponse();
    }

    /**
     * Create an instance of {@link DeletePersonResponse }
     * 
     */
    public DeletePersonResponse createDeletePersonResponse() {
        return new DeletePersonResponse();
    }

    /**
     * Create an instance of {@link ReadPersonMeasureHistory }
     * 
     */
    public ReadPersonMeasureHistory createReadPersonMeasureHistory() {
        return new ReadPersonMeasureHistory();
    }

    /**
     * Create an instance of {@link UpdatePersonMeasureResponse }
     * 
     */
    public UpdatePersonMeasureResponse createUpdatePersonMeasureResponse() {
        return new UpdatePersonMeasureResponse();
    }

    /**
     * Create an instance of {@link ReadPersonList }
     * 
     */
    public ReadPersonList createReadPersonList() {
        return new ReadPersonList();
    }

    /**
     * Create an instance of {@link RemoveMeasure }
     * 
     */
    public RemoveMeasure createRemoveMeasure() {
        return new RemoveMeasure();
    }

    /**
     * Create an instance of {@link CreatePersonGoal }
     * 
     */
    public CreatePersonGoal createCreatePersonGoal() {
        return new CreatePersonGoal();
    }

    /**
     * Create an instance of {@link UpdatePersonGoal }
     * 
     */
    public UpdatePersonGoal createUpdatePersonGoal() {
        return new UpdatePersonGoal();
    }

    /**
     * Create an instance of {@link ReadSingleTimeline }
     * 
     */
    public ReadSingleTimeline createReadSingleTimeline() {
        return new ReadSingleTimeline();
    }

    /**
     * Create an instance of {@link DeletePerson }
     * 
     */
    public DeletePerson createDeletePerson() {
        return new DeletePerson();
    }

    /**
     * Create an instance of {@link CreatePersonResponse }
     * 
     */
    public CreatePersonResponse createCreatePersonResponse() {
        return new CreatePersonResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonGoalResponse }
     * 
     */
    public UpdatePersonGoalResponse createUpdatePersonGoalResponse() {
        return new UpdatePersonGoalResponse();
    }

    /**
     * Create an instance of {@link ReadSingleTimelineResponse }
     * 
     */
    public ReadSingleTimelineResponse createReadSingleTimelineResponse() {
        return new ReadSingleTimelineResponse();
    }

    /**
     * Create an instance of {@link CreatePersonTimeline }
     * 
     */
    public CreatePersonTimeline createCreatePersonTimeline() {
        return new CreatePersonTimeline();
    }

    /**
     * Create an instance of {@link CreatePerson }
     * 
     */
    public CreatePerson createCreatePerson() {
        return new CreatePerson();
    }

    /**
     * Create an instance of {@link ReadPersonGoalsByMeasureResponse }
     * 
     */
    public ReadPersonGoalsByMeasureResponse createReadPersonGoalsByMeasureResponse() {
        return new ReadPersonGoalsByMeasureResponse();
    }

    /**
     * Create an instance of {@link ReadSingleGoal }
     * 
     */
    public ReadSingleGoal createReadSingleGoal() {
        return new ReadSingleGoal();
    }

    /**
     * Create an instance of {@link CreatePersonTimelineResponse }
     * 
     */
    public CreatePersonTimelineResponse createCreatePersonTimelineResponse() {
        return new CreatePersonTimelineResponse();
    }

    /**
     * Create an instance of {@link ReadMeasureTypes }
     * 
     */
    public ReadMeasureTypes createReadMeasureTypes() {
        return new ReadMeasureTypes();
    }

    /**
     * Create an instance of {@link ReadPersonGoalsResponse }
     * 
     */
    public ReadPersonGoalsResponse createReadPersonGoalsResponse() {
        return new ReadPersonGoalsResponse();
    }

    /**
     * Create an instance of {@link CreatePersonMeasureResponse }
     * 
     */
    public CreatePersonMeasureResponse createCreatePersonMeasureResponse() {
        return new CreatePersonMeasureResponse();
    }

    /**
     * Create an instance of {@link CreatePersonMeasure }
     * 
     */
    public CreatePersonMeasure createCreatePersonMeasure() {
        return new CreatePersonMeasure();
    }

    /**
     * Create an instance of {@link UpdatePersonMeasure }
     * 
     */
    public UpdatePersonMeasure createUpdatePersonMeasure() {
        return new UpdatePersonMeasure();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link ReadPersonResponse }
     * 
     */
    public ReadPersonResponse createReadPersonResponse() {
        return new ReadPersonResponse();
    }

    /**
     * Create an instance of {@link ReadGoalTypes }
     * 
     */
    public ReadGoalTypes createReadGoalTypes() {
        return new ReadGoalTypes();
    }

    /**
     * Create an instance of {@link ReadPersonMeasureHistoryResponse }
     * 
     */
    public ReadPersonMeasureHistoryResponse createReadPersonMeasureHistoryResponse() {
        return new ReadPersonMeasureHistoryResponse();
    }

    /**
     * Create an instance of {@link ReadPerson }
     * 
     */
    public ReadPerson createReadPerson() {
        return new ReadPerson();
    }

    /**
     * Create an instance of {@link ReadPersonTimelinesResponse }
     * 
     */
    public ReadPersonTimelinesResponse createReadPersonTimelinesResponse() {
        return new ReadPersonTimelinesResponse();
    }

    /**
     * Create an instance of {@link ReadSingleGoalResponse }
     * 
     */
    public ReadSingleGoalResponse createReadSingleGoalResponse() {
        return new ReadSingleGoalResponse();
    }

    /**
     * Create an instance of {@link ReadPersonMeasure }
     * 
     */
    public ReadPersonMeasure createReadPersonMeasure() {
        return new ReadPersonMeasure();
    }

    /**
     * Create an instance of {@link ReadPersonMeasureResponse }
     * 
     */
    public ReadPersonMeasureResponse createReadPersonMeasureResponse() {
        return new ReadPersonMeasureResponse();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     * 
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link Goal }
     * 
     */
    public Goal createGoal() {
        return new Goal();
    }

    /**
     * Create an instance of {@link Measure }
     * 
     */
    public Measure createMeasure() {
        return new Measure();
    }

    /**
     * Create an instance of {@link HealthProfile }
     * 
     */
    public HealthProfile createHealthProfile() {
        return new HealthProfile();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link Timeline }
     * 
     */
    public Timeline createTimeline() {
        return new Timeline();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "removeGoalResponse")
    public JAXBElement<RemoveGoalResponse> createRemoveGoalResponse(RemoveGoalResponse value) {
        return new JAXBElement<RemoveGoalResponse>(_RemoveGoalResponse_QNAME, RemoveGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "removeMeasureResponse")
    public JAXBElement<RemoveMeasureResponse> createRemoveMeasureResponse(RemoveMeasureResponse value) {
        return new JAXBElement<RemoveMeasureResponse>(_RemoveMeasureResponse_QNAME, RemoveMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonGoals }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "readPersonGoals")
    public JAXBElement<ReadPersonGoals> createReadPersonGoals(ReadPersonGoals value) {
        return new JAXBElement<ReadPersonGoals>(_ReadPersonGoals_QNAME, ReadPersonGoals.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "removeGoal")
    public JAXBElement<RemoveGoal> createRemoveGoal(RemoveGoal value) {
        return new JAXBElement<RemoveGoal>(_RemoveGoal_QNAME, RemoveGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "readMeasureTypesResponse")
    public JAXBElement<ReadMeasureTypesResponse> createReadMeasureTypesResponse(ReadMeasureTypesResponse value) {
        return new JAXBElement<ReadMeasureTypesResponse>(_ReadMeasureTypesResponse_QNAME, ReadMeasureTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "createPersonGoalResponse")
    public JAXBElement<CreatePersonGoalResponse> createCreatePersonGoalResponse(CreatePersonGoalResponse value) {
        return new JAXBElement<CreatePersonGoalResponse>(_CreatePersonGoalResponse_QNAME, CreatePersonGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonGoalsByMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "readPersonGoalsByMeasure")
    public JAXBElement<ReadPersonGoalsByMeasure> createReadPersonGoalsByMeasure(ReadPersonGoalsByMeasure value) {
        return new JAXBElement<ReadPersonGoalsByMeasure>(_ReadPersonGoalsByMeasure_QNAME, ReadPersonGoalsByMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveTimeline }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "removeTimeline")
    public JAXBElement<RemoveTimeline> createRemoveTimeline(RemoveTimeline value) {
        return new JAXBElement<RemoveTimeline>(_RemoveTimeline_QNAME, RemoveTimeline.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveTimelineResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "removeTimelineResponse")
    public JAXBElement<RemoveTimelineResponse> createRemoveTimelineResponse(RemoveTimelineResponse value) {
        return new JAXBElement<RemoveTimelineResponse>(_RemoveTimelineResponse_QNAME, RemoveTimelineResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonTimelines }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "readPersonTimelines")
    public JAXBElement<ReadPersonTimelines> createReadPersonTimelines(ReadPersonTimelines value) {
        return new JAXBElement<ReadPersonTimelines>(_ReadPersonTimelines_QNAME, ReadPersonTimelines.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadGoalTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "readGoalTypesResponse")
    public JAXBElement<ReadGoalTypesResponse> createReadGoalTypesResponse(ReadGoalTypesResponse value) {
        return new JAXBElement<ReadGoalTypesResponse>(_ReadGoalTypesResponse_QNAME, ReadGoalTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "readPersonListResponse")
    public JAXBElement<ReadPersonListResponse> createReadPersonListResponse(ReadPersonListResponse value) {
        return new JAXBElement<ReadPersonListResponse>(_ReadPersonListResponse_QNAME, ReadPersonListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "deletePersonResponse")
    public JAXBElement<DeletePersonResponse> createDeletePersonResponse(DeletePersonResponse value) {
        return new JAXBElement<DeletePersonResponse>(_DeletePersonResponse_QNAME, DeletePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonMeasureHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "readPersonMeasureHistory")
    public JAXBElement<ReadPersonMeasureHistory> createReadPersonMeasureHistory(ReadPersonMeasureHistory value) {
        return new JAXBElement<ReadPersonMeasureHistory>(_ReadPersonMeasureHistory_QNAME, ReadPersonMeasureHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "updatePersonMeasureResponse")
    public JAXBElement<UpdatePersonMeasureResponse> createUpdatePersonMeasureResponse(UpdatePersonMeasureResponse value) {
        return new JAXBElement<UpdatePersonMeasureResponse>(_UpdatePersonMeasureResponse_QNAME, UpdatePersonMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "readPersonList")
    public JAXBElement<ReadPersonList> createReadPersonList(ReadPersonList value) {
        return new JAXBElement<ReadPersonList>(_ReadPersonList_QNAME, ReadPersonList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "removeMeasure")
    public JAXBElement<RemoveMeasure> createRemoveMeasure(RemoveMeasure value) {
        return new JAXBElement<RemoveMeasure>(_RemoveMeasure_QNAME, RemoveMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "createPersonGoal")
    public JAXBElement<CreatePersonGoal> createCreatePersonGoal(CreatePersonGoal value) {
        return new JAXBElement<CreatePersonGoal>(_CreatePersonGoal_QNAME, CreatePersonGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "updatePersonGoal")
    public JAXBElement<UpdatePersonGoal> createUpdatePersonGoal(UpdatePersonGoal value) {
        return new JAXBElement<UpdatePersonGoal>(_UpdatePersonGoal_QNAME, UpdatePersonGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadSingleTimeline }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "readSingleTimeline")
    public JAXBElement<ReadSingleTimeline> createReadSingleTimeline(ReadSingleTimeline value) {
        return new JAXBElement<ReadSingleTimeline>(_ReadSingleTimeline_QNAME, ReadSingleTimeline.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "deletePerson")
    public JAXBElement<DeletePerson> createDeletePerson(DeletePerson value) {
        return new JAXBElement<DeletePerson>(_DeletePerson_QNAME, DeletePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "createPersonResponse")
    public JAXBElement<CreatePersonResponse> createCreatePersonResponse(CreatePersonResponse value) {
        return new JAXBElement<CreatePersonResponse>(_CreatePersonResponse_QNAME, CreatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "updatePersonGoalResponse")
    public JAXBElement<UpdatePersonGoalResponse> createUpdatePersonGoalResponse(UpdatePersonGoalResponse value) {
        return new JAXBElement<UpdatePersonGoalResponse>(_UpdatePersonGoalResponse_QNAME, UpdatePersonGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadSingleTimelineResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "readSingleTimelineResponse")
    public JAXBElement<ReadSingleTimelineResponse> createReadSingleTimelineResponse(ReadSingleTimelineResponse value) {
        return new JAXBElement<ReadSingleTimelineResponse>(_ReadSingleTimelineResponse_QNAME, ReadSingleTimelineResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonTimeline }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "createPersonTimeline")
    public JAXBElement<CreatePersonTimeline> createCreatePersonTimeline(CreatePersonTimeline value) {
        return new JAXBElement<CreatePersonTimeline>(_CreatePersonTimeline_QNAME, CreatePersonTimeline.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "createPerson")
    public JAXBElement<CreatePerson> createCreatePerson(CreatePerson value) {
        return new JAXBElement<CreatePerson>(_CreatePerson_QNAME, CreatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonGoalsByMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "readPersonGoalsByMeasureResponse")
    public JAXBElement<ReadPersonGoalsByMeasureResponse> createReadPersonGoalsByMeasureResponse(ReadPersonGoalsByMeasureResponse value) {
        return new JAXBElement<ReadPersonGoalsByMeasureResponse>(_ReadPersonGoalsByMeasureResponse_QNAME, ReadPersonGoalsByMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadSingleGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "readSingleGoal")
    public JAXBElement<ReadSingleGoal> createReadSingleGoal(ReadSingleGoal value) {
        return new JAXBElement<ReadSingleGoal>(_ReadSingleGoal_QNAME, ReadSingleGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonTimelineResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "createPersonTimelineResponse")
    public JAXBElement<CreatePersonTimelineResponse> createCreatePersonTimelineResponse(CreatePersonTimelineResponse value) {
        return new JAXBElement<CreatePersonTimelineResponse>(_CreatePersonTimelineResponse_QNAME, CreatePersonTimelineResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "readMeasureTypes")
    public JAXBElement<ReadMeasureTypes> createReadMeasureTypes(ReadMeasureTypes value) {
        return new JAXBElement<ReadMeasureTypes>(_ReadMeasureTypes_QNAME, ReadMeasureTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonGoalsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "readPersonGoalsResponse")
    public JAXBElement<ReadPersonGoalsResponse> createReadPersonGoalsResponse(ReadPersonGoalsResponse value) {
        return new JAXBElement<ReadPersonGoalsResponse>(_ReadPersonGoalsResponse_QNAME, ReadPersonGoalsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "createPersonMeasureResponse")
    public JAXBElement<CreatePersonMeasureResponse> createCreatePersonMeasureResponse(CreatePersonMeasureResponse value) {
        return new JAXBElement<CreatePersonMeasureResponse>(_CreatePersonMeasureResponse_QNAME, CreatePersonMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "createPersonMeasure")
    public JAXBElement<CreatePersonMeasure> createCreatePersonMeasure(CreatePersonMeasure value) {
        return new JAXBElement<CreatePersonMeasure>(_CreatePersonMeasure_QNAME, CreatePersonMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "updatePersonMeasure")
    public JAXBElement<UpdatePersonMeasure> createUpdatePersonMeasure(UpdatePersonMeasure value) {
        return new JAXBElement<UpdatePersonMeasure>(_UpdatePersonMeasure_QNAME, UpdatePersonMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<UpdatePersonResponse>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "readPersonResponse")
    public JAXBElement<ReadPersonResponse> createReadPersonResponse(ReadPersonResponse value) {
        return new JAXBElement<ReadPersonResponse>(_ReadPersonResponse_QNAME, ReadPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadGoalTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "readGoalTypes")
    public JAXBElement<ReadGoalTypes> createReadGoalTypes(ReadGoalTypes value) {
        return new JAXBElement<ReadGoalTypes>(_ReadGoalTypes_QNAME, ReadGoalTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonMeasureHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "readPersonMeasureHistoryResponse")
    public JAXBElement<ReadPersonMeasureHistoryResponse> createReadPersonMeasureHistoryResponse(ReadPersonMeasureHistoryResponse value) {
        return new JAXBElement<ReadPersonMeasureHistoryResponse>(_ReadPersonMeasureHistoryResponse_QNAME, ReadPersonMeasureHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "readPerson")
    public JAXBElement<ReadPerson> createReadPerson(ReadPerson value) {
        return new JAXBElement<ReadPerson>(_ReadPerson_QNAME, ReadPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonTimelinesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "readPersonTimelinesResponse")
    public JAXBElement<ReadPersonTimelinesResponse> createReadPersonTimelinesResponse(ReadPersonTimelinesResponse value) {
        return new JAXBElement<ReadPersonTimelinesResponse>(_ReadPersonTimelinesResponse_QNAME, ReadPersonTimelinesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadSingleGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "readSingleGoalResponse")
    public JAXBElement<ReadSingleGoalResponse> createReadSingleGoalResponse(ReadSingleGoalResponse value) {
        return new JAXBElement<ReadSingleGoalResponse>(_ReadSingleGoalResponse_QNAME, ReadSingleGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "readPersonMeasure")
    public JAXBElement<ReadPersonMeasure> createReadPersonMeasure(ReadPersonMeasure value) {
        return new JAXBElement<ReadPersonMeasure>(_ReadPersonMeasure_QNAME, ReadPersonMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "readPersonMeasureResponse")
    public JAXBElement<ReadPersonMeasureResponse> createReadPersonMeasureResponse(ReadPersonMeasureResponse value) {
        return new JAXBElement<ReadPersonMeasureResponse>(_ReadPersonMeasureResponse_QNAME, ReadPersonMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.project.introsde/", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<UpdatePerson>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

}
