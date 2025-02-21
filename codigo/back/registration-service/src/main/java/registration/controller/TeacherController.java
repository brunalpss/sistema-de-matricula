package registration.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import registration.entity.Course;

@RestController
@RequestMapping("/api/teacher")
@CrossOrigin(origins = "http://localhost:3000")
public class TeacherController {

    @PostMapping
    public ResponseEntity<Void> postTeacher() {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/student/discipline/{id}")
    public ResponseEntity<Course> getStudentsByDiscipline(@PathVariable String id) {
        return ResponseEntity.ok().build();
    }

}
