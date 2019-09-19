package za.ac.cput.controller.card;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.card.BalanceCheck;
import za.ac.cput.service.card.BalanceCheckService;

import java.util.Set;

@RestController
@RequestMapping("/balancecheck")
public class BalanceCheckController {

    @Autowired
    @Qualifier("BalanceCheckServiceImpl")
    private BalanceCheckService balanceCheckService;

    @PostMapping("/create")
    @ResponseBody
    public BalanceCheck create(@PathVariable BalanceCheck balanceCheck)
    {
        return balanceCheckService.create(balanceCheck);
    }

    @GetMapping(path = "/read/{id}")
    public BalanceCheck read(@PathVariable BalanceCheck balanceCheck)
    {
        return balanceCheckService.create(balanceCheck);
    }

    @PutMapping("/update")
    @ResponseBody
    public BalanceCheck update(@PathVariable BalanceCheck balanceCheck)
    {
        return balanceCheckService.update(balanceCheck);
    }

    @DeleteMapping(path = "/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        balanceCheckService.delete(id);
    }

    @GetMapping("/getall")
    public Set<BalanceCheck> getAll()
    {
        return balanceCheckService.getAll();
    }
}
