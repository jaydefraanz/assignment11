package za.ac.cput.controller.bus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.bus.BusDetails;
import za.ac.cput.service.bus.BusDetailsService;

import java.util.Set;

@RestController
@RequestMapping("/busdetails")
public class BusDetailsController {

    @Autowired
    //@Qualifier("BusDetailsServiceImpl")
    private BusDetailsService busDetailService;

    @PostMapping("/create")
    @ResponseBody
    public BusDetails create(@RequestBody BusDetails busDetails)
    {
        return busDetailService.create(busDetails);
    }

    @GetMapping(path = "/read/{id}")
    public BusDetails read(@PathVariable String id){
        BusDetails busDetails = busDetailService.read(id);
        return busDetails;
    }

    @PutMapping("/update")
    @ResponseBody
    public BusDetails update(@PathVariable BusDetails busDetails)
    {
        return busDetailService.update(busDetails);
    }

    @DeleteMapping(path = "/delete/{id}")
    @ResponseBody
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