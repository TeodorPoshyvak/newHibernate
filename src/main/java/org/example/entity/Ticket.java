package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
@Entity
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    ZonedDateTime create_at;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @OneToOne
    @JoinColumn(name = "from_planet_id", nullable = false)
    Planet from_planet;

    @OneToOne
    @JoinColumn(name = "to_planet_id", nullable = false)
    Planet to_planet;

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy KK:mm:ss Z");
        return "Ticket{" +
                "id=" + id +
                ", create_at=" + create_at.format(formatter) +
                ", from_planet=" + from_planet.id +
                ", to_planet=" + to_planet.id +
                '}';
    }
}
