package sn.esmt.emplois.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
@Table(name="cvs")
public class AppCvEntity {

    @Id // clé primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto incremente
    private int id;
    @Column(length = 150, nullable = false)
    private String nom;
    @Column(length = 150, nullable = false)
    private String prenom;
    @Column(length = 10, nullable = false)
    private int age;
    @Column(length = 200, nullable = false)
    private String adresse;
    @Column(length = 200, nullable = false)
    private String email;
    @Column(length = 40, nullable = true)
    private String telephone;
    @Column(length = 150, nullable = false)
    private String specialite;
    @Column(length = 100, nullable = false)
    private String niveauEtude;
    @Column(length = 150, nullable = true)
    private String experienceProfessionnelle;
}
