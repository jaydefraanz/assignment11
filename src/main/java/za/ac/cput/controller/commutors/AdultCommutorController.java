package za.ac.cput.controller.commutors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.commutors.Adult;
import za.ac.cput.service.commutors.AdultCommutorService;

import java.util.Set;

@RestController
@RequestMapping("/adultcommutor")
public class AdultCommutorController {

    @Autowired
    //@Qualifier("AdultCommutorServiceImpl")
    private AdultCommutorService adultCommutorService;

    @PostMapping("/create")
//    @RequestBody
    public Adult create(@RequestBody Adult adult)
    {
        return adultCommutorService.create(adult);
    }

    @GetMapping(path = "/read/{id}")
    public Adult read (@PathVariable String id)
    {
        Adult adult = adultCommutorService.read(id);
        return adult;
    }

    @PutMapping("/update")
    @ResponseBody
    public Adult update(@PathVariable Adult adult)
    {
        return adultCommutorService.update(adult);
    }

    @DeleteMapping(path = "/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        adultCommutorService.delete(id);
    }

    @GetMapping("/getall")
    public Set<Adult> getAll()
    {
        return adultCommutorService.getAll();
    }
}
