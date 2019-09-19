package za.ac.cput.controller.commutors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.commutors.Child;
import za.ac.cput.service.commutors.ChildCommutorService;

import java.util.Set;

@RestController
@RequestMapping("/childcommutor")
public class ChildCommutorController {

    @Autowired
    @Qualifier("ChildCommutorServiceImpl")
    private ChildCommutorService childCommutorService;

    @PostMapping("/create")
    public Child create(@RequestBody Child child)
    {
        return childCommutorService.create(child);
    }

    @GetMapping(path = "/read/{id}")
    public Child read(@PathVariable String id)
    {
        Child child = childCommutorService.read(id);
        return child;
    }

    @PutMapping("/update")
    @ResponseBody
    public Child update(@PathVariable Child child)
    {
        return childCommutorService.update(child);
    }

    @DeleteMapping(path = "/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        childCommutorService.delete(id);
    }

    @GetMapping("/getall")
    public Set<Child> getAll()
    {
        return childCommutorService.getAll();
    }

}
