package Repo;

import Model.Book;
import org.springframework.data.repository.CrudRepository;


public interface BookRepo extends CrudRepository <Book, Long> {

}
