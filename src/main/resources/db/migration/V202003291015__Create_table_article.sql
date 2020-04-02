   CREATE TABLE article (
      id serial,
      description VARCHAR (155)  NOT NULL,
      price decimal  NOT NULL,
      category_id integer,
      announcement_id integer,
      CONSTRAINT pk_article PRIMARY KEY(id),
      CONSTRAINT fk_category foreign key (category_id) references category,
      CONSTRAINT fk_anouncement foreign key (announcement_id) references announcement
   );