import React, { useState, useEffect } from 'react';
import axios from 'axios';
import './App.css'; // Importing the custom CSS for the app

// Task Component (Child)
const Task = ({ task, deleteTask, index, totalTasks }) => {
  // Dynamic background color logic based on index
  const getBackgroundColor = () => {
    if (index === 0) return 'red'; // Older tasks (first added)
    if (index === totalTasks - 1) return 'green'; // Most recently added task
    return 'orange'; // Tasks in between
  };

  return (
    <div className="list-group-item" style={{ backgroundColor: getBackgroundColor() }}>
      <h5>{task.title}</h5>
      <p>{task.description}</p>
      <button className="btn btn-danger" onClick={() => deleteTask(task.id)}>
        Delete
      </button>
    </div>
  );
};

// Task Form Component (Child)
const TaskForm = ({ addTask }) => {
  const [title, setTitle] = useState('');
  const [description, setDescription] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    const newTask = { title, description, id: Date.now() };

    addTask(newTask);
    setTitle('');
    setDescription('');
  };

  return (
    <form onSubmit={handleSubmit} className="mb-4">
      <div className="form-group">
        <label>Task Title</label>
        <input
          type="text"
          className="form-control"
          value={title}
          onChange={(e) => setTitle(e.target.value)}
          required
        />
      </div>
      <div className="form-group">
        <label>Task Description</label>
        <textarea
          className="form-control"
          value={description}
          onChange={(e) => setDescription(e.target.value)}
          required
        />
      </div>
      <button type="submit" className="btn btn-primary mt-3">
        ADD Task- LET'S GO!
      </button>
    </form>
  );
};

// Main App Component (Parent)
function App() {
  // Initialize tasks with some predefined tasks
  const [tasks, setTasks] = useState([]);
  useEffect(() => {
    axios
      .get('https://jsonplaceholder.typicode.com/todos')
      .then((response) => {
        // Map API response to the shape we need (adding descriptions and other fields)
        const apiTasks = response.data.map((task) => ({
          id: task.id,
          title: task.title,
          description: task.completed
            ? 'Task completed, no further action needed.'
            : 'This task is pending.',
        }));
        setTasks(apiTasks); // Set tasks state with fetched data
      })
      .catch((error) => {
        console.error('Error fetching tasks from API', error);
      });
  }, []);
  const addTask = (task) => {
    setTasks([...tasks, task]);
  };

  const deleteTask = (id) => {
    setTasks(tasks.filter((task) => task.id !== id));
  };
   
  return (
    <div className="App">
      <header className="App-header">
        <h1>DIGITAL TASK MANAGER</h1>
        <h2>Empower Your Day, One Task at a Time</h2>
        <p>Welcome to the Task Manager App!</p>
        <p>Scroll-Down to begin!</p>
      </header>

      <div className="container">
        <TaskForm addTask={addTask} />
        <div className="list-group mt-4">
          {tasks.map((task) => (
            <Task key={task.id} task={task} deleteTask={deleteTask} />
          ))}
        </div>
      </div>
    </div>
  );
}

export default App;
