CREATE TABLE client(
id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
name VARCHAR(200) NOT NULL CHECK (LENGTH(name) >= 3 AND LENGTH(name)<= 200)
);

CREATE TABLE planet (
    id  VARCHAR NOT NULL PRIMARY KEY,
    name VARCHAR(500) NOT NULL CHECK (LENGTH(name) >= 1 AND LENGTH(name) <= 500)
);

CREATE TABLE ticket (
    id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    create_at TIMESTAMP,
    client_id BIGINT NOT NULL,
    from_planet_id  VARCHAR NOT NULL,
    to_planet_id  VARCHAR NOT NULL,
    CONSTRAINT ticket_client_fk FOREIGN KEY (client_id) REFERENCES client (id) ON DELETE CASCADE,
    CONSTRAINT ticket_fromPlanet_fk FOREIGN KEY (from_planet_id) REFERENCES planet (id) ON DELETE CASCADE,
    CONSTRAINT ticket_toPlanet_fk FOREIGN KEY (to_planet_id) REFERENCES planet (id) ON DELETE CASCADE
);
