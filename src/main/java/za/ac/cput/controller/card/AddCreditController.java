package za.ac.cput.controller.card;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.card.AddCredit;
import za.ac.cput.service.card.AddCreditService;

import java.util.Set;

@RestController
@RequestMapping("/addcredit")
public class AddCreditController {

    @Autowired
    @Qualifier("AddCreditServiceImpl")
    private AddCreditService addCreditService;

    @PostMapping("/create")
    @ResponseBody
    public AddCredit create (@PathVariable AddCredit addCredit)
    {
        return addCreditService.create(addCredit);
    }

    @GetMapping(path = "/read/{id}")
    public AddCredit read(@PathVariable String id){
        AddCredit addCredit = addCreditService.read(id);
        return addCredit;
    }

    @PutMapping("/update")
    @ResponseBody
    public AddCredit update(@PathVariable AddCredit addCredit)
    {
        return addCreditService.update(addCredit);
    }

    @DeleteMapping(path = "/delete/{id}")
    @ResponseBody
    public void delete (@PathVariable String id)
    {
        addCreditService.delete(id);
    }

    @GetMapping("/getall")
    public Set<AddCredit> getAll()
    {
        return addCreditService.getAll();
    }
}
