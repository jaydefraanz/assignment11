package za.ac.cput.controller.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.driver.AssignedBus;
import za.ac.cput.service.driver.AssignedBusService;

import java.util.Set;

@RestController
@RequestMapping("/assignedBus")
public class AssignedBusController {

    @Autowired
    //@Qualifier("AssignedBusServiceImpl")
    private AssignedBusService assignedBusService;

    @PostMapping("/create")
    @ResponseBody
    public AssignedBus create(@RequestBody AssignedBus assignedBus)
    {
        return assignedBusService.create(assignedBus);
    }

    @GetMapping(path = "/read/{id}")
    public AssignedBus read(@PathVariable String id){
        AssignedBus assignedBus = assignedBusService.read(id);
        return assignedBus;
    }

    @PutMapping("/update")
//    @RequestBody
    public AssignedBus update(@PathVariable AssignedBus assignedBus)
    {
        return  assignedBusService.update(assignedBus);
    }

    @DeleteMapping(path = "/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        assignedBusService.delete(id);
    }

    @GetMapping("/getall")
    public Set<AssignedBus> getAll()
    {
        return assignedBusService.getAll();
    }
}
