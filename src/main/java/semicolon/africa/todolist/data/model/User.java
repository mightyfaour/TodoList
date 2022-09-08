package semicolon.africa.todolist.data.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Document
@Setter
@Getter
public class User{
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
