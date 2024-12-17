
# Escape Room: Rescate Digital (Versión para Desarrollo)

## Descripción del Proyecto
**Escape Room: Rescate Digital** es una versión inicial del proyecto diseñada para que los desarrolladores implementen la solución desde cero. Esta versión incluye la estructura básica del proyecto con todas las clases, servicios y controladores necesarios **vacíos**, pero listos para ser completados.

### Propósito del Repositorio
Este repositorio contiene un entorno preparado para que los participantes desarrollen la solución a cada reto de forma progresiva. La solución final estará disponible en un repositorio separado, al que se hará referencia más adelante.

---

## Progresión de Misiones
1. **Reto 1:** Configura el servicio de correo electrónico para enviar el primer mensaje.
2. **Reto 2:** Conéctate a la base de datos para habilitar la persistencia de datos.
3. **Reto 3:** Implementa un CRUD para gestionar mensajes secretos.
4. **Reto 4:** Crea un sistema para gestionar agentes.
5. **Reto 5:** Diseña y administra misiones críticas.
6. **Reto 6:** Asigna agentes a las misiones (relación muchos a muchos).

Cada reto desbloqueará nuevas funcionalidades y te acercará al rescate digital.

---

## Estructura del Proyecto
El repositorio incluye:

1. **Configuración esencial del proyecto:**
   - Archivo `application.properties` listo para la configuración.
   - Configuración de servicios básicos, como el envío de correos electrónicos (mock).

2. **Clases y Servicios Preparados:**
   - Estructura de paquetes completa.
   - Clases vacías en `controller`, `service`, `model` y `repository`.
   - Lógica para enviar correos preconfigurada en `MailService`.
   - Sistema de progreso del juego listo en `GameProgress`.

3. **Carpeta `config`:**
   - Bean mock para `JavaMailSender` que asegura que la aplicación arranque sin errores.

4. **Carpeta `utils`:**
   - Utilidad `GameProgress` lista para registrar el progreso de los retos.

---

## Configuración Inicial

### Prerrequisitos
- **Java JDK 20**
- **IntelliJ IDEA** u otro IDE compatible
- **Maven** (para la gestión de dependencias)

### Instalación del Proyecto
Clona el repositorio en tu máquina local:

```bash
git clone https://github.com/tu-usuario/escape-room-starter.git
cd escape-room-starter
```

### Configuración Básica
En el archivo `application.properties`, puedes añadir tu configuración real de correo y base de datos más adelante.

Para iniciar el proyecto con la configuración básica:
```bash
mvn clean install
mvn spring-boot:run
```

---

## Cómo Avanzar en los Retos
A medida que avances en el desarrollo, implementa la lógica dentro de las clases vacías:

1. **Controllers** → Controladores REST para gestionar endpoints.
2. **Services** → Implementación de la lógica de negocio.
3. **Repositories** → Conexión con la base de datos.
4. **Models** → Definición de entidades para la base de datos.

Cada reto tiene instrucciones claras y progresivas para ayudarte a completar el desarrollo.

---

## Solución Final
La solución completa estará disponible en el siguiente repositorio:
**Repositorio de la solución**([[https://github.com/AndresEstebanPatino/escaperoom-java-solution](https://github.com/AndresEstebanPatino/escaperoom-java-solution/edit/main/README.md))

---

## Estructura del Proyecto
```
escaperoom/
│-- src/
│   ├── main/
│   │   ├── java/com/escaperoomcoders/escaperoom/
│   │   │   ├── controller/         # Controladores REST (vacíos)
│   │   │   ├── model/              # Modelos de entidades (vacíos)
│   │   │   ├── repository/         # Repositorios JPA (vacíos)
│   │   │   ├── service/            # Lógica de negocio (vacía, excepto MailService)
│   │   │   └── utils/              # GameProgress configurado
│   │   ├── resources/
│   │   │   ├── application.properties
│   │   │   └── game-progress.txt
│   ├── test/                       # Pruebas unitarias
└── pom.xml                         # Dependencias Maven
```

---


## Contacto
Si tienes preguntas o sugerencias sobre este proyecto, no dudes en contactarnos:
- **Email:** andresp199519@gmail.com
- **GitHub:** [AndresEstebanPatino](https://github.com/AndresEstebanPatino)

---

¡Buena suerte, agente! El futuro del mundo depende de ti. 🚀
