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

COMMENT ON TABLE Supervisor IS 'Tabla que contiene a los supervisores de las Esteticas';
COMMENT ON COLUMN Supervisor.CURP IS 'CURP de los supervisores y que sirve para identificarlos';
COMMENT ON COLUMN Supervisor.Salario IS 'Salario de los supervisores';
COMMENT ON COLUMN Supervisor.Genero IS 'Genero de los supervisores';
COMMENT ON COLUMN Supervisor.FechaNacimiento IS 'Fecha de nacimiento de los supervisores';
COMMENT ON COLUMN Supervisor.Telefono IS 'Telefono de los supervisores';
COMMENT ON COLUMN Supervisor.Calle IS 'Calle donde vive cada supervisor';
COMMENT ON COLUMN Supervisor.NumCalle IS 'Numero donde vive cada supervisor';
COMMENT ON COLUMN Supervisor.Estado IS 'Estado donde vive cada supervisor';
COMMENT ON COLUMN Supervisor.CodigoPostal IS 'Codigo postal del lugar en donde vive cada supervisor';
COMMENT ON COLUMN Supervisor.Nombre IS 'Nombre de los supervisores';
COMMENT ON COLUMN Supervisor.ApellidoPaterno IS 'Apellido paterno de los supervisores';
COMMENT ON COLUMN Supervisor.ApellidoMaterno IS 'Apellido materno de los supervisores';
COMMENT ON COLUMN Supervisor.RFC IS 'RFC de cada supervisor';
COMMENT ON CONSTRAINT supervisor_pkey ON Supervisor IS 'La llave primaria de la tabla Supervisor';

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

COMMENT ON TABLE Veterinario IS 'Tabla que contiene a los veterinarios';
COMMENT ON COLUMN Veterinario.CURP IS 'CURP es el identificador de los veterinarios';
COMMENT ON COLUMN Veterinario.Salario IS 'Salario del veterinario';
COMMENT ON COLUMN Veterinario.Genero IS 'Genero del veterinario';
COMMENT ON COLUMN Veterinario.FechaNacimiento IS 'Fecha de nacimiento del veterinario';
COMMENT ON COLUMN Veterinario.Telefono IS 'Telefono del veterinario';
COMMENT ON COLUMN Veterinario.Calle IS 'Calle donde vive el veterinario';
COMMENT ON COLUMN Veterinario.NumCalle IS 'Numero donde vive el veterinario';
COMMENT ON COLUMN Veterinario.Estado IS 'Estado donde vive el veterinario';
COMMENT ON COLUMN Veterinario.CodigoPostal IS 'Codigo postal del lugar en donde vive el veterinario';
COMMENT ON COLUMN Veterinario.Nombre IS 'Nombre del veterinario';
COMMENT ON COLUMN Veterinario.ApellidoPaterno IS 'Apellido paterno del veterinario';
COMMENT ON COLUMN Veterinario.ApellidoMaterno IS 'Apellido materno del veterinario';
COMMENT ON COLUMN Veterinario.RFC IS 'RFC del veterinario';
COMMENT ON COLUMN Veterinario.NumPacientesActivos IS 'Numero de pacientes activos que el veterinario está viendo';
COMMENT ON COLUMN Veterinario.HoraEntrada IS 'Hora en la que un veterinario inicia su turno';
COMMENT ON COLUMN Veterinario.HoraSalida IS 'Hora en la que un veterinario finaliza su turno';
COMMENT ON CONSTRAINT veterinario_pkey ON Veterinario IS 'La llave primaria de la tabla Veterinario';


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

COMMENT ON TABLE Estilista IS 'Tabla que contiene a los estiistas';
COMMENT ON COLUMN Estilista.CURP IS 'CURP es el identificador de los estilistas';    
COMMENT ON COLUMN Estilista.Salario IS 'Salario del estilista';
COMMENT ON COLUMN Estilista.Genero IS 'Genero del estilista';
COMMENT ON COLUMN Estilista.FechaNacimiento IS 'Fecha de nacimiento del estilista';
COMMENT ON COLUMN Estilista.Telefono IS 'Telefono del estilista';
COMMENT ON COLUMN Estilista.Calle IS 'Calle donde vive el estilista';
COMMENT ON COLUMN Estilista.NumCalle IS 'Numero donde vive el estilista';
COMMENT ON COLUMN Estilista.Estado IS 'Estado donde vive el estilista';
COMMENT ON COLUMN Estilista.CodigoPostal IS 'Codigo postal del lugar en donde vive el estilista';
COMMENT ON COLUMN Estilista.Nombre IS 'Nombre del estilista';
COMMENT ON COLUMN Estilista.ApellidoPaterno IS 'Apellido paterno del estilista';
COMMENT ON COLUMN Estilista.ApellidoMaterno IS 'Apellido materno del estilista';
COMMENT ON COLUMN Estilista.NumeroDeCertificado IS 'Numero de certificado del estilista';
COMMENT ON CONSTRAINT estilista_pkey ON Estilista IS 'La llave primaria de la tabla Estilista';

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
COMMENT ON TABLE Estetica IS 'Tabla que contiene las estéticas';
COMMENT ON COLUMN Estetica.idEstetica IS 'Identificador de las estéticas';
COMMENT ON COLUMN Estetica.Nombre IS 'Nombre de las estéticas';
COMMENT ON COLUMN Estetica.Telefono IS 'Telefono de las estéticas';
COMMENT ON COLUMN Estetica.Calle IS 'Calle donde está ubicada la estetica';
COMMENT ON COLUMN Estetica.NumCalle IS 'Numero de la calle donde está ubicada la estetica';
COMMENT ON COLUMN Estetica.Estado IS 'Estado donde está ubicada la estetica';
COMMENT ON COLUMN Estetica.CodigoPostal IS 'Código postal del lugar donde está ubicada la estetica';
COMMENT ON COLUMN Estetica.HoraInicio IS 'Hora en la que se abre la estetica';
COMMENT ON COLUMN Estetica.HoraFin IS 'Hora en la que se cierra la estetica';
COMMENT ON COLUMN Estetica.NumConsultorios IS 'Numero de consultorios que tiene la estetica';
COMMENT ON CONSTRAINT estetica_pkey ON Estetica IS 'La llave primaria de la tabla Estetica';

-- Tabla Producto
CREATE TABLE Producto (
    	idProducto SERIAL PRIMARY KEY,
    	Nombre VARCHAR(64) NOT NULL,
    	Precio REAL NOT NULL CHECK (Precio > 0),
    	Descripcion TEXT NOT NULL,
    	CantidadDisponible INT NOT NULL CHECK (CantidadDisponible > 0),
    	Imagen VARCHAR(64) NOT NULL
	);

COMMENT ON TABLE Producto IS 'Tabla que contiene la informacion de los productos';
COMMENT ON COLUMN Producto.idProducto IS 'Identificador de los productos';
COMMENT ON COLUMN Producto.Nombre IS 'Nombre de los productos';
COMMENT ON COLUMN Producto.Precio IS 'Precio de los productos';
COMMENT ON COLUMN Producto.Descripcion IS 'Descripcion de los productos';
COMMENT ON COLUMN Producto.CantidadDisponible IS 'Cntidad disponible de productos';
COMMENT ON COLUMN Producto.Imagen IS 'Nombre del archivo donde se encuentra una imagen del producto';
COMMENT ON CONSTRAINT producto_pkey ON Producto IS 'La llave primaria de producto';


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
COMMENT ON TABLE Duenio IS 'Tabla que contiene a los dueños';
COMMENT ON COLUMN Duenio.CURP IS 'CURP es el identificador de los dueños';    
COMMENT ON COLUMN Duenio.FechaNacimiento IS 'Fecha de nacimiento del dueño';
COMMENT ON COLUMN Duenio.Telefono IS 'Telefono del dueno';
COMMENT ON COLUMN Duenio.Calle IS 'Calle donde vive el dueño';
COMMENT ON COLUMN Duenio.NumCalle IS 'Numero donde vive el dueño';
COMMENT ON COLUMN Duenio.Estado IS 'Estado donde vive el dueño';
COMMENT ON COLUMN Duenio.CodigoPostal IS 'Codigo postal del lugar en donde vive el dueño';
COMMENT ON COLUMN Duenio.Nombre IS 'Nombre del dueño';
COMMENT ON COLUMN Duenio.ApellidoPaterno IS 'Apellido paterno del dueño';
COMMENT ON COLUMN Duenio.ApellidoMaterno IS 'Apellido materno del dueño';
COMMENT ON COLUMN Duenio.Email IS 'email del dueño';
COMMENT ON CONSTRAINT duenio_pkey ON Duenio IS 'La llave primario de dueño';


-- Tabla Mascota
CREATE TABLE Mascota (
    	idMascota SERIAL PRIMARY KEY,
    	CURPDuenio CHAR(18) NOT NULL REFERENCES Duenio (CURP) ON DELETE CASCADE ON UPDATE CASCADE,
    	Nombre VARCHAR(30) NOT NULL,
    	FechaNacimiento DATE NOT NULL,
    	Especie VARCHAR(30) NOT NULL,
    	Raza VARCHAR(30) NOT NULL,
    	Peso REAL NOT NULL
	);
COMMENT ON TABLE Mascota IS 'Tabla que contiene a las mascotas';
COMMENT ON COLUMN Mascota.idMascota IS 'Identificador de las mascotas';
COMMENT ON COLUMN Mascota.CURPDuenio IS 'CURP del dueño de la mascota';
COMMENT ON COLUMN Mascota.Nombre IS 'Nombre de la mascota';
COMMENT ON COLUMN Mascota.FechaNacimiento IS 'Fecha de nacimiento de la mascota';
COMMENT ON COLUMN Mascota.Especie IS 'Especie de la mascota';
COMMENT ON COLUMN Mascota.Raza IS 'Raza de la mascota';
COMMENT ON COLUMN Mascota.Peso IS 'Peso de la mascota';
COMMENT ON CONSTRAINT mascota_pkey ON Mascota IS 'La llave primaria de la tabla Mascota';
COMMENT ON CONSTRAINT mascota_curpduenio_fkey ON Mascota IS 'La llave foranea de la tabla Mascota que referencia al CURP de Duenio';

-- Tabla Medicamento
CREATE TABLE Medicamento(
    	idMedicamento INT UNIQUE PRIMARY KEY REFERENCES Producto (idProducto) ON DELETE CASCADE ON UPDATE CASCADE,
    	fechaCaducidad DATE NOT NULL
	);
COMMENT ON TABLE Medicamento IS 'Tabla que contiene los medicamentos';
COMMENT ON COLUMN Medicamento.idMedicamento IS 'Identificador de los medicamentos';
COMMENT ON COLUMN Medicamento.fechaCaducidad IS 'Fecha de caducidad de los medicamentos';
COMMENT ON CONSTRAINT medicamento_pkey ON Medicamento IS 'La llave primaria de la tabla Medicamento';
COMMENT ON CONSTRAINT medicamento_idmedicamento_fkey ON Medicamento IS 'La llave foranea de la tabla Medicamento que apunta a idProducto de Producto';

-- Tabla Alimento
CREATE TABLE Alimento(
    	idAlimento INT UNIQUE PRIMARY KEY REFERENCES Producto (idProducto) ON DELETE CASCADE ON UPDATE CASCADE,
    	fechaCaducidad DATE NOT NULL
	);
COMMENT ON TABLE Alimento IS 'Tabla que contiene los alimentos';
COMMENT ON COLUMN Alimento.idAlimento IS 'Identificador de los Alimentos';
COMMENT ON COLUMN Alimento.fechaCaducidad IS 'Fecha de caducidad de los alimentos';
COMMENT ON CONSTRAINT alimento_pkey ON Alimento IS 'La llave primaria de la tablaAlimento';
COMMENT ON CONSTRAINT alimento_idalimento_fkey ON Alimento IS 'La llave foranea de la tabla Alimento que apunta a idProducto de Producto';

-- Tabla OfertarProducto
CREATE TABLE OfertarProducto (
    	idProducto INT NOT NULL REFERENCES Producto (idProducto) ON DELETE CASCADE ON UPDATE CASCADE,
    	idEstetica INT NOT NULL REFERENCES Estetica (idEstetica) ON DELETE CASCADE ON UPDATE CASCADE
	);
COMMENT ON TABLE OfertarProducto IS 'Tabla de la relación ofertar Producto';
COMMENT ON COLUMN OfertarProducto.idProducto IS 'Id del producto que se oferta';
COMMENT ON COLUMN OfertarProducto.idEstetica IS 'Id de la estética donde se oferta el producto';
COMMENT ON CONSTRAINT ofertarproducto_idestetica_fkey ON OfertarProducto IS 'La llave foranea de la tabla OfertarProducto que apunta a idEstetica de Estetica';
COMMENT ON CONSTRAINT ofertarproducto_idproducto_fkey ON OfertarProducto IS 'La llave foranea de la tabla OfertarProducto que apunta a idProducto de Producto';

-- Tabla OfertarAlimento
CREATE TABLE OfertarAlimento (
    	idAlimento INT NOT NULL REFERENCES Alimento (idAlimento) ON DELETE CASCADE ON UPDATE CASCADE,
    	idEstetica INT NOT NULL REFERENCES Estetica (idEstetica) ON DELETE CASCADE ON UPDATE CASCADE
	);
COMMENT ON TABLE OfertarAlimento IS 'Tabla de la relación ofertar alimento';
COMMENT ON COLUMN OfertarAlimento.idAlimento IS 'Id del alimento que se oferta';
COMMENT ON COLUMN OfertarAlimento.idEstetica IS 'Id de la estética donde se oferta el alimento';
COMMENT ON CONSTRAINT ofertaralimento_idestetica_fkey ON OfertarAlimento IS 'La llave foranea de la tabla OfertarAlimento que apunta a idEstetica de Estetica';
COMMENT ON CONSTRAINT ofertaralimento_idalimento_fkey ON OfertarAlimento IS 'La llave foranea de la tabla OfertarAlimento que apunta a idAlimento de Alimento';

-- Tabla OfertarMedicamento
CREATE TABLE OfertarMedicamento (
    	idMedicamento INT NOT NULL REFERENCES Medicamento (idMedicamento) ON DELETE CASCADE ON UPDATE CASCADE,
    	idEstetica INT NOT NULL REFERENCES Estetica (idEstetica) ON DELETE CASCADE ON UPDATE CASCADE
	);
COMMENT ON TABLE OfertarMedicamento IS 'Tabla de la relación ofertar medicamento';
COMMENT ON COLUMN OfertarMedicamento.idMedicamento IS 'Id del medicamento que se oferta';
COMMENT ON COLUMN OfertarMedicamento.idEstetica IS 'Id del medicamento donde se oferta el alimento';
COMMENT ON CONSTRAINT ofertarmedicamento_idestetica_fkey ON OfertarMedicamento IS 'La llave foranea de la tabla OfertarMedicamento que apunta a idEstetica de Estetica';
COMMENT ON CONSTRAINT ofertarmedicamento_idmedicamento_fkey ON OfertarMedicamento IS 'La llave foranea de la tabla OfertarMedicamento que apunta a idMedicamento de Medicamento';


-- Tabla ConsultaEmergencia
CREATE TABLE ConsultaEmergencia(
    	idConsultaEmergencia SERIAL PRIMARY KEY,
    	idMascota INT NOT NULL REFERENCES Mascota (idMascota) ON DELETE CASCADE ON UPDATE CASCADE,
    	CURPVeterinario CHAR(18) NOT NULL REFERENCES Veterinario (CURP) ON DELETE CASCADE ON UPDATE CASCADE,
    	codigoEmergencia INT NOT NULL,
    	procedimiento TEXT NOT NULL
	);
COMMENT ON TABLE ConsultaEmergencia IS 'Tabla que contiene las consultas de emergencia';
COMMENT ON COLUMN ConsultaEmergencia.idConsultaEmergencia IS 'Identificador de la consulta de emergencia';
COMMENT ON COLUMN ConsultaEmergencia.idMascota IS 'Identificador de la mascota que tuvo que ser atendida de emergencia';
COMMENT ON COLUMN ConsultaEmergencia.CURPVeterinario IS 'CURP del veterinario que atendió la emergencia';
COMMENT ON COLUMN ConsultaEmergencia.codigoEmergencia IS 'Código asociado al tipo de emergencia';
COMMENT ON COLUMN ConsultaEmergencia.procedimiento IS 'Descripción del procedimiento que se llevó a cabo';
COMMENT ON CONSTRAINT consultaemergencia_pkey ON ConsultaEmergencia IS 'La llave primaria de la tabla ConsultaEmergencia';
COMMENT ON CONSTRAINT consultaemergencia_curpveterinario_fkey ON ConsultaEmergencia IS 'La llave foranea de la tabla ConsultaEmergencia que apunta a CURP de Veterinario';
COMMENT ON CONSTRAINT consultaemergencia_idmascota_fkey ON ConsultaEmergencia IS 'La llave foranea de la tabla ConsultaEmergencia que apunta a idMascota de Mascota';

-- Tabla Sintoma
CREATE TABLE Sintoma (
	idConsultaEmergencia INT REFERENCES ConsultaEmergencia (idConsultaEmergencia) ON DELETE CASCADE ON UPDATE CASCADE,
	Sintoma TEXT,
	PRIMARY KEY (idConsultaEmergencia, Sintoma)
);
COMMENT ON TABLE Sintoma IS 'Tabla que contiene los síntomas';
COMMENT ON COLUMN Sintoma.idConsultaEmergencia IS 'Id de la consulta a la que está asociado el sintoma';
COMMENT ON COLUMN Sintoma.Sintoma IS 'Descripción del síntoma';
COMMENT ON CONSTRAINT sintoma_idconsultaemergencia_fkey ON Sintoma IS 'La llave foranea de la tabla Sintoma que apunta a idConsultaEmergencia de ConsultaEmergencia';

-- Tabla ConsultaNormal
CREATE TABLE consultaNormal (
    	idConsultaNormal SERIAL PRIMARY KEY,
    	idMascota INT NOT NULL REFERENCES Mascota (idMascota) ON DELETE CASCADE ON UPDATE CASCADE,
    	CURPVeterinario CHAR(18) NOT NULL REFERENCES Veterinario (CURP) ON DELETE CASCADE ON UPDATE CASCADE,
    	estadoSaludMascota TEXT NOT NULL,
    	motivoConsulta TEXT NOT NULL,
    	fechaSigConsulta DATE NOT NULL
	);
COMMENT ON TABLE ConsultaNormal IS 'Tabla que contiene las consultas normales';
COMMENT ON COLUMN ConsultaNormal.idConsultaNormal IS 'Identificador de la consulta';
COMMENT ON COLUMN ConsultaNormal.idMascota IS 'Identificador de la mascota que asiste a consulta';
COMMENT ON COLUMN ConsultaNormal.CURPVeterinario IS 'Curp del veterianrio que atiende la consulta';
COMMENT ON COLUMN ConsultaNormal.estadoSaludMascota IS 'Descripcion de la salud de la mascota';
COMMENT ON COLUMN ConsultaNormal.motivoConsulta IS 'Motivo del por qué se agendó la consulta';
COMMENT ON COLUMN ConsultaNormal.fechaSigConsulta IS 'Fecha de próxima consulta';
COMMENT ON CONSTRAINT ConsultaNormal_pkey ON consultaNormal IS 'La llave primaria de la tabla ConsultaNormal';
COMMENT ON CONSTRAINT consultanormal_curpveterinario_fkey ON ConsultaNormal IS 'La llave foranea de la tabla ConsultaNormal que apunta a CURP de Veterinario';
COMMENT ON CONSTRAINT consultanormal_idmascota_fkey ON ConsultaNormal IS 'La llave foranea de la tabla ConsultaNormal que apunta a idMascota de Mascota';

-- Tabla MetodoPago
CREATE TABLE metodoPago (
    	idMetodoPago SERIAL PRIMARY KEY,
    	CURPDuenio CHAR(18) NOT NULL REFERENCES Duenio (CURP) ON DELETE CASCADE ON UPDATE CASCADE,
    	fechaVencimiento DATE NOT NULL CHECK (fechaVencimiento != NOW()),
    	numTarjeta CHAR(19) NOT NULL CHECK (CHAR_LENGTH(numTarjeta) <=19 AND CHAR_LENGTH(numTarjeta) >= 15 AND CURPDuenio SIMILAR TO '[0-9]{18}'),
    	nombreTitular VARCHAR(60) NOT NULL,
    	esTarjeta BIT NOT NULL,
    	esEfectivo BIT NOT NULL
	);
COMMENT ON TABLE MetodoPago IS 'Tabla que contiene los metodos de pago';
COMMENT ON COLUMN MetodoPago.idMetodoPago IS 'Identificado del metodo de pago';
COMMENT ON COLUMN MetodoPago.CURPDuenio IS 'Identificador del cliente que va a pagar';
COMMENT ON COLUMN MetodoPago.fechaVencimiento IS 'Fecha de vencimiento de la tarjeta con la que el cliente va a pagar';
COMMENT ON COLUMN MetodoPago.numTarjeta IS 'Tarjeta con la que el cliente va a pagar';
COMMENT ON COLUMN MetodoPago.nombreTitular IS 'Nombre del titular de la tarjeta con la que el cliente va a pagar';
COMMENT ON COLUMN MetodoPago.esTarjeta IS 'Boolean que nos indica si el cliente va a pagar con tarjeta';
COMMENT ON COLUMN MetodoPago.esEfectivo IS 'Boolean que nos indica si el cliente va a pagar con efectivo';
COMMENT ON CONSTRAINT MetodoPago_pkey ON MetodoPago IS 'La llave primaria de la tabla MetodoPago';
COMMENT ON CONSTRAINT metodopago_curpduenio_fkey ON metodoPago IS 'La llave foranea de la tabla metodoPago que apunta a CURP de Duenio';

-- Tabla Recibo
CREATE TABLE recibo (
    	idRecibo SERIAL PRIMARY KEY,
    	idEstetica SERIAL NOT NULL REFERENCES Estetica(idEstetica) ON DELETE CASCADE ON UPDATE CASCADE,
    	idMetodoPago SERIAL NOT NULL REFERENCES metodoPago(idMetodoPago) ON DELETE CASCADE ON UPDATE CASCADE,
    	nombreDuenio VARCHAR(30) NOT NULL,
    	nombreMascota VARCHAR(30) NOT NULL,
    	nombreTrabajador VARCHAR(30) NOT NULL,
    	costo REAL NOT NULL CHECK (costo>0)
	);
COMMENT ON TABLE recibo IS 'Tabla que contiene los recibos';
COMMENT ON COLUMN recibo.idRecibo IS 'Identificador de los recibos';
COMMENT ON COLUMN recibo.idEstetica IS 'Identificador de la estética donde se generó el recibo';
COMMENT ON COLUMN recibo.idMetodoPago IS 'Identificador del metodo con el que se va a pagar el recibo';
COMMENT ON COLUMN recibo.nombreDuenio IS 'Nombre de quien va a pagar el recibo';
COMMENT ON COLUMN recibo.nombreMascota IS 'Nombre de la mascota atendida';
COMMENT ON COLUMN recibo.nombreTrabajador IS 'Nombre de quien atendió y generó el recibo';
COMMENT ON COLUMN recibo.costo IS 'Costo a pagar';
COMMENT ON CONSTRAINT recibo_pkey ON recibo IS 'La llave primaria de la tabla Recibo';
COMMENT ON CONSTRAINT recibo_idestetica_fkey ON recibo IS 'La llave foranea de la tabla recibo que apunta a idEstetica de Estetica';
COMMENT ON CONSTRAINT recibo_idmetodopago_fkey ON recibo IS 'La llave foranea de la tabla recibo que apunta a idMetodoPago de metodoPago';

-- Tabla generarReciboConsultaNormal
CREATE TABLE generarReciboConsultaNormal(
    	idRecibo INT NOT NULL REFERENCES Recibo (idRecibo) ON DELETE CASCADE ON UPDATE CASCADE,
    	idConsultaNormal INT NOT NULL REFERENCES ConsultaNormal(idConsultaNormal) ON DELETE CASCADE ON UPDATE CASCADE,
    	idEstetica INT NOT NULL REFERENCES Estetica (idEstetica) ON DELETE CASCADE ON UPDATE CASCADE,
    	idMetodoPago INT NOT NULL REFERENCES MetodoPago (idMetodoPago) ON DELETE CASCADE ON UPDATE CASCADE,
    	nombreDuenio VARCHAR(30) NOT NULL,
    	nombreMascota VARCHAR(30) NOT NULL,
    	nombreTrabajador VARCHAR(30) NOT NULL,
    	costo REAL NOT NULL CHECK (costo>0),
    	estadoSaludMascota TEXT NOT NULL,
    	motivoConsulta TEXT NOT NULL,
    	fechaSigConsulta DATE NOT NULL
	);
COMMENT ON TABLE generarReciboConsultaNormal IS 'Tabla de la relación que genera los recibos de una consulta normal';
COMMENT ON COLUMN generarReciboConsultaNormal.idRecibo IS 'Identificador de los recibos';
COMMENT ON COLUMN generarReciboConsultaNormal.idEstetica IS 'Identificador de la estética donde se generó el recibo';
COMMENT ON COLUMN generarReciboConsultaNormal.idMetodoPago IS 'Identificador del metodo con el que se va a pagar el recibo';
COMMENT ON COLUMN generarReciboConsultaNormal.nombreDuenio IS 'Nombre de quien va a pagar el recibo';
COMMENT ON COLUMN generarReciboConsultaNormal.nombreTrabajador IS 'Nombre de quien atendió y generó el recibo';
COMMENT ON COLUMN generarReciboConsultaNormal.costo IS 'Costo a pagar';
COMMENT ON COLUMN generarReciboConsultaNormal.estadoSaludMascota IS 'Estado de salud de la mascota que fue atendida';
COMMENT ON COLUMN generarReciboConsultaNormal.motivoConsulta IS 'Motivo del por qué la mascota fue atendida';
COMMENT ON COLUMN generarReciboConsultaNormal.fechaSigConsulta IS 'Fecha próxima en la que la mascota debería de tener otra consulta';
COMMENT ON CONSTRAINT generarreciboconsultanormal_idconsultanormal_fkey ON generarReciboConsultaNormal IS 'La llave foranea de la tabla generarReciboConsultaNormal que apunta a idConsultaNormal de ConsultaNormal';
COMMENT ON CONSTRAINT generarreciboconsultanormal_idestetica_fkey ON generarReciboConsultaNormal IS 'La llave foranea de la tabla generarReciboConsultaNormal que apunta a idEstetica de Estetica';
COMMENT ON CONSTRAINT generarreciboconsultanormal_idmetodopago_fkey ON generarReciboConsultaNormal IS 'La llave foranea de la tabla generarReciboConsultaNormal que apunta a idMetodoPago de metodoPago';
COMMENT ON CONSTRAINT generarreciboconsultanormal_idrecibo_fkey ON generarReciboConsultaNormal IS 'La llave foranea de la tabla generarReciboConsultaNormal que apunta a idRecibo de recibo';

-- Tabla generarReciboConsEmergencia
CREATE TABLE generarReciboConsEmergencia(
    	idRecibo INT NOT NULL REFERENCES Recibo (idRecibo) ON DELETE CASCADE ON UPDATE CASCADE,
    	idConsultaEmergencia INT NOT NULL REFERENCES ConsultaEmergencia(idConsultaEmergencia) ON DELETE CASCADE ON UPDATE CASCADE,
    	idEstetica INT NOT NULL REFERENCES Estetica (idEstetica) ON DELETE CASCADE ON UPDATE CASCADE,
    	idMetodoPago INT NOT NULL REFERENCES MetodoPago (idMetodoPago) ON DELETE CASCADE ON UPDATE CASCADE,
    	nombreDuenio VARCHAR(30) NOT NULL,
    	nombreMascota VARCHAR(30) NOT NULL,
    	nombreTrabajador VARCHAR(30) NOT NULL,
    	costo REAL NOT NULL CHECK (costo>0),
    	codigoEmergencia INT NOT NULL,
    	procedimiento TEXT NOT NULL
	);
COMMENT ON TABLE generarReciboConsEmergencia IS 'Tabla de la relación que genera los recibos de una consulta de emergencia';
COMMENT ON COLUMN generarReciboConsEmergencia.idRecibo IS 'Identificador de los recibos';
COMMENT ON COLUMN generarReciboConsEmergencia.idEstetica IS 'Identificador de la estética donde se generó el recibo';
COMMENT ON COLUMN generarReciboConsEmergencia.idMetodoPago IS 'Identificador del metodo con el que se va a pagar el recibo';
COMMENT ON COLUMN generarReciboConsEmergencia.nombreDuenio IS 'Nombre de quien va a pagar el recibo';
COMMENT ON COLUMN generarReciboConsEmergencia.nombreTrabajador IS 'Nombre de quien atendió y generó el recibo';
COMMENT ON COLUMN generarReciboConsEmergencia.costo IS 'Costo a pagar';
COMMENT ON COLUMN generarReciboConsEmergencia.codigoEmergencia IS 'Código de emergencia asociado al por qué fue atendida la mascota';
COMMENT ON COLUMN generarReciboConsEmergencia.procedimiento IS 'Procedimiento que se realizó en la mascota';
COMMENT ON CONSTRAINT generarreciboconsemergencia_idconsultaemergencia_fkey ON generarReciboConsEmergencia IS 'La llave foranea de la tabla generarReciboConsEmergencia que apunta a idConsultaNormal de ConsultaEmergencia';
COMMENT ON CONSTRAINT generarreciboconsemergencia_idestetica_fkey ON generarReciboConsEmergencia IS 'La llave foranea de la tabla generarReciboConsEmergencia que apunta a idEstetica de Estetica';
COMMENT ON CONSTRAINT generarreciboconsemergencia_idmetodopago_fkey ON generarReciboConsEmergencia IS 'La llave foranea de la tabla generarReciboConsEmergencia que apunta a idMetodoPago de metodoPago';
COMMENT ON CONSTRAINT generarreciboconsemergencia_idrecibo_fkey ON generarReciboConsEmergencia IS 'La llave foranea de la tabla generarReciboConsEmergencia que apunta a idRecibo de recibo';

-- Tabla Recetar
CREATE TABLE recetar(
	idMedicamento INT NOT NULL REFERENCES medicamento (idMedicamento) ON DELETE CASCADE ON UPDATE CASCADE,
	idConsulta INT NOT NULL REFERENCES consultaNormal (idConsultaNormal) ON DELETE CASCADE ON UPDATE CASCADE
);
COMMENT ON TABLE Recetar IS 'Tabla de la relación recetar';
COMMENT ON COLUMN Recetar.idMedicamento IS 'Identificador del medicamento que se va a recetar';
COMMENT ON COLUMN Recetar.idConsulta IS 'Identificador que hace referencia a la consulta normal en la que se recetó el medicamento';
COMMENT ON CONSTRAINT recetar_idconsulta_fkey ON recetar IS 'La llave foranea de la tabla recetar que apunta a idConsulta de consultaNormal';
COMMENT ON CONSTRAINT recetar_idmedicamento_fkey ON recetar IS 'La llave foranea de la tabla recetar que apunta a idMedicamento de medicamento';

-- Tabla Apartado
CREATE TABLE apartado(
	idApartado SERIAL PRIMARY KEY,
	idEstetica INT NOT NULL REFERENCES estetica (idEstetica) ON DELETE CASCADE ON UPDATE CASCADE,
	uso TEXT NOT NULL
);
COMMENT ON TABLE Apartado IS 'Tabla que contiene los apartados de una estetica';
COMMENT ON COLUMN Apartado.idApartado IS 'Identificador del apartado';
COMMENT ON COLUMN Apartado.idEstetica IS 'Identificador de la estetica a la que pertenece el apartado';
COMMENT ON COLUMN Apartado.uso IS 'Uso que se le da a el apartado';
COMMENT ON CONSTRAINT apartado_pkey ON apartado IS 'La llave primaria de la tabla Apartado';
COMMENT ON CONSTRAINT apartado_idestetica_fkey ON apartado IS 'La llave foranea de la tabla apartado que apunta a idEstetica de estetica';

--Tabla Servicio
CREATE TABLE servicio(
	idRecibo SERIAL NOT NULL REFERENCES recibo (idRecibo) ON DELETE CASCADE ON UPDATE CASCADE,
	servicio TEXT NOT NULL,
  	PRIMARY KEY(idRecibo, servicio)
);
COMMENT ON TABLE servicio IS 'Tabla que contiene los servicios';
COMMENT ON COLUMN servicio.idRecibo IS 'Identificador del servicio prestado';
COMMENT ON COLUMN servicio.servicio IS 'Servicio prestado';
COMMENT ON CONSTRAINT servicio_idrecibo_fkey ON servicio IS 'La llave foranea de la tabla servicio que apunta a idRecibo de recibo';

-- Tabla Informar
CREATE TABLE informar(
    	idEstetica INT NOT NULL REFERENCES estetica (idEstetica) ON DELETE CASCADE ON UPDATE CASCADE,
    	CURP CHAR(18) NOT NULL UNIQUE CHECK (CHAR_LENGTH(CURP) = 18 AND CURP SIMILAR TO '[A-Z0-9]{18}') REFERENCES supervisor (CURP) ON DELETE CASCADE ON UPDATE CASCADE,
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

COMMENT ON TABLE Informar IS 'Tabla de la relacion informar';
COMMENT ON COLUMN Informar.idEstetica IS 'Identificador de la estetica';
COMMENT ON COLUMN Informar.CURP IS 'CURP de los supervisores y que sirve para identificarlos';
COMMENT ON COLUMN Informar.nombreEstetica IS 'Nombre de las estéticas';
COMMENT ON COLUMN Informar.telefonoEstetica IS 'Telefono de las estéticas';
COMMENT ON COLUMN Informar.calleEstetica IS 'Calle donde está ubicada la estetica';
COMMENT ON COLUMN Informar.numeroCalleEstetica IS 'Numero de la calle donde está ubicada la estetica';
COMMENT ON COLUMN Informar.estadoEstetica IS 'Estado donde está ubicada la estetica';
COMMENT ON COLUMN Informar.codigoPostalEstetica IS 'Código postal del lugar donde está ubicada la estetica';
COMMENT ON COLUMN Informar.horaInicio IS 'Hora en la que se abre la estetica';
COMMENT ON COLUMN Informar.horaFin IS 'Hora en la que se cierra la estetica';
COMMENT ON COLUMN Informar.NumConsultorios IS 'Numero de consultorios que tiene la estetica';
COMMENT ON COLUMN Informar.nombreSupervisor IS 'Nombre de los supervisores';
COMMENT ON COLUMN Informar.apellidoPaterno IS 'Apellido paterno de los supervisores';
COMMENT ON COLUMN Informar.apellidoMaterno IS 'Apellido materno de los supervisores';
COMMENT ON COLUMN Informar.fechaNacimiento IS 'Fecha de nacimiento de los supervisores';
COMMENT ON COLUMN Informar.telefonoSupervisor IS 'Telefono de los supervisores';
COMMENT ON COLUMN Informar.calleSupervisor IS 'Calle donde vive cada supervisor';
COMMENT ON COLUMN Informar.numeroCalleSupervisor IS 'Numero donde vive cada supervisor';
COMMENT ON COLUMN Informar.estadoSupervisor IS 'Estado donde vive cada superviso';
COMMENT ON COLUMN Informar.codigoPostalSupervisor IS 'Codigo postal del lugar en donde vive cada supervisor';
COMMENT ON COLUMN Informar.genero IS 'Genero de los supervisores';
COMMENT ON COLUMN Informar.salario IS 'Salario de los supervisores';
COMMENT ON COLUMN Informar.RFC IS 'RFC de cada supervisor';
COMMENT ON CONSTRAINT informar_curp_fkey ON Informar IS 'La llave foranea de la tabla Informar que apunta a CURP de supervisor';
COMMENT ON CONSTRAINT informar_idestetica_fkey ON Informar IS 'La llave foranea de la tabla Informar que apunta a idEstetica de estetica';

