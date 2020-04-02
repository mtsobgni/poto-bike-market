   CREATE TABLE announcement (
      id serial,
      title VARCHAR (155)  NOT NULL,
      description VARCHAR (155) NOT NULL,
      creationDate TIMESTAMP,
      type_offre VARCHAR (55) NOT NULL,
      type_announcement VARCHAR (55) NOT NULL,
      user_id INTEGER,
      CONSTRAINT pk_announcement PRIMARY KEY(id),
      CONSTRAINT fk_user foreign key (user_id) references user_poto
   );