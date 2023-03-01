CREATE TABLE users
(
    id IDENTITY NOT NULL PRIMARY KEY,
    firstname   VARCHAR(255),
    lastname   VARCHAR(255),
    civility   BOOLEAN,
    role    VARCHAR(255)
);

CREATE TABLE courses
(
    id IDENTITY NOT NULL PRIMARY KEY,
    name   VARCHAR(255),
    description   CLOB,
    idDiscipline INT,
    idUser INT
);

CREATE TABLE chapters
(
    id IDENTITY NOT NULL PRIMARY KEY,
    title   VARCHAR(255),
    content   CLOB,
    idCourse INT
);

CREATE TABLE disciplines
(
    id IDENTITY NOT NULL PRIMARY KEY,
    name   VARCHAR(255)
);

ALTER TABLE courses
   ADD FOREIGN KEY (idDiscipline)
   REFERENCES disciplines(id);

ALTER TABLE courses
   ADD FOREIGN KEY (idUser)
   REFERENCES users(id);

ALTER TABLE chapters
   ADD FOREIGN KEY (idCourse)
   REFERENCES courses(id);