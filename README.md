# Simulación de Campeonato de Fórmula 1

Esta es una simulación simple basada en Java de un Campeonato de Fórmula 1. Permite gestionar pilotos, coches y carreras. El sistema también calcula y guarda el ranking final de los pilotos, así como la información de los coches y pilotos disponibles en archivos de texto.

## Características
- Gestiona pilotos, coches y carreras.
- Simula las carreras y calcula los puntos según la posición de cada piloto en la carrera.
- Guarda la información de los pilotos, los coches y el ranking final en archivos de texto (`pilotos.txt`, `coches.txt`, `ranking.txt`).

## Clases Principales
### `Pilot` (Pilot)
- Representa a un piloto de Fórmula 1.
- Almacena el nombre del piloto, su país, el número de carreras en las que ha participado y los puntos acumulados.
- Métodos: `race()`, `addPoints(int points)`.

### `CarF1` (Coche F1)
- Representa un coche de Fórmula 1.
- Almacena el modelo del coche, la velocidad máxima y el piloto asignado al coche.

### `Race` (Carrera)
- Representa una carrera de Fórmula 1.
- Almacena el nombre de la carrera, el tipo de pista y la distribución de puntos por posición.
- Métodos: `startRace()`, `addPilot(Pilot pilot)`.

### `F1Championship` (Campeonato F1)
- Gestiona el campeonato de Fórmula 1.
- Almacena una lista de pilotos y carreras.
- Métodos: `addRace(Race race)`, `addPilot(Pilot pilot)`, `startChampionship()`, `saveRanking()`, `savePilots()`, `saveCars()`.

## Archivos Generados
- **pilots.txt**: Contiene la lista de pilotos y sus puntos totales.
- **circuits.txt**: Contiene la lista de pilotos y sus puntos totales.
- **cars.txt**: Contiene la lista de coches disponibles en el campeonato.
- **ranking.txt**: Contiene el ranking final de los pilotos al finalizar el campeonato.
