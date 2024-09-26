import { useState } from "react";

function Employee() {
  const [emp,setEmp]=useState({});
  const [employees,setEmployees]=useState([]);
  const chageHandler=(e)=>{
    const {name,value}=e.target;
    setEmp({...emp,[name]:value});
  }
  const addEmp=()=>{
    console.log(emp);
  }
  return (
    <div>
      <table>
        <tbody>
          <tr>
            <td>FirstName</td>
            <td><input type="text" name="fname" onChange={chageHandler}/></td>
          </tr>   
          <tr>
            <td>Email</td>
            <td><input type="text" name="email" onChange={chageHandler}/></td>
          </tr>   
          <tr>
            <td><button onClick={addEmp}>Add Employee</button></td>
          </tr>          
        </tbody>
      </table>
    </div>
  )
}

export default Employee;