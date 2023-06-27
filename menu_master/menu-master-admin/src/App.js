
import './App.css';
import {BrowserRouter as Router,Route,Routes} from 'react-router-dom';
import LoginPage from './pages/LoginPage';

function App() {
  return (
    <div>
      <router>
      <div>
              
              <Routes>
              
              <Route path="/" exact element={<LoginPage/>}></Route>

              </Routes>
      </div>
      </router>
    </div>          
  );
}

export default App;
