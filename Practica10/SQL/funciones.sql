--CREATE LANGUAGE plpgsql;
--DROP FUNCTION edadCliente (curp_cliente char(18));

CREATE OR REPLACE FUNCTION edadCliente (curp_cliente char(18))
	RETURNS int 
	AS $$
	DECLARE 
		fecha DATE;
		anioNacimiento int;
	BEGIN 
		SELECT duenio.fechaNacimiento INTO fecha 
		FROM public.duenio
		WHERE duenio.curp = curp_cliente;
		SELECT EXTRACT (year FROM fecha) INTO anioNacimiento;
		return 2022-anioNacimiento;
	END ;
	$$
	Language plpgsql;
	
--DROP FUNCTION ingresosEstetica(id_Estetica int)	;

CREATE OR REPLACE FUNCTION ingresosEstetica (id_estetica int) 
	RETURNS REAL
	AS $$
	DECLARE
	 ganancia REAL;
	BEGIN 
	SELECT SUM(Recibo.costo) INTO ganancia 
			   FROM public.Recibo
			   WHERE Recibo.idEstetica = id_estetica;
		return ganancia; 
	END ;
	$$
	Language plpgsql;

--SELECT idEstetica, costo FROM Recibo WHERE idEstetica = 22;
--SELECT ingresosEstetica(22);
SELECT edadCliente ('IBLO812442JSHWRQC1');