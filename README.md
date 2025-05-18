# Conversor de Monedas en Java

Este es un proyecto de consola en Java que permite convertir entre diferentes divisas utilizando la API de [ExchangeRate](https://www.exchangerate-api.com/). 
El programa presenta un menú interactivo con opciones para realizar conversiones, ver divisas disponibles, consultar el historial y salir.

## 🧩 Funcionalidades

- **Conversión de divisas**: Ingresa el código de la moneda de origen, el de destino y el monto. Se muestra el resultado de la conversión usando datos en tiempo real.
- **Listado de divisas**: Muestra una lista con algunos de los códigos de divisa disponibles para realizar conversiones.
- **Historial de conversiones**: Cada consulta se guarda en un archivo "Historial.txt" en el se registra cada conversión con un timestamp, permitiendo revisar cuándo se realizaron.
- **Salir**: Finaliza el programa.
- 
## ⚙️ Tecnologías utilizadas

- Java 17.
- API de ExchangeRate (https://www.exchangerate-api.com/)
- Librería gson para parsear JSON.
- `java.time.LocalDateTime` para timestamps.

## 🚀 Instalación y ejecución

1. Clona el repositorio:
```bash
git clone https://github.com/Jagen74/currency-converter-v2.git
cd conversor-monedas-java    
```
2. Asegúrate de tener Java instalado. Puedes verificar con:
```bash
java -version
````
4. Compila el proyecto:
```bash
javac ConversorMonedas.java
````
5. Ejecuta el programa:
 ```bash
java ConversorMonedas
```
5. Si estás usando un entorno como IntelliJ IDEA o Eclipse, también puedes importar el proyecto directamente y ejecutar desde ahí.

##










