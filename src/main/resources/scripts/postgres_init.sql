INSERT INTO users(id, username, password, email, name, location, role)
VALUES ('df9sf8s7', 'peteshonik', '$2a$12$F.4dKvzn/8OID6jORKPzGeHR/Ecf0rVF.XDaefmgpkPYMp9onjk7e', 'myemail@abv.bg', 'Peter', 'PLOVDIV', 'USER');

INSERT INTO users(id, username, password, email, name, location, role)
VALUES ('df9sf8s7', 'peteshonik', 'topSecret', 'myemail@abv.bg', 'Peter', 'PLOVDIV', 'USER');

INSERT INTO events(id, name, event_type)
VALUES ('ascsd8b0', 'Spring Boot MicroServices', 'INTERNAL_TRAININGS');

INSERT INTO events(id, name, event_type)
VALUES ('ascsd8b0', 'Spring Boot MicroServices', 'INTERNAL_TRAININGS');

INSERT INTO user_event(user_id, event_id)
VALUES ('df9sf8s7', 'ascsd8b0')