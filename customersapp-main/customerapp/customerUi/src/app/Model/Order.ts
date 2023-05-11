import { Item } from "./Item";

export interface Order{
    id: Number;
    date: String;
    total: Number;
    items: Array<Item>;
}