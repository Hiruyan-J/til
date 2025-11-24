DELETE FROM student;
INSERT INTO student VALUES(1,'›Œ´',60);
INSERT INTO student VALUES(2,'÷ˆä',100);
INSERT INTO student VALUES(3,'“cŒ´',85);
INSERT INTO student VALUES(4,'’†ì',90);
INSERT INTO student VALUES(5,'—é–Ø',75);

SELECT * FROM student;

SELECT * FROM student
  WHERE 50 <= score AND score <= 80;

SELECT * FROM student
  WHERE score BETWEEN 80 AND 100;

SELECT * FROM student
  WHERE name LIKE '%Œ´';

UPDATE student SET score = score + 5
  WHERE no = 1;

SELECT * FROM student;

DELETE FROM student WHERE no = 1;

SELECT * FROM student;

