package com.mabwatech.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor
public class MtUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String email;

    private String password;

    private String authProvider;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<MtPlate> plates;
}
