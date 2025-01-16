import request from "supertest";
import app from "../src/index"; // Adjust the path to your app

describe("GET /items", () => {
  it("should return 200 OK and an empty array initially", async () => {
    const response = await request(app).get("/items");
    expect(response.status).toBe(200);
    expect(response.body).toEqual([]);
  });

  it("should return 200 OK and the list of items", async () => {
    // Add a new item first
    await request(app)
      .post("/items")
      .send({ name: "Item 1", description: "Description 1" });

    const response = await request(app).get("/items");
    expect(response.status).toBe(200);
    expect(response.body.length).toBeGreaterThan(0);
    expect(response.body[0]).toHaveProperty("id");
    expect(response.body[0]).toHaveProperty("name", "Item 1");
    expect(response.body[0]).toHaveProperty("description", "Description 1");
  });

  // Add more tests for the other CRUD operations
});
