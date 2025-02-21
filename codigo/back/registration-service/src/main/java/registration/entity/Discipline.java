package registration.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Discipline {

    @Id
    private Long id;

    @ManyToMany
    @JoinTable(
            name = "university_student",
            joinColumns = @JoinColumn(name = "student_id")
    )
    private List<Student> studentList;

    private String name;
    private boolean required;
    private Double price;

}
