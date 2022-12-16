package academy.certif.trading.controller;

import academy.certif.trading.domain.Tick;
import academy.certif.trading.repository.TickRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TickController {
    private final TickRepository repository;

    TickController(TickRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/ticks")
    List<Tick> all() {
        return repository.findAll();
    }

    @PostMapping("/ticks")
    Tick newEmployee(@RequestBody Tick newEmployee) {
        return repository.save(newEmployee);
    }
}
