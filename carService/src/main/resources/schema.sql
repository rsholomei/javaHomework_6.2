drop table if EXISTS Car;
CREATE TABLE Car(
                Car_ID   INT NOT NULL AUTO_INCREMENT,
                NameCar VARCHAR (20) NOT NULL,
                Wheels_ID INT (20) NOT NULL,
                Engine_ID INT (20) NOT NULL,
                PRIMARY KEY (Car_ID)
        );
drop table if EXISTS Engine;
CREATE TABLE Engine(
                Engine_ID   INT NOT NULL AUTO_INCREMENT,
                EngineСapacity DOUBLE (20) NOT NULL,
                PRIMARY KEY (Engine_ID)
        );
drop table if EXISTS Tyres;
CREATE TABLE Tyres(
                Tyres_ID   INT NOT NULL AUTO_INCREMENT,
                SizeTyres INT (20) NOT NULL,
                NameTyres VARCHAR (20) NOT NULL,
                PRIMARY KEY (Tyres_ID)
        );
drop table if EXISTS Wheels;
CREATE TABLE Wheels(
                Wheels_ID   INT NOT NULL AUTO_INCREMENT,
                Tyres_ID VARCHAR (20),
                PRIMARY KEY (Wheels_ID)
        );