import React, { useState } from 'react'

function Child(props) {
    const [data,setData]=useState();
  return (
    <div>
        <input type='text' onChange={(e)=>setData(e.target.value)}/>
        <button onClick={()=>props.setName(data)}>ClickMe</button>
    </div>
  )
}

export default Child