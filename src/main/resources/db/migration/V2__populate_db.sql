INSERT INTO client(NAME) VALUES
                             ('Ivan'),
                             ('Teodor'),
                             ('Taras'),
                             ('Anna'),
                             ('Veronika'),
                             ('Oleg'),
                             ('Max'),
                             ('Dmytro'),
                             ('Roman'),
                             ('Olga');

INSERT INTO planet(id, name) VALUES
                                 ('MARS1', 'Mars'),
                                 ('MERCURY2', 'Mercury'),
                                 ('VENUS3', 'Venus'),
                                 ('EARTH4', 'Earth'),
                                 ('JUPITER5', 'Jupiter');

INSERT INTO ticket(create_at, client_id, from_planet_id, to_planet_id) VALUES
                                                                           (now(), 1, 'MARS1', 'MERCURY2'),
                                                                           (NOW() - INTERVAL '1 hour', 2, 'MERCURY2', 'MARS1'),
                                                                           (NOW() - INTERVAL '2 hours', 3, 'JUPITER5', 'MERCURY2'),
                                                                           (NOW() - INTERVAL '3 hours', 4, 'VENUS3', 'EARTH4'),
                                                                           (NOW() - INTERVAL '4 hours', 5, 'JUPITER5', 'MARS1'),
                                                                           (NOW() - INTERVAL '5 hours', 6, 'MERCURY2', 'VENUS3'),
                                                                           (NOW() - INTERVAL '10 minutes', 7, 'EARTH4', 'MARS1'),
                                                                           (NOW() - INTERVAL '20 minutes', 8, 'MARS1', 'VENUS3'),
                                                                           (NOW() - INTERVAL '40 minutes', 9, 'EARTH4', 'MARS1'),
                                                                           (NOW() - INTERVAL '10 seconds', 10, 'MARS1', 'EARTH4');
