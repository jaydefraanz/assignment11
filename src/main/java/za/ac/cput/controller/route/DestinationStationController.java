package za.ac.cput.controller.route;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.route.DestinationStation;
import za.ac.cput.service.route.DestinationStationService;

import java.util.Set;

@RestController
@RequestMapping("destinationstation")
public class DestinationStationController {

    @Autowired
    //@Qualifier("DestinationStationServiceImpl")
    private DestinationStationService destinationStationService;

    @PostMapping("/create")
    @ResponseBody
    public DestinationStation create(@RequestBody DestinationStation destinationStation)
    {
        return destinationStationService.create(destinationStation);
    }

    @GetMapping(path = "/read/{id}")
    public DestinationStation read(@PathVariable String id)
    {
        DestinationStation destinationStation = destinationStationService.read(id);
        return destinationStation;
    }

    @PutMapping("/update")
    @ResponseBody
    public DestinationStation update(@PathVariable DestinationStation destinationStation)
    {
        return destinationStationService.update(destinationStation);
    }

    @DeleteMapping(path = "/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        destinationStationService.delete(id);
    }

    @GetMapping("/getall")
    public Set<DestinationStation> getAll()
    {
        return destinationStationService.getAll();
    }
}