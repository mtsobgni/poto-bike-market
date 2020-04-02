   CREATE TABLE user_poto(
      id serial,
      username VARCHAR (155) UNIQUE NOT NULL,
      password VARCHAR (155) NOT NULL,
      email VARCHAR (255) UNIQUE NOT NULL,
      created_on TIMESTAMP NOT NULL,
      last_login TIMESTAMP,
      CONSTRAINT pk_user PRIMARY KEY(id)
   );