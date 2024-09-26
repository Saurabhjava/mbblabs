import React, { Component } from 'react'

export class StateDemoWithClass extends Component {
    constructor(){
        super();
        this.state={counter:0}
    }
    componentDidMount() {
      document.title=`Clicked ${this.state.counter} times`;
    }
    componentDidUpdate() {
      document.title=`Clicked ${this.state.counter} times`;
    }
    clicked(){
        this.setState({counter:this.state.counter+1});
    }
  render() {
    return (
      <div>
        <h2>Counter={this.state.counter}</h2>
        <button onClick={()=>this.clicked()}>ClickMe</button>
        {/* <button onClick={this.clicked.bind(this,"Ankit")}>ClickMe</button> */}
        {/* <button onClick={()=>this.clicked("Ankit")}>ClickMe</button> */}
      </div>
    )
  }
}

export default StateDemoWithClass