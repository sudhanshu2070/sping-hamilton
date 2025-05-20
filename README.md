# Project Setup & Running Guide

Welcome to the project! Follow these steps to set up and run the Spring Boot application.

---

## 🚀 Prerequisites

- [Java JDK 17+](https://adoptopenjdk.net/)
- [Maven](https://maven.apache.org/)
- [Git](https://git-scm.com/)

---

## 📦 Installation

1. **Clone the repository:**
    ```bash
    git clone https://github.com/sudhanshu2070/sping-hamilton.git
    cd your-repo
    ```

2. **Build the project:**
    ```bash
    mvn clean install
    ```

---

## ⚙️ Configuration

- Copy `src/main/resources/application.example.properties` to `src/main/resources/application.properties` and update configuration as needed:
    ```bash
    cp src/main/resources/application.example.properties src/main/resources/application.properties
    ```

---

## 🏃 Running the Project

- **Start the application:**
    ```bash
    mvn spring-boot:run
    ```
    The app should now be running at [http://localhost:8080](http://localhost:8080).

---

## 🧪 Running Tests

- **Run all tests:**
    ```bash
    mvn test
    ```

---

## 📁 Project Structure

```plaintext
.
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── pom.xml
└── README.md
```

---

## 🙋 Need Help?

- Check the [issues](https://github.com/sudhanshu2070/) page.
- Contact the maintainer.

---

Happy coding! 🎉