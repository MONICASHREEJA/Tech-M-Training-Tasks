import React from 'react';

const Task = ({ task, deleteTask }) => {
  return (
    <div className="list-group-item">
      <h5>{task.title}</h5>
      <p>{task.description}</p>
      <button className="btn btn-danger" onClick={() => deleteTask(task.id)}>
        Delete
      </button>
    </div>
  );
};

export default Task;
