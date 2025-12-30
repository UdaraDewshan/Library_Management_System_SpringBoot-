# Library Management System

A RESTful API-based Library Management System built with Spring Boot and Hibernate, providing comprehensive book and member management functionality.

## Features

- **Book Management**
  - Add new books to the library
  - View all books
  - Search books by ID
  - Remove books from inventory
  - Track book availability status

- **Member Management**
  - Register new library members
  - View all registered members
  - Search members by ID
  - Remove member records
  - Store member contact information

## Technology Stack

- **Java 22**
- **Spring Boot 4.0.0-M2**
- **Hibernate 7.1.0.Final**
- **MySQL 9.4.0**
- **Lombok 1.18.42**
- **Maven** (Build Tool)

## Prerequisites

Before running this application, ensure you have:

- Java JDK 22 or higher
- MySQL Server installed and running
- Maven 3.6+
- An IDE (IntelliJ IDEA, Eclipse, or VS Code)

## Database Configuration

The application uses MySQL database with the following default configuration:

- **Database Name:** `library_management_system`
- **Host:** `localhost`
- **Port:** `3306`

To modify these settings, update the `hibernate.cfg.xml` file located in the resources directory.

## Installation & Setup

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd library_management_system_springboot
   ```

2. **Update database credentials**
   
   Edit `src/main/resources/hibernate.cfg.xml` and update the MySQL credentials if needed.

3. **Build the project**
   ```bash
   mvn clean install
   ```

4. **Run the application**
   ```bash
   mvn spring-boot:run
   ```

   Or run the `Main.java` class directly from your IDE.

The application will start on `http://localhost:8080`

## API Endpoints

### Book Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/book/all` | Retrieve all books |
| POST | `/book/add` | Add a new book |
| GET | `/book/search={id}` | Search book by ID |
| GET | `/book/remove={id}` | Remove a book |

**Book JSON Structure:**
```json
{
  "id": "B001",
  "name": "The Great Gatsby",
  "description": "A classic American novel",
  "available": true
}
```

### Member Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/member/all` | Retrieve all members |
| POST | `/member/add` | Add a new member |
| GET | `/member/search={id}` | Search member by ID |
| GET | `/member/remove={id}` | Remove a member |

**Member JSON Structure:**
```json
{
  "id": "M001",
  "name": "John Doe",
  "address": "123 Main Street",
  "phoneNo": "+1234567890"
}
```

## Usage Examples

### Adding a Book
```bash
curl -X POST http://localhost:8080/book/add \
  -H "Content-Type: application/json" \
  -d '{
    "id": "B001",
    "name": "1984",
    "description": "Dystopian novel by George Orwell",
    "available": true
  }'
```

### Getting All Members
```bash
curl http://localhost:8080/member/all
```

### Searching for a Book
```bash
curl http://localhost:8080/book/search=B001
```

## Project Structure

```
src/main/java/edu/icet/ecom/
├── Main.java                          # Application entry point
├── config/
│   ├── HibernateUtillBook.java       # Hibernate config for Books
│   └── HibernateUtilMember.java      # Hibernate config for Members
├── controller/
│   ├── BookController.java           # REST endpoints for Books
│   └── MemberController.java         # REST endpoints for Members
├── service/
│   ├── BookService.java              # Business logic for Books
│   └── MemberService.java            # Business logic for Members
├── repository/
│   ├── BookRepository.java           # Data access for Books
│   └── MemberRepository.java         # Data access for Members
└── model/entity/
    ├── Book.java                     # Book entity
    └── Member.java                   # Member entity
```

## Database Schema

### Book Table
- `id` (VARCHAR) - Primary Key
- `name` (VARCHAR)
- `description` (VARCHAR)
- `isAvailable` (BOOLEAN)

### Member Table
- `id` (VARCHAR) - Primary Key
- `name` (VARCHAR)
- `address` (VARCHAR)
- `phoneNo` (VARCHAR)

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## Future Enhancements

- Implement book borrowing and return functionality
- Add user authentication and authorization
- Create a frontend interface
- Add late fee calculation
- Implement email notifications
- Add pagination for large datasets
- Implement search by book name/author
- Add member borrowing history

## License

This project is licensed under the MIT License.

## Contact

For questions or support, please open an issue in the repository.
