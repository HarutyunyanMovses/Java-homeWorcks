// PlanesTable.jsx

import React from 'react';
import './result.css';

const PlanesTable = ({ taskDesc, resPlanes }) => {
    return (
        <div className="planes-table-container">
            <h2 className="planes-table-title">{taskDesc}</h2>
            <table>
                <thead>
                    <tr>
                        <th>Model</th>
                        <th>ID</th>
                        <th>Country</th>
                        <th>Year</th>
                        <th>Military</th>
                        <th>Wingspan</th>
                        <th>Top Speed</th>
                        <th>Hours in Air</th>
                        <th>Weight</th>
                        <th>Seats</th>
                        <th>Cost</th>
                    </tr>
                </thead>
                <tbody>
                    {resPlanes.map((plane, index) => (
                        <tr key={index}>
                            <td>{plane.model}</td>
                            <td>{index + 1}</td>
                            <td>{plane.country}</td>
                            <td>{plane.year}</td>
                            <td>{plane.military ? 'Yes' : 'No'}</td>
                            <td>{plane.wingspan}m</td>
                            <td>{plane.topSpeed}km/h</td>
                            <td>{plane.hours}</td>
                            <td>{plane.weight}kg</td>
                            <td>{plane.seats}</td>
                            <td>{plane.cost}$</td>
                        </tr>
                    ))


                    }
                </tbody>
            </table>
        </div>
    );
};

export default PlanesTable;
