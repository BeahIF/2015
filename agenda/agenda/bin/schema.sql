-- palavras reservadas do banco sempre MAIÚSCULAS
-- palavras do usuário em snake_case minúsculo

CREATE TABLE contatos (
	id        SERIAL      NOT NULL PRIMARY KEY,
	nome      VARCHAR(20) NOT NULL,
	sobrenome VARCHAR(30)     NULL
);

CREATE TABLE telefones (
	id_contato INTEGER NOT NULL
			   REFERENCES contatos(id)
			   ON DELETE CASCADE,
	-- ON DELETE CASCADE = PROCURA CONTATO PELO ID E EXCLUI TUDO, NÃO SOMENTE O TELEFONE
	ddd 	   VARCHAR(2) 	  NULL,
	numero	   VARCHAR(9) NOT NULL
);

--

INSERT INTO contatos VALUES (
	DEFAULT, 'Rafael', 'Betito'
); --1

INSERT INTO contatos (
	nome, sobrenome
) VALUES (
	'Igor', 'Bira'
); --2


-- select all
SELECT * FROM contatos;
-- select "econômico": só a coluna que precisa
-- e só uma página de registros


SELECT sobrenome
FROM contatos LIMIT 1 OFFSET 1;
-- LIMIT pula um contato
-- OFFSET pega apenas um dos contatos


-- ver os primeiros 5 contatos
SELECT sobrenome
FROM contatos LIMIT 5

-- próximos 5
SELECT sobrenome
FROM contatos LIMIT 5 OFFSET 5;


UPDATE contatos
SET nome = 'Ogro'
WHERE id = 1;
-- NUNCA FAÇA UPDATE E DELETE SEM WHERE


INSERT INTO contatos (nome)
VALUES ('temp');
--
DELETE FROM contatos
WHERE nome = 'temp';


INSERT INTO telefones VALUES (
	(SELECT id FROM contatos WHERE sobrenome = 'Betito'), '53', '88992211'
);

INSERT INTO telefones (id_contato, numero) VALUES (
	2, '32334455'
), (
	2, '99234455'
);


--

SELECT nome, numero
FROM contatos c JOIN telefones t 
ON c.id = t.id_contato

SELECT nome, numero
FROM contatos NATURAL JOIN telefones;


Fazer tabela de email