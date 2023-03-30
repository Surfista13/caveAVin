import React, { useEffect, useState } from 'react';
import './App.css';

const App = () => {

    const [bouteilles, setGroups] = useState([]);

    useEffect(() => {
        fetch('api/bouteilles')
            .then(response => response.json())
            .then(data => {
                setGroups(data);
            })
    }, []);
    return (
        <div className="App">
            <header className="App-header">
                <div className="App-intro">
                    <h2>Liste des bouteilles de la cave</h2>
                    {bouteilles.map(bouteille =>
                        <div key={bouteille.id}>
                            {bouteille.nom} {bouteille.millesime} {bouteille.couleur.nom}
                        </div>
                    )}
                </div>
            </header>
        </div>
    );
}

export default App;