package org.example.entity;

import java.time.LocalDateTime;
import java.util.UUID;

public class Ticket {
    Long id;
    LocalDateTime created_at;
    Client client_id;
    Planet from_planet_id;
    Planet to_planet_id;
}
