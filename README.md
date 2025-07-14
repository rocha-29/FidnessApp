# 💪 FidnessApp

**FidnessApp** es una aplicación de escritorio desarrollada en Java con Swing como parte del curso _Programación Cliente Servidor Concurrente_.  
Permite a los usuarios ver ejercicios, crear rutinas personalizadas y exportarlas a un archivo de texto.

---

## 🚀 Características principales

- 🧑‍💻 Inicio de sesión con validación de credenciales
- 🏋️‍♀️ Visualización de ejercicios por tipo (pierna, brazo, espalda)
- 📝 Creación de rutinas personalizadas
- 💾 Exportación de rutina a `.txt`
- 🔄 Simulación de carga con hilos (`Thread.sleep()`)
- 🪛 Manejo de excepciones personalizadas
- 🧱 Aplicación estructurada con **MVC**

---

## 🧠 Tecnología utilizada

- Java 8+
- Java Swing (GUI)
- Colecciones (`List`)
- Excepciones y clases personalizadas
- Programación concurrente con `Thread`
- Git & GitHub

---

## 📁 Estructura del proyecto
fidness
├── Main.java
├── modelo
│ ├── Usuario.java
│ ├── Ejercicio.java
│ ├── EjercicioPierna.java
│ ├── EjercicioBrazo.java
│ ├── EjercicioEspalda.java
│ ├── Rutina.java
│ └── CredencialesInvalidasException.java
└── vista
├── LoginFrame.java
├── MenuPrincipalFrame.java
├── VerEjerciciosFrame.java
└── CrearRutinaFrame.java


---

## 📚 Requisitos del Avance 2 cubiertos

| Requisito                              | Estado ✅ |
|----------------------------------------|-----------|
| Clases y objetos                       | ✅ |
| Herencia                               | ✅ |
| Polimorfismo                           | ✅ |
| Excepciones personalizadas             | ✅ |
| Colecciones (`List`, `ArrayList`)      | ✅ |
| GUI con Swing                          | ✅ |
| Serialización / exportación a archivo | ✅ |
| Multihilos (opcional)                  | ✅ |

---

## 👨‍🎓 Autor

**Daniel Rocha**  
Estudiante de Seguridad informatica  
Curso: Programación Cliente Servidor Concurrente  
Julio 2025

---

## 📄 Licencia

Este proyecto es de carácter académico y libre de uso con fines educativos.
