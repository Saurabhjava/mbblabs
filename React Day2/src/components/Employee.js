import { useState } from "react";

function Employee() {
  const [emp,setEmp]=useState({});
  const [employees,setEmployees]=useState([]);
  const chageHandler=(e)=>{
    const {name,value}=e.target;
    setEmp({...emp,[name]:value});
  }
  const addEmp=()=>{
    setEmployees([...employees,emp]);
   }
   return (
    <div>
      <h1>Employee Details</h1>
      <table>
        <tbody>
          <tr>
            <td>FirstName</td>
            <td><input type="text" name="fname" onChange={chageHandler} /></td>
          </tr>   
          <tr>
            <td>Email</td>
            <td><input type="text" name="email" onChange={chageHandler}/></td>
          </tr>   
          <tr>
            <td><button className="btn btn-primary" onClick={addEmp}>Add Employee</button></td>
          </tr>          
        </tbody>
      </table>
      <div>
        <table className="table table-bordered">
          <thead>
            <tr><th>Name</th><th>Email</th></tr>
          </thead>
          <tbody>
          {employees.map((e,i)=>
              <tr key={i}><td>{e.fname}</td><td>{e.email}</td></tr>
            )}
          </tbody>
        </table>
      </div>
    </div>
  )
}

export default Employee;