package com.example;

import com.google.gson.Gson;
import model.Index;
import model.Plane;
import model.Result;
import service.PlaneServic;
import static spark.Spark.*;

public class Server {

    public static void main(String[] args) {
        port(3045);
        options("/*",
                (request, response) -> {
                    String accessControlRequestHeaders = request.headers("Access-Control-Request-Headers");
                    if (accessControlRequestHeaders != null) {
                        response.header("Access-Control-Allow-Headers", accessControlRequestHeaders);
                    }

                    String accessControlRequestMethod = request.headers("Access-Control-Request-Method");
                    if (accessControlRequestMethod != null) {
                        response.header("Access-Control-Allow-Methods", accessControlRequestMethod);
                    }
                    return "OK";
                });

        before((request, response) -> response.header("Access-Control-Allow-Origin", "*"));
        /////
        Gson gson = new Gson();
        PlaneServic service = new PlaneServic();
        Plane[] planes = service.getPlanes();


        get("/planes", (req, res) -> {
            res.type("application/json");
            return gson.toJson(planes);
        });

        // Task 2
        post("/task2", (req, res) -> {
            String taskDask = "Get cost and topSpeed if the plane is military otherwise Get model and country";
            /////////
            Index index = gson.fromJson(req.body(), Index.class);
            String text = service.ifMilitaryOrNot(planes[index.getI()]);
            Result result = new Result(taskDask, text ,2);
            res.type("application/json");
            return gson.toJson(result);
        });

        // Task 3
        post("/task3", (req, res) -> {
            String taskDask = " Get the plane which one is newer (if they have the same age return first one)";
            /////////
            Index index = gson.fromJson(req.body(), Index.class);
            Plane resPlane = service.getnewPlane(planes[index.getI()], planes[index.getJ()]);
            Result result = new Result(taskDask, resPlane,3);
            res.type("application/json");
            return gson.toJson(result);
        });
        // Task 4
        post("/task4", (req, res) -> {
            String taskDask = " Get the model of the plane which has  bigger wingspan "
                    + "(if they have the same - return second one) ";
            /////////
            Index index = gson.fromJson(req.body(), Index.class);
            String resText = service.getBigWingspan(planes[index.getI()], planes[index.getJ()]);
            Result result = new Result(taskDask, resText,4);
            res.type("application/json");
            return gson.toJson(result);
        });
        // Task 5
        post("/task5", (req, res) -> {
            String taskDask = "Get country of the plane whit smallest seats " +
                    "count(if they have the same - print first)";
            Index index = gson.fromJson(req.body(), Index.class);
            String resText = service.getSmallSets(planes[index.getI()], planes[index.getJ()], planes[index.getK()]);
            Result result = new Result(taskDask, resText,5);
            res.type("application/json");
            return gson.toJson(result);
        });
        // Task 6
        get("/task6", (req, res) -> {
            String taskDask = "Get all not military planes";
            res.type("application/json");
            return gson.toJson(new Result(taskDask, service.getNotMilitary(planes),6));
        });
        // Task 7
        get("/task7", (req, res) -> {
            String taskDask = "Get all military planes which were in air more then 100 hours";
            res.type("application/json");
            return gson.toJson(new Result(taskDask, service.getMilitaryMoreHours(planes),7));
        });
        // Task 8
        get("/task8", (req, res) -> {
            String taskDask = "Get the plane whit minimal weight (if there are some of them return last one)";
            res.type("application/json");
            return gson.toJson(new Result(taskDask, service.getMinWeightPlane(planes),8));
        });
        // Task 9
        get("/task9", (req, res) -> {
            String taskDask = "Get the plane whit minimal cost from all military planes";
            res.type("application/json");
            return gson.toJson(new Result(taskDask, service.getMinCostMilitaryPlane(planes),9));
        });
        // Task 10
        get("/task10", (req, res) -> {
            String taskDask = "Print planes in ascending  form order by year ";
            res.type("application/json");
            return gson.toJson(new Result(taskDask, service.getPlanesOrderByYear(planes),10));
        });

    }
}
