package service;

import org.springframework.http.ResponseEntity;

import com.pruebasodexo.models.Noticias;
import com.pruebasodexo.responce.NoticiasResponseRest;

public interface INoticiasService {
	
	
	public ResponseEntity<NoticiasResponseRest> savefavs(Noticias noticias);
	public ResponseEntity<NoticiasResponseRest> deletefavs(Long idFavorite);


}
