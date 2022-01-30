import models.Hero;
import models.Squad;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;
public class App {
    public static void main(String[] args) {
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

            Hero hero = new Hero(name, age, power, weakness);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());


    }
}






























































