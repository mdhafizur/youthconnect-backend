# YouthConnect Backend

YouthConnect is a platform designed to connect youth services in Chemnitz, providing a centralized resource for finding and accessing local youth services, schools, and support facilities.

## Project Overview

This backend service is built with:

- Kotlin
- Spring Boot 3.2.5
- MongoDB
- Spring Security with JWT Authentication
- Swagger for API Documentation

## Prerequisites

- JDK 17+
- Gradle
- MongoDB instance (local or cloud-based)
- Git

## Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/youthconnect-backend.git
cd youthconnect-backend
```

### 2. Configure the Database

Create a file named `application-local.properties` in `src/main/resources/` with your MongoDB connection details:

```properties
spring.data.mongodb.uri=your_mongodb_connection_string
spring.data.mongodb.database=youthconnect
```

### 3. Build the Project

```bash
./gradlew build
```

### 4. Run the Application

```bash
./gradlew clean bootRun
```

The application will start on port 8080 by default.

## API Documentation

Once the application is running, you can access the Swagger UI at:

```plaintext
http://localhost:8080/swagger-ui.html
```

## Data Synchronization

The project includes GeoJSON data files for youth services in Chemnitz. To import this data into MongoDB:

### Install Required Tools

Ensure that `mongoimport` and `jq` are installed on your system.

#### On Ubuntu/Debian

```bash
sudo apt-get update
sudo apt-get install -y mongodb-clients jq
```

#### On macOS (using Homebrew)

```bash
brew tap mongodb/brew
brew install mongodb-database-tools
brew install jq
```

#### On Windows

1. **Install MongoDB Tools**:
   Download the MongoDB Database Tools MSI from the [MongoDB Download Center](https://www.mongodb.com/try/download/database-tools) and follow the installation instructions.

2. **Install jq**:
   Download the `jq` binary from the [jq GitHub Releases page](https://github.com/stedolan/jq/releases) and place it in a directory that is included in your system's PATH.

### Run the Data Sync Script

1. Make the script executable:

   ```bash
   chmod +x src/main/resources/datasource/sync.sh
   ```

2. Run the script:

   ```bash
   ./src/main/resources/datasource/sync.sh
   ```

## Development

### Generate API Documentation

To convert the API documentation from Markdown to Word format:

```bash
pandoc src/main/resources/youthconnect-api-docs.md -o src/main/resources/youthconnect-api-docs.docx
```

### Running Tests

```bash
./gradlew test
```

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Contact

Md Hafizur Rahman - [hafizur.upm@gmail.com](mailto:hafizur.upm@gmail.com)

Project Link: [https://github.com/your-username/youthconnect-backend](https://github.com/your-username/youthconnect-backend)
