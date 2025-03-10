import React, { useState } from 'react';
import axios from 'axios';

const TaskForm = ({ addTask }) => {
  const [title, setTitle] = useState('');
  const [description, setDescription] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();

    const newTask = { title, description };

    axios.post('https://jsonplaceholder.typicode.com/todos', newTask)
      .then(response => {
        addTask(response.data); // Adding new task to the list
        setTitle('');
        setDescription('');
      })
      .catch(error => console.error('Error adding task', error));
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
      <button type="submit" className="btn btn-primary mt-3">Add Task</button>
    </form>
  );
};

export default TaskForm;
