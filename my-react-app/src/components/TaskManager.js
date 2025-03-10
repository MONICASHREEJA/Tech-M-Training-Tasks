import React, { useState, useEffect } from 'react';
import axios from 'axios';
import Task from './Task';
import TaskForm from './TaskForm';

const TaskManager = () => {
  const [tasks, setTasks] = useState([]);

  useEffect(() => {
    axios.get('https://jsonplaceholder.typicode.com/todos')
      .then(response => setTasks(response.data))
      .catch(error => console.error('Error fetching tasks', error));
  }, []);

  const addTask = (task) => {
    setTasks([...tasks, task]);
  };

  const deleteTask = (id) => {
    setTasks(tasks.filter(task => task.id !== id));
  };

  return (
    <div className="container">
      <h1 className="mt-5">Task Manager</h1>
      <TaskForm addTask={addTask} />
      <div className="list-group mt-4">
        {tasks.map(task => (
          <Task key={task.id} task={task} deleteTask={deleteTask} />
        ))}
      </div>
    </div>
  );
};

export default TaskManager;
