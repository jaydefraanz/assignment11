package za.ac.cput.controller.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.driver.DriverDetails;
import za.ac.cput.service.driver.DriverDetailsService;

import java.util.Set;

@RestController
@RequestMapping("/driverdetails")
public class DriverDetailsController {

    @Autowired
   // @Qualifier("DriverDetailsServiceImpl")
    private DriverDetailsService driverDetailsService;

    @PostMapping("/create")
    @ResponseBody
    public DriverDetails create(@PathVariable DriverDetails driverDetails)
    {
        return driverDetailsService.create(driverDetails);
    }

    @GetMapping(path = "/read/{id}")
    public DriverDetails read(@PathVariable String id)
    {
        DriverDetails driverDetails = driverDetailsService.read(id);
        return driverDetails;
    }

    @PutMapping("/update")
    @ResponseBody
    public DriverDetails update(@PathVariable DriverDetails driverDetails)
    {
        return driverDetailsService.update(driverDetails);
    }

    @DeleteMapping(path = "/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        driverDetailsService.delete(id);
    }

    @GetMapping("/getall")
    public Set<DriverDetails> getAll()
    {
        return driverDetailsService.getAll();
    }
}
