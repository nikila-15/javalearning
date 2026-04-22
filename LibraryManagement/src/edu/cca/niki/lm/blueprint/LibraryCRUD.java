package edu.cca.niki.lm.blueprint;
import java.util.List;
import edu.cca.niki.lm.models.Library;
public interface LibraryCRUD {
	Integer create(Library l);
	List<Library>readAll();
	Library readOne(Integer id);
	Library update(Integer id,Library l);
	Boolean delete(Integer id);
}
