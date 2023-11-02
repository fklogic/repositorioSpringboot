package service;

import org.springframework.http.ResponseEntity;

import com.pruebasodexo.models.Noticias;
import com.pruebasodexo.responce.NoticiasResponseRest;

public interface INoticiasService {
	
	public ResponseEntity<NoticiasResponseRest> obtenerFavoritos();
	public ResponseEntity<NoticiasResponseRest> buscarFavoritosPorTitulo(String title);
	public ResponseEntity<NoticiasResponseRest> actualizarFavoritos(Noticias noticias, Long idFavorite);
	public ResponseEntity<NoticiasResponseRest> guardarFavorito(Noticias noticias);
	public ResponseEntity<NoticiasResponseRest> borrarFavoritos(Long idFavorite);


}
