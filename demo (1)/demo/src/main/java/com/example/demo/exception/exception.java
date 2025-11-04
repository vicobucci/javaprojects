package com.example.demo.exception;

import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.NoSuchElementException;

@RestControllerAdvice
public class exception {

    // Handles DB connection and query errors ("Not Connected")
    @ExceptionHandler({SQLException.class, DataAccessException.class})
    @ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
    public String handleDatabaseError(Exception ex) {
        return "Database connection error: " + ex.getMessage();
    }

    // Handles "Not Found" (book, author, etc doesn't exist)
    @ExceptionHandler(NoSuchElementException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleNotFound(Exception ex) {
        return "Resource not found: " + ex.getMessage();
    }

    // Handles empty list results for search APIs ("Doesn't have any")
    // Custom handler for empty results in controller
}