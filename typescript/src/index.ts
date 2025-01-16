import express from "express";
import itemRoutes from "./routes/itemRoutes";

const app = express();
const port = 3000;

app.use(express.json());
app.use("/items", itemRoutes);

app.listen(port, () => {
  console.log(`Server is running on http://localhost:${port}`);
});
