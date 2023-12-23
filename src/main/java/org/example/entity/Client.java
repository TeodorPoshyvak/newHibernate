package org.example.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(length = 200)
    String name;

    @OneToMany(mappedBy = "client", fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    private Set<Ticket> tickets = new HashSet<>();

}
