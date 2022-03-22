import logo from './logo.svg';
import './App.css';
import Greet from './components/Greet'
import Welcome from './components/Welcome';
import Hello from './components/Hello';
import Message from './components/Message';
import Counter from './components/Counter';
import FunctionClick from './components/FunctionClick';
function App() {
  return (
    <div className="App">

      <Counter />
      <FunctionClick></FunctionClick>
      {/* <Message/> */}
      {/* <Greet name="kew"><p>This is children props</p></Greet>  */}
      {/* <Welcome/>  */}
      {/* <Hello/> */}
    </div>
  );
}

export default App;
