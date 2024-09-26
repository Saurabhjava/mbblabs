import React, { Component } from "react";
const MyComponent = (OriginalComponent) => {
  class NewComponent extends Component {
    constructor() {
      super();
      this.state = { count: 0 };
    }
    incr=()=> {
      this.setState({count:this.state.count+1});
    };
    render() {
      return (
          <OriginalComponent
            count={this.state.count}
            incrementCount={this.incr}
          />
      );
    }
  }
  return NewComponent;
};

export default MyComponent;
