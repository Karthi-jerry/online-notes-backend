# Use Java 17 base image
FROM eclipse-temurin:17-jdk

# Set work directory
WORKDIR /app

# Copy Gradle wrapper and project files
COPY . .

# Build the application
RUN ./gradlew build --no-daemon

# Run the jar (adjust path if needed)
CMD ["java", "-jar", "build/libs/online-notes-app-backend-0.0.1-SNAPSHOT.jar"]
