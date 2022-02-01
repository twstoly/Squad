import models.Hero;
import models.Squad;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;
public class App {
    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }
    public static void main(String[] args) {
        port(getHerokuAssignedPort());
        staticFileLocation("/public");
//        Showing all posts.
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();

            ArrayList<Hero> hero = Hero.getAllInstances();
            model.put("hero", hero);

            ArrayList<Squad> squad = Squad.getAllInstances();
            model.put("squad", squad);

            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

//        Post information;
        post("/hero/new" , (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String name = request.queryParams("name");
            String age = request.queryParams("age");
            String power = request.queryParams("power");
            String weakness = request.queryParams("weakness");

            String squad = request.queryParams("squad");
            String task = request.queryParams("task");
            String size = request.queryParams("size");

            Squad squadGroup = new Squad(squad, size, task);
            Hero hero = new Hero(name, age, power, weakness);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());

        get("/hero/new" , (request, response) -> {
            Map<String, Object> model = new HashMap<>();

            ArrayList<Hero> hero = Hero.getAllInstances();
            model.put("hero", hero);

            ArrayList<Squad> squadGroup = Squad.getAllInstances();
            model.put("squadGroup", squadGroup);

            return new ModelAndView(model, "list.hbs");
        }, new HandlebarsTemplateEngine());

    }
}






























































