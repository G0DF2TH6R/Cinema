package org.example.backend.Screening;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/screenings")
@CrossOrigin
public class ScreeningController {

    private final ScreeningRepository screeningRepository;

    public ScreeningController(ScreeningRepository screeningRepository) {
        this.screeningRepository = screeningRepository;
    }

    @GetMapping("")
    public List<Screening> getAllScreenings() {
        return screeningRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Screening> getScreeningById(@PathVariable Long id) {
        return screeningRepository.findById(id);
    }

    @PostMapping("")
    public void postScreening(@RequestBody Screening screening) {
        screeningRepository.save(screening);
    }
}
