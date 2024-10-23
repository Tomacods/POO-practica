-- Tabla Jugador
CREATE TABLE Jugador (
    ID_Jugador INT PRIMARY KEY,
    Nombre VARCHAR(50),
    Apellido VARCHAR(50),
    Correo VARCHAR(100),
    Puntaje INT,
    Estado VARCHAR(20) CHECK (Estado IN ('activo', 'eliminado'))
);

-- Tabla Pregunta
CREATE TABLE Pregunta (
    ID_Pregunta INT PRIMARY KEY,
    Enunciado TEXT,
    Tipo_Pregunta VARCHAR(20) CHECK (Tipo_Pregunta IN ('multiple_choice', 'aproximación')),
    Categoría VARCHAR(50),
    Dificultad VARCHAR(20) CHECK (Dificultad IN ('baja', 'media', 'alta')),
    Respuesta_Correcta TEXT,
    Valor_Aproximado DECIMAL(10, 2)
);

-- Tabla Respuesta
CREATE TABLE Respuesta (
    ID_Respuesta INT PRIMARY KEY,
    ID_Pregunta INT,
    Texto TEXT,
    Correcta BOOLEAN,
    FOREIGN KEY (ID_Pregunta) REFERENCES Pregunta(ID_Pregunta)
);

-- Tabla Temática
CREATE TABLE Temática (
    ID_Temática INT PRIMARY KEY,
    Nombre_Temática VARCHAR(50)
);

-- Tabla Escalón
CREATE TABLE Escalón (
    ID_Escalon INT PRIMARY KEY,
    Número_Escalon INT,
    ID_Temática INT,
    Estado VARCHAR(20) CHECK (Estado IN ('pendiente', 'completado')),
    FOREIGN KEY (ID_Temática) REFERENCES Temática(ID_Temática)
);



-- Tabla Juego
CREATE TABLE Juego (
    ID_Juego INT PRIMARY KEY,
    Fecha DATETIME,
    Estado VARCHAR(20) CHECK (Estado IN ('en curso', 'completado')),
    ID_Jugador_Ganador INT,
    FOREIGN KEY (ID_Jugador_Ganador) REFERENCES Jugador(ID_Jugador)
);

-- Tabla Empate
CREATE TABLE Empate (
    ID_Empate INT PRIMARY KEY,
    ID_Pregunta_Aproximacion INT,
    FOREIGN KEY (ID_Pregunta_Aproximacion) REFERENCES Pregunta(ID_Pregunta)
);

-- Tabla Empate_Jugador
CREATE TABLE Empate_Jugador (
    ID_Empate INT,
    ID_Jugador INT,
    Es_Ganador BOOLEAN,
    PRIMARY KEY (ID_Empate, ID_Jugador),
    FOREIGN KEY (ID_Empate) REFERENCES Empate(ID_Empate),
    FOREIGN KEY (ID_Jugador) REFERENCES Jugador(ID_Jugador)
);


-- Tabla Ronda
CREATE TABLE Ronda (
    ID_Ronda INT PRIMARY KEY,
    ID_Juego INT,
    ID_Jugador INT,
    ID_Pregunta INT,
    ID_Escalon INT,
    Resultado VARCHAR(20) CHECK (Resultado IN ('correcto', 'incorrecto', 'aproximado')),
    Fecha DATETIME,
    Estado VARCHAR(20) CHECK (Estado IN ('en curso', 'finalizado')),
    FOREIGN KEY (ID_Juego) REFERENCES Juego(ID_Juego),
    FOREIGN KEY (ID_Jugador) REFERENCES Jugador(ID_Jugador),
    FOREIGN KEY (ID_Pregunta) REFERENCES Pregunta(ID_Pregunta),
    FOREIGN KEY (ID_Escalon) REFERENCES Escalón(ID_Escalon)
);