TOURIST ANALYTICS - RUN INSTRUCTIONS

Requirements:
1. Install JDK 17 or later.
2. Install IntelliJ IDEA or Eclipse (or use Maven from a terminal).

Run using IntelliJ:
1. Extract the ZIP file.
2. Open the extracted TouristAnalytics folder in IntelliJ IDEA.
3. Wait for Maven dependencies to download.
4. Open TouristAnalyticsApplication.java.
5. Click the green Run button beside the main method.

Run using terminal:
1. Open a terminal in the extracted TouristAnalytics folder.
2. Run: mvn spring-boot:run

API:
GET http://localhost:8080/api/tourists

Swagger:
http://localhost:8080/swagger-ui/index.html

Swagger test:
1. Open Swagger UI.
2. Expand GET /api/tourists and click Try it out.
3. Enter header parameter Token with value tourist123.
4. Click Execute. Expected status: 200.
5. Change Token to wrong123 and execute again. Expected status: 401.

Valid token: tourist123
Invalid/missing token: 401 Unauthorized

Database:
This project uses an in-memory H2 database. Three sample tourist records are inserted
automatically when the application starts. No MySQL installation is required.
The in-memory database resets when the application is stopped.
