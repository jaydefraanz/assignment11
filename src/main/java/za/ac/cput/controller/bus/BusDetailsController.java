package za.ac.cput.controller.bus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.bus.BusDetails;
import za.ac.cput.service.bus.BusDetailsService;

@RestController
@RequestMapping("/busdetails")
public class BusDetailsController {

    @Autowired
    @Qualifier("BusDetailsServiceImpl")
    private BusDetailsService service;

    @GetMapping("/create/{busName}")
    @ResponseBody
    public BusDetails create(BusDetails busDetails)
    {
        return service.create(busDetails);
    }


    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        service.delete(id);
    }

    @GetMapping("/update")
    @ResponseBody
    public BusDetails update(@PathVariable BusDetails id){return service.update(id);}

}
