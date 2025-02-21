package registration.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class FinancialController {

    @GetMapping("/financial/{id}")
    public ResponseEntity<Void> getFinancial(@PathVariable String id) {
        return ResponseEntity.ok().build();
    }

}
