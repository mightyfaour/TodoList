package semicolon.africa.todolist.Data.repositpories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import semicolon.africa.todolist.Data.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
