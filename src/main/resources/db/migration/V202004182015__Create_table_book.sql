   CREATE TABLE book (
      id serial,
      title VARCHAR (155)  NOT NULL,
      price decimal  NOT NULL,
      announcement_id integer,
      classe VARCHAR (100),
      classe_primaire VARCHAR (100),
      course VARCHAR (100),
      editeur VARCHAR (100),
      book_condition VARCHAR (100),
      level_of_studies VARCHAR (100),
      CONSTRAINT pk_book PRIMARY KEY(id),
      CONSTRAINT fk_anouncement foreign key (announcement_id) references announcement
   );