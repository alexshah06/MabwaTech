package com.mabwatech.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
@NoArgsConstructor
public class MtPlate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String plateName;

    @ManyToOne
    @JoinColumn(name = "userId")
    private MtUser user;
}
