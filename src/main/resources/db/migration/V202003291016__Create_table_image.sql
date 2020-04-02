   CREATE TABLE image (
      id serial,
      name VARCHAR (155)  NOT NULL,
      type VARCHAR (155) NOT NULL,
      pic_bytes bytea [],
      article_id integer,
      CONSTRAINT pk_image PRIMARY KEY(id),
      CONSTRAINT fk_article foreign key (article_id) references article
   );