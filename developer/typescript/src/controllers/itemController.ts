import { Request, Response } from "express";
import { Item } from "../models/item";

let items: Item[] = [];
let currentId = 1;

export const getItems = (req: Request, res: Response) => {
  res.json(items);
};

export const getItemById = (req: Request, res: Response) => {
  const id = parseInt(req.params.id);
  const item = items.find((item) => item.id === id);
  if (item) {
    res.json(item);
  } else {
    res.status(404).send("Item not found");
  }
};

export const createItem = (req: Request, res: Response) => {
  const newItem: Item = {
    id: currentId++,
    ...req.body,
  };
  items.push(newItem);
  res.status(201).json(newItem);
};

export const updateItem = (req: Request, res: Response) => {
  const id = parseInt(req.params.id);
  const index = items.findIndex((item) => item.id === id);
  if (index !== -1) {
    items[index] = { id, ...req.body };
    res.json(items[index]);
  } else {
    res.status(404).send("Item not found");
  }
};

export const deleteItem = (req: Request, res: Response) => {
  const id = parseInt(req.params.id);
  const index = items.findIndex((item) => item.id === id);
  if (index !== -1) {
    items.splice(index, 1);
    res.status(204).send();
  } else {
    res.status(404).send("Item not found");
  }
};
