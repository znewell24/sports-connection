package com.sportsConnection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.sportsConnection.entity.Sport;
import com.sportsConnection.service.SportService;

import java.util.Collection;
import java.util.Map;

@RestController
@RequestMapping("/sports")
public class SportController {

    @Autowired
    private SportService sportService;

    @RequestMapping("/")
    public String index() { return "index"; }

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Sport> getAllSports() {
        return sportService.getAllSports();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Sport getSportById(@PathVariable("id") int id) {
        return sportService.getSportById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteSportById(@PathVariable("id") int id){
        sportService.removeSportById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void deleteStudentById(@RequestBody Sport sport){
        sportService.updateSport(sport);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertStudent(@RequestBody Sport sport) {
        sportService.insertSport(sport);
    }

    @RequestMapping("/db")
    public String db(Map<String, Object> model) { return sportService.db(model); }
}
