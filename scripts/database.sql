CREATE DATABASE test_users;

CREATE  TABLE items (
  id INT(11) NOT NULL AUTO_INCREMENT,
  user_id INT(11),
  text VARCHAR(255),
  PRIMARY KEY (id));

INSERT INTO items(user_id, text) VALUES ('1', 'Record 1');
INSERT INTO items(user_id, text) VALUES ('2', 'Record 2');
