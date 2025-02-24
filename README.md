# ToDoBread

Simple application to describe the steps of creating home-made bread.

Java, Javascript, Typescript, React, Node.js

**********************************************************************************************

Run the backend:
'./mvnw spring-boot:run'
(The API should be available at http://localhost:8080/todos)

Refresh the code:
'mvn clean install'

Identify if any required dependencies are missing:
'mvn dependency:tree'

******

RUNNING THE FRONTEND:

Create a new React project with TypeScript:
'npx create-react-app todo-frontend --template typescript'

Run the React project in development mode:
'npm start'
(After running npm start, your React + TypeScript app will be live at: 👉 http://localhost:3000/)

******

The steps in a nutchel:

Ensure the Backend is Running (mvnw spring-boot:run)
Run the Frontend (npm start)
Try adding a TODO task about fixing bread! 🥖

******

Some definitions:

1️⃣ npx
npx is a package runner that comes with npm (Node Package Manager).
It allows you to execute packages without globally installing them.
In this case, it runs create-react-app without needing to install it separately.
2️⃣ create-react-app todo-frontend
create-react-app is a tool that sets up a new React project with a default configuration.
todo-frontend is the name of your new project directory.
It will create a new folder named todo-frontend and set up a React project inside it.
3️⃣ --template typescript
By default, create-react-app sets up a JavaScript-based React project.
Adding --template typescript makes it a TypeScript project instead of JavaScript.