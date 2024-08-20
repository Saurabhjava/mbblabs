import React, { Component } from 'react'

export class ProductClass extends Component {
  render() {
    return (
        <div className='productStyle'>
        <h3>ProductName: {this.props.pname}</h3>
        <h3>Price: {this.props.price}</h3>
        <h3>Sold By : {this.props.seller}</h3>
    </div>
    )
  }
}

export default ProductClass