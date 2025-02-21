package registration.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import registration.entity.Course;

@RestController
@RequestMapping("/api/course")
@CrossOrigin(origins = "http://localhost:3000")
public class CourseController {

    @PostMapping
    public ResponseEntity<Void> postCourse() {
        return ResponseEntity.ok().build();
    }

    @GetMapping("{id}")
    public ResponseEntity<Course> getCourse(@PathVariable String id) {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/discipline/{id}")
    public ResponseEntity<Course> getCourseDiscipline(@PathVariable String id) {
        return ResponseEntity.ok().build();
    }

}
