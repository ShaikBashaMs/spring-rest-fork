package io.shaik.sprrest.controllers;

import io.shaik.sprrest.models.AppModel;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/io.shaik")
public class RestAppController {

    @RequestMapping(value = "/save", method = RequestMethod.POST,
    produces = "application/json")
    public AppModel modelData(@RequestBody AppModel app) {
        return app;
    }

    @RequestMapping(value = "/shaik", method = RequestMethod.GET)
    public String findMaster() {
        return "shaik";
    }
    @RequestMapping(value = "/master", method = RequestMethod.GET)
    public String findMaster() {
        return "master";
    }
}
