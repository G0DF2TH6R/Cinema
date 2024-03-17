import './App.css';
import Week from './components/Week'

function App() {
  let days = ['Esmaspäev', 'Teisipäev']

  return (
    <div className="App">
      <Week days={days} />
    </div>
  );
}

export default App;
