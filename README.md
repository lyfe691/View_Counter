
# Visitor Counter Application

This is a simple web application built with Java, Spring Boot, and Redis. The application increments a counter every time the home page is visited and displays the current visitor count.

## Features

- **Visitor Counter**: Increments and displays the number of visits to the home page.
- **Redis Integration**: Uses Redis to store and manage the visitor count, ensuring persistence across application restarts.
- **Spring Boot**: The application is built using Spring Boot, making it easy to run and deploy.

## Prerequisites

Before you begin, ensure you have the following installed on your system:

- **Java 11** or higher
- **Maven** for dependency management and running the application
- **Redis** server

## Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/lyfe691/View_Counter.git
cd View_Counter
```

### 2. Configure Redis

Make sure Redis is installed and running on your machine. The application is configured to connect to Redis on `localhost` at port `6379` by default.
<hr>
If you dont have redis installed do this:

#### For Windows
You can't run redis on default on windows, you'll have to use a VM or the Windows Subsystem for Linux (WSL). This is how you can install it:

1. **Powershell (Administator)** Run this and restart.
```bash
wsl --install
```
2. Now that you have WSL installed you can open your terminal and open a new tab as ubuntu or type ```wsl``` and enter the following commands:
```bash
sudo apt-get update
sudo apt-get install redis
```
3. **Start Redis**
```bash
redis-server
```
#### For MacOS
1. **Install Homebrew**
```bash
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
```
2. **Install Redis**
```bash
brew install redis
```
3. **Start Redis**
```bash
brew services start redis
```
#### For Linux
1. **Install Redis**
```bash
sudo apt-get update
sudo apt-get install redis
```
2. **Start Redis**
```bash
redis-server
```
### 3. Build the Application

Compile and package the application using Maven:

```bash
mvn clean install
```

### 4. Run the Application

Start the Spring Boot application:

```bash
mvn spring-boot:run
```

### 5. Access the Application

Open your web browser and go to:

```
http://localhost:8080
```

Each time you refresh the page, the visitor counter will increment.

## Project Structure

```plaintext
View_Counter/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/redis/visitorcounter/
│   │   │       ├── VisitorCounterApplication.java  # Main application class
│   │   │       └── VisitorCounterController.java   # Controller handling the visitor count
│   │   └── resources/
│   │       └── application.properties              # Redis configuration
│   └── test/                                       # Unit tests (if any)
│
├── pom.xml                                         # Maven build file
└── README.md                                       # Project documentation
```

## Technologies Used

- **Java**
- **Spring Boot**
- **Redis**
- **Maven**

## License

This project is licensed under the MIT License. See the <a href="https://github.com/lyfe691/View_Counter?tab=MIT-1-ov-file">LICENSE</a> file for details.

