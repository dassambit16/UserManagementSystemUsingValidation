# User Management System

A Java Spring Boot application for managing user data with validation.

## Project Details

- **Dependencies:**
  - SpringBoot Starter Web
  - Lombok
  - Validation

- **Data Flow:**
  - User

- **User Attributes:**
  1. userId
  2. userName
  3. Type
  4. userEmail (validated with @Email)
  5. userContactNo
  6. userDOB

- **Controller:**
  1. `POST /users`: Add multiple users with validation.
  2. `GET /users/id/{id}`: Retrieve a user by their ID.
  3. `GET /users`: Retrieve all users.
  4. `PUT /User/id/{id}`: Update a user's phone number by their ID.
  5. `DELETE /user/id/{id}`: Remove a user by their ID.

- **Service:**
  1. Get all users
  2. Get a specific user
  3. Add a user
  4. Add multiple users
  5. Update user contact info
  6. Delete a user

- **Data Structure:**
  - ArrayList from the collection framework
