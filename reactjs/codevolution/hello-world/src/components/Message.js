import React, { Component } from "react";

class Message extends Component {
  constructor() {
    super(); //required because we use component class, has to be made to call parent component
    this.state = {
      message: "Welcome visitor",
    };
  }

  render() {
    return (
      <div>
        <h1>{this.state.message}</h1>
        <button onClick={()=> this.changeMessage()}>Subscribe</button>

      </div>
    );
  }

  changeMessage(){
      this.setState({
          message:'Thank you for subscribing'
      })
  }
}

export default Message;
