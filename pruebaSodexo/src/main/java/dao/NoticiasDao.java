package dao;

import org.springframework.data.repository.CrudRepository;

import com.pruebasodexo.models.Noticias;

public interface NoticiasDao extends CrudRepository<Noticias, Long>{

	Iterable<Noticias> findByTitleContainingIgnoreCase(String title);
}
