# 🚀 Run 
This guide explains how to start and run the tolerant-reader locally.

## 🚦 Prerequisites

Make sure you have the following installed:
- Java 25 or higher
- Maven 3.9+
- IDE (e.g., IntelliJ IDEA, VS Code – optional but helpful)

## 💾 Clone the Repository

```shell
   git https://github.com/hakktastic/tolerant-reader.git
   cd tolerant-reader
   git checkout master
```

## 🛠️ Build the Project

```shell
   mvn clean install
```

## ⚡Start Application

```shell      
  # start the upstream service
  cd upstream-service
  mvn spring-boot:run
```

```shell
  # start the downstream service
  cd downstream-service
  mvn spring-boot:run
```
## 🧪 Test the service
All HTTP requests are located in the [./http-requests.http](http-requests.http) file. These 
are ready to use and already configured.

### Using IntelliJ
1. Open the .http file: [./http-requests.http](http-requests.http) file
2. Send requests directly from the editor

> This file was generated with the assistance of an AI tool