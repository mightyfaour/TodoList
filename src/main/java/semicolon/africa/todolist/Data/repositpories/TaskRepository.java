package semicolon.africa.todolist.Data.repositpories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import semicolon.africa.todolist.Data.model.Task;

@Repository
public interface TaskRepository extends MongoRepository<Task, String> {

}
