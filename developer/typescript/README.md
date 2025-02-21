# TypeScript CRUD Application

This is a basic CRUD application built with TypeScript and Express.

## Installation

1. Clone the repository
2. Run `npm install` to install dependencies

## Usage

- `npm run dev`: Run the application in development mode
- `npm start`: Build and run the application

## Docker

To build and run the Docker container:

1. Build the Docker image:
   ```sh
   npm run docker-build
   ```

2. Run the Docker container:
   ```sh
   docker run -p 3000:3000 typescript-crud
   ```

## Endpoints

- `GET /items`: Get all items
- `GET /items/:id`: Get an item by ID
- `POST /items`: Create a new item
- `PUT /items/:id`: Update an item by ID
- `DELETE /items/:id`: Delete an item by ID