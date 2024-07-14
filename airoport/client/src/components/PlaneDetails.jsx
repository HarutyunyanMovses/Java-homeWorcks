// TaskResult.jsx

import React from 'react';
import './result.css';

const PlaneDetails = ({ taskDesc, resString, plane }) => {
    return (
        <div className="task-result-container">
            <h2 className="task-result-title">{taskDesc}</h2>
            <div className="task-result">
                {plane ? (
                    <>
                    {console.log(1)}
                        <div className="task-result-item">
                            <span>Model:</span> {plane.model}
                        </div>
                        <div className="task-result-item">
                            <span>Country:</span> {plane.country}
                        </div>
                        <div className="task-result-item">
                            <span>Year:</span> {plane.year}
                        </div>
                        <div className="task-result-item">
                            <span>Hours:</span> {plane.hours}
                        </div>
                        <div className="task-result-item">
                            <span>Military:</span> {plane.military ? 'Yes' : 'No'}
                        </div>
                        <div className="task-result-item">
                            <span>Weight:</span> {plane.weight}
                        </div>
                        <div className="task-result-item">
                            <span>Wingspan:</span> {plane.wingspan}
                        </div>
                        <div className="task-result-item">
                            <span>Top Speed:</span> {plane.topSpeed}
                        </div>
                        <div className="task-result-item">
                            <span>Seats:</span> {plane.seats}
                        </div>
                        <div className="task-result-item">
                            <span>Cost:</span> {plane.cost}
                        </div>
                    </>
                ) : (
                    <div className="task-result-item">
                    {console.log(2)}
                        {resString}
                    </div>
                )}
            </div>
        </div>
    );
};

export default PlaneDetails;
