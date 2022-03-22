import React, { Component } from 'react'
import AddTodo from './AddTodo';

export class ListTodo extends Component {

    state = {
        listToDo: [
            { id: 1, title: 'todo1' },
            { id: 2, title: 'todo2' },
            { id: 3, title: 'todo3' },
        ]
    }

    addTodo = (todo) => {
        this.setState({
            listToDo: [...this.state.listToDo, todo]
        })
    }

    render() {
        //variable assignment
        let listToDo = this.state.listToDo;
        console.log(listToDo)
        return (
            <div>
                <AddTodo addTodo={this.addTodo} />
                <div>
                    {listToDo.map((todo) => {
                        return (
                            <div key={todo.id}>{todo.title}</div>
                        )
                    })}
                </div>
            </div>

        )
    }
}

export default ListTodo
