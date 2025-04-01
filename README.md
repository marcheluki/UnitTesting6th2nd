# Library Management Unit Testing

Este repositorio contiene un ejemplo de pruebas unitarias para un sistema de gestión de biblioteca. El proyecto está organizado con Maven y utiliza JUnit 5 para las pruebas unitarias.

## Estructura del Proyecto

```
LibraryManagementUnitTesting/
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── Book.java
│   │       ├── Library.java
│   │       └── Patron.java
│   ├── test/
│       └── java/
│           └── LibraryTest.java
├── pom.xml
├── target/
└── README.md
```

## Prerequisitos

1. **Java Development Kit (JDK)**: Asegúrate de tener JDK 8 o superior instalado. Puedes verificar la versión de Java con el siguiente comando:
   ```bash
   java -version
   ```

2. **Apache Maven**: Asegúrate de que Maven esté instalado y configurado. Puedes verificar la instalación de Maven con:
   ```bash
   mvn -version
   ```

3. **IDE (Opcional)**: Usa un IDE como Visual Studio Code o IntelliJ IDEA para facilitar el desarrollo y las pruebas.

## Cómo Ejecutar las Pruebas

1. **Navega al directorio raíz del proyecto**: Abre una terminal y navega al directorio raíz del proyecto:
   ```bash
   cd c:\Users\marce\Documents\a_itc\6to\2Parcial\M3ProfAdolfo\UnitTesting\LibraryManagementUnitTesting
   ```

2. **Ejecuta las pruebas con Maven**: Ejecuta el siguiente comando para correr todas las pruebas:
   ```bash
   mvn test
   ```

3. **Ver los resultados de las pruebas**:
   - Los resultados de las pruebas se mostrarán en la terminal.
   - Un reporte detallado se generará en el directorio `target/surefire-reports`.

## Solución de Problemas

- Si encuentras problemas con la estructura del proyecto o las dependencias, asegúrate de que el archivo `pom.xml` esté en el directorio raíz y de que la estructura del proyecto siga las convenciones de Maven.
- Si las pruebas no se detectan en tu IDE, asegúrate de que la carpeta `src/test/java` esté marcada como una carpeta de pruebas en la configuración de tu IDE.

## Notas Adicionales

- Este proyecto utiliza JUnit 5 para las pruebas unitarias.
- Los reportes de cobertura de código pueden ser generados usando **JaCoCo** ejecutando:
  ```bash
  mvn jacoco:report
  ```
  El reporte de cobertura estará disponible en el directorio `target/site/jacoco`.