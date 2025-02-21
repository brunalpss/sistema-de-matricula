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
public class Teacher {

    @Id
    private Long id;

    @OneToMany
    @JoinTable(
            name = "university_discipline",
            joinColumns = @JoinColumn(name = "discipline_id")
    )
    private List<Discipline> disciplineList;

    private String name;
    private String email;
    private String password;

}
