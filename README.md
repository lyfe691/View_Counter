
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
│   │   │   └── com/example/visitorcounter/
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

- **Java**: Programming language
- **Spring Boot**: Framework for building the web application
- **Redis**: In-memory data structure store used as a database for counting visits
- **Maven**: Build and dependency management tool

## Contributing

If you would like to contribute to this project, please fork the repository and submit a pull request. Feel free to open issues for any bugs or feature requests.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Acknowledgments

- Thanks to the creators of [Spring Boot](https://spring.io/projects/spring-boot) and [Redis](https://redis.io/) for providing the tools that make this project possible.
