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
public class Course {

    @Id
    private Long id;

    private String name;
    private Integer credits;

    @OneToMany
    @JoinTable(
            name = "university_discipline",
            joinColumns = @JoinColumn(name = "discipline_id")
    )
    private List<Discipline> disciplineList;
}
