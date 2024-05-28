INSERT INTO "STATUS" (ID, VERSION, NAME) VALUES
(1, 1, 'Aprovado'),
(2, 1, 'Reprovado'),
(3, 1, 'Nao Avaliado');
INSERT INTO "COMPANY" (ID, VERSION, NAME) VALUES
(4, 1, 'Medico 1'),
(5, 1, 'Medico 2'),
(6, 1, 'Restaurante 1');
INSERT INTO "CONTACT" (ID, VERSION, EMAIL, FIRST_NAME, LAST_NAME, COMPANY_ID, STATUS_ID) VALUES
(7, 1, 'exemplo@gmail.com', 'Post Instagram', 'Foto procedimento + explicacao', 4, 1),
(8, 1, 'fulano@hotmail.com', 'Google Ads', 'Promocao pessoal regular', 5, 2),
(9, 1, 'comida@outlook.com', 'Texto', 'Informativo sobre regulamento', 6, 3);