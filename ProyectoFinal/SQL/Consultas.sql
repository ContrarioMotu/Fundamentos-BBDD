--Consultas
--Vemos la carta
SELECT nombre, precioVenta FROM ProductoALimenticio;
--Nos aseguramos que el burrito vegetariano, de verdad sea vegetariano
SELECT Preparar.idIngrediente, nombre 
FROM Preparar INNER JOIN Ingrediente 
ON Preparar.idIngrediente = Ingrediente.idIngrediente 
WHERE idProductoALimenticio = 6
--Recomendaciones de platillos para pico de gallo
SELECT ProductoAlimenticio.idProductoAlimenticio, ProductoALimenticio.nombre
FROM RecomendarConSalsa INNER JOIN ProductoAlimenticio
ON RecomendarConSalsa.idProductoALimenticio = ProductoAlimenticio.idProductoAlimenticio 
WHERE idSalsa= 5;