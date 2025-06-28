
# 🧪 Proyecto de Pruebas en Java

Este proyecto contiene pruebas **unitarias** y de **integración** escritas en Java con **JUnit 4**, demostrando cómo validar operaciones aritméticas simples y flujos más complejos con múltiples dependencias lógicas.

## ⚙️ Tecnologías

- Java 8+
- [JUnit 4](https://junit.org/junit4/)
- IDE recomendado: IntelliJ IDEA / Eclipse

## 📁 Estructura de Clases

```bash
src/
├── Calculadora.java
├── OperacionService.java
└── tests/
    ├── CalculadoraTest.java      # Pruebas unitarias
    └── OperacionServiceTest.java # Pruebas de integración
```

## ✅ Tipos de prueba

### 🔹 Pruebas unitarias

`CalculadoraTest.java` se enfoca en métodos individuales de la clase `Calculadora`:

```java
@Test
public void testSumar() {
    Calculadora calc = new Calculadora();
    assertEquals(5, calc.sumar(2, 3));
}
```

### 🔸 Pruebas de integración

`OperacionServiceTest.java` valida el comportamiento combinado de lógica interna y métodos auxiliares:

```java
@Test
public void testRealizarCalculoComplejo() {
    OperacionService service = new OperacionService();
    assertEquals("Resultado complejo: 10.0", service.realizarCalculoComplejo(2, 3, 4));
}
```

También incluye casos especiales como divisiones con cero intermedio.

## 🚀 Ejecución de pruebas

Puedes ejecutar las pruebas desde tu IDE o mediante Maven:

```bash
mvn test
```

Asegúrate de tener configurado el `pom.xml` con la dependencia de JUnit 4.

## 🧑‍💻 Autor

Desarrollado por [**Mauricio**](https://github.com/mauricioverar), como ejercicio práctico para afianzar el dominio de pruebas estructuradas en Java.
