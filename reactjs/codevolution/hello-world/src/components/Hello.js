import React from 'react'
//function component
const Hello = () => {
    // return(
    //     <div className = 'dummyClass'><h1>Hello Hieu</h1></div>
    // )
    return React.createElement(
        'div',
        { id: 'hello', className: 'dummyClass' },
        React.createElement('h1', null, 'Hello Hieu')
    )
}
export default Hello