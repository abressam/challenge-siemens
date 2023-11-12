CREATE TABLE Students (
    ID INTEGER,
    Name VARCHAR(255),
    Value INTEGER,
    PRIMARY KEY (ID)
);

INSERT INTO Students (ID, Name, Value) VALUES
    (1, 'Julia', 81),
    (2, 'Carol', 68),
    (3, 'Maria', 99),
    (4, 'Andreia', 78),
    (5, 'Jaqueline', 63),
    (6, 'Marcela', 88);

CREATE TABLE Notes (
    Grade INTEGER,
    Min_Value INTEGER,
    Max_Value INTEGER,
    PRIMARY KEY (Grade)
);

INSERT INTO Notes (Grade, Min_Value, Max_Value) VALUES
    (1, 0, 9),
    (2, 10, 19),
    (3, 20, 29),
    (4, 30, 39),
    (5, 40, 49),
    (6, 50, 59),
    (7, 60, 69),
    (8, 70, 79),
    (9, 80, 89),
    (10, 90, 100);

SELECT
    CASE
        WHEN Value BETWEEN 70 AND 100 THEN Name
        ELSE 'NULL'
    END AS Name,
    CASE
        WHEN Value BETWEEN 70 AND 100 THEN 8 + (Value - 70) / 10
        ELSE 7
    END AS Grade,
    Value
FROM Students
WHERE
    Value BETWEEN 70 AND 100
    OR Value < 70
ORDER BY
    Grade DESC,
    Name;