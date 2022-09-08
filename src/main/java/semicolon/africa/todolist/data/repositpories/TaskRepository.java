package semicolon.africa.todolist.data.repositpories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import semicolon.africa.todolist.data.model.Task;

@Repository
public interface TaskRepository extends MongoRepository<Task, String>{

}
