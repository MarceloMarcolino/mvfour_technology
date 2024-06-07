-- Active: 1715899212322@@127.0.0.1@5432@20241_mvfour_technology

-- ALTER TABLE tb_usuario_mvfour_technology ADD COLUMN tipo INT;
CREATE TABLE tb_usuario_mvfour_technology(
    cod_usuario SERIAL PRIMARY KEY,
    login VARCHAR(200),
    senha VARCHAR(200),
    tipo INT
);

INSERT INTO tb_usuario_mvfour_technology(login, senha, tipo)
VALUES
('admin', 'admin', 1),
('comum', 'comum', 2);

SELECT * FROM tb_usuario_mvfour_technology;

SELECT * FROM tb_evento_mvfour_technology(
    cod_evento SERIAL PRIMARY KEY,
    nome VARCHAR(200) NOT NULL,
    descricao VARCHAR(1000) NOT NULL,
    data_inicio TIMESTAMP NOT NULL,
    data_fim TIMESTAMP NOT NULL
);

INSERT INTO tb_evento_mvfour_technology
(nome, descricao, data_inicio, data_fim)
VALUES
(
    'Evento 1',
    'Esse é o evento 1',
    CURRENT_TIMESTAMP,
    CURRENT_TIMESTAMP
),
(
    'Evento 2',
    'Esse é o evento 2',
    CURRENT_TIMESTAMP,
    CURRENT_TIMESTAMP
);

SELECT * FROM tb_evento_mvfour_technology;