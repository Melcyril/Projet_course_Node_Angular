INSERT INTO users(firstname, lastname, civility, role) VALUES
('John','Doe',true,'Professeur'),
('Gilbert','Montagnier',true,'Pianiste');

INSERT INTO disciplines(name) VALUES
('Gestion de projet'),
('Programmation Web');

INSERT INTO courses(name, description, idDiscipline, idUser) VALUES
('Javascript', 'Un cours de javascript',2,1),
('Php', 'Un cours de PHP',2,1);

INSERT INTO chapters(title, content, idCourse) VALUES
('Fondamentaux du javascript','Un contenu...',1),
('Javascript coté navigateur','un autre contenu',1),
('Architecture Client-Serveur','Un contenu Php',2);