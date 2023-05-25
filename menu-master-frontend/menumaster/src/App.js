import './App.css';
import {BrowserRouter as Router,Route,Routes} from 'react-router-dom';
import WelcomePage from './pages/WelcomePage';

function App() {
  return (
    <div>
    <Router>
    <div>
            
            <Routes>
            
            <Route path="/" exact element={<WelcomePage/>}></Route>

            </Routes>
    </div>
    </Router>
    </div>
  );
}

export default App;
