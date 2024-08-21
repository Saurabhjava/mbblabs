import { useState } from "react";

function UpdateComponent(OriginalComponent) {
  function NewFunctionComponent() {
    const [count, setCount] = useState(0);
    function incr() {
      setCount(count + 1);
    }
    function m1() {
      if (count % 2 == 0) 
        return true;
      else return false;
    }
    return (
      <OriginalComponent count={count} increment={incr} color={m1} />
    );
  }
  return NewFunctionComponent;
}
export default UpdateComponent;
