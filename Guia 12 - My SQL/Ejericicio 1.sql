USE personal;
-- 1. Obtener los datos completos de los empleados.
SELECT * FROM empleado;
-- 2. Obtener los datos completos de los departamentos.
SELECT * FROM departamento;
-- 3. Listar el nombre de los departamentos. 
SELECT nombre_depto FROM departamento;
-- 4. Obtener el nombre y salario de todos los empleados.
 SELECT nombre, salario FROM empleado;
-- 5. Listar todas las comisiones. 
SELECT comision FROM empleado;
-- 6. Obtener los datos de los empleados cuyo cargo sea ‘Secretaria’.
SELECT * FROM empleado WHERE cargo = 'Secretaria';
-- 7. Obtener los datos de los empleados vendedores, ordenados por nombre alfabéticamente.
SELECT * FROM empleado WHERE cargo = 'Vendedor' ORDER BY nombre;
-- 8. Obtener el nombre y cargo de todos los empleados, ordenados por salario de menor a mayor.
SELECT nombre, cargo FROM empleado ORDER BY salario;
-- 9. Elabore un listado donde para cada fila, figure el alias ‘Nombre’ y ‘Cargo’ para las respectivas tablas de empleados. 
SELECT nombre as 'Nombre', cargo as 'Cargo' FROM empleado;
-- 10. Listar los salarios y comisiones de los empleados del departamento 2000, ordenado por comisión de menor a mayor.
SELECT * FROM empleado;
SELECT salario, comision FROM empleado WHERE id_depto = 2000 ORDER BY comision;
-- 11. Obtener el valor total a pagar que resulta de sumar el salario y la comisión de los 
-- empleados del departamento 3000 una bonificación de 500, en orden alfabético del empleado.
SELECT nombre, (salario+comision+500) as 'Total a pagar' FROM empleado WHERE id_depto = 3000 ORDER BY nombre;
-- 12. Muestra los empleados cuyo nombre empiece con la letra J. 
SELECT nombre FROM empleado WHERE nombre LIKE 'J%';
-- 13. Listar el salario, la comisión, el salario total (salario + comisión) y nombre, de aquellos 
-- empleados que tienen comisión superior a 1000.
SELECT salario, comision, (salario+comision) as 'Salario Total', nombre
FROM empleado
WHERE comision > 1000;
-- 14. Obtener un listado similar al anterior, pero de aquellos empleados que NO tienen comisión.
SELECT salario, comision, (salario+comision) as 'Salario Total', nombre
FROM empleado
WHERE comision = 0;
-- 15. Obtener la lista de los empleados que ganan una comisión superior a su sueldo.
SELECT nombre
FROM empleado
WHERE comision > salario;
-- 16. Listar los empleados cuya comisión es menor o igual que el 30% de su sueldo. 
SELECT nombre
FROM empleado
WHERE comision <= salario * 0.3;
-- 17. Hallar los empleados cuyo nombre no contiene la cadena “MA”
SELECT nombre FROM empleado WHERE nombre NOT LIKE '%MA%';
-- 18. Obtener los nombres de los departamentos que sean “Ventas”, “Investigación”, ‘Mantenimiento".
SELECT * FROM departamento WHERE nombre_depto IN ('Ventas','Mantenimiento', 'Investigación');
-- 19. Ahora obtener los nombres de los departamentos que no sean “Ventas” ni “Investigación” ni ‘Mantenimiento. 
SELECT * FROM departamento WHERE nombre_depto NOT IN ('Ventas','Mantenimiento', 'Investigación');
-- 20. Mostrar el salario más alto de la empresa.
SELECT MAX(salario) FROM empleado;
-- 21. Mostrar el nombre del último empleado de la lista por orden alfabético.
SELECT nombre FROM empleado ORDER BY nombre DESC LIMIT 1;
-- 22. Hallar el salario más alto, el más bajo y la diferencia entre ellos.
SELECT MAX(salario) as 'max', MIN(salario) as 'Min', (MAX(salario)-MIN(salario)) as 'Diferencia' FROM empleado;
-- 23. Hallar el salario promedio por departamento. 
SELECT id_depto, ROUND(AVG(salario), 0) as 'Salario promedio' FROM empleado GROUP BY id_depto;
-- 24. Hallar los departamentos que tienen más de tres empleados. Mostrar el número de empleados de esos departamentos.
SELECT id_depto, COUNT(*) as 'Cantidad' FROM empleado GROUP BY id_depto HAVING Cantidad > 3;
-- 25. Mostrar el código y nombre de cada jefe, junto al número de empleados que dirige. 
-- Solo los que tengan más de dos empleados (2 incluido). 
SELECT *, COUNT(*) as 'Cantidad'
FROM empleado
GROUP BY id_depto
HAVING Cantidad >= 2 AND cargo LIKE 'Jefe%';
-- 26. Hallar los departamentos que no tienen empleados
SELECT *
FROM departamento as d
LEFT JOIN empleado as e
ON d.id_depto = e.id_depto
GROUP BY d.id_depto
HAVING count(e.nombre) = 0;
-- 27. Mostrar la lista de los empleados cuyo salario es mayor o igual que el promedio de la empresa. Ordenarlo por departamento.
SELECT *
FROM empleado
WHERE salario >= (SELECT AVG(salario) FROM empleado)
ORDER BY id_depto;

SELECT *
FROM empleado as e
INNER JOIN departamento as d
ON e.id_depto = d.id_depto
WHERE e.salario >= (SELECT AVG(salario) FROM empleado)
ORDER BY d.nombre_depto;