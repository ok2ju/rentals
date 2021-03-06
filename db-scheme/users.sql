CREATE USER Alexey IDENTIFIED BY root
DEFAULT TABLESPACE Rentals_tablespace

QUOTA UNLIMITED ON Rentals_tablespace;

GRANT CREATE SESSION, GRANT ANY PRIVILEGE TO Alexey;
GRANT UNLIMITED TABLESPACE TO Alexey;

CREATE USER Oleg IDENTIFIED BY root
DEFAULT TABLESPACE Rentals_tablespace

QUOTA UNLIMITED ON Rentals_tablespace;

GRANT CREATE SESSION, GRANT ANY PRIVILEGE TO Oleg;
GRANT UNLIMITED TABLESPACE TO Oleg;