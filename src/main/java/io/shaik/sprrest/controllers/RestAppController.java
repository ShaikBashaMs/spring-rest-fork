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
    public String findMaster1() {
        return "shaik";
    }
    @RequestMapping(value = "/master", method = RequestMethod.GET)
    public String findMaster() {
        return "master";
    }

    @RequestMapping(value = "/shaik122", method = RequestMethod.GET)
    public String findShaik122() {
        return "shaik122";
    }

    @RequestMapping(value = "/shaik122v2", method = RequestMethod.GET)
    public String findShaik122V2() {
        return "shaik122V2";
    }
}
