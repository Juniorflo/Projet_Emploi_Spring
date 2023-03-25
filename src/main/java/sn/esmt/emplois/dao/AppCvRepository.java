package sn.esmt.emplois.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.esmt.emplois.entities.AppCvEntity;

import java.util.List;

@Repository
public interface AppCvRepository extends JpaRepository<AppCvEntity, Integer> {
    AppCvEntity findById(int id);
    List<AppCvEntity> findBySpecialite(String speciliate);
}
