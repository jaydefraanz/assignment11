package za.ac.cput.controller.location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.location.Location;
import za.ac.cput.service.location.LocationService;

import java.util.Set;

@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    @Qualifier("LocationServiceImpl")
    private LocationService locationService;

    @PostMapping
    @ResponseBody
    public Location create(@PathVariable Location location)
    {
        return locationService.create(location);
    }

    @GetMapping(path = "/read/{id}")
    public Location read(@PathVariable String id)
    {
        Location location = locationService.read(id);
        return location;
    }

    @PutMapping("/update")
    @ResponseBody
    public Location update(@PathVariable Location location)
    {
        return locationService.update(location);
    }

    @DeleteMapping(path = "/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        locationService.delete(id);

    }

    @GetMapping("/getall")
    public Set<Location> getAll()
    {
        return locationService.getAll();
    }
}