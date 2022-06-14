CREATE OR REPLACE FUNCTION agrega_cliente() RETURNS TRIGGER
    AS $$
    DECLARE 
        curp_sucursal VARCHAR(18);
    BEGIN 
        curp_sucursal = CONCAT(NEW.RFC, '00000');
        INSERT INTO Persona(curp,nombre,apellidoPaterno,apellidoMaterno,fechanacimiento,codigopostal,estado,calle,numeroExt,telefono,correo) 
        VALUES (curp_sucursal, NEW.nombre,NEW.nombre,NEW.nombre,'1948-08-17',NEW.codigoPostal,NEW.estado,NEW.calle,NEW.numeroExt,NEW.telefono,NEW.correo);
        INSERT INTO Cliente(curp, puntos) 
        VALUES (curp_sucursal, 0);
        RETURN NEW;
       --
    END;
    $$
    LANGUAGE plpgsql;


CREATE TRIGGER cliente_default_trigger
    AFTER INSERT ON sucursal
    FOR EACH ROW
    EXECUTE PROCEDURE agrega_cliente();
    
    
CREATE OR REPLACE FUNCTION verifica_tipo_repartidor() RETURNS TRIGGER
    AS $$
    DECLARE 
        tipoE INT;
    BEGIN 
        SELECT idTipoEmpleado INTO tipoE FROM empleado WHERE empleado.curp = NEW.curp;
        IF tipoE <> 1 THEN
            RAISE EXCEPTION 'Para poder ser repartidor tiene que tener idTipoRepartidor = 1';
        END IF;
        RETURN NEW;
       --
    END;
    $$
    LANGUAGE plpgsql;
    
    
CREATE TRIGGER repartidor_coincidente
    BEFORE INSERT ON repartidor
    FOR EACH ROW
    EXECUTE PROCEDURE verifica_tipo_repartidor();    
    