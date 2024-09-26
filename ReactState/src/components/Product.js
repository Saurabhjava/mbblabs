import React from 'react'
import "./prod.css"

function Product(props) {
  return (
    <div className='productStyle'>
        <h3>ProductName: {props.pname}</h3>
        <h3>Price: {props.price}</h3>
        <h3>Sold By : {props.seller}</h3>
    </div>
  )
}

export default Product