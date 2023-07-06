package learning_poo.blog;

public interface CategoryRepository extends CrudRepository<CategoryEntity, Integer> {
	CategoryEntity[] findByName(String name);

}
