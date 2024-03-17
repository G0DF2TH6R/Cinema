import Day from "./Day"

function Week(props) {
    const days = props.days

    return (
        <ul> {days.map(day => <Day day={day} />)} </ul>
    )
}

export default Week