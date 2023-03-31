package fr.eni.caveavin.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Bouteille {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Size(min = 5, max = 50)
    private String nom;
    @NotNull
    private boolean petillant;
    @NotNull
    private String millesime;
    @Min(1)
    private int quantite;
    @ManyToOne
    @NotNull
    private Couleur couleur;
    @ManyToOne
    @NotNull
    private Region region;

    public Bouteille(String nom, boolean petillant, String millesime, int quantite, Couleur couleur, Region region) {
        this.nom = nom;
        this.petillant = petillant;
        this.millesime = millesime;
        this.quantite = quantite;
        this.couleur = couleur;
        this.region = region;
    }
}
