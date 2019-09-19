package za.ac.cput.controller.route;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.route.Route;
import za.ac.cput.service.route.RouteService;

import java.util.Set;

@RestController
@RequestMapping("/route")
public class RouteController {

    @Autowired
    @Qualifier("RouteServiceImpl")
    private RouteService routeService;

    @PostMapping("/create")
//    @RequestBody
    public Route create (@RequestBody Route route)
    {
        return routeService.create(route);
    }

    @GetMapping(path = "/read/{id}")
    public Route read(@PathVariable String id)
    {
        Route route = routeService.read(id);
        return route;
    }

    @PutMapping("/update")
    @ResponseBody
    public Route update(@PathVariable Route route)
    {
        return routeService.update(route);
    }

    @DeleteMapping(path = "/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        routeService.delete(id);
    }

    @GetMapping("/getall")
    public Set<Route> getAll()
    {
        return routeService.getAll();
    }
}
