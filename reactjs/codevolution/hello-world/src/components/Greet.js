import React from "react";

const Greet = (props) => {
  console.log(props);
  return (
    <div id="hello" className="dummyName">
      <h1>Hello {props.name}</h1>
      {props.children}
    </div>
  );
};
export default Greet;
