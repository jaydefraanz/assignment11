package za.ac.cput.controller.route;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.route.DepartureStation;
import za.ac.cput.service.route.DepartureStationService;

import java.util.Set;

@RestController
@RequestMapping("departurestation")
public class DepartureStationController {

    @Autowired
    @Qualifier("DepartureStationServiceImpl")
    private DepartureStationService departureStationService;

    @PostMapping("/create")
    @ResponseBody
    public DepartureStation create(@PathVariable DepartureStation departureStation)
    {
        return departureStationService.create(departureStation);
    }

    @GetMapping(path = "/read/{id}")
    public DepartureStation read(@PathVariable String id){
        DepartureStation departureStation = departureStationService.read(id);
        return departureStation;
    }

    @PutMapping("/update")
    @ResponseBody
    public DepartureStation update(@PathVariable DepartureStation departureStation)
    {
        return departureStationService.update(departureStation);
    }

    @DeleteMapping(path = "/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        departureStationService.delete(id);
    }

    @GetMapping("/getall")
    public Set<DepartureStation> getAll()
    {
        return departureStationService.getAll();
    }
}
