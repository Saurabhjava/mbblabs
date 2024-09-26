import axios from "axios";
import React, { useEffect, useState } from "react";
import AllEmployee from "./AllEmployee";

function CreateEmployee() {
  const url = "http://localhost:8080/employees";
  const [employee, setEmployee] = useState({ name: "", email: "", dob: "" });
  const [emps, setEmps] = useState([]);
  const [errMsg, setErrMsg] = useState("");
  const [name, setName] = useState("");
  useEffect(() => {
    const getData = setTimeout(() => {
      axios
        .get(url + "/name/" + name)
        .then((response) => {
          setEmps(response.data);
        })
        .catch((error) => {
          setErrMsg("***********Error is API Call");
        });
    }, 500);
    return () => clearTimeout(getData);
  }, [name]);
  useEffect(() => {
    axios
      .get(url)
      .then((response) => {
        setEmps(response.data);
      })
      .catch((error) => {
        setErrMsg("=========Error is API Call" + error);
      });
  }, []);
  const changeHandler = (e) => {
    setEmployee({ ...employee, [e.target.name]: e.target.value });
  };
  const handleName = (name) => {
    setName(name);
  };
  const addEmployee = (e) => {
    e.preventDefault();
    axios
      .post(url, employee)
      .then((response) => {
        console.log(response.data);
        setEmps([...emps, response.data]);
      })
      .catch((e) => {
        setErrMsg(e);
      });
  };
  const deleteEmployee = (eid) => {
    axios
      .delete(`http://localhost:8080/employees/${eid}`)
      .then((response) => {
        setEmps(response.data);
      })
      .catch((e) => {
        setErrMsg("Error in Delete");
      });
  };
  return (
    <div>
      <form onSubmit={addEmployee}>
        <div className="form-group">
          <input
            type="text"
            className="form-control"
            name="name"
            placeholder="Enter Name"
            onChange={changeHandler}
          />
        </div>
        <div className="form-group">
          <input
            type="text"
            className="form-control"
            name="email"
            placeholder="Enter Email"
            onChange={changeHandler}
          />
        </div>
        <div className="form-group">
          <input
            type="text"
            className="form-control"
            name="dob"
            placeholder="Enter DOB"
            onChange={changeHandler}
          />
        </div>
        <div className="d-flex">
          <button className="btn btn-primary" type="submit">
            AddEmployee
          </button>
        </div>
      </form>
      <AllEmployee employees={emps} nameHandler={handleName}  delEmp={deleteEmployee}/>
      <p style={{ color: "red" }}>{errMsg}</p>
    </div>
  );
}

export default CreateEmployee;
