import React, { useLayoutEffect, useState } from "react";
import fetch from "../JS/services/fetch";
import "./table.css"

export default function Table(params) {
    let [planes , setPlanes] = useState([])

    useLayoutEffect(()=>{
        fetch.get("planes")
        .then(data => {
            setPlanes(data)
        })
        .catch(err =>{
            alert("mi ban en chi ")
        })
    },[])


    return(
        <div  className="table-container">
        <h2>Aircraft Information</h2>
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
                {planes.map((plane, index) => (
                    <tr key={index}>
                        <td>{plane.model}</td>
                        <td>{index+1}</td>
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
                ))}
            </tbody>
        </table>
    </div>
    )
}