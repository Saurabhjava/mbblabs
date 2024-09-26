import React from 'react'
import { useParams } from 'react-router-dom'

function UpdateEmployee() {
    let { empid }=useParams();
  return (
    <div>Update the Employee of Employee Id :{empid}</div>
  )
}

export default UpdateEmployee