# ♟️ Ajedrez en Java

<p align="center">
  <img src="https://img.shields.io/badge/Java-17%2B-orange?style=for-the-badge&logo=java" />
  <img src="https://img.shields.io/badge/NetBeans-IDE-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide" />
  <img src="https://img.shields.io/badge/Swing-GUI-green?style=for-the-badge" />
  <img src="https://img.shields.io/badge/IA-Minimax%20%2B%20Alpha--Beta-purple?style=for-the-badge" />
</p>

<p align="center">
  Juego de ajedrez completo desarrollado en Java puro con interfaz gráfica Swing.<br/>
  Incluye modo 1vs1 local y modo contra Inteligencia Artificial con tres niveles de dificultad.
</p>

---

## 📸 Vista previa

```
  a   b   c   d   e   f   g   h
┌───┬───┬───┬───┬───┬───┬───┬───┐
│ ♜ │ ♞ │ ♝ │ ♛ │ ♚ │ ♝ │ ♞ │ ♜ │  8
├───┼───┼───┼───┼───┼───┼───┼───┤
│ ♟ │ ♟ │ ♟ │ ♟ │ ♟ │ ♟ │ ♟ │ ♟ │  7
├───┼───┼───┼───┼───┼───┼───┼───┤
│   │   │   │   │   │   │   │   │  6
├───┼───┼───┼───┼───┼───┼───┼───┤
│   │   │   │   │   │   │   │   │  5
├───┼───┼───┼───┼───┼───┼───┼───┤
│   │   │   │   │   │   │   │   │  4
├───┼───┼───┼───┼───┼───┼───┼───┤
│   │   │   │   │   │   │   │   │  3
├───┼───┼───┼───┼───┼───┼───┼───┤
│ ♙ │ ♙ │ ♙ │ ♙ │ ♙ │ ♙ │ ♙ │ ♙ │  2
├───┼───┼───┼───┼───┼───┼───┼───┤
│ ♖ │ ♘ │ ♗ │ ♕ │ ♔ │ ♗ │ ♘ │ ♖ │  1
└───┴───┴───┴───┴───┴───┴───┴───┘
```

---

## ✨ Funcionalidades

- ♟️ **Tablero completo** con todas las reglas oficiales del ajedrez
- 🤝 **Modo 1vs1 local** — dos jugadores en el mismo ordenador
- 🤖 **Modo vs IA** — con tres niveles de dificultad (Fácil, Medio, Difícil)
- 🟢 **Resaltado de movimientos válidos** al seleccionar una pieza
- 📜 **Historial de movimientos** en notación algebraica
- ⏱️ **Temporizador** por jugador configurable
- 🔊 **Sonidos** al mover, capturar y dar jaque
- 👑 **Diálogo de promoción** de peón con selección de pieza
- 🏳️ **Detección automática** de jaque, jaque mate y ahogado

---

## 🎮 Reglas especiales implementadas

- Enroque corto y largo (O-O / O-O-O)
- Captura al paso (en passant)
- Promoción de peón
- Detección de jaque y jaque mate
- Ahogado (tablas por falta de movimientos)

---

## 🧠 Inteligencia Artificial

La IA usa el algoritmo **Minimax con poda Alpha-Beta**. Evalúa las posiciones teniendo en cuenta el valor material de las piezas y su posicionamiento en el tablero.

| Nivel | Profundidad | Descripción |
|-------|-------------|-------------|
| Fácil | 2 | Comete errores, ideal para principiantes |
| Medio | 3 | Juega con criterio, defiende y ataca |
| Difícil | 4-5 | Difícil de vencer, juega posicionalmente |

---

## 🏗️ Estructura del proyecto

```
src/
└── ajedrez/
    ├── main/
    │   └── Main.java                  # Punto de entrada
    ├── model/
    │   ├── Pieza.java                 # Clase abstracta base
    │   ├── Tablero.java               # Estado y lógica del juego
    │   ├── Movimiento.java            # Representa un movimiento
    │   ├── EstadoJuego.java           # Enum de estados de partida
    │   └── piezas/
    │       ├── Peon.java
    │       ├── Torre.java
    │       ├── Caballo.java
    │       ├── Alfil.java
    │       ├── Reina.java
    │       └── Rey.java
    ├── ia/
    │   ├── MotorIA.java               # Fachada de la IA
    │   ├── Minimax.java               # Algoritmo Minimax + Alpha-Beta
    │   └── Evaluador.java             # Evaluación de posiciones
    ├── controller/
    │   └── JuegoController.java       # Lógica de control del juego
    └── view/
        ├── VentanaPrincipal.java      # Ventana principal (JFrame)
        ├── MenuPrincipal.java         # Menú de inicio (JDialog)
        ├── TableroPanel.java          # Tablero visual (JPanel)
        ├── InfoPanel.java             # Panel lateral de información
        └── DialogoPromocion.java      # Diálogo de promoción de peón
```

---

## 🧩 Conceptos de POO aplicados

| Concepto | Dónde se aplica |
|----------|-----------------|
| **Herencia** | `Peon`, `Torre`, `Rey`... extienden `Pieza` |
| **Clase abstracta** | `Pieza` no puede instanciarse directamente |
| **Método abstracto** | `movimientosValidos()` en `Pieza` |
| **Polimorfismo** | El tablero llama `p.movimientosValidos()` sin saber el tipo concreto |
| **Encapsulamiento** | Todos los atributos son `private`/`protected` con getters y setters |
| **Interfaces** | `MouseListener` en `TableroPanel` |
| **Enumeraciones** | `Color`, `Tipo`, `EstadoJuego`, `ModoJuego` |
| **Colecciones** | `List<Movimiento>`, `List<Pieza>` |
| **Recursividad** | Algoritmo Minimax |
| **Concurrencia** | `SwingWorker` para ejecutar la IA sin bloquear la UI |

---

## 🛠️ Requisitos

- Java JDK 17 o superior
- NetBeans IDE (recomendado) o cualquier IDE con soporte Java
- No requiere librerías externas

---

## 🚀 Cómo ejecutar

**Opción 1 — Desde NetBeans:**
1. `File > Open Project` y selecciona la carpeta del proyecto
2. Click derecho en el proyecto → `Run`

**Opción 2 — Desde terminal:**
```bash
# Compilar
javac -d out -sourcepath src src/ajedrez/main/Main.java

# Ejecutar
java -cp out ajedrez.main.Main
```

---

## 🎨 Estilo visual

- **Tablero clásico** en tonos marrón y beige
- **Piezas** representadas con símbolos Unicode ♔♕♖♗♘♙
- **Resaltado verde** para movimientos válidos
- **Resaltado rojo** para el rey en jaque
- Coordenadas (a-h, 1-8) visibles en los bordes

---

## 📁 Recursos de sonido

Coloca los siguientes archivos `.wav` en `src/resources/`:

```
resources/
├── mover.wav       # Sonido al mover una pieza
├── captura.wav     # Sonido al capturar una pieza
└── jaque.wav       # Sonido al dar jaque
```

---

## 📄 Licencia

Este proyecto es de uso académico y educativo.
