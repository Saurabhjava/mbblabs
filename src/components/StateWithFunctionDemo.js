import React, { useEffect, useState } from 'react'

function StateWithFunctionDemo() {
    const [count,setCount]=useState(0);
    const [msg,setMsg]=useState("Hello React"); 
    function incr(){
        setCount(count+1);
    }
    useEffect(()=>{
      document.title="Changed in Message State";
    },[msg]);

    useEffect(()=>{
      document.title=`You Clickec ${count}`;
    },[count]);

    function changeMessage(){
      setMsg("Message Change By Button Clicked");
    }
  return (
    <div>
        <h2>{msg}</h2>
        <h2>Counter={count}</h2>
        <button onClick={incr}>ClickMe</button>
        <button onClick={changeMessage}>Button2</button>
    </div>
  )
}

export default StateWithFunctionDemo