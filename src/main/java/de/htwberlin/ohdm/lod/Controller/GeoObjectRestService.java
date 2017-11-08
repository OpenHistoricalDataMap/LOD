package de.htwberlin.ohdm.lod.Controller;

import de.htwberlin.ohdm.lod.Models.GeoObject;
import de.htwberlin.ohdm.lod.Repositories.IGeoObjectRepository;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ggrauberger on 07.11.17.
 */
@RestController
@RequestMapping("/lod/")
public class GeoObjectRestService {
    @Autowired private IGeoObjectRepository repository;
    static final Logger logger = LogManager.getLogger(GeoObjectRestService.class.getName());

    @RequestMapping(value = "/geoobject/{name}",
            method = RequestMethod.GET)
    @ResponseBody
    public String readGeoObject(@PathVariable String name){
        GeoObject geoObject;
        try {
            geoObject = repository.findByName(name);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return e.getMessage();
        }
        if (geoObject == null) {
            String errorMsg = "No objects found for name";
            logger.error(errorMsg);
            return errorMsg;
        } else {
            return geoObject.toString();
        }
    }

}
