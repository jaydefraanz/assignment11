package za.ac.cput.controller.bus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.bus.BusDetails;
import za.ac.cput.service.bus.BusDetailsService;

import java.awt.*;
import java.util.Set;

@RestController
@RequestMapping("/busdetails")
public class BusDetailsController {

    @Autowired
    private BusDetailsService busDetailService;

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public BusDetails create(@RequestBody BusDetails busDetails)
    {
        return busDetailService.create(busDetails);
    }

    @GetMapping(path = "/read/{id}")
    public BusDetails read(@PathVariable String id){
        return busDetailService.read(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody BusDetails busDetails)
    {
        busDetailService.update(busDetails);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id)
    {
        busDetailService.delete(id);
    }

    @GetMapping("/getall")
    public Set<BusDetails> getAll()
    {
        return busDetailService.getAll();
    }
}