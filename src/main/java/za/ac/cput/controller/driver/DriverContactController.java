package za.ac.cput.controller.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.driver.DriverContact;
import za.ac.cput.service.driver.DriverContactService;

import java.util.Set;

@RestController
@RequestMapping("/drivercontact")
public class DriverContactController {

    @Autowired
    @Qualifier("DriverContactServiceImpl")
    private DriverContactService driverContactService;

    @PostMapping("/create")
    @ResponseBody
    public DriverContact create(@PathVariable DriverContact driverContact)
    {
        return driverContactService.create(driverContact);
    }

    @GetMapping(path = "/read/{id}")
    public DriverContact read(@PathVariable String id)
    {
        DriverContact driverContact = driverContactService.read(id);
        return driverContact;
    }

    @PutMapping("/update")
    @ResponseBody
    public DriverContact update(@PathVariable DriverContact driverContact)
    {
        return driverContactService.update(driverContact);
    }

    @DeleteMapping(path = "/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        driverContactService.delete(id);
    }

    @GetMapping("/getall")
    public Set<DriverContact> getAll()
    {
        return driverContactService.getAll();
    }

}
