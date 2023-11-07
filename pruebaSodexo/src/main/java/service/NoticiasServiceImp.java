package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pruebasodexo.models.Noticias;
import com.pruebasodexo.responce.NoticiasResponseRest;

import dao.NoticiasDao;
import jakarta.transaction.Transactional;

public class NoticiasServiceImp implements INoticiasService{
private static final Logger Logger = null;


	
	@Autowired
	private NoticiasDao nDao;
	
	@Override
	public ResponseEntity<NoticiasResponseRest> savefavs(Noticias noticia){
		Logger.info("Inicio De Guardar noticia");
		NoticiasResponseRest response = new NoticiasResponseRest();				
		Noticias noticia1=new Noticias();		
			try {	
					n		      
			        nDao.save(noticia1);		         
			        response.o().setPregunta(newpregunta);
			         
			        		        
							
			}catch (Exception e) {
				Logger.error("error en proceso de guardar pregunta");
				response.setMetada("respuesta no OK", "-1");
				return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
			} 		
				response.setMetada("Respuesta ok", "200");
				return new ResponseEntity<>(response, HttpStatus.OK);
		}

	@Override
	public ResponseEntity<NoticiasResponseRest> deletefavs(Long idFavorite) {
		// TODO Auto-generated method stub
		return null;
	}
	}




}