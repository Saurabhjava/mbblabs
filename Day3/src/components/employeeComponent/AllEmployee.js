import axios from "axios";
import React, { useEffect, useState } from "react";

function AllEmployee(props) {
  
  return (
    <div>   
      <input
        type="text"
        className="form-control"
        placeholder="Enter Name to Search"
        onChange={(e) => props.nameHandler(e.target.value)}
      />  
      <table className="table table-bordered">
        <thead>
          <tr>
            <th>Employee ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>DOB</th>
          </tr>
        </thead>
        <tbody>
          {
            props.employees.map((e) => (
                <tr key={e.empid}>
                  <td>{e.empid}</td>
                  <td>{e.name}</td>
                  <td>{e.email}</td>
                  <td>{e.dob}</td>
                  <td><button className="btn btn-danger">Delete</button></td>
                </tr>
              ))
            }
        </tbody>
      </table>
    </div>
  );
}

export default AllEmployee;
