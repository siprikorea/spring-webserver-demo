## Spring WebServer Demo

### 📌 Project Overview
This project is a demo web server designed to serve JSP and static files.
It is built with Spring Boot and provides a simple way to handle client requests.
---
### ⚙️ Tech Stack
- Java 17+
- Spring Boot
- Jakarta Servlet
- Apache Tomcat (embedded)
- Gradle
---
### 📂 Project Structure
```
spring-webserver-demo/
│── src/
│   ├── main/
│   │   ├── java/com/siprikorea/webserver/
│   │   │   ├── ClientController.java  # Handles client requests
│   │   ├── resources/
│   │   │   ├── static/  # Static resources (CSS, JS, images, etc.)
│   │   │   ├── templates/  # JSP files
│── build.gradle  # Gradle project configuration
│── settings.gradle  # Gradle settings
│── README.md  # Project documentation
```
---
### 🚀 How to Run

1️⃣ Clone the Project
```shell
git clone https://github.com/siprikorea/spring-webserver-demo.git
cd spring-webserver-demo
```
2️⃣ Build & Run with Gradle
```shell
./gradlew bootRun
```
3️⃣ Access the Server
- Static File Request:
```
http://localhost:8080/index.html
```
- JSP Request:
```
http://localhost:8080/jsp/time
```
---
### 🔥 Features

- ✅ Supports JSP rendering
- ✅ Serves static files
- ✅ Simple web server built with Spring Boot
---
### 📜 License

This project is licensed under the MIT License.
