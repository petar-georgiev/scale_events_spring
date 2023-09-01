INSERT INTO users(id,first_name, last_name, password,  email,  role, location_id)
VALUES (uuid_in(md5(random()::text || random()::text)::cstring),'Peter', 'Georgiev', '$2a$12$F.4dKvzn/8OID6jORKPzGeHR/Ecf0rVF.XDaefmgpkPYMp9onjk7e', 'pesho@abv.bg','USER', NULL);

INSERT INTO users(id,first_name, last_name, password,  email,  role, location_id)
VALUES (uuid_in(md5(random()::text || random()::text)::cstring),'Ivan', 'Ivanov', '$2a$12$boVOhd1iinKHmikW6GpnhOtSdOCwT1QkFCA0wSng2eN7iNsz.RqX6', 'ivan@abv.bg','MANAGER', NULL);

