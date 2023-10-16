package com.mediatech.mediatech.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "produits")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProduitEntity implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -7275079172834495736L;


    @Id
    private Integer id;

    @Column(nullable = false)
    private String libelle;

    @Column(nullable=false)
    private String 	ref;


    @Column(nullable = false)
    private BigDecimal prix;


    @Column(nullable = false)
    private double quantite_stock;

    @OneToMany(mappedBy = "produit",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<LigneFactureEntity> ligneFactures;


}
