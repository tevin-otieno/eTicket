import models.Event;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        get("/",(request, response) -> {
            Map<String,Object> model=new HashMap<String, Object>();
            return new ModelAndView(model,"index.hbs");
        },new HandlebarsTemplateEngine());

        //Event
        get("/events/new",(request, response) -> {
            Map<String,Object> model=new HashMap<String, Object>();
            return new ModelAndView(model,"eventform.hbs");
        },new HandlebarsTemplateEngine());

        post("/events/new",(request, response) -> {
            Map<String,Object> model=new HashMap<String, Object>();
            String title=request.queryParams("title");
            String location=request.queryParams("location");
            int price=Integer.parseInt(request.queryParams("price"));
            String time=request.queryParams("time");
            String host=request.queryParams("host");
            Event ranger=new Event(title, location, time, price, host);
            ranger.save();
            System.out.println(ranger);
            model.put("ranger",ranger);

            return new ModelAndView(model,"success.hbs");
        },new HandlebarsTemplateEngine());
    }
}
