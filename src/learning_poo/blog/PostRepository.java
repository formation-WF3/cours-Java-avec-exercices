package learning_poo.blog;

public interface PostRepository extends CrudRepository<PostEntity, Integer> {
	PostEntity[] findByTitle(String title);

}
