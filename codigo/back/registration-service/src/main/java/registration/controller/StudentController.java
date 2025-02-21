package registration.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import registration.entity.Student;

import java.util.List;

@RestController
@RequestMapping("/api/student")
@CrossOrigin(origins = "http://localhost:3000")
public class StudentController {

    @PostMapping
    public ResponseEntity<Void> postStudent() {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<Student>> getStudents(@PathVariable String id) {
        return ResponseEntity.ok().build();
    }

}
