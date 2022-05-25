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
    BEFORE INSERT on supervisor
    FOR EACH ROW
    EXECUTE PROCEDURE invertir_apellidos();
    


