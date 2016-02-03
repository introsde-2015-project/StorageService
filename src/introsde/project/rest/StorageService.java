package introsde.project.rest;
import introsde.project.soap.*;

import java.io.IOException;
import java.net.URI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

@Path("/")
public class StorageService {
	// For soap
	PeopleService service = new PeopleService();
    People people = service.getPeopleImplPort();
    
    // For rest
    ClientConfig clientConfig = new ClientConfig();
    Client client = ClientBuilder.newClient(clientConfig);
    WebTarget adapterService = client.target(getAdapterURI());
    String acceptType = "application/json";
	
	//Getting the list of person in the LocalDatabase Service
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/persons")
    public List<Person> getPersons() {
        List<Person> persons = people.readPersonList();
        return persons;
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Person newPerson(Person person){           
        return people.createPerson(person);
    }
    
    //Getting the person information in the LocalDatabase Service
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/persons/{personId}")
    public Person getPerson(@PathParam("personId") int idPerson) {
    	Person person = people.readPerson(idPerson);
        return person;
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON )
    @Path("/persons/{personId}")
    public Person putPerson(Person person, @PathParam("personId") int idPerson) {
    	Person existing = people.readPerson(idPerson);
        if (existing == null) {
        	throw new WebApplicationException(Response.Status.NOT_FOUND);
        } else {
        	// Set missing attributes for person
            person.setIdPerson(idPerson);
            if (person.getFirstname() == null) {
            	person.setFirstname(existing.getFirstname());
            }
            if (person.getLastname() == null) {
            	person.setLastname(existing.getLastname());
            }
            if (person.getBirthdate() == null) {
            	person.setBirthdate(existing.getBirthdate());
            }
            if (person.getHealthProfile() == null) {
            	person.setHealthProfile(existing.getHealthProfile());
            }
            people.updatePerson(person);
        }
        return person;
    }

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON )
    @Path("/persons/{personId}")
    public void deletePerson(@PathParam("personId") int idPerson) {
        Person p = people.readPerson(idPerson);
        if (p == null) {
        	throw new WebApplicationException(Response.Status.NOT_FOUND);
        }
        people.deletePerson(p.getIdPerson());
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON )
    @Path("/persons/{personId}/{measureType}")
    public List<Measure> getMeasureHistory(@PathParam("personId") int idPerson, @PathParam("measureType") String measureType) {
    	List<Measure> measureHistory = people.readPersonMeasureHistory(idPerson, measureType);
        if (measureHistory == null) {
        	throw new WebApplicationException(Response.Status.NOT_FOUND);
        }
        return measureHistory;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/persons/{personId}/{measureType}")
    public Measure newMeasure(Measure measure, @PathParam("personId") int idPerson, @PathParam("measureType") String measureType) throws IOException, ParseException {
    	// Link person and healthprofile to measure and add missing attributes
        measure.setMeasureName(measureType);
        if (measure.getCreated() == null) {
        	measure.setCreated(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        }
        return people.createPersonMeasure(idPerson, measure);
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON )
    @Path("/persons/{personId}/{measureType}/{measureId}")
    public Measure getMeasure(@PathParam("personId") int idPerson, @PathParam("measureType") String measureType, @PathParam("measureId") int measureId) {
    	Measure measure = people.readPersonMeasure(idPerson, measureType, measureId);
        if (measure == null) {
        	throw new WebApplicationException(Response.Status.NOT_FOUND);
        }
        return measure;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON )
    @Path("/persons/{personId}/goals")
    public List<Goal> getGoals(@PathParam("personId") int idPerson) {
    	List<Goal> goals = people.readPersonGoals(idPerson);
        if (goals == null) {
        	throw new WebApplicationException(Response.Status.NOT_FOUND);
        }
        return goals;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON )
    @Path("/persons/{personId}/{measureType}/goals")
    public List<Goal> getGoals(@PathParam("personId") int idPerson, @PathParam("measureType") String measureType) {
    	List<Goal> goals = people.readPersonGoalsByMeasure(idPerson, measureType);
        if (goals == null) {
        	throw new WebApplicationException(Response.Status.NOT_FOUND);
        }
        return goals;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/persons/{personId}/goals")
    public Goal newGoal(Goal goal, @PathParam("personId") int idPerson) {
    	// Link person and healthprofile to measure and add missing attributes
        if (goal.getCreated() == null) {
        	goal.setCreated(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        }
        return people.createPersonGoal(idPerson, goal);
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON )
    @Path("/measuretypes")
    public List<String> getMeasureTypes() {
    	List<String> measureTypes = people.readMeasureTypes();
        return measureTypes;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON )
    @Path("/goaltypes")
    public List<String> getGoalTypes() {
    	List<String> goalTypes = people.readGoalTypes();
        return goalTypes;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON )
    @Path("/music/sleep")
    public Response getSleepMusic() {
    	Response result = adapterService.path("/music/sleep").request().accept(acceptType).get();
    	return result;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON )
    @Path("/music/run")
    public Response getRunningMusic() {
    	Response result = adapterService.path("/music/run").request().accept(acceptType).get();
    	return result;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON )
    @Path("/joke")
    public Response getJoke(@QueryParam("firstname") String firstname, @QueryParam("lastname") String lastname) {
    	Response result = adapterService.path("/joke")
    			.queryParam("firstname", firstname)
    			.queryParam("lastname", lastname)
    			.request().accept(acceptType).get();
    	return result;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON )
    @Path("/recipe")
    public Response getRecipe() {
    	Response result = adapterService.path("/recipe").request().accept(acceptType).get();
    	return result;
    }
    
    private static URI getAdapterURI() {
        return UriBuilder.fromUri(
                "http://localhost:5500/").build();
    }
    
    
    
}