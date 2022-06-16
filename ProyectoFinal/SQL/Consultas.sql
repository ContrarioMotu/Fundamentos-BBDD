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

--Compramos mesas grandes de otra marca a diferente provedor
UPDATE ProductoNoPerecedero
SET idprovedor = 2, cantidad = 20, marca = 'MESAS JIMENEZ', fechaAdquisicion='2022-12-12', precioCompra=2500.26
where idProductoNoPerecedero = 1;

--Compramos tomates de distinta marca 
UPDATE Ingrediente
SET cantidad = 26, marca = 'Tomates DEL SUR', fechaAdquisicion='2022-06-14', precioCompra=30.8, fechaCaducidad='2022-07-17'
where idIngrediente = 1;

-- Dinero que se le ha pagado al provedor 2 por productos no perecederos.
UPDATE ProductoNoPerecedero
SET idprovedor = 2, cantidad = 20, marca = 'MESAS JIMENEZ', fechaAdquisicion='2023-01-2', precioCompra=506.26
where idProductoNoPerecedero = 1;

UPDATE ProductoNoPerecedero
SET idprovedor = 2, cantidad = 20, marca = 'MESAS SANCHEZ', fechaAdquisicion='2023-02-12', precioCompra=6000.26
where idProductoNoPerecedero = 1;

UPDATE ProductoNoPerecedero
SET idprovedor = 2, cantidad = 20, marca = 'MESAS SANCHEZ', fechaAdquisicion='2022-03-12', precioCompra=700.26
where idProductoNoPerecedero = 1;

SELECT sum(precioCompra) FROM RegistroProductoNoPerecedero
where idprovedor = 2

-- Numero de los empleados que trabajan en la sucursal 1
select count(sucursal.idsucursal) from sucursal join empleado on sucursal.idsucursal= empleado.idsucursal -- natural join persona
where sucursal.idsucursal = 1

