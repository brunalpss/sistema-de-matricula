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
public class Student {

    @Id
    private Long id;

    @OneToOne
    @JoinTable(
            name = "university_course",
            joinColumns = @JoinColumn(name = "course_id")
    )
    private Course course;

    @OneToMany
    @JoinTable(
            name = "university_discipline",
            joinColumns = @JoinColumn(name = "discipline_id")
    )
    private List<Discipline> disciplineList;

    private String name;
    private String email;
    private String password;
    private String registration;

}
