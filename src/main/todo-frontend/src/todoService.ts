// import axios from "axios";
// import { Todo } from "../models/ToDo_FE";

import { Todo } from "./ToDo_FE";

// const API_URL = "http://localhost:8080/todos";

// export const getTodos = async (): Promise<Todo[]> => {
//     const response = await axios.get(API_URL);
//     return response.data;
// };

// export const createTodo = async (todo: Todo): Promise<Todo> => {
//     const response = await axios.post(API_URL, todo);
//     return response.data;
// };

const API_URL = "http://localhost:8080/todos";

export const getTodos = async () => {
    const response = await fetch(API_URL);
    return response.json();
};

export const createTodo = async (todo: Todo) => {
    const response = await fetch(API_URL, {
        method: "POST",
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify(todo),
    });
    return response.json();
};