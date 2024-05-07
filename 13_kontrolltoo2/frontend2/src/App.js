import { useEffect, useRef, useState } from 'react';
import './App.css';

function App() {
  const [autod, setAutod] = useState([]);
  const markRef = useRef();
  const pikkusRef = useRef();
  const massRef = useRef();
  const aastaaRef = useRef();

  useEffect(() => {
    fetch("http://localhost:8080/autod")
      .then(response => response.json())
      .then(body => {
        setAutod(body);
      })
  }, []);

    function kustuta(primaarivoti) {
     fetch("http://localhost:8080/autod/" + primaarivoti, {"method": "DELETE"})
       .then(response => response.json()) 
       .then(json => {
         setAutod(json);
      })
   }

  function lisa() {
    if (markRef.current.value.trim() === "") {
      return;
  }
  const auto = {
    "mark": markRef.current.value,
    "pikkus": pikkusRef.current.value,
    "mass": massRef.current.value,
    "aastaa": aastaaRef.current.value, 
  }
  fetch("http://localhost:8080/autod", 
  {
    "method": "POST", 
    "body": JSON.stringify(auto),
    "headers": {"Content-Type": "application/json"}
  })
      .then(response => response.json()) 
      .then(json => {
      setAutod(json);
    })
  }


  return (
    <div className="App">
      <div>
        
        <label>Auto mark</label> <br/>
        <input ref={markRef} type="text" /> <br />
        <label>Auto pikkus</label> <br/>
        <input ref={pikkusRef} type="text" /> <br />
        <label>Auto mass</label> <br/>
        <input ref={massRef} type="text" /> <br />
        <label>Auto aasta</label> <br/>
        <input ref={aastaaRef} type="text" /> <br />
        <button onClick={() => lisa()}>Sisesta</button> <br />
        <br />

        {autod.map(t => 
          <div>{t.mark} | {t.pikkus} | {t.mass} | {t.aastaa} 
            {<button onClick={() => kustuta(t.id)}>x</button>}
          </div> )}
      </div>
    </div>
  );
}

export default App;