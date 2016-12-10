package com.xelitalabs.samples;

import com.google.gson.Gson;

import static spark.Spark.*;

public class Application {
 
    public static void main(String[] args) {
        Gson gson = new Gson();
 
        get("/check", (req, res) -> {
            res.type("application/json");
            return new Status("UP");
        }, gson::toJson);
    }

    public static class Status {

        private final String status;

        public Status(String status) {
            this.status = status;
        }
    }
}
