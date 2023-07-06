package learning_poo.blog;

import java.util.Optional;

public interface CrudRepository<T, ID> {
	T[] findAll();
	
	Optional<T> findById(ID id);

	T insert(T obj);
	
	T update(T obj);
	
	void deleteById(ID id);
}
