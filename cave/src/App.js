import React, { useEffect, useState } from 'react';
import './App.css';

const App = () => {

    const [bouteilles, setGroups] = useState([]);
    const [couleurs, setCouleurs] = useState([]);
    const [regions, setRegions] = useState([]);
    const [bouteille, setBouteille] = useState({
        nom: "",
        millesime: "",
        quantite: "",
        couleur:{
            id: "",
            nom: ""
        },
        region: {
            id: "",
            nom: ""
        }
    })
    function handleChange(event){
        const target = event.target;
        let value = target.value;
        console.log(value);
        const name = target.name;
        name =="petillant" && target.checked ? value = true : value = false;
        bouteille[name] = value;
        setBouteille(bouteille);
        console.log(bouteille);
    };



    useEffect(() => {
        fetch('api/bouteilles')
            .then(response => response.json())
            .then(data => {
                setGroups(data);
            })
    }, []);
    useEffect(() => {
        fetch('api/couleurs')
            .then(response => response.json())
            .then(data => {
                setCouleurs(data);
            })
    });
    useEffect(() => {
        fetch('api/regions')
            .then(response => response.json())
            .then(data => {
                setRegions(data);
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
            <form>
                <div>
                    <label>Nom de la bouteille</label>
                    <input type="text" name="nom" onChange={handleChange}/>
                </div>
                <div>
                    <label>Petillant</label>
                    <input type="checkbox" name="petillant" onChange={handleChange} />
                </div>
                <div>
                    <label>Millesime</label>
                    <input type="text" name="millesime" />
                </div>
                <div>
                    <label>Quantite</label>
                    <input type="number" name="quantite" />
                </div>
                <div>
                    <label>Couleur</label>
                    <select name="couleur">
                        {couleurs.map(couleur =>
                            <option key={couleur.id} value={couleur.id}>{couleur.nom}</option>
                        )}
                    </select>
                </div>
                <div>
                    <label>Region</label>
                    <select name="region">
                        {regions.map(region =>
                            <option key={region.id} value={region.id}>{region.nom}</option>
                        )}
                    </select>
                </div>

                <input type="submit" value="Ajouter" />
            </form>
        </div>
    );
}

export default App;