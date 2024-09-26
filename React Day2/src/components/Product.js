import React from 'react'
import "./prod.css"
import { Link, Outlet } from 'react-router-dom'

function Product(props) {
  return (
    <div className='productStyle'>
        <h3>ProductName: {props.pname}</h3>
        <h3>Price: {props.price}</h3>
        <h3>Sold By : {props.seller}</h3>
        <ul class="nav">
        <li class="nav-item">
          <Link class="nav-link" to={"book"}>
            Book
          </Link>
        </li>
        <li class="nav-item">
          <Link class="nav-link" to={"mobile"}>
            Mobile
          </Link>
        </li>
      </ul>
      <Outlet/>
    </div>
  )
}

export default Product