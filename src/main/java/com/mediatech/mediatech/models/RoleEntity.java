package com.mediatech.mediatech.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/***
 * Class Role Entity
 * @author Imene OUAHRANI
 */


@Entity
@Table(name = "roles")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleEntity implements Serializable {

    @Id
    private Integer roleId;
    @Column(nullable = false)
    private String name;

    @ManyToMany
    @JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "roleId"),
            inverseJoinColumns = @JoinColumn(name = "userId")
    )
    private List<UserEntity> users;
}
