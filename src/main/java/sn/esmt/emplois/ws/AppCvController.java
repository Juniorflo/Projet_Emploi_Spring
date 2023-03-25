package sn.esmt.emplois.ws;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sn.esmt.emplois.dao.AppCvRepository;
import sn.esmt.emplois.entities.AppCvEntity;

import java.util.List;

//@RestController:indique que la classe est un contrôleur
@RestController
//spécifie le chemin de base pour toutes les requêtes HTTP associées aux utilisateurs.
@RequestMapping(value = "/cvs")
//annotation de Lombok qui permet de générer
// un constructeur avec tous les champs d'une classe
@AllArgsConstructor
//la classe AppUserController, qui est un contrôleur
// pour les requêtes HTTP associées aux utilisateurs de l'application.
public class AppCvController {
    private AppCvRepository appCvRepository;

    //spécifie que cette méthode doit être appelée
    // lorsqu'une requête HTTP POST est envoyée à l'URL /users/save.
    @PostMapping(path = "/save")
    //@RequestBody indique que les données de la requête HTTP
    // doivent être converties en un objet AppUserEntity
    public AppCvEntity save(@RequestBody AppCvEntity appCvEntity) {
        return appCvRepository.save(appCvEntity);
    }

    //spécifie que cette méthode doit être appelée
    // lorsqu'une requête HTTP GET est envoyée à l'URL /users/alls
    @GetMapping(path = "/all")
    public List<AppCvEntity> getAll() {
        return appCvRepository.findAll();
    }

    @GetMapping(path = "/getBySpecialite/{specialite}")
    public List<AppCvEntity> findBySpecialite(@PathVariable("specialite") String specialite) {
        return appCvRepository.findBySpecialite(specialite);
    }

    @GetMapping(path = "/getById/{id}")
    public AppCvEntity findBySpecialite(@PathVariable("id") int id) {
        return appCvRepository.findById(id);
    }

}
