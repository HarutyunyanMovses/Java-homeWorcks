
import React, { useState } from 'react';
import "./taskBar.css"
import fetch from '../JS/services/fetch';
import PlanesTable from './PlanesTable';
import PlaneDetails from './PlaneDetails';

const TaskBar = () => {
    const [index, setIndex] = useState('');
    const [input1, setInput1] = useState(0);
    const [input2, setInput2] = useState(0);
    const [input3, setInput3] = useState(0);
    const [taskData, setTaskData] = useState(null)
    const handleSubmit = async (e) => {
        e.preventDefault();

        try {
            switch (index) {
                case 2:
                case 3:
                case 4:
                case 5:
                    fetch.post(`task${index}`,
                        {
                            i: input1 - 1 >= 0 ? input1 - 1 : 0,
                            j: input2 - 1 >= 0 ? input2 - 1 : 0,
                            k: input3 - 1 >= 0 ? input3 - 1 : 0
                        }
                    )
                        .then(data => {
                            setTaskData(data)
                        })
                        .catch(err => {
                            alert("tu ara")
                        })
                    break;

                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    fetch.get(`task${index}`)
                        .then(data => {
                            setTaskData(data)
                        })
                        .catch(err => {
                            alert("tu ara")
                        })
                    break;
                default:
                    alert("axper tenc xndir chka")
                    break
            }
        } catch (error) {
            console.error('Ошибка при отправке запроса:', error);
        }
        setIndex('')
        setInput1(0)
        setInput2(0)
        setInput3(0)
    };

    return (
        <div className="task-form-container">
            <h2 className="task-form-title">Enter the parametrs for task</h2>
            <form className="task-form" onSubmit={handleSubmit}>
                <label>
                    Task number :
                    <input type="number"
                        value={index}
                        placeholder='Enter 2 from 10'
                        onChange={(e) => setIndex(+e.target.value)} required />
                </label>
                <label>
                    Plane Id one
                    <input type="number"
                        value={input1}
                        onChange={(e) => setInput1(+e.target.value)} required />
                </label>
                <label>
                    Plane Id two
                    <input type="number"
                        value={input2}
                        onChange={(e) =>
                            setInput2(+e.target.value)} required />
                </label>
                <label>
                    Plane Id tre
                    <input type="number"
                        value={input3}
                        onChange={(e) => setInput3(+e.target.value)} required />
                </label>
                <button type="submit">Send</button>
            </form>
            <div className="result">

                {taskData ?
                    taskData.resPlanes ?
                        <>
                            <h1>Result of task {taskData.taskNumber}</h1>
                            <PlanesTable taskDesc={taskData.taskDesc} resPlanes={taskData.resPlanes} />
                        </>
                        :
                        <>
                            <h1>Result of task {taskData.taskNumber}</h1>
                            <PlaneDetails taskDesc={taskData.taskDesc} resString={taskData.resString} plane={taskData.plane} />
                        </>
                    : <></>
                }

            </div>
        </div>
    );
};

export default TaskBar;
