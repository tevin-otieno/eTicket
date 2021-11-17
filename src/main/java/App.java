import dao.Sql2oEventDao;
import models.DB;
import models.Event;
import org.sql2o.Connection;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {

        Sql2oEventDao eventDao = new Sql2oEventDao(DB.sql2o);
        Connection conn = DB.sql2o.open();

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            List<Event> allEvents = eventDao.getAll();
            model.put("events", allEvents);
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        //form to post Event
        get("/events/new", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "eventform.hbs");
        }, new HandlebarsTemplateEngine());

        //process event form
        post("/events/new", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String title = request.queryParams("title");
            String location = request.queryParams("location");
            int price = Integer.parseInt(request.queryParams("price"));
            String time = request.queryParams("time");
            String host = request.queryParams("host");
            String imageUrl = request.queryParams("imageUrl");
            String description = request.queryParams("description");
            Event event = new Event(title, location, time, price, host,imageUrl,description);
            eventDao.add(event);
            model.put("events", event);

            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());

        // event description
        get("/events/:id", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            int eventId = Integer.parseInt(request.params("id"));
            Event foundEvent = eventDao.findById(eventId);
            model.put("events", foundEvent);
            return new ModelAndView(model, "eventDetails.hbs");
        }, new HandlebarsTemplateEngine());

    }
}
