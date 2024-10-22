
SELECT * FROM ej2.docente_materia;
SELECT * FROM ej2.docente;
SELECT * FROM  ej2.materia;

SELECT ci.nombre_docente, ci.titulo_docente 
FROM ej2.docente ci
JOIN ej2.docente_materia e ON ci.dni_docente = e.dni
WHERE e.departamento = 'Matemáticas'
ORDER BY ci.titulo_docente;

SELECT departamento
FROM ej2.docente_materia 
WHERE salario > 12000::money;


--Listar  los  nombres  y  carga  horaria  de  las  materias  y  los  nombres  y 
 --apellidos de los docentes cuyo título es Analista de Sistemas. 
SELECT m.nombre_materia, m.carga_horaria, d.nombre_docente, d.apellido_docente
FROM ej2.materia m
JOIN ej2.docente_materia dm ON m.cod_materia = dm.cod_mat
JOIN ej2.docente d ON dm.dni = d.dni_docente
WHERE d.titulo_docente = 'Analista en sistemas';











