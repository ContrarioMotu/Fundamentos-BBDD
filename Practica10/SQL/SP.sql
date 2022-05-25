CREATE OR REPLACE PROCEDURE agregarVeterinario(
	curpN IN CHAR(18), salarioN IN INT, generoN IN CHAR(1), fnacN IN DATE, telN IN CHAR(10),
	calleN IN VARCHAR(30), numcalleN IN INT, estadoN IN VARCHAR(30), codpostN IN CHAR(5),
	nombreN IN CHAR(30), paternoN IN CHAR(30), maternoN IN CHAR(30), rfcN IN CHAR(13),
	pacientesN IN INT, entradaN IN TIME, salidaN IN TIME)
	AS $$
	BEGIN
		ASSERT calleN SIMILAR TO '[a-zA-Z]{1,30}',
			'La calle: '|| $6 ||' no puede contener símbolos, números ni acentos...';
		ASSERT estadoN SIMILAR TO '[a-zA-Z]{1,30}',
			'El estado: '|| $8 ||' no puede contener símbolos, números ni acentos...';
		ASSERT nombreN SIMILAR TO '[a-zA-Z]{1,30}',
			'El nombre: '|| $10 ||' no puede contener símbolos, números ni acentos...';
		ASSERT paternoN SIMILAR TO '[a-zA-Z]{1,30}',
			'El apellido paterno: '|| $11 ||' no puede contener símbolos, números ni acentos...';
		ASSERT maternoN SIMILAR TO '[a-zA-Z]{1,30}',
			'El apellido materno: '|| $12 ||' no puede contener símbolos, números ni acentos...';
		INSERT INTO veterinario(curp, salario, genero, fechanacimiento, telefono, calle, numcalle, estado,
								codigopostal, nombre, apellidopaterno, apellidomaterno, rfc, numpacientesactivos,
								horaentrada, horasalida)
		VALUES (curpN, salarioN, generoN, fnacN, telN, calleN, numcalleN, estadoN, codpostN, nombreN, paternoN,
				maternoN, rfcN, pacientesN, entradaN, salidaN);
	END;
	$$
	LANGUAGE plpgsql;

CALL agregarVeterinario('AAPV010324HDFRMLA9', 20000, 'F', '2001-03-24', '5511443589', 'Pino', 21, 'CDMX', '09839', 'Vamos',
						'Ainvadir', 'Polonia', 'AIPV010324HHH', 4, '10:00:00', '13:00:00');
						
CREATE OR REPLACE PROCEDURE eliminarVeterinario(curpVet IN CHAR(18)) AS $$
	BEGIN
		DELETE FROM veterinario WHERE curp = curpVet;
	END;
	$$
	LANGUAGE plpgsql;

CALL eliminarVeterinario('AAPV010324HDFRMLA9');