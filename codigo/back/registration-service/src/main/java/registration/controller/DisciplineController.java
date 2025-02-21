package registration.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import registration.entity.Course;

@RestController
@RequestMapping("/api/discipline")
@CrossOrigin(origins = "http://localhost:3000")
public class DisciplineController {

    @PostMapping
    public ResponseEntity<Course> createCourse(@RequestBody Course course) {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/student/{id}")
    public ResponseEntity<Course> registerStudentOnDiscipline(@RequestBody Course course, @PathVariable String id) {
        return ResponseEntity.ok().build();
    }

}
