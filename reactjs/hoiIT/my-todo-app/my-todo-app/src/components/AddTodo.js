import React, { Component } from 'react'

export class AddTodo extends Component {
    state = {
        title: ''
    }
    handleonClick = () => {

        this.props.addTodo(this.state)
    }

    handleChangeinput = (e) => {
        this.setState({
            id: Math.floor(Math.random() * 10000), //giving random id to prevent this error: https://stackoverflow.com/q/28329382
            title: e.target.value
        })
    }

    render() {

        let input = this.state.title//value = {input} sets the initial value of input, which is '' 

        return (
            //when there is change (everytime you press a character), set state object to changed input value.
            <div>
                <input onChange={(e) => this.handleChangeinput(e)} type="text" value={input}></input>
                <button onClick={() => this.handleonClick()}>Add</button>
            </div>

        )
    }
}

export default AddTodo