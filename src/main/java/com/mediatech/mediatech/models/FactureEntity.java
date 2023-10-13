package com.mediatech.mediatech.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="factures")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class FactureEntity implements Serializable {
    @Id
    private Integer id;

    @Column(nullable = false)
    private String ref;

    @Column(nullable = false, name="date_creation_facture")
    private Date date;

    @ManyToOne
    private ClientEntity client;
}
