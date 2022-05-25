CREATE OR REPLACE FUNCTION invertir_apellidos() RETURNS TRIGGER
    AS $$
    DECLARE 
        temp VARCHAR(30);
    BEGIN 
        temp := NEW.ApellidoPaterno;
        NEW.ApellidoPaterno := NEW.ApellidoMaterno;
        NEW.ApellidoMaterno := temp;
        RETURN NEW;
    END;
    $$
    LANGUAGE plpgsql;


CREATE TRIGGER invertir_apellidos_trigger
    BEFORE INSERT ON supervisor
    FOR EACH ROW
    EXECUTE PROCEDURE invertir_apellidos();

CREATE OR REPLACE FUNCTION no_update_delete() RETURNS TRIGGER
    AS $$
    BEGIN 
    -- INSERT INTO mascota VALUES (OLD)
    --RETURN OLD;
    RAISE EXCEPTION 'NO PERMITIMOS ACTUALIZAR NI BORRAR';
    END;
    $$
    LANGUAGE plpgsql;
    

CREATE TRIGGER no_update_detele_trigger
    BEFORE UPDATE OR DELETE ON mascota
    FOR EACH ROW
    EXECUTE PROCEDURE no_update_delete();


