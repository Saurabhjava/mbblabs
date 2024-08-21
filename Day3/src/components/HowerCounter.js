import React, { Component } from 'react'
import MyComponent from './MyComponent'
import UpdateComponent from './MyComponentWithFunction';
import './prod.css';

function HowerCounter(props){
  let cName=props.color()?"bascColor":"";
    return (
      <div>
        <h2 className={cName} onMouseOver={props.increment}>Count={props.count}</h2>
      </div>
    )
}

export default UpdateComponent(HowerCounter);