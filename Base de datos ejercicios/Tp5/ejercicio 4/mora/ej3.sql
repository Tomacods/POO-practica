

SELECT a.legajo_alumno, a.nombre_alumno
FROM ej3.alumno a
JOIN ej3.examen e ON a.legajo_alumno = e.legajo_alumno 
JOIN ej3.materia m ON m.codigo_materia = e.codigo_materia
WHERE m.nombre_materia = 'Estadística' AND m.facultad_materia = 'Ingeniería'
GROUP BY a.legajo_alumno;

SELECT m.codigo_materia, m.carrera_materia, COUNT(*) as cantidad
FROM ej3.materia m
WHERE m.facultad_materia = 'Ingeniería'
GROUP BY m.codigo_materia, m.carrera_materia
ORDER BY m.codigo_materia

SELECT a.legajo_alumno, a.nombre_alumno, AVG(e.nota_examen) AS promedio
FROM ej3.alumno a
JOIN ej3.examen e ON a.legajo_alumno = e.legajo_alumno
GROUP BY a.legajo_alumno
HAVING AVG(e.nota_examen) > 8;



