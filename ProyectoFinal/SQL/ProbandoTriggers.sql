UPDATE ProductoNoPerecedero
SET cantidad = 20, marca = 'MESAS JIMENEZ', fechaAdquisicion='2022-12-12', precioCompra=50.26
where idProductoNoPerecedero = 1;

UPDATE Ingrediente
SET cantidad = 20, marca = 'Tomates SA', fechaAdquisicion='2022-06-14', precioCompra=30.8, fechaCaducidad='2022-07-17'
where idIngrediente = 1;

select * from productoNoPerecedero;

select * from RegistroProductoNoPerecedero;

select * from registroingrediente;
