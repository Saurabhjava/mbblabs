import React, { useState } from "react";
import Child from "./Child";

function Parent() {
  const [count, setCount] = useState(0);
  const [fname,setFname]=useState("<YourName>");
  function incr() {
    setCount(count + 1);
  }
  function displayName(fname) {
        setFname(fname);
  }
  return (
    <div>
      <h2>Count Value{count}</h2>
      <h2>Your Name: {fname}</h2>
      <Child increment={incr} setName={displayName}></Child>
    </div>
  );
}

export default Parent;
