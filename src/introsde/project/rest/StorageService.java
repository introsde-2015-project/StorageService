package introsde.project.rest;
import introsde.project.soap.*;

import java.io.IOException;
import java.net.URI;
import java.text.ParseException;
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
        return people.readPersonList();
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/persons")
    public Person newPerson(Person person){           
        return people.createPerson(person);
    }
    
    //Getting the person information in the LocalDatabase Service
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/persons/{personId}")
    public Person getPerson(@PathParam("personId") int idPerson) {
    	return people.readPerson(idPerson);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON )
    @Path("/persons/{personId}")
    public Person updatePerson(Person person, @PathParam("personId") int idPerson) {
    	Person existing = people.readPerson(idPerson);
        if (existing == null) {
        	throw new WebApplicationException(Response.Status.NOT_FOUND);
        } else {
            return people.updatePerson(person, idPerson);
        }
    }

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON )
    @Path("/persons/{personId}")
    public boolean deletePerson(@PathParam("personId") int idPerson) {
        Person p = people.readPerson(idPerson);
        if (p == null) {
        	throw new WebApplicationException(Response.Status.NOT_FOUND);
        }
        return people.deletePerson(p.getIdPerson());
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
        return people.createPersonMeasure(idPerson, measure, measureType);
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
    
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON )
    @Path("/persons/{personId}/{measureType}/{measureId}")
    public boolean deleteMeasure(@PathParam("personId") int idPerson, @PathParam("measureType") String measureType, @PathParam("measureId") int measureId) {
    	Measure measure = people.readPersonMeasure(idPerson, measureType, measureId);
        if (measure == null) {
        	throw new WebApplicationException(Response.Status.NOT_FOUND);
        }
        return people.removeMeasure(idPerson, measureId);
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
    public List<Goal> getGoalsByMeasure(@PathParam("personId") int idPerson, @PathParam("measureType") String measureType) {
    	List<Goal> goals = people.readPersonGoalsByMeasure(idPerson, measureType);
        if (goals == null) {
        	throw new WebApplicationException(Response.Status.NOT_FOUND);
        }
        return goals;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON )
    @Path("/persons/{personId}/goals/{goalId}")
    public Goal getSingleGoal(@PathParam("personId") int idPerson, @PathParam("goalId") int goalId) {
    	Goal goal = people.readSingleGoal(idPerson, goalId);
        if (goal == null) {
        	throw new WebApplicationException(Response.Status.NOT_FOUND);
        }
        return goal;
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON )
    @Path("/persons/{personId}/goals/{goalId}")
    public Goal updateGoal(Goal goal, @PathParam("personId") int idPerson, @PathParam("goalId") int goalId) {
        Goal existing = people.readSingleGoal(idPerson, goalId);
        if (existing == null) {
        	throw new WebApplicationException(Response.Status.NOT_FOUND);
        } else {
            return people.updatePersonGoal(idPerson, goal, goalId);
        }
    }
    
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON )
    @Path("/persons/{personId}/goals/{goalId}")
    public boolean deleteGoal(@PathParam("personId") int idPerson, @PathParam("goalId") int goalId) {
    	Goal goal = people.readSingleGoal(idPerson, goalId);
        if (goal == null) {
        	throw new WebApplicationException(Response.Status.NOT_FOUND);
        }
        return people.removeGoal(idPerson, goalId);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/persons/{personId}/goals")
    public Goal newGoal(Goal goal, @PathParam("personId") int idPerson) {
    	// Link person and healthprofile to measure and add missing attributes
        return people.createPersonGoal(goal, idPerson);
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON )
    @Path("/persons/{personId}/timelines")
    public List<Timeline> getTimelines(@PathParam("personId") int idPerson) {
    	List<Timeline> timelines = people.readPersonTimelines(idPerson);
        if (timelines == null) {
        	throw new WebApplicationException(Response.Status.NOT_FOUND);
        }
        return timelines;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON )
    @Path("/persons/{personId}/timelines/{timelineId}")
    public Timeline getSingleTimeline(@PathParam("personId") int idPerson, @PathParam("timelineId") int timelineId) {
    	Timeline tl = people.readSingleTimeline(idPerson, timelineId);
        if (tl == null) {
        	throw new WebApplicationException(Response.Status.NOT_FOUND);
        }
        return tl;
    }
    
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON )
    @Path("/persons/{personId}/timelines/{timelineId}")
    public boolean deleteTimeline(@PathParam("personId") int idPerson, @PathParam("timelineId") int timelineId) {
    	Timeline tl = people.readSingleTimeline(idPerson, timelineId);
        if (tl == null) {
        	throw new WebApplicationException(Response.Status.NOT_FOUND);
        }
        return people.removeTimeline(idPerson, timelineId);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/persons/{personId}/timelines")
    public Timeline newTimelines(Timeline tl, @PathParam("personId") int idPerson) {
    	// Link person and healthprofile to measure and add missing attributes
        return people.createPersonTimeline(idPerson, tl);
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
                "https://adapter-introsde.herokuapp.com/").build();
    }
    
    
    
}