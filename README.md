# Fortune API

A RESTful API for retrieving random fortunes, developed with Spring Boot and Maven. This project allows users to get random fortunes through a simple HTTP API, inspired by the classic Unix-based `fortune` command.

## Table of Contents

- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Configuration](#configuration)

## Features

- Fetch random fortunes
- Built with Spring Boot for simplicity and ease of use
- Configured with Maven for dependency management

## Background

The `fortune` command is a classic Unix utility that displays random quotes, jokes, or sayings from a database of text files. It has been a fun and whimsical part of Unix-like systems for decades, often used to provide users with a bit of amusement in their terminal sessions.

Inspired by this tradition, the Fortune API offers a modern, RESTful approach to delivering random fortunes in a structured JSON format.

## Installation

### Prerequisites

- Java 17 or higher
- Maven

### Clone the Repository

1. Clone the repository
   ```bash
    git clone https://github.com/yourusername/fortune-api.git

3. Navigate to the project directory:
    ```bash
    cd fortune-api

### Build and Run

1. Build the project with Maven:
    ```bash  
    mvn clean install

2. Run the application:
    ```bash
    mvn spring-boot:run
    ```
    
    The application should start on `http://localhost:8080` by default.

## Usage

To interact with the API, you can use tools like `curl`, Postman, or any HTTP client.

### Example Request

    curl http://localhost:8080/api/getFortune

### Example Response

    {
      "author": "Randall Munroe, xkcd",
      "quote": "Our brains have just one scale, and we resize our experiences to fit."
    }

## API Endpoints

### GET /api/getFortune

- **Description**: Retrieves a random fortune.
- **Response**: A JSON object with the following structure:
  - `author` (string): The author of the fortune.
  - `quote` (string): The fortune text.

## Configuration

You can configure the application by editing the `application.properties` file located in `src/main/resources/`. For example, you can change the server port or other settings.
