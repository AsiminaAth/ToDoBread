/* Building the main component of the frontend application. */

import React, { useEffect, useState } from "react";
import { Todo } from "../src/models/ToDo_FE";
import { getTodos, createTodo } from "./services/todoService";

const App: React.FC = () => {
    const [todos, setTodos] = useState<Todo[]>([]);
    const [task, setTask] = useState("");

    useEffect(() => {
        fetchTodos();
    }, []);

    const fetchTodos = async () => {
        const data = await getTodos();
        setTodos(data);
    };

    const addTodo = async () => {
        if (!task) return;
        const newTodo = await createTodo({ task, status: "pending" });
        setTodos([...todos, newTodo]);
        setTask("");
    };

    return (
        <div style={{ padding: "20px" }}>
            <h1>TODO List - How to Fix Bread</h1>
            <input
                type="text"
                value={task}
                onChange={(e) => setTask(e.target.value)}
                placeholder="Enter a fix for bread..."
            />
            <button onClick={addTodo}>Add</button>
            <ul>
                {todos.map((todo) => (
                    <li key={todo.id}>
                        {todo.task} - {todo.status}
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default App;