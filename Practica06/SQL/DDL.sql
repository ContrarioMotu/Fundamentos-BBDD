DROP SCHEMA IF EXISTS public CASCADE; --Borrar todo

CREATE SCHEMA public;  -- Creamos el esquema publico

-- Tabla Supervisor
CREATE TABLE Supervisor (
		CURP CHAR(18) NOT NULL UNIQUE CHECK (CHAR_LENGTH(CURP) = 18 AND CURP SIMILAR TO '[A-Z0-9]{18}') PRIMARY KEY ,
		Salario INT NOT NULL CHECK (Salario > 0),
		Genero CHAR(1) NOT NULL CHECK (CHAR_LENGTH(Genero) = 1 AND Genero = 'M' OR Genero = 'F'),
		FechaNacimiento DATE NOT NULL,   
		Telefono CHAR(10) NOT NULL CHECK (CHAR_LENGTH(Telefono) = 10 AND Telefono SIMILAR TO '[0-9]{10}'),
		Calle VARCHAR(30) NOT NULL,
		NumCalle INT NOT NULL CHECK (NumCalle > 0),
		Estado VARCHAR(30) NOT NULL,
		CodigoPostal  CHAR(5) NOT NULL CHECK (CHAR_LENGTH(CodigoPostal) = 5 AND CodigoPostal SIMILAR TO '[0-9]{5}'),
		Nombre VARCHAR(30) NOT NULL,
		ApellidoPaterno VARCHAR(30) NOT NULL,
		ApellidoMaterno VARCHAR(30) NOT NULL, 
		RFC CHAR(13) NOT NULL UNIQUE CHECK (CHAR_LENGTH(RFC) = 13 AND RFC SIMILAR TO '[A-Z0-9]{13}')
 	);

--Tabla Veterinario
CREATE TABLE Veterinario (
		CURP CHAR(18) NOT NULL UNIQUE CHECK (CHAR_LENGTH(CURP) = 18 AND CURP SIMILAR TO '[A-Z0-9]{18}') PRIMARY KEY ,
		Salario INT NOT NULL CHECK (Salario > 0),
		Genero CHAR(1) NOT NULL CHECK (CHAR_LENGTH(Genero) = 1 AND Genero = 'M' OR Genero = 'F'),
		FechaNacimiento DATE NOT NULL,   
		Telefono CHAR(10) NOT NULL CHECK (CHAR_LENGTH(Telefono) = 10 AND Telefono SIMILAR TO '[0-9]{10}'),
		Calle VARCHAR(30) NOT NULL,
		NumCalle INT NOT NULL CHECK (NumCalle > 0),
		Estado VARCHAR(30) NOT NULL,
		CodigoPostal  CHAR(5) NOT NULL CHECK (CHAR_LENGTH(CodigoPostal) = 5 AND CodigoPostal SIMILAR TO '[0-9]{5}'),
		Nombre VARCHAR(30) NOT NULL,
		ApellidoPaterno VARCHAR(30) NOT NULL,
		ApellidoMaterno VARCHAR(30) NOT NULL, 
		RFC CHAR(13) NOT NULL UNIQUE CHECK (CHAR_LENGTH(RFC) = 13 AND RFC SIMILAR TO '[A-Z0-9]{13}'),
		NumPacientesActivos INT NOT NULL CHECK (NumPacientesActivos BETWEEN 0 AND 10),  
		HoraEntrada TIME NOT NULL,
		HoraSalida TIME NOT NULL
	);
	
-- Tabla Estilista
CREATE TABLE Estilista (
		CURP CHAR(18) NOT NULL UNIQUE CHECK (CHAR_LENGTH(CURP) = 18 AND CURP SIMILAR TO '[A-Z0-9]{18}') PRIMARY KEY ,
		Salario INT NOT NULL CHECK (Salario > 0),
		Genero CHAR(1) NOT NULL CHECK (CHAR_LENGTH(Genero) = 1 AND Genero = 'M' OR Genero = 'F'),
		FechaNacimiento DATE NOT NULL,   
		Telefono CHAR(10) NOT NULL CHECK (CHAR_LENGTH(Telefono) = 10 AND Telefono SIMILAR TO '[0-9]{10}'),
		Calle VARCHAR(30) NOT NULL,
		NumCalle INT NOT NULL CHECK (NumCalle > 0),
		Estado VARCHAR(30) NOT NULL,
		CodigoPostal  CHAR(5) NOT NULL CHECK (CHAR_LENGTH(CodigoPostal) = 5 AND CodigoPostal SIMILAR TO '[0-9]{5}'),
		Nombre VARCHAR(30) NOT NULL,
		ApellidoPaterno VARCHAR(30) NOT NULL,
		ApellidoMaterno VARCHAR(30) NOT NULL,
		NumeroDeCertificado CHAR(13) NOT NULL UNIQUE CHECK (CHAR_LENGTH(NumeroDeCertificado) = 13 AND NumeroDeCertificado SIMILAR TO '[0-9]{13}')
	);

-- Tabla Estetica
CREATE TABLE Estetica(
		idEstetica SERIAL PRIMARY KEY,
		Nombre VARCHAR(64) NOT NULL,
		Telefono CHAR(10) NOT NULL CHECK (CHAR_LENGTH(Telefono) = 10 AND Telefono SIMILAR TO '[0-9]{10}'),
		Calle VARCHAR(30) NOT NULL,
		NumCalle INT NOT NULL CHECK (NumCalle > 0),
		Estado VARCHAR(30) NOT NULL,
		CodigoPostal  CHAR(5) NOT NULL CHECK (CHAR_LENGTH(CodigoPostal) = 5 AND CodigoPostal SIMILAR TO '[0-9]{5}'),
		HoraInicio TIME NOT NULL,
		HoraFin TIME NOT NULL,
		NumConsultorios INT NOT NULL CHECK (NumConsultorios > 0 AND NumConsultorios < 5)
	);

-- Tabla Producto
CREATE TABLE Producto (
		idProducto SERIAL PRIMARY KEY,
		Nombre VARCHAR(64) NOT NULL,
		Precio REAL NOT NULL CHECK (Precio > 0),
		Descripcion TEXT NOT NULL,
		CantidadDisponible INT NOT NULL CHECK (CantidadDisponible > 0),
		Imagen VARCHAR(64) NOT NULL
	);

-- Tabla Duenio
CREATE TABLE Duenio (
		CURP CHAR(18) NOT NULL UNIQUE CHECK (CHAR_LENGTH(CURP) = 18 AND CURP SIMILAR TO '[A-Z0-9]{18}') PRIMARY KEY ,
		FechaNacimiento DATE NOT NULL,   
		Telefono CHAR(10) NOT NULL CHECK (CHAR_LENGTH(Telefono) = 10 AND Telefono SIMILAR TO '[0-9]{10}'),
		Calle VARCHAR(30) NOT NULL,
		NumCalle INT NOT NULL CHECK (NumCalle > 0),
		Estado VARCHAR(30) NOT NULL,
		CodigoPostal  CHAR(5) NOT NULL CHECK (CHAR_LENGTH(CodigoPostal) = 5 AND CodigoPostal SIMILAR TO '[0-9]{5}'),
		Nombre VARCHAR(30) NOT NULL,
		ApellidoPaterno VARCHAR(30) NOT NULL,
		ApellidoMaterno VARCHAR(30) NOT NULL,
		Email VARCHAR(64)		
	);


-- Tabla Mascota
CREATE TABLE Mascota (
		idMascota SERIAL PRIMARY KEY,
		CURPDuenio CHAR(18) NOT NULL REFERENCES Duenio (CURP),
		Nombre VARCHAR(30) NOT NULL,
		FechaNacimiento DATE NOT NULL,
		Especie VARCHAR(30) NOT NULL,
		Raza VARCHAR(30) NOT NULL,
		Peso REAL NOT NULL
	);

-- Tabla Medicamento
CREATE TABLE Medicamento(
		idMedicamento INT UNIQUE PRIMARY KEY REFERENCES Producto (idProducto),
		fechaCaducidad DATE NOT NULL
	);

-- Tabla Alimento
CREATE TABLE Alimento(
		idAlimento INT UNIQUE PRIMARY KEY REFERENCES Producto (idProducto),
		fechaCaducidad DATE NOT NULL
	);

-- Tabla OfertarProducto
CREATE TABLE OfertarProducto (
		idProducto INT NOT NULL REFERENCES Producto (idProducto),
		idEstetica INT NOT NULL REFERENCES Estetica (idEstetica)
	);

-- Tabla OfertarAlimento
CREATE TABLE OfertarAlimeto (
		idAlimento INT NOT NULL REFERENCES Alimento (idAlimento),
		idEstetica INT NOT NULL REFERENCES Estetica (idEstetica)
	);

-- Tabla OfertarMedicamento
CREATE TABLE OfertarMedicamento (
		idMedicamento INT NOT NULL REFERENCES Medicamento (idMedicamento),
		idEstetica INT NOT NULL REFERENCES Estetica (idEstetica)
	);

-- Tabla ConsultaEmergencia 
CREATE TABLE ConsultaEmergencia(
		idConsultaEmergencia SERIAL PRIMARY KEY, 
		idMascota SERIAL NOT NULL REFERENCES Mascota (idMascota),
		CURPVeterinario CHAR(18) NOT NULL REFERENCES Veterinario (CURP),
		codigoEmergencia INT NOT NULL,
		procedimiento TEXT NOT NULL
	);

-- Tabla Sintoma 
CREATE TABLE sintoma (
	idConsultaEmergencia INT REFERENCES ConsultaEmergencia (idConsultaEmergencia),
	Sintoma TEXT,
	PRIMARY KEY (idConsultaEmergencia, Sintoma)
);

-- Tabla ConsultaNormal
CREATE TABLE consultaNormal (
		idConsultaNormal SERIAL PRIMARY KEY, 
		idMascota INT NOT NULL REFERENCES Mascota (idMascota),
		CURPVeterinario CHAR(18) NOT NULL REFERENCES Veterinario (CURP),
		estadoSaludMascota TEXT NOT NULL,
		motivoConsulta TEXT NOT NULL,
		fechaSigConsulta DATE NOT NULL
	);

-- Tabla MetodoPago
CREATE TABLE metodoPago (
		idMetodoPago SERIAL PRIMARY KEY,
		CURPDuenio CHAR(18) NOT NULL REFERENCES Duenio (CURP),
		fechaVencimiento DATE NOT NULL CHECK (fechaVencimiento != NOW()),
		numTarjeta CHAR(19) NOT NULL CHECK (CHAR_LENGTH(numTarjeta) <=19 AND CHAR_LENGTH(numTarjeta) >= 15 AND CURPDuenio SIMILAR TO '[0-9]{18}'),
		nombreTitular VARCHAR(60) NOT NULL,
		esTarjeta BIT NOT NULL,
		esEfectivo BIT NOT NULL
	);

-- Tabla Recibo
CREATE TABLE recibo (
		idRecibo SERIAL PRIMARY KEY,
		idEstetica SERIAL NOT NULL REFERENCES Estetica(idEstetica),
		idMetodoPago SERIAL NOT NULL REFERENCES metodoPago(idMetodoPago),
		nombreDueño VARCHAR(30) NOT NULL,
		nombreTrabajador VARCHAR(30) NOT NULL,
		costo REAL NOT NULL CHECK (costo>0)
	);

-- Tabla generarReciboConsultaNormal
CREATE TABLE generarReciboConsNormal(
		idRecibo SERIAL NOT NULL REFERENCES recibo (idRecibo),
		idConsultaNormal SERIAL NOT NULL REFERENCES consultaNormal(idConsultaNormal),
		nombreDueño VARCHAR(30) NOT NULL,
		nombreMascota VARCHAR(30) NOT NULL,
		nombreTrabajador VARCHAR(30) NOT NULL,
		costo REAL NOT NULL CHECK (costo>0),
		estadoSaludMascota TEXT NOT NULL,
		motivoConsulta TEXT NOT NULL,
		fechaSigConsulta DATE NOT NULL
	);

-- Tabla generarReciboConsEmergencia
CREATE TABLE generarReciboConsEmergencia(
		idRecibo SERIAL NOT NULL REFERENCES recibo (idRecibo),
		idConsultaEmergencia SERIAL NOT NULL REFERENCES consultaEmergencia(idConsultaEmergencia),
		nombreDueño VARCHAR(30) NOT NULL,
		nombreMascota VARCHAR(30) NOT NULL,
		nombreTrabajador VARCHAR(30) NOT NULL,
		costo REAL NOT NULL CHECK (costo>0),
		codigoEmergencia INT NOT NULL,
		procedimiento TEXT NOT NULL
	);

-- Tabla Recetar
CREATE TABLE recetar(
	idMedicamento INT NOT NULL REFERENCES medicamento (idMedicamento),
	idConsulta INT NOT NULL REFERENCES consultaNormal (idConsultaNormal)
);

-- Tabla Apartado
CREATE TABLE apartado(
	idApartado SERIAL PRIMARY KEY,
	idEstetica INT NOT NULL REFERENCES estetica (idEstetica),
	uso TEXT NOT NULL
);

--Tabla Servicio
CREATE TABLE servicio(
	idRecibo SERIAL NOT NULL REFERENCES recibo (idRecibo),
	servicio TEXT NOT NULL,
  	PRIMARY KEY(idRecibo, servicio)
);

-- Tabla Informar
CREATE TABLE informar(
		idEstetica INT NOT NULL REFERENCES estetica (idEstetica),
		CURP CHAR(18) NOT NULL UNIQUE CHECK (CHAR_LENGTH(CURP) = 18 AND CURP SIMILAR TO '[A-Z0-9]{18}') REFERENCES supervisor (CURP),
		nombreEstetica VARCHAR(64) NOT NULL,
		telefonoEstetica CHAR(10) NOT NULL CHECK (CHAR_LENGTH(telefonoEstetica) = 10 AND telefonoEstetica SIMILAR TO '[0-9]{10}'),
		calleEstetica VARCHAR(30) NOT NULL,
		numeroCalleEstetica INT NOT NULL CHECK (numeroCalleEstetica > 0),
		estadoEstetica VARCHAR(30) NOT NULL,
		codigoPostalEstetica CHAR(5) NOT NULL CHECK (CHAR_LENGTH(codigoPostalEstetica) = 5 AND codigoPostalEstetica SIMILAR TO '[0-9]{5}'),
		horaInicio  TIME NOT NULL,
		horaFin TIME NOT NULL,
		NumConsultorios INT NOT NULL CHECK (NumConsultorios > 0 AND NumConsultorios < 5),
		nombreSupervisor VARCHAR(30) NOT NULL,
		apellidoPaterno VARCHAR(30) NOT NULL,
		apellidoMaterno VARCHAR(30) NOT NULL,
		fechaNacimiento DATE NOT NULL,
		telefonoSupervisor CHAR(10) NOT NULL CHECK (CHAR_LENGTH(telefonoSupervisor) = 10 AND telefonoSupervisor SIMILAR TO '[0-9]{10}'),
		calleSupervisor VARCHAR(30) NOT NULL,
		numeroCalleSupervisor INT NOT NULL CHECK (numeroCalleSupervisor > 0),
		estadoSupervisor VARCHAR(30) NOT NULL,
		codigoPostalSupervisor CHAR(5) NOT NULL CHECK (CHAR_LENGTH(codigoPostalSupervisor) = 5 AND codigoPostalSupervisor SIMILAR TO '[0-9]{5}'),
		genero CHAR(1) NOT NULL CHECK (CHAR_LENGTH(Genero) = 1 AND Genero = 'M' OR Genero = 'F'),
		salario INT NOT NULL CHECK (Salario > 0),
		RFC CHAR(13) NOT NULL UNIQUE CHECK (CHAR_LENGTH(RFC) = 13 AND RFC SIMILAR TO '[A-Z0-9]{13}')
	);
